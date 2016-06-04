package Bio.model;

import java.io.InputStream;

public class SepcificationBean {
	private int specsIdNumber;
	private int medicalId;
	private InputStream[] specification;

	public int getSpecsIdNumber() {
		return specsIdNumber;
	}

	public void setSpecsIdNumber(int specsIdNumber) {
		this.specsIdNumber = specsIdNumber;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public InputStream[] getSpecification() {
		return specification;
	}

	public void setSpecification(InputStream[] specification) {
		this.specification = specification;
	}

}
