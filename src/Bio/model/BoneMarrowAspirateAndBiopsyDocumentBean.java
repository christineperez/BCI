package Bio.model;

import java.io.InputStream;

public class BoneMarrowAspirateAndBiopsyDocumentBean {
	private int boneAndBiopsyId;
	private int boneAndBiopsyDocuId;
	private InputStream[] document;

	public int getBoneAndBiopsyId() {
		return boneAndBiopsyId;
	}

	public void setBoneAndBiopsyId(int boneAndBiopsyId) {
		this.boneAndBiopsyId = boneAndBiopsyId;
	}

	public int getBoneAndBiopsyDocuId() {
		return boneAndBiopsyDocuId;
	}

	public void setBoneAndBiopsyDocuId(int boneAndBiopsyDocuId) {
		this.boneAndBiopsyDocuId = boneAndBiopsyDocuId;
	}

	public InputStream[] getDocument() {
		return document;
	}

	public void setDocument(InputStream[] document) {
		this.document = document;
	}

}
