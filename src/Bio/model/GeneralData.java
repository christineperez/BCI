package Bio.model;

import java.sql.Date;

public class GeneralData {
private int patientIDNumber;
private String lastName;
private String firstName;
private String middleInitial;
private String address;
private String civilStatus;
private String occupation;
private Date dateOfEntry;
private String[] specimen;
public int getPatientIDNumber() {
	return patientIDNumber;
}
public void setPatientIDNumber(int patientIDNumber) {
	this.patientIDNumber = patientIDNumber;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public Date getDateOfEntry() {
	return dateOfEntry;
}
public void setDateOfEntry(Date dateOfEntry) {
	this.dateOfEntry = dateOfEntry;
}
public String[] getSpecimen() {
	return specimen;
}
public void setSpecimen(String[] specimen) {
	this.specimen = specimen;
}


}
