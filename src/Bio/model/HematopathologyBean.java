package Bio.model;

import java.sql.Date;

public class HematopathologyBean {
	private int labProfIdNumber;
	private int hematopathologyId;
	private String result;
	private Date datePerformed;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getHematopathologyId() {
		return hematopathologyId;
	}

	public void setHematopathologyId(int hematopathologyId) {
		this.hematopathologyId = hematopathologyId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getDatePerformed() {
		return datePerformed;
	}

	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}

}
