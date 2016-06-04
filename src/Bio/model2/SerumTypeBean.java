package Bio.model2;

import java.io.InputStream;

public class SerumTypeBean {
	private int labProfIdNumber;
	private int serumtypeId;
	private InputStream[] serumType;

	public int getLabProfIdNumber() {
		return labProfIdNumber;
	}

	public void setLabProfIdNumber(int labProfIdNumber) {
		this.labProfIdNumber = labProfIdNumber;
	}

	public int getSerumtypeId() {
		return serumtypeId;
	}

	public void setSerumtypeId(int serumtypeId) {
		this.serumtypeId = serumtypeId;
	}

	public InputStream[] getSerumType() {
		return serumType;
	}

	public void setSerumType(InputStream[] serumType) {
		this.serumType = serumType;
	}

}
