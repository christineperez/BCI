package Bio.model2;

public class UrineProteinElectrophoresis {
	private int labProfIdNumber;
	private int urineProElecId;
	private String status;
	private String result;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getUrineProElecId() {
		return urineProElecId;
	}

	public void setUrineProElecId(int urineProElecId) {
		this.urineProElecId = urineProElecId;
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
