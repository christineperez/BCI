package Bio.model;

import java.sql.Date;

public class BaselineClinicalDataCoagulation {
	private int baselineClinicalDataCoagulationId;
	private Date dateOfVisit;
	private String diagnosis;
	private String othersSpecify;
	private String severity;
	private String chiefComplaint;
	private String otherSymptoms;
	private String[] relationshipToPatient;
	private String otherDiseaseInTheFamily;
	private String comorbidities;
	private String[] genericName;
	private String[] dose;
	private String[] frequency;
	private String smokingHistorySpecify;
	private String alcoholIntakeSpecify;
	private String chemicalExposureSpecify;
	private String height;
	private String weight;
	private Boolean presenceOfHemarthroses;
	private Boolean presenceOfContracturesAndMuscleAtrophy;
	private String otherFindings;
	
	
	public int getBaselineClinicalDataCoagulationId() {
		return baselineClinicalDataCoagulationId;
	}
	public void setBaselineClinicalDataCoagulationId(int baselineClinicalDataCoagulationId) {
		this.baselineClinicalDataCoagulationId = baselineClinicalDataCoagulationId;
	}
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getOthersSpecify() {
		return othersSpecify;
	}
	public void setOthersSpecify(String othersSpecify) {
		this.othersSpecify = othersSpecify;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getChiefComplaint() {
		return chiefComplaint;
	}
	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}
	public String getOtherSymptoms() {
		return otherSymptoms;
	}
	public void setOtherSymptoms(String otherSymptoms) {
		this.otherSymptoms = otherSymptoms;
	}
	public String[] getRelationshipToPatient() {
		return relationshipToPatient;
	}
	public void setRelationshipToPatient(String[] relationshipToPatient) {
		this.relationshipToPatient = relationshipToPatient;
	}
	public String getOtherDiseaseInTheFamily() {
		return otherDiseaseInTheFamily;
	}
	public void setOtherDiseaseInTheFamily(String otherDiseaseInTheFamily) {
		this.otherDiseaseInTheFamily = otherDiseaseInTheFamily;
	}
	public String getComorbidities() {
		return comorbidities;
	}
	public void setComorbidities(String comorbidities) {
		this.comorbidities = comorbidities;
	}
	public String[] getGenericName() {
		return genericName;
	}
	public void setGenericName(String[] genericName) {
		this.genericName = genericName;
	}
	public String[] getDose() {
		return dose;
	}
	public void setDose(String[] dose) {
		this.dose = dose;
	}
	public String[] getFrequency() {
		return frequency;
	}
	public void setFrequency(String[] frequency) {
		this.frequency = frequency;
	}
	public String getSmokingHistorySpecify() {
		return smokingHistorySpecify;
	}
	public void setSmokingHistorySpecify(String smokingHistorySpecify) {
		this.smokingHistorySpecify = smokingHistorySpecify;
	}
	public String getAlcoholIntakeSpecify() {
		return alcoholIntakeSpecify;
	}
	public void setAlcoholIntakeSpecify(String alcoholIntakeSpecify) {
		this.alcoholIntakeSpecify = alcoholIntakeSpecify;
	}
	public String getChemicalExposureSpecify() {
		return chemicalExposureSpecify;
	}
	public void setChemicalExposureSpecify(String chemicalExposureSpecify) {
		this.chemicalExposureSpecify = chemicalExposureSpecify;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public Boolean getPresenceOfHemarthroses() {
		return presenceOfHemarthroses;
	}
	public void setPresenceOfHemarthroses(Boolean presenceOfHemarthroses) {
		this.presenceOfHemarthroses = presenceOfHemarthroses;
	}
	public Boolean getPresenceOfContracturesAndMuscleAtrophy() {
		return presenceOfContracturesAndMuscleAtrophy;
	}
	public void setPresenceOfContracturesAndMuscleAtrophy(Boolean presenceOfContracturesAndMuscleAtrophy) {
		this.presenceOfContracturesAndMuscleAtrophy = presenceOfContracturesAndMuscleAtrophy;
	}
	public String getOtherFindings() {
		return otherFindings;
	}
	public void setOtherFindings(String otherFindings) {
		this.otherFindings = otherFindings;
	}
	
	

}
