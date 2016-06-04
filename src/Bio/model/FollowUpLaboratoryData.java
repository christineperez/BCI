package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class FollowUpLaboratoryData {
	private int followUpLaboratoryDataId;
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
	private Boolean notDoneOtherLabParameter;
	private String reticulocyteCount;
	private String ldh;
	private String serumFerritin;
	private String creatinine;
	private Date datePerformed;
	private String description;
	private InputStream[] attachedBoneMarrowAspirateAndBiopsyResult;
	private String resultFlowCytometry;
	private InputStream[] attachedFlowCytometry;
	private String resultCytogenicAndMolecularAnalysis;
	private InputStream[] attachedCytogenicAndMolecularAnalysis;
	public int getFollowUpLaboratoryDataId() {
		return followUpLaboratoryDataId;
	}
	public void setFollowUpLaboratoryDataId(int followUpLaboratoryDataId) {
		this.followUpLaboratoryDataId = followUpLaboratoryDataId;
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
	public Boolean getNotDoneOtherLabParameter() {
		return notDoneOtherLabParameter;
	}
	public void setNotDoneOtherLabParameter(Boolean notDoneOtherLabParameter) {
		this.notDoneOtherLabParameter = notDoneOtherLabParameter;
	}
	public String getReticulocyteCount() {
		return reticulocyteCount;
	}
	public void setReticulocyteCount(String reticulocyteCount) {
		this.reticulocyteCount = reticulocyteCount;
	}
	public String getLdh() {
		return ldh;
	}
	public void setLdh(String ldh) {
		this.ldh = ldh;
	}
	public String getSerumFerritin() {
		return serumFerritin;
	}
	public void setSerumFerritin(String serumFerritin) {
		this.serumFerritin = serumFerritin;
	}
	public String getCreatinine() {
		return creatinine;
	}
	public void setCreatinine(String creatinine) {
		this.creatinine = creatinine;
	}
	public Date getDatePerformed() {
		return datePerformed;
	}
	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public InputStream[] getAttachedBoneMarrowAspirateAndBiopsyResult() {
		return attachedBoneMarrowAspirateAndBiopsyResult;
	}
	public void setAttachedBoneMarrowAspirateAndBiopsyResult(InputStream[] attachedBoneMarrowAspirateAndBiopsyResult) {
		this.attachedBoneMarrowAspirateAndBiopsyResult = attachedBoneMarrowAspirateAndBiopsyResult;
	}
	public String getResultFlowCytometry() {
		return resultFlowCytometry;
	}
	public void setResultFlowCytometry(String resultFlowCytometry) {
		this.resultFlowCytometry = resultFlowCytometry;
	}
	public InputStream[] getAttachedFlowCytometry() {
		return attachedFlowCytometry;
	}
	public void setAttachedFlowCytometry(InputStream[] attachedFlowCytometry) {
		this.attachedFlowCytometry = attachedFlowCytometry;
	}
	public String getResultCytogenicAndMolecularAnalysis() {
		return resultCytogenicAndMolecularAnalysis;
	}
	public void setResultCytogenicAndMolecularAnalysis(String resultCytogenicAndMolecularAnalysis) {
		this.resultCytogenicAndMolecularAnalysis = resultCytogenicAndMolecularAnalysis;
	}
	public InputStream[] getAttachedCytogenicAndMolecularAnalysis() {
		return attachedCytogenicAndMolecularAnalysis;
	}
	public void setAttachedCytogenicAndMolecularAnalysis(InputStream[] attachedCytogenicAndMolecularAnalysis) {
		this.attachedCytogenicAndMolecularAnalysis = attachedCytogenicAndMolecularAnalysis;
	}
	
	
}
