package Bio.model;

import java.sql.Date;

public class BaselineClinicalDataMyelo {
	private int baselineClinicalDataMyeloId;
	private Date dateOfVisit;
	private String diagnosis;
	private String prognosticRiskScoring;
	private String riskScore;
	private String chiefComplaint;
	private String constitutionalSymptoms;
	private String otherSymptoms;
	private String[] relationshipToPatient;
	private String[] cancerOfRelative;
	private String otherDiseaseInTheFamily;
	private String comorbidities;
	private String specifyThrombosisHistory;
	private String[] genericName;
	private String[] dose;
	private String[] frequency;
	private String smokingHistorySpecify;
	private String alcoholIntakeSpecify;
	private String chemicalExposureSpecify;
	// Physical Exam
	private String height;
	private String weight;
	private String ecog;
	private String splenomegalySpecify;
	private String hepatomegalySpecify;
	private String lymphadenopathiesSpecify;
	private String pertinentOtherFindings;

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

	public String getChiefComplaint() {
		return chiefComplaint;
	}

	public void setChiefComplaint(String chiefComplaint) {
		this.chiefComplaint = chiefComplaint;
	}

	public String getConstitutionalSymptoms() {
		return constitutionalSymptoms;
	}

	public void setConstitutionalSymptoms(String constitutionalSymptoms) {
		this.constitutionalSymptoms = constitutionalSymptoms;
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

	public int getBaselineClinicalDataMyeloId() {
		return baselineClinicalDataMyeloId;
	}

	public void setBaselineClinicalDataMyeloId(int baselineClinicalDataMyeloId) {
		this.baselineClinicalDataMyeloId = baselineClinicalDataMyeloId;
	}

	public String getPrognosticRiskScoring() {
		return prognosticRiskScoring;
	}

	public void setPrognosticRiskScoring(String prognosticRiskScoring) {
		this.prognosticRiskScoring = prognosticRiskScoring;
	}

	public String getRiskScore() {
		return riskScore;
	}

	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}

	public String getSpecifyThrombosisHistory() {
		return specifyThrombosisHistory;
	}

	public void setSpecifyThrombosisHistory(String specifyThrombosisHistory) {
		this.specifyThrombosisHistory = specifyThrombosisHistory;
	}

	public String getAlcoholIntakeSpecify() {
		return alcoholIntakeSpecify;
	}

	public void setAlcoholIntakeSpecify(String alcoholIntakeSpecify) {
		this.alcoholIntakeSpecify = alcoholIntakeSpecify;
	}

	public String getPertinentOtherFindings() {
		return pertinentOtherFindings;
	}

	public void setPertinentOtherFindings(String pertinentOtherFindings) {
		this.pertinentOtherFindings = pertinentOtherFindings;
	}

}
