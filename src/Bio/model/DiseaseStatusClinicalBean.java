package Bio.model;

public class DiseaseStatusClinicalBean {
private int diseaseIdNumber;
private int clinicalDataIdNumber;
private String status;

public int getDiseaseIdNumber() {
	return diseaseIdNumber;
}
public void setDiseaseIdNumber(int diseaseIdNumber) {
	this.diseaseIdNumber = diseaseIdNumber;
}
public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
