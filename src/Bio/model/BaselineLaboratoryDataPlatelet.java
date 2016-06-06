package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryDataPlatelet {
	private int baselineLaboratoryDataPlateletId;
	private Date dateOfBloodCollection;
	private boolean notDoneHematology;
	private String hemoglobin;
	private String hematocrit;
	private String whiteBloodCells;
	private String neutrophils;
	private String lymphocytes;
	private String monocytes;
	private String eosinophils;
	private String basophils;
	private String plateletCount;
	// Blood Chemistry
	private boolean notDoneBloodChemistry;
	private String creatinine;
	private String uricAcid;
	private String na;
	private String k;
	private String sgot;
	private String sgpt;
	private String ldh;
	private String anaTiter;
	private String hepatitisCRna;
	private Date datePerformedBoneMarrowAspirateAndBiopsy;
	private String descriptionBoneMarrowAspirateAndBiopsy;
	private InputStream[] attachedBoneMarrowAspirateAndBiopsy;
	private Date datePerformedUnderGIEndoscopy;
	private String descriptionUnderGIEndoscopy;
	private InputStream[] attachedHPylori;
	private String formOfITP;

	public int getBaselineLaboratoryDataPlateletId() {
		return baselineLaboratoryDataPlateletId;
	}

	public void setBaselineLaboratoryDataPlateletId(int baselineLaboratoryDataPlateletId) {
		this.baselineLaboratoryDataPlateletId = baselineLaboratoryDataPlateletId;
	}

	public Date getDateOfBloodCollection() {
		return dateOfBloodCollection;
	}

	public void setDateOfBloodCollection(Date dateOfBloodCollection) {
		this.dateOfBloodCollection = dateOfBloodCollection;
	}

	public boolean isNotDoneHematology() {
		return notDoneHematology;
	}

	public void setNotDoneHematology(boolean notDoneHematology) {
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

	public String getPlateletCount() {
		return plateletCount;
	}

	public void setPlateletCount(String plateletCount) {
		this.plateletCount = plateletCount;
	}

	public boolean isNotDoneBloodChemistry() {
		return notDoneBloodChemistry;
	}

	public void setNotDoneBloodChemistry(boolean notDoneBloodChemistry) {
		this.notDoneBloodChemistry = notDoneBloodChemistry;
	}

	public String getCreatinine() {
		return creatinine;
	}

	public void setCreatinine(String creatinine) {
		this.creatinine = creatinine;
	}

	public String getUricAcid() {
		return uricAcid;
	}

	public void setUricAcid(String uricAcid) {
		this.uricAcid = uricAcid;
	}

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getSgot() {
		return sgot;
	}

	public void setSgot(String sgot) {
		this.sgot = sgot;
	}

	public String getSgpt() {
		return sgpt;
	}

	public void setSgpt(String sgpt) {
		this.sgpt = sgpt;
	}

	public String getLdh() {
		return ldh;
	}

	public void setLdh(String ldh) {
		this.ldh = ldh;
	}

	public String getAnaTiter() {
		return anaTiter;
	}

	public void setAnaTiter(String anaTiter) {
		this.anaTiter = anaTiter;
	}

	public String getHepatitisCRna() {
		return hepatitisCRna;
	}

	public void setHepatitisCRna(String hepatitisCRna) {
		this.hepatitisCRna = hepatitisCRna;
	}

	public Date getDatePerformedBoneMarrowAspirateAndBiopsy() {
		return datePerformedBoneMarrowAspirateAndBiopsy;
	}

	public void setDatePerformedBoneMarrowAspirateAndBiopsy(Date datePerformedBoneMarrowAspirateAndBiopsy) {
		this.datePerformedBoneMarrowAspirateAndBiopsy = datePerformedBoneMarrowAspirateAndBiopsy;
	}

	public String getDescriptionBoneMarrowAspirateAndBiopsy() {
		return descriptionBoneMarrowAspirateAndBiopsy;
	}

	public void setDescriptionBoneMarrowAspirateAndBiopsy(String descriptionBoneMarrowAspirateAndBiopsy) {
		this.descriptionBoneMarrowAspirateAndBiopsy = descriptionBoneMarrowAspirateAndBiopsy;
	}

	public InputStream[] getAttachedBoneMarrowAspirateAndBiopsy() {
		return attachedBoneMarrowAspirateAndBiopsy;
	}

	public void setAttachedBoneMarrowAspirateAndBiopsy(InputStream[] attachedBoneMarrowAspirateAndBiopsy) {
		this.attachedBoneMarrowAspirateAndBiopsy = attachedBoneMarrowAspirateAndBiopsy;
	}

	public Date getDatePerformedUnderGIEndoscopy() {
		return datePerformedUnderGIEndoscopy;
	}

	public void setDatePerformedUnderGIEndoscopy(Date datePerformedUnderGIEndoscopy) {
		this.datePerformedUnderGIEndoscopy = datePerformedUnderGIEndoscopy;
	}

	public String getDescriptionUnderGIEndoscopy() {
		return descriptionUnderGIEndoscopy;
	}

	public void setDescriptionUnderGIEndoscopy(String descriptionUnderGIEndoscopy) {
		this.descriptionUnderGIEndoscopy = descriptionUnderGIEndoscopy;
	}

	public InputStream[] getAttachedHPylori() {
		return attachedHPylori;
	}

	public void setAttachedHPylori(InputStream[] attachedHPylori) {
		this.attachedHPylori = attachedHPylori;
	}

	public String getFormOfITP() {
		return formOfITP;
	}

	public void setFormOfITP(String formOfITP) {
		this.formOfITP = formOfITP;
	}

}
