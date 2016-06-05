package Bio.model;

import java.sql.Date;

public class BaselineTherapyAndResponseDataLeukemia {
	private int baselineTherapyAndResponseDataLeukemiaId;
	private String modeOfTreatment;
	private String regimen;
	private String[] chemoMedications;
	private String cycleNumber;
	private Date dateStarted;
	private String complications;
	private String diseaseStatus;

	public int getBaselineTherapyAndResponseDataLeukemiaId() {
		return baselineTherapyAndResponseDataLeukemiaId;
	}

	public void setBaselineTherapyAndResponseDataLeukemiaId(int baselineTherapyAndResponseDataLeukemiaId) {
		this.baselineTherapyAndResponseDataLeukemiaId = baselineTherapyAndResponseDataLeukemiaId;
	}

	public String getRegimen() {
		return regimen;
	}

	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}

	public String[] getChemoMedications() {
		return chemoMedications;
	}

	public void setChemoMedications(String[] chemoMedications) {
		this.chemoMedications = chemoMedications;
	}

	public String getCycleNumber() {
		return cycleNumber;
	}

	public void setCycleNumber(String cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	public String getComplications() {
		return complications;
	}

	public void setComplications(String complications) {
		this.complications = complications;
	}

	public String getModeOfTreatment() {
		return modeOfTreatment;
	}

	public void setModeOfTreatment(String modeOfTreatment) {
		this.modeOfTreatment = modeOfTreatment;
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
