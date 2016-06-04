package Bio.model2;

import java.sql.Date;

public class OtherTreatmentModalitiesBean {
	private int otherModalitiesId;
	private int treatmentId;
	private Date dateStarted;
	private boolean dialysis;

	public int getOtherModalitiesId() {
		return otherModalitiesId;
	}

	public void setOtherModalitiesId(int otherModalitiesId) {
		this.otherModalitiesId = otherModalitiesId;
	}

	public int getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(int treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

	public boolean isDialysis() {
		return dialysis;
	}

	public void setDialysis(boolean dialysis) {
		this.dialysis = dialysis;
	}

}
