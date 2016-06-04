package Bio.model;

import java.sql.Date;

public class TreatmentBean {
private int treatmentIdNumber;
private int patientIdNumber;
private int cycleNumber;
private Date dateStarted;
private Date dateEnded;

public int getTreatmentIdNumber() {
	return treatmentIdNumber;
}
public void setTreatmentIdNumber(int treatmentIdNumber) {
	this.treatmentIdNumber = treatmentIdNumber;
}
public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public int getCycleNumber() {
	return cycleNumber;
}
public void setCycleNumber(int cycleNumber) {
	this.cycleNumber = cycleNumber;
}
public Date getDateStarted() {
	return dateStarted;
}
public void setDateStarted(Date dateStarted) {
	this.dateStarted = dateStarted;
}
public Date getDateEnded() {
	return dateEnded;
}
public void setDateEnded(Date dateEnded) {
	this.dateEnded = dateEnded;
}
}
