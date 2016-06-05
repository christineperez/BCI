package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryDataCoagulation {
	private int BaselineLaboratoryDataCoagulationId;
	private Date dateOfBloodCollection;
	// Hematology
	private Boolean notDoneHematology;
	private String hemoglobin;
	private String hematocrit;
	private String whiteBloodCells;
	private String neutrophils;
	private String lymphocytes;
	private String monocytes;
	private String eosinophils;
	private String basophils;
	private String plateletCount;
	// Coagulation Testing
	private Boolean notDoneLabParameterCoagulation;
	private String factorViiiLevel;
	private String factorIxLevel;
	private String inhibitorAssay;
	private String bethesdaUnits;
	// Blood Chemistry
	private Boolean notDoneLabParameterBloodChemistry;
	private String creatinine;
	private String uricAcid;
	private String na;
	private String k;
	private String sgot;
	private String sgpt;
	private String ldh;
	private String resultImagingStudies;

	public int getBaselineLaboratoryDataCoagulationId() {
		return BaselineLaboratoryDataCoagulationId;
	}

	public void setBaselineLaboratoryDataCoagulationId(int baselineLaboratoryDataCoagulationId) {
		BaselineLaboratoryDataCoagulationId = baselineLaboratoryDataCoagulationId;
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

	public String getPlateletCount() {
		return plateletCount;
	}

	public void setPlateletCount(String plateletCount) {
		this.plateletCount = plateletCount;
	}

	public Boolean getNotDoneLabParameterCoagulation() {
		return notDoneLabParameterCoagulation;
	}

	public void setNotDoneLabParameterCoagulation(Boolean notDoneLabParameterCoagulation) {
		this.notDoneLabParameterCoagulation = notDoneLabParameterCoagulation;
	}

	public String getFactorViiiLevel() {
		return factorViiiLevel;
	}

	public void setFactorViiiLevel(String factorViiiLevel) {
		this.factorViiiLevel = factorViiiLevel;
	}

	public String getFactorIxLevel() {
		return factorIxLevel;
	}

	public void setFactorIxLevel(String factorIxLevel) {
		this.factorIxLevel = factorIxLevel;
	}

	public String getInhibitorAssay() {
		return inhibitorAssay;
	}

	public void setInhibitorAssay(String inhibitorAssay) {
		this.inhibitorAssay = inhibitorAssay;
	}

	public String getBethesdaUnits() {
		return bethesdaUnits;
	}

	public void setBethesdaUnits(String bethesdaUnits) {
		this.bethesdaUnits = bethesdaUnits;
	}

	public Boolean getNotDoneLabParameterBloodChemistry() {
		return notDoneLabParameterBloodChemistry;
	}

	public void setNotDoneLabParameterBloodChemistry(Boolean notDoneLabParameterBloodChemistry) {
		this.notDoneLabParameterBloodChemistry = notDoneLabParameterBloodChemistry;
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

	public String getResultImagingStudies() {
		return resultImagingStudies;
	}

	public void setResultImagingStudies(String resultImagingStudies) {
		this.resultImagingStudies = resultImagingStudies;
	}

}
