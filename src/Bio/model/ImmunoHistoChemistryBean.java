package Bio.model;

import java.sql.Date;

public class ImmunoHistoChemistryBean {
	private int labProfIdNumber;
	private int immunoHistoChemId;
	private String result;
	private Date datePerformed;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getImmunoHistoChemId() {
		return immunoHistoChemId;
	}

	public void setImmunoHistoChemId(int immunoHistoChemId) {
		this.immunoHistoChemId = immunoHistoChemId;
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
