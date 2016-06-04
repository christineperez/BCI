package Bio.model;

public class PatientClassificationBean {
private int patientClassificationIdNumber;
private int patientIdNumber;
private String patientClassification;

public int getPatientClassificationIdNumber() {
	return patientClassificationIdNumber;
}
public void setPatientClassificationIdNumber(int patientClassificationIdNumber) {
	this.patientClassificationIdNumber = patientClassificationIdNumber;
}
public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public String getPatientClassification() {
	return patientClassification;
}
public void setPatientClassification(String patientClassification) {
	this.patientClassification = patientClassification;
}

}
