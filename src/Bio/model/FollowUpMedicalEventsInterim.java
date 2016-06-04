package Bio.model;

import java.sql.Date;

public class FollowUpMedicalEventsInterim {
	private int followUpMedicalEventsInterimId;
	private Date dateOfEntry;
	private Date dateOfVisit;
	private String hematologicalMalignancy;
	private String concomitantMedications;
	private String procdeureOrIntervention;
	private String[] sample;
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
	public String getHematologicalMalignancy() {
		return hematologicalMalignancy;
	}
	public void setHematologicalMalignancy(String hematologicalMalignancy) {
		this.hematologicalMalignancy = hematologicalMalignancy;
	}
	public String getConcomitantMedications() {
		return concomitantMedications;
	}
	public void setConcomitantMedications(String concomitantMedications) {
		this.concomitantMedications = concomitantMedications;
	}
	public String getProcdeureOrIntervention() {
		return procdeureOrIntervention;
	}
	public void setProcdeureOrIntervention(String procdeureOrIntervention) {
		this.procdeureOrIntervention = procdeureOrIntervention;
	}
	public String[] getSample() {
		return sample;
	}
	public void setSample(String[] sample) {
		this.sample = sample;
	}
	
	
}
