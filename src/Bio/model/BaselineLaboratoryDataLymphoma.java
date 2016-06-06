package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryDataLymphoma {
	private int baselineLaboratoryDataLymphomaId;
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
	private String na;
	private String k;
	private String bilirubin;
	private String total;
	private String direct;
	private String indirect;
	private String sgot;
	private String sgpt;
	private String beta2Microglobulin;
	private String hepatitisBTesting;
	private String ldh;
	private String esr;
	private Date datePerformedHema;
	private String resultHema;
	private Date datePerformedImmuno;
	private String resultImmuno;
	private String resultImagingStudies;
	private Date datePerformedBoneMarrow;
	private String descriptionBoneMarrowAspirateAndBiopsyResult;
	private InputStream[] attachedBoneMarrowAspirateAndBiopsyResult;
	private String resultFlowCytometry;
	private InputStream[] attachedFlowCytometry;

	public int getBaselineLaboratoryDataLymphoma() {
		return baselineLaboratoryDataLymphomaId;
	}

	public void setBaselineLaboratoryDataLymphoma(int baselineLaboratoryDataLymphomaId) {
		this.baselineLaboratoryDataLymphomaId = baselineLaboratoryDataLymphomaId;
	}

	public String getBilirubin() {
		return bilirubin;
	}

	public void setBilirubin(String bilirubin) {
		this.bilirubin = bilirubin;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	public String getIndirect() {
		return indirect;
	}

	public void setIndirect(String indirect) {
		this.indirect = indirect;
	}

	public String getBeta2Microglobulin() {
		return beta2Microglobulin;
	}

	public void setBeta2Microglobulin(String beta2Microglobulin) {
		this.beta2Microglobulin = beta2Microglobulin;
	}

	public String getHepatitisBTesting() {
		return hepatitisBTesting;
	}

	public void setHepatitisBTesting(String hepatitisBTesting) {
		this.hepatitisBTesting = hepatitisBTesting;
	}

	public String getEsr() {
		return esr;
	}

	public void setEsr(String esr) {
		this.esr = esr;
	}

	public Date getDatePerformedHema() {
		return datePerformedHema;
	}

	public void setDatePerformedHema(Date datePerformedHema) {
		this.datePerformedHema = datePerformedHema;
	}

	public String getResultHema() {
		return resultHema;
	}

	public void setResultHema(String resultHema) {
		this.resultHema = resultHema;
	}

	public Date getDatePerformedImmuno() {
		return datePerformedImmuno;
	}

	public void setDatePerformedImmuno(Date datePerformedImmuno) {
		this.datePerformedImmuno = datePerformedImmuno;
	}

	public String getResultImmuno() {
		return resultImmuno;
	}

	public void setResultImmuno(String resultImmuno) {
		this.resultImmuno = resultImmuno;
	}

	public Date getDatePerformedBoneMarrow() {
		return datePerformedBoneMarrow;
	}

	public void setDatePerformedBoneMarrow(Date datePerformedBoneMarrow) {
		this.datePerformedBoneMarrow = datePerformedBoneMarrow;
	}

	public String getResultFlowCytometry() {
		return resultFlowCytometry;
	}

	public void setResultFlowCytometry(String resultFlowCytometry) {
		this.resultFlowCytometry = resultFlowCytometry;
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
