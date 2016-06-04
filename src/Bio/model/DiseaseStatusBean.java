package Bio.model;

public class DiseaseStatusBean {
	private int labProfIdNumber;
	private int diseaseStatusId;
	private String diseaseResponse;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getDiseaseStatusId() {
		return diseaseStatusId;
	}

	public void setDiseaseStatusId(int diseaseStatusId) {
		this.diseaseStatusId = diseaseStatusId;
	}

	public String getDiseaseResponse() {
		return diseaseResponse;
	}

	public void setDiseaseResponse(String diseaseResponse) {
		this.diseaseResponse = diseaseResponse;
	}

}
