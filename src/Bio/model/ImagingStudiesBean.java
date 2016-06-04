package Bio.model;

public class ImagingStudiesBean {
	private int labProfIdNumber;
	private int imagingStudies;
	private String status;
	private String result;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getImagingStudies() {
		return imagingStudies;
	}

	public void setImagingStudies(int imagingStudies) {
		this.imagingStudies = imagingStudies;
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
