package Bio.model2;

public class BoneMarrowAspirateAndBiopsyResult {
	private int labprofIdNumber;
	private int boneAndBiopsyId;
	private String status;
	private String result;

	public int getLabprofIdNumber() {
		return labprofIdNumber;
	}

	public void setLabprofIdNumber(int labprofIdNumber) {
		this.labprofIdNumber = labprofIdNumber;
	}

	public int getBoneAndBiopsyId() {
		return boneAndBiopsyId;
	}

	public void setBoneAndBiopsyId(int boneAndBiopsyId) {
		this.boneAndBiopsyId = boneAndBiopsyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
