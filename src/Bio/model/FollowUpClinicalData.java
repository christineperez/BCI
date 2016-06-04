package Bio.model;

public class FollowUpClinicalData {
	private int followUpClinicalDataId;
	private String currentSymptoms;
	private String currentPhysicalExam;
	private String weight;
	private String ecog;
	private String[] pFindingsSpecify[];

	public int getFollowUpClinicalDataId() {
		return followUpClinicalDataId;
	}

	public void setFollowUpClinicalDataId(int followUpClinicalDataId) {
		this.followUpClinicalDataId = followUpClinicalDataId;
	}

	public String getCurrentSymptoms() {
		return currentSymptoms;
	}

	public void setCurrentSymptoms(String currentSymptoms) {
		this.currentSymptoms = currentSymptoms;
	}

	public String getCurrentPhysicalExam() {
		return currentPhysicalExam;
	}

	public void setCurrentPhysicalExam(String currentPhysicalExam) {
		this.currentPhysicalExam = currentPhysicalExam;
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

	public String[][] getpFindingsSpecify() {
		return pFindingsSpecify;
	}

	public void setpFindingsSpecify(String[][] pFindingsSpecify) {
		this.pFindingsSpecify = pFindingsSpecify;
	}

}
