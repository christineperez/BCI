package Bio.model2;

public class HematologyBean {
	private int labProfileIdNumber;
	private int hemaId;
	private String labParameter;
	private String result;
	private String notDone;

	public int getLabProfileIdNumber() {
		return labProfileIdNumber;
	}

	public void setLabProfileIdNumber(int labProfileIdNumber) {
		this.labProfileIdNumber = labProfileIdNumber;
	}

	public int getHemaId() {
		return hemaId;
	}

	public void setHemaId(int hemaId) {
		this.hemaId = hemaId;
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
