package Bio.utility;

import java.sql.Connection;
import java.sql.Date;
import Bio.model.AddPatientBean;
import Bio.utility.sql.SQLOperations;

public class addPatient {
	public void addPatient(int patientIdNum,String lastName,String firstName,String middleInitial,
			String gender,Date dateOfBirth,String address,String civilStatus,String occupation,
			Date dateOfEntry,String tissueSpecCollected,String[] specimen, Connection connection){
		
		AddPatientBean addPatient= BioBeanFactory.getFactoryBean(patientIdNum,firstName, middleInitial, 
				lastName, gender, dateOfBirth, address, civilStatus, occupation, dateOfEntry);
	
		SQLOperations.addPatient(addPatient, connection);
	}
}

