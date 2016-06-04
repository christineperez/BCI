package Bio.model2;

import java.sql.Date;

public class ClinicalDataBean {

private int clinicalDataIdNumber;
private int patientIdNumber;
private String Diagnosis;
private String StageRiskScore;
private String ChiefComplaint;
private Date dateOfVisit;
public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getPatientIdNumber() {
	return patientIdNumber;
}
public void setPatientIdNumber(int patientIdNumber) {
	this.patientIdNumber = patientIdNumber;
}
public String getDiagnosis() {
	return Diagnosis;
}
public void setDiagnosis(String diagnosis) {
	Diagnosis = diagnosis;
}
public String getStageRiskScore() {
	return StageRiskScore;
}
public void setStageRiskScore(String stageRiskScore) {
	StageRiskScore = stageRiskScore;
}
public String getChiefComplaint() {
	return ChiefComplaint;
}
public void setChiefComplaint(String chiefComplaint) {
	ChiefComplaint = chiefComplaint;
}
public Date getDateOfVisit() {
	return dateOfVisit;
}
public void setDateOfVisit(Date dateOfVisit) {
	this.dateOfVisit = dateOfVisit;
}

}
