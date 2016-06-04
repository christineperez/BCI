package Bio.model2;

import java.sql.Date;

public class GeneralDataBean {
private int patientIdNumber;
private String lastName;
private String firstName;
private String middleInitial;
private String gender;
private String civilStatus;
private String occupation;
private Date dateOfBirth;
private Date dateOfEntry;

public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleInitial() {
	return middleInitial;
}
public void setMiddleInitial(String middleInitial) {
	this.middleInitial = middleInitial;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCivilStatus() {
	return civilStatus;
}
public void setCivilStatus(String civilStatus) {
	this.civilStatus = civilStatus;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Date getDateOfEntry() {
	return dateOfEntry;
}
public void setDateOfEntry(Date dateOfEntry) {
	this.dateOfEntry = dateOfEntry;
}
}
