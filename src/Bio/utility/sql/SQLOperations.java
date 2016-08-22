package Bio.utility.sql;

//import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

import javax.sql.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Bio.utility.sql.SQLCommands;

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

	
}
