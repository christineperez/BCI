package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryDataMyelo {
	private int baselineLaboratoryDataLymphomaI;
	private Date dateOfBloodCollection;
	// Hematology
	private boolean notDoneHematology;
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

	// Blood Chemistry
	private boolean notDoneLabParameterBloodChemistry;
	private String creatinine;
	private String uricAcid;
	private String sgot;
	private String sgpt;
	private String ldh;
	private String epo;
	private Date datePerformedBoneMarrow;
	private String descriptionBoneMarrowAspirateAndBiopsyResult;
	private InputStream[] attachedBoneMarrowAspirateAndBiopsyResult;
	private String resultMolecularAnalysis;
	private InputStream[] attachedFlowCytometry;

	public int getBaselineLaboratoryDataLymphomaI() {
		return baselineLaboratoryDataLymphomaI;
	}

	public void setBaselineLaboratoryDataLymphomaI(int baselineLaboratoryDataLymphomaI) {
		this.baselineLaboratoryDataLymphomaI = baselineLaboratoryDataLymphomaI;
	}

	public String getEpo() {
		return epo;
	}

	public void setEpo(String epo) {
		this.epo = epo;
	}

	public String getResultMolecularAnalysis() {
		return resultMolecularAnalysis;
	}

	public void setResultMolecularAnalysis(String resultMolecularAnalysis) {
		this.resultMolecularAnalysis = resultMolecularAnalysis;
	}

	public Date getDatePerformedBoneMarrow() {
		return datePerformedBoneMarrow;
	}

	public void setDatePerformedBoneMarrow(Date datePerformedBoneMarrow) {
		this.datePerformedBoneMarrow = datePerformedBoneMarrow;
	}

	public Date getDateOfBloodCollection() {
		return dateOfBloodCollection;
	}

	public void setDateOfBloodCollection(Date dateOfBloodCollection) {
		this.dateOfBloodCollection = dateOfBloodCollection;
	}

	public boolean getNotDoneHematology() {
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

	public boolean getNotDoneLabParameterBloodChemistry() {
		return notDoneLabParameterBloodChemistry;
	}

	public void setNotDoneLabParameterBloodChemistry(boolean notDoneLabParameterBloodChemistry) {
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

	public String getDescriptionBoneMarrowAspirateAndBiopsyResult() {
		return descriptionBoneMarrowAspirateAndBiopsyResult;
	}

	public void setDescriptionBoneMarrowAspirateAndBiopsyResult(String descriptionBoneMarrowAspirateAndBiopsyResult) {
		this.descriptionBoneMarrowAspirateAndBiopsyResult = descriptionBoneMarrowAspirateAndBiopsyResult;
	}

	public InputStream[] getAttachedBoneMarrowAspirateAndBiopsyResult() {
		return attachedBoneMarrowAspirateAndBiopsyResult;
	}

	public void setAttachedBoneMarrowAspirateAndBiopsyResult(InputStream[] attachedBoneMarrowAspirateAndBiopsyResult) {
		this.attachedBoneMarrowAspirateAndBiopsyResult = attachedBoneMarrowAspirateAndBiopsyResult;
	}

	public InputStream[] getAttachedFlowCytometry() {
		return attachedFlowCytometry;
	}

	public void setAttachedFlowCytometry(InputStream[] attachedFlowCytometry) {
		this.attachedFlowCytometry = attachedFlowCytometry;
	}

}
