package Bio.model2;

public class BloodChemistryBean {
	private int labProfIdNumber;
	private int bloodChemId;
	private String labParameter;
	private String result;
	private String notDone;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getBloodChemId() {
		return bloodChemId;
	}

	public void setBloodChemId(int bloodChemId) {
		this.bloodChemId = bloodChemId;
	}

	public String getLabParameter() {
		return labParameter;
	}

	public void setLabParameter(String labParameter) {
		this.labParameter = labParameter;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNotDone() {
		return notDone;
	}

	public void setNotDone(String notDone) {
		this.notDone = notDone;
	}

}
