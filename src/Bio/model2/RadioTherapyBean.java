package Bio.model2;

public class RadioTherapyBean {
	private int radioTherId;
	private int otherModalitiesId;
	private double dose;
	private double frequency;

	public int getRadioTherId() {
		return radioTherId;
	}

	public void setRadioTherId(int radioTherId) {
		this.radioTherId = radioTherId;
	}

	public int getOtherModalitiesId() {
		return otherModalitiesId;
	}

	public void setOtherModalitiesId(int otherModalitiesId) {
		this.otherModalitiesId = otherModalitiesId;
	}

	public double getDose() {
		return dose;
	}

	public void setDose(double dose) {
		this.dose = dose;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

}
