package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class FollowUpLaboratoryDataLymphoma {
	private int followUpLaboratoryDataLymphomaId;
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
	private String ldh;
	private String esr;
	private String resultImagingStudies;
	private InputStream[] attachedImagingStudies;

	public int getFollowUpLaboratoryDataLymphomaId() {
		return followUpLaboratoryDataLymphomaId;
	}

	public void setFollowUpLaboratoryDataLymphomaId(int followUpLaboratoryDataLymphomaId) {
		this.followUpLaboratoryDataLymphomaId = followUpLaboratoryDataLymphomaId;
	}

	public String getLdh() {
		return ldh;
	}

	public void setLdh(String ldh) {
		this.ldh = ldh;
	}

	public String getEsr() {
		return esr;
	}

	public void setEsr(String esr) {
		this.esr = esr;
	}

	public String getResultImagingStudies() {
		return resultImagingStudies;
	}

	public void setResultImagingStudies(String resultImagingStudies) {
		this.resultImagingStudies = resultImagingStudies;
	}

	public InputStream[] getAttachedImagingStudies() {
		return attachedImagingStudies;
	}

	public void setAttachedImagingStudies(InputStream[] attachedImagingStudies) {
		this.attachedImagingStudies = attachedImagingStudies;
	}

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
