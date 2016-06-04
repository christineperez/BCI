package Bio.model;

public class ChemicalExposureBean {
private int clinicalDataIdNumber;
private int chemExposureId;
private String specification;
public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getChemExposureId() {
	return chemExposureId;
}
public void setChemExposureId(int chemExposureId) {
	this.chemExposureId = chemExposureId;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}

}
