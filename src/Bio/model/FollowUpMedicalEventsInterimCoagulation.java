package Bio.model;

import java.sql.Date;

public class FollowUpMedicalEventsInterimCoagulation {
	private int followUpMedicalEventsInterimId;
	private Date dateOfEntry;
	private Date dateOfVisit;
	private String selfAdministered;
	private String datesOfAdministration;
	private String doseOfFactorConcentrate;
	private String procedureOrIntervention;
	private String specialNotes;
	
	public int getFollowUpMedicalEventsInterimId() {
		return followUpMedicalEventsInterimId;
	}

	public void setFollowUpMedicalEventsInterimId(int followUpMedicalEventsInterimId) {
		this.followUpMedicalEventsInterimId = followUpMedicalEventsInterimId;
	}

	public Date getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public Date getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	public String getSelfAdministered() {
		return selfAdministered;
	}

	public void setSelfAdministered(String selfAdministered) {
		this.selfAdministered = selfAdministered;
	}

	public String getDatesOfAdministration() {
		return datesOfAdministration;
	}

	public void setDatesOfAdministration(String datesOfAdministration) {
		this.datesOfAdministration = datesOfAdministration;
	}

	public String getDoseOfFactorConcentrate() {
		return doseOfFactorConcentrate;
	}

	public void setDoseOfFactorConcentrate(String doseOfFactorConcentrate) {
		this.doseOfFactorConcentrate = doseOfFactorConcentrate;
	}

	public String getProcedureOrIntervention() {
		return procedureOrIntervention;
	}

	public void setProcedureOrIntervention(String procedureOrIntervention) {
		this.procedureOrIntervention = procedureOrIntervention;
	}

	public String getSpecialNotes() {
		return specialNotes;
	}

	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}
	
	

}
