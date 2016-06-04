package Bio.model2;

import java.sql.Date;

public class FollowUpDataBean {
private int followUpIdNumber;
private int patientIdNumber;
private Date dateOfEntry;
private Date dateOfVisit;
private String chemotherapyCompletion;

public int getFollowUpIdNumber() {
	return followUpIdNumber;
}
public void setFollowUpIdNumber(int followUpIdNumber) {
	this.followUpIdNumber = followUpIdNumber;
}
public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public Date getDateOfEntry() {
	return dateOfEntry;
}
public void setDateOfEntry(Date dateOfEntry) {
	this.dateOfEntry = dateOfEntry;
}
public Date getDateOfVisit() {
	return dateOfVisit;
}
public void setDateOfVisit(Date dateOfVisit) {
	this.dateOfVisit = dateOfVisit;
}
public String getChemotherapyCompletion() {
	return chemotherapyCompletion;
}
public void setChemotherapyCompletion(String chemotherapyCompletion) {
	this.chemotherapyCompletion = chemotherapyCompletion;
}

}
