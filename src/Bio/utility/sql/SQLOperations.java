package Bio.utility.sql;

//import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

import javax.sql.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Bio.model.AccountBean;
import Bio.model.AddPatientBean;
import Bio.utility.sql.SQLCommands;
import ust.crs.model.CRSBean;


public class SQLOperations implements SQLCommands {

	private static Connection connection;

	private SQLOperations() {
	}

	// NEW CONNECTION
	private static Connection getDBConnection() {
		try {
			InitialContext context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/BCI-DS");

			if (dataSource != null) {
				connection = dataSource.getConnection();
			} else {
				System.err.println("DataSource is NULL.");
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Connection getConnection() {
		return (connection != null) ? connection : getDBConnection();
	}

	//check login
	public static boolean loginCheck(String username, String password, Connection connection){
	    boolean login = false;
	    ResultSet rs = null;
	    try {
	    	PreparedStatement pstmt =
					connection.prepareStatement(LOGIN_DETAILS);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		rs=pstmt.executeQuery();
	    rs = pstmt.getResultSet();
	    login = rs.first(); 
	    
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return login;
	}
	public static AccountBean searchAccount(String username, 
			Connection connection) {
			
			AccountBean ab= new AccountBean();
			
			try{
				PreparedStatement pstmt =
							connection.prepareStatement(SEARCH_ACCOUNT);
				pstmt.setString(1, username);
				ResultSet rs=pstmt.executeQuery();
				
				while(rs.next()){
					ab.setAccountID(rs.getInt("AccountID"));
					ab.setPersonalInfoID(rs.getInt("PersonalInfoID"));
					ab.setUsername(rs.getString("Username"));
					ab.setPassword(rs.getString("Password"));
					ab.setSalt(rs.getString("Salt"));
					ab.setRoleID(rs.getInt("RoleID"));
					ab.setActive(rs.getInt("Active"));
				}
					
			}
			catch(SQLException sqle){
				System.out.println("SQLException - searchAccount:" 
						+ sqle.getMessage());
				
				return ab;
			}
			return ab;
			
		}
	public static synchronized int deletePatient(int id, Connection connection) {
		int updated = 0;
		
		try {
			connection.setAutoCommit(false);
	        PreparedStatement pstmt = connection.prepareStatement(DELETE_PATIENT);
	        pstmt.setInt(1, 0);
	        pstmt.setInt(2, id);
	        updated  = pstmt.executeUpdate();
	        connection.commit();
		} catch (SQLException sqle) {
			System.out.println("SQLException - deletePatient: " + sqle.getMessage());
			
			try {
				connection.rollback();
			} catch (SQLException sql) {
				System.err.println("Error on Delete Connection Rollback - " + sql.getMessage());
			}
			return updated; 
		}	
		
		return updated;
	}
	public static boolean addPatient(AddPatientBean patient, 
			Connection connection) {
			
			try {
		        PreparedStatement pstmt = connection.prepareStatement(ADD_PATIENT);
		        pstmt.setString(1, patient.getFirstName());
		        pstmt.setString(2, patient.getMiddleName());
		        pstmt.setString(3, patient.getLastName());
		        pstmt.setString(4, patient.getGender());
		        pstmt.setDate(5, patient.getDate());
		        pstmt.setString(6, patient.getAddress());
		        pstmt.setString(7, patient.getCivilStatus());
		        pstmt.setString(8, patient.getOccupation());
		        pstmt.setDate(9, patient.getDateOfEntry());
		        pstmt.executeUpdate(); // execute insert statement  
			} catch (SQLException sqle) {
				System.out.println("SQLException - addPatient: " + sqle.getMessage());
				return false; 
			}	
			return true;
	}
}
