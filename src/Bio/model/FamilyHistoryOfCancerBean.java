package Bio.model;

public class FamilyHistoryOfCancerBean {
private int clinicalDataIdNumber;
private int familyHistoryId;
private String relationshipToPatient;
private String cancer;

public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getFamilyHistoryId() {
	return familyHistoryId;
}
public void setFamilyHistoryId(int familyHistoryId) {
	this.familyHistoryId = familyHistoryId;
}
public String getRelationshipToPatient() {
	return relationshipToPatient;
}
public void setRelationshipToPatient(String relationshipToPatient) {
	this.relationshipToPatient = relationshipToPatient;
}
public String getCancer() {
	return cancer;
}
public void setCancer(String cancer) {
	this.cancer = cancer;
}
}
