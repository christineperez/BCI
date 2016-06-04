package Bio.model;

public class ComplicationsMedicalBean {
	private int complicationsId;
	private int medicalId;
	private byte complications;

	public int getComplicationsId() {
		return complicationsId;
	}

	public void setComplicationsId(int complicationsId) {
		this.complicationsId = complicationsId;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public byte getComplications() {
		return complications;
	}

	public void setComplications(byte complications) {
		this.complications = complications;
	}

}
