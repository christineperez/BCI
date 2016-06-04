package Bio.model;

public class DiagnosisBean {
private int clinicalDataIdNumber;
private int otherDiseasesId;
private String otherDisease;
public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getOtherDiseasesId() {
	return otherDiseasesId;
}
public void setOtherDiseasesId(int otherDiseasesId) {
	this.otherDiseasesId = otherDiseasesId;
}
public String getOtherDisease() {
	return otherDisease;
}
public void setOtherDisease(String otherDisease) {
	this.otherDisease = otherDisease;
}
}
