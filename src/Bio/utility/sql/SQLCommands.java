package Bio.utility.sql;

public interface SQLCommands {
	String ADD_PATIENT="insert into GeneralDataTable(PatientID, FirstName, MiddleName, LastName,Gender,"
			+ "DateOfBirth, Address, CivilStatus, Occupation, DateOfEntry) values(?,?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP())";
	String LOGIN_DETAILS="select Username, Password from AccountTable where Username=? and Password=?";
	String SEARCH_ACCOUNT="select * from AccountTable where Username=?";
}
