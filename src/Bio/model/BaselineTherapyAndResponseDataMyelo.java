package Bio.model;

import java.sql.Date;

public class BaselineTherapyAndResponseDataMyelo {
	private int baselineTherapyAndResponseDataMyeloId;
	private String modeOfTreatment;
	private String[] medications;
	private Date dateStarted;
	private String diseaseStatus;

	public int getBaselineTherapyAndResponseDataMyeloId() {
		return baselineTherapyAndResponseDataMyeloId;
	}

	public void setBaselineTherapyAndResponseDataMyeloId(int baselineTherapyAndResponseDataMyeloId) {
		this.baselineTherapyAndResponseDataMyeloId = baselineTherapyAndResponseDataMyeloId;
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
