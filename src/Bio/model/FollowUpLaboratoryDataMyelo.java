package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class FollowUpLaboratoryDataMyelo {
	private int followUpLaboratoryDataMyeloId;
	private Date dateOfBloodCollection;
	private Boolean notDoneHematology;
	private String hemoglobin;
	private String hematocrit;
	private String whiteBloodCells;
	private String neutrophils;
	private String lymphocytes;
	private String monocytes;
	private String eosinophils;
	private String basophils;
	private String myelocytes;
	private String metamyelocytes;
	private String blasts;
	private String plateletCount;
	private Date datePerformed;
	private String descriptionBoneMarrow;
	private InputStream[] attachedBoneMarrow;

	
	public Date getDateOfBloodCollection() {
		return dateOfBloodCollection;
	}

	public void setDateOfBloodCollection(Date dateOfBloodCollection) {
		this.dateOfBloodCollection = dateOfBloodCollection;
	}

	public Boolean getNotDoneHematology() {
		return notDoneHematology;
	}

	public void setNotDoneHematology(Boolean notDoneHematology) {
		this.notDoneHematology = notDoneHematology;
	}

	public String getHemoglobin() {
		return hemoglobin;
	}

	public int getFollowUpLaboratoryDataMyeloId() {
		return followUpLaboratoryDataMyeloId;
	}

	public void setFollowUpLaboratoryDataMyeloId(int followUpLaboratoryDataMyeloId) {
		this.followUpLaboratoryDataMyeloId = followUpLaboratoryDataMyeloId;
	}

	public Date getDatePerformed() {
		return datePerformed;
	}

	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}

	public String getDescriptionBoneMarrow() {
		return descriptionBoneMarrow;
	}

	public void setDescriptionBoneMarrow(String descriptionBoneMarrow) {
		this.descriptionBoneMarrow = descriptionBoneMarrow;
	}

	public InputStream[] getAttachedBoneMarrow() {
		return attachedBoneMarrow;
	}

	public void setAttachedBoneMarrow(InputStream[] attachedBoneMarrow) {
		this.attachedBoneMarrow = attachedBoneMarrow;
	}

	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public String getHematocrit() {
		return hematocrit;
	}

	public void setHematocrit(String hematocrit) {
		this.hematocrit = hematocrit;
	}

	public String getWhiteBloodCells() {
		return whiteBloodCells;
	}

	public void setWhiteBloodCells(String whiteBloodCells) {
		this.whiteBloodCells = whiteBloodCells;
	}

	public String getNeutrophils() {
		return neutrophils;
	}

	public void setNeutrophils(String neutrophils) {
		this.neutrophils = neutrophils;
	}

	public String getLymphocytes() {
		return lymphocytes;
	}

	public void setLymphocytes(String lymphocytes) {
		this.lymphocytes = lymphocytes;
	}

	public String getMonocytes() {
		return monocytes;
	}

	public void setMonocytes(String monocytes) {
		this.monocytes = monocytes;
	}

	public String getEosinophils() {
		return eosinophils;
	}

	public void setEosinophils(String eosinophils) {
		this.eosinophils = eosinophils;
	}

	public String getBasophils() {
		return basophils;
	}

	public void setBasophils(String basophils) {
		this.basophils = basophils;
	}

	public String getMyelocytes() {
		return myelocytes;
	}

	public void setMyelocytes(String myelocytes) {
		this.myelocytes = myelocytes;
	}

	public String getMetamyelocytes() {
		return metamyelocytes;
	}

	public void setMetamyelocytes(String metamyelocytes) {
		this.metamyelocytes = metamyelocytes;
	}

	public String getBlasts() {
		return blasts;
	}

	public void setBlasts(String blasts) {
		this.blasts = blasts;
	}

	public String getPlateletCount() {
		return plateletCount;
	}

	public void setPlateletCount(String plateletCount) {
		this.plateletCount = plateletCount;
	}

}
