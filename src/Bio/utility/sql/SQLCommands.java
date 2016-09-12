package Bio.utility.sql;

public interface SQLCommands {
	String ADD_PATIENT="insert into GeneralDataTable(FirstName, MiddleName, LastName,Gender,"
			+ "DateOfBirth, Address, CivilStatus, Occupation, DateOfEntry) values(?,?,?,?,?,?,?,?,?)";
	String LOGIN_DETAILS="select Username, Password from AccountTable where Username=? and Password=?";
	String SEARCH_ACCOUNT="select * from AccountTable where Username=?";
	String DELETE_PATIENT="update PatientDiseaseTable set Active=? where ControlNo=?";
}
