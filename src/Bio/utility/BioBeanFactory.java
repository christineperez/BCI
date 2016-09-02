package Bio.utility;
import java.sql.Date;

import Bio.model.*;

public class BioBeanFactory {
	public static AccountBean getFactoryBean(int accountID,int personalInfoID, String username, String password, String salt, int roleID, int active) {
		AccountBean ab = new AccountBean();
		
		ab.setAccountID(accountID);
		ab.setActive(active);
		ab.setPassword(password);
		ab.setPersonalInfoID(personalInfoID);
		ab.setRoleID(roleID);
		ab.setSalt(salt);
		ab.setUsername(username);
		
		return ab;
	}
	
	public static AddPatientBean getFactoryBean(int patientId, String firstName, String middleName, String lastName, String gender, Date date, String address, String civilStatus,
			String occupation, Date dateOfEntry){
		AddPatientBean addPatientBean= new AddPatientBean();
		
		addPatientBean.setPatientId(patientId);
		addPatientBean.setFirstName(firstName);
		addPatientBean.setMiddleName(middleName);
		addPatientBean.setLastName(lastName);
		addPatientBean.setGender(gender);
		addPatientBean.setDate(date);
		addPatientBean.setAddress(address);
		addPatientBean.setCivilStatus(civilStatus);
		addPatientBean.setOccupation(occupation);
		addPatientBean.setDateOfEntry(dateOfEntry);
		
		return addPatientBean;
	}
}
