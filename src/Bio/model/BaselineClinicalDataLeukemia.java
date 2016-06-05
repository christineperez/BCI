package Bio.model;

import java.sql.Date;

public class BaselineClinicalDataLeukemia {
	private int baselineClinicalDataLeukemiaId;
	private Date dateOfVisit;
	private String diagnosis;
	private String classificationRiskStratification;
	private String chiefComplaint;
	private String otherSymptoms;
	private String[] relationshipToPatient;
	private String[] cancerOfRelative;
	private String otherDiseaseInTheFamily;
	private String comorbidities;
	private String[] genericName;
	private String[] dose;
	private String[] frequency;
	private String smokingHistorySpecify;
	private String chemicalExposureSpecify;
	// Physical Exam
	private String height;
	private String weight;
	private String ecog;
	private String splenomegalySpecify;
	private String hepatomegalySpecify;
	private String lymphadenopathiesSpecify;
	private String otherFindings;

	public int getBaselineClinicalDataLeukemiaId() {
		return baselineClinicalDataLeukemiaId;
	}

	public void setBaselineClinicalDataLeukemiaId(int baselineClinicalDataLeukemiaId) {
		this.baselineClinicalDataLeukemiaId = baselineClinicalDataLeukemiaId;
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

	public String getClassificationRiskStratification() {
		return classificationRiskStratification;
	}

	public void setClassificationRiskStratification(String classificationRiskStratification) {
		this.classificationRiskStratification = classificationRiskStratification;
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

	public String[] getCancerOfRelative() {
		return cancerOfRelative;
	}

	public void setCancerOfRelative(String[] cancerOfRelative) {
		this.cancerOfRelative = cancerOfRelative;
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

	public String getEcog() {
		return ecog;
	}

	public void setEcog(String ecog) {
		this.ecog = ecog;
	}

	public String getSplenomegalySpecify() {
		return splenomegalySpecify;
	}

	public void setSplenomegalySpecify(String splenomegalySpecify) {
		this.splenomegalySpecify = splenomegalySpecify;
	}

	public String getHepatomegalySpecify() {
		return hepatomegalySpecify;
	}

	public void setHepatomegalySpecify(String hepatomegalySpecify) {
		this.hepatomegalySpecify = hepatomegalySpecify;
	}

	public String getLymphadenopathiesSpecify() {
		return lymphadenopathiesSpecify;
	}

	public void setLymphadenopathiesSpecify(String lymphadenopathiesSpecify) {
		this.lymphadenopathiesSpecify = lymphadenopathiesSpecify;
	}

	public String getOtherFindings() {
		return otherFindings;
	}

	public void setOtherFindings(String otherFindings) {
		this.otherFindings = otherFindings;
	}

}
