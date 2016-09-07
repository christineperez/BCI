package Bio.utility;

import java.sql.Connection;

import Bio.utility.sql.SQLOperations;

public class deletePatient {
	public void deletePatient(int id, Connection connection){
		SQLOperations.deletePatient(id, connection);
	}
}
