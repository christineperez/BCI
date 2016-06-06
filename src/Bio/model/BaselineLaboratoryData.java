package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryData {
	private int laboratoryDataId;
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
	private String myelocytes;
	private String metamyelocytes;
	private String blasts;
	private String plateletCount;
	private boolean notDoneOtherLabParameter;
	private String creatinine;
	private String uricAcid;
	private String reticulocyteCount;
	private String serumIron;
	private String ironBindingCapacity;
	private String serumFerritin;
	private String directAntiglobulin;
	private String indirectAntiglobulin;
	private String sgot;
	private String sgpt;
	private String ldh;
	private String hepaVirus;
	private String cytoVirus;
	private String erythropoeitinLevel;
	private String serumFolicAcid;
	private String serumB12;
	private String tsh;
	private Date datePerformed;
	private String description;
	private InputStream[] attachedBoneMarrowAspirateAndBiopsyResult;
	private String resultFlowCytometry;
	private InputStream[] attachedFlowCytometry;
	private String resultCytogenicAndMolecularAnalysisAaAndPnh;
	private InputStream[] attachedCytogenicAndMolecularAnalysisAaAndPnh;
	private String resultCytogenicAndMolecularAnalysisMds;
	private InputStream[] attachedCytogenicAndMolecularAnalysisMds;

	public int getLaboratoryDataId() {
		return laboratoryDataId;
	}

	public void setLaboratoryDataId(int laboratoryDataId) {
		this.laboratoryDataId = laboratoryDataId;
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

	public boolean getNotDoneOtherLabParameter() {
		return notDoneOtherLabParameter;
	}

	public void setNotDoneOtherLabParameter(boolean notDoneOtherLabParameter) {
		this.notDoneOtherLabParameter = notDoneOtherLabParameter;
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

	public String getReticulocyteCount() {
		return reticulocyteCount;
	}

	public void setReticulocyteCount(String reticulocyteCount) {
		this.reticulocyteCount = reticulocyteCount;
	}

	public String getSerumIron() {
		return serumIron;
	}

	public void setSerumIron(String serumIron) {
		this.serumIron = serumIron;
	}

	public String getIronBindingCapacity() {
		return ironBindingCapacity;
	}

	public void setIronBindingCapacity(String ironBindingCapacity) {
		this.ironBindingCapacity = ironBindingCapacity;
	}

	public String getSerumFerritin() {
		return serumFerritin;
	}

	public void setSerumFerritin(String serumFerritin) {
		this.serumFerritin = serumFerritin;
	}

	public String getDirectAntiglobulin() {
		return directAntiglobulin;
	}

	public void setDirectAntiglobulin(String directAntiglobulin) {
		this.directAntiglobulin = directAntiglobulin;
	}

	public String getIndirectAntiglobulin() {
		return indirectAntiglobulin;
	}

	public void setIndirectAntiglobulin(String indirectAntiglobulin) {
		this.indirectAntiglobulin = indirectAntiglobulin;
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

	public String getHepaVirus() {
		return hepaVirus;
	}

	public void setHepaVirus(String hepaVirus) {
		this.hepaVirus = hepaVirus;
	}

	public String getCytoVirus() {
		return cytoVirus;
	}

	public void setCytoVirus(String cytoVirus) {
		this.cytoVirus = cytoVirus;
	}

	public String getErythropoeitinLevel() {
		return erythropoeitinLevel;
	}

	public void setErythropoeitinLevel(String erythropoeitinLevel) {
		this.erythropoeitinLevel = erythropoeitinLevel;
	}

	public String getSerumFolicAcid() {
		return serumFolicAcid;
	}

	public void setSerumFolicAcid(String serumFolicAcid) {
		this.serumFolicAcid = serumFolicAcid;
	}

	public String getSerumB12() {
		return serumB12;
	}

	public void setSerumB12(String serumB12) {
		this.serumB12 = serumB12;
	}

	public String getTsh() {
		return tsh;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
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

	public String getResultCytogenicAndMolecularAnalysisAaAndPnh() {
		return resultCytogenicAndMolecularAnalysisAaAndPnh;
	}

	public void setResultCytogenicAndMolecularAnalysisAaAndPnh(String resultCytogenicAndMolecularAnalysisAaAndPnh) {
		this.resultCytogenicAndMolecularAnalysisAaAndPnh = resultCytogenicAndMolecularAnalysisAaAndPnh;
	}

	public InputStream[] getAttachedCytogenicAndMolecularAnalysisAaAndPnh() {
		return attachedCytogenicAndMolecularAnalysisAaAndPnh;
	}

	public void setAttachedCytogenicAndMolecularAnalysisAaAndPnh(
			InputStream[] attachedCytogenicAndMolecularAnalysisAaAndPnh) {
		this.attachedCytogenicAndMolecularAnalysisAaAndPnh = attachedCytogenicAndMolecularAnalysisAaAndPnh;
	}

	public String getResultCytogenicAndMolecularAnalysisMds() {
		return resultCytogenicAndMolecularAnalysisMds;
	}

	public void setResultCytogenicAndMolecularAnalysisMds(String resultCytogenicAndMolecularAnalysisMds) {
		this.resultCytogenicAndMolecularAnalysisMds = resultCytogenicAndMolecularAnalysisMds;
	}

	public InputStream[] getAttachedCytogenicAndMolecularAnalysisMds() {
		return attachedCytogenicAndMolecularAnalysisMds;
	}

	public void setAttachedCytogenicAndMolecularAnalysisMds(InputStream[] attachedCytogenicAndMolecularAnalysisMds) {
		this.attachedCytogenicAndMolecularAnalysisMds = attachedCytogenicAndMolecularAnalysisMds;
	}

}
