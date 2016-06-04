package Bio.model2;

import java.sql.Date;

public class LaboratoryProfileBean {
private int labProfileIdNumber;
private int patientIdNumber;
private int followUpIdNumber;
private Date dateOfBloodCollection;

public int getLabProfileIdNumber() {
	return labProfileIdNumber;
}
public void setLabProfileIdNumber(int labProfileIdNumber) {
	this.labProfileIdNumber = labProfileIdNumber;
}
public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public int getFollowUpIdNumber() {
	return followUpIdNumber;
}
public void setFollowUpIdNumber(int followUpIdNumber) {
	this.followUpIdNumber = followUpIdNumber;
}
public Date getDateOfBloodCollection() {
	return dateOfBloodCollection;
}
public void setDateOfBloodCollection(Date dateOfBloodCollection) {
	this.dateOfBloodCollection = dateOfBloodCollection;
}

}
