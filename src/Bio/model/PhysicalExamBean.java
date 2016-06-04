package Bio.model;

public class PhysicalExamBean {
private int clinicalDataIdNumber;
private int physicalExamId;
private double height;
private double weight;
private double ecog;
public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getPhysicalExamId() {
	return physicalExamId;
}
public void setPhysicalExamId(int physicalExamId) {
	this.physicalExamId = physicalExamId;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getEcog() {
	return ecog;
}
public void setEcog(double ecog) {
	this.ecog = ecog;
}
}
