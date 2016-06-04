package Bio.model;

import java.sql.Date;

public class BaselineTherapyAndResponseData {
	private int BaselineTherapyAndResponseDataId;
	private String modeOfTreatment;
	private String[] medications;
	private Date dateStarted;
	private String diseaseStatus;
	public int getBaselineTherapyAndResponseDataId() {
		return BaselineTherapyAndResponseDataId;
	}
	public void setBaselineTherapyAndResponseDataId(int baselineTherapyAndResponseDataId) {
		BaselineTherapyAndResponseDataId = baselineTherapyAndResponseDataId;
	}
	public String getModeOfTreatment() {
		return modeOfTreatment;
	}
	public void setModeOfTreatment(String modeOfTreatment) {
		this.modeOfTreatment = modeOfTreatment;
	}
	public String[] getMedications() {
		return medications;
	}
	public void setMedications(String[] medications) {
		this.medications = medications;
	}
	public Date getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}
	public String getDiseaseStatus() {
		return diseaseStatus;
	}
	public void setDiseaseStatus(String diseaseStatus) {
		this.diseaseStatus = diseaseStatus;
	}
	
	
}
