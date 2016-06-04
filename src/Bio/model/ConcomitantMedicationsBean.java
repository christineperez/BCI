package Bio.model;

public class ConcomitantMedicationsBean {
private int clinicalDataIdNumber;
private int concomitantId;
private String genericName;
private double dose;
private String frequency;

public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getConcomitantId() {
	return concomitantId;
}
public void setConcomitantId(int concomitantId) {
	this.concomitantId = concomitantId;
}
public String getGenericName() {
	return genericName;
}
public void setGenericName(String genericName) {
	this.genericName = genericName;
}
public double getDose() {
	return dose;
}
public void setDose(double dose) {
	this.dose = dose;
}
public String getFrequency() {
	return frequency;
}
public void setFrequency(String frequency) {
	this.frequency = frequency;
}
}
