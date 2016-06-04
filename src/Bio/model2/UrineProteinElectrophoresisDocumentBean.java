package Bio.model2;

import java.io.InputStream;

public class UrineProteinElectrophoresisDocumentBean {
	private int urineProelecId;
	private int urineProElecDocuId;
	private InputStream[] urineProElecDocu;

	public int getUrineProelecId() {
		return urineProelecId;
	}

	public void setUrineProelecId(int urineProelecId) {
		this.urineProelecId = urineProelecId;
	}

	public int getUrineProElecDocuId() {
		return urineProElecDocuId;
	}

	public void setUrineProElecDocuId(int urineProElecDocuId) {
		this.urineProElecDocuId = urineProElecDocuId;
	}

	public InputStream[] getUrineProElecDocu() {
		return urineProElecDocu;
	}

	public void setUrineProElecDocu(InputStream[] urineProElecDocu) {
		this.urineProElecDocu = urineProElecDocu;
	}

}
