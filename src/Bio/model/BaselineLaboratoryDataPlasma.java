package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class BaselineLaboratoryDataPlasma {
	private int baselineLaboratoryDataPlasmaId;
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
	//Blood Chemistry
	private boolean notDoneLabParameterBloodChemistry;
	private String bun;
	private String creatinine;
	private String uricAcid;
	private String ica;
	private String na;
	private String k;
	private String totalProtein;
	private String aluminum;
	private String globulin;
	private String b2Microglobulin;
	private String ldh;
	private String imagingStudiesResult;
	private Date datePerformed;
	private String descriptionBoneMarrowAspirateAndBiopsyResult;
	private String attachedBoneMarrowAspirateAndBiopsyResult;
	private String resultSerumFreeLightChainAssay;
	private InputStream[] attachedSerumFreeLightChainAssay;
	private String resultSerumProteinElectrophoresis;
	private InputStream[] attachedSerumProteinElectrophoresis;
	private String resultSerumImmunofixation;
	private InputStream[] attachedSerumImmunofixation;
	private String resultUrineProteinElectrophoresis;
	private InputStream[] attachedUrineProteinElectrophoresis;
	private String resultCytogeneticMolecularAnalysis;
	private InputStream[] attachedCytogeneticMolecularAnalysis;
	public int getBaselineLaboratoryDataPlasmaId() {
		return baselineLaboratoryDataPlasmaId;
	}
	public void setBaselineLaboratoryDataPlasmaId(int baselineLaboratoryDataPlasmaId) {
		this.baselineLaboratoryDataPlasmaId = baselineLaboratoryDataPlasmaId;
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
	public boolean isNotDoneLabParameterBloodChemistry() {
		return notDoneLabParameterBloodChemistry;
	}
	public void setNotDoneLabParameterBloodChemistry(boolean notDoneLabParameterBloodChemistry) {
		this.notDoneLabParameterBloodChemistry = notDoneLabParameterBloodChemistry;
	}
	public String getBun() {
		return bun;
	}
	public void setBun(String bun) {
		this.bun = bun;
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
	public String getIca() {
		return ica;
	}
	public void setIca(String ica) {
		this.ica = ica;
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
	public String getTotalProtein() {
		return totalProtein;
	}
	public void setTotalProtein(String totalProtein) {
		this.totalProtein = totalProtein;
	}
	public String getAluminum() {
		return aluminum;
	}
	public void setAluminum(String aluminum) {
		this.aluminum = aluminum;
	}
	public String getGlobulin() {
		return globulin;
	}
	public void setGlobulin(String globulin) {
		this.globulin = globulin;
	}
	public String getB2Microglobulin() {
		return b2Microglobulin;
	}
	public void setB2Microglobulin(String b2Microglobulin) {
		this.b2Microglobulin = b2Microglobulin;
	}
	public String getLdh() {
		return ldh;
	}
	public void setLdh(String ldh) {
		this.ldh = ldh;
	}
	public String getImagingStudiesResult() {
		return imagingStudiesResult;
	}
	public void setImagingStudiesResult(String imagingStudiesResult) {
		this.imagingStudiesResult = imagingStudiesResult;
	}
	public Date getDatePerformed() {
		return datePerformed;
	}
	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}
	public String getDescriptionBoneMarrowAspirateAndBiopsyResult() {
		return descriptionBoneMarrowAspirateAndBiopsyResult;
	}
	public void setDescriptionBoneMarrowAspirateAndBiopsyResult(String descriptionBoneMarrowAspirateAndBiopsyResult) {
		this.descriptionBoneMarrowAspirateAndBiopsyResult = descriptionBoneMarrowAspirateAndBiopsyResult;
	}
	public String getAttachedBoneMarrowAspirateAndBiopsyResult() {
		return attachedBoneMarrowAspirateAndBiopsyResult;
	}
	public void setAttachedBoneMarrowAspirateAndBiopsyResult(String attachedBoneMarrowAspirateAndBiopsyResult) {
		this.attachedBoneMarrowAspirateAndBiopsyResult = attachedBoneMarrowAspirateAndBiopsyResult;
	}
	public String getResultSerumFreeLightChainAssay() {
		return resultSerumFreeLightChainAssay;
	}
	public void setResultSerumFreeLightChainAssay(String resultSerumFreeLightChainAssay) {
		this.resultSerumFreeLightChainAssay = resultSerumFreeLightChainAssay;
	}
	public InputStream[] getAttachedSerumFreeLightChainAssay() {
		return attachedSerumFreeLightChainAssay;
	}
	public void setAttachedSerumFreeLightChainAssay(InputStream[] attachedSerumFreeLightChainAssay) {
		this.attachedSerumFreeLightChainAssay = attachedSerumFreeLightChainAssay;
	}
	public String getResultSerumProteinElectrophoresis() {
		return resultSerumProteinElectrophoresis;
	}
	public void setResultSerumProteinElectrophoresis(String resultSerumProteinElectrophoresis) {
		this.resultSerumProteinElectrophoresis = resultSerumProteinElectrophoresis;
	}
	public InputStream[] getAttachedSerumProteinElectrophoresis() {
		return attachedSerumProteinElectrophoresis;
	}
	public void setAttachedSerumProteinElectrophoresis(InputStream[] attachedSerumProteinElectrophoresis) {
		this.attachedSerumProteinElectrophoresis = attachedSerumProteinElectrophoresis;
	}
	public String getResultSerumImmunofixation() {
		return resultSerumImmunofixation;
	}
	public void setResultSerumImmunofixation(String resultSerumImmunofixation) {
		this.resultSerumImmunofixation = resultSerumImmunofixation;
	}
	public InputStream[] getAttachedSerumImmunofixation() {
		return attachedSerumImmunofixation;
	}
	public void setAttachedSerumImmunofixation(InputStream[] attachedSerumImmunofixation) {
		this.attachedSerumImmunofixation = attachedSerumImmunofixation;
	}
	public String getResultUrineProteinElectrophoresis() {
		return resultUrineProteinElectrophoresis;
	}
	public void setResultUrineProteinElectrophoresis(String resultUrineProteinElectrophoresis) {
		this.resultUrineProteinElectrophoresis = resultUrineProteinElectrophoresis;
	}
	public InputStream[] getAttachedUrineProteinElectrophoresis() {
		return attachedUrineProteinElectrophoresis;
	}
	public void setAttachedUrineProteinElectrophoresis(InputStream[] attachedUrineProteinElectrophoresis) {
		this.attachedUrineProteinElectrophoresis = attachedUrineProteinElectrophoresis;
	}
	public String getResultCytogeneticMolecularAnalysis() {
		return resultCytogeneticMolecularAnalysis;
	}
	public void setResultCytogeneticMolecularAnalysis(String resultCytogeneticMolecularAnalysis) {
		this.resultCytogeneticMolecularAnalysis = resultCytogeneticMolecularAnalysis;
	}
	public InputStream[] getAttachedCytogeneticMolecularAnalysis() {
		return attachedCytogeneticMolecularAnalysis;
	}
	public void setAttachedCytogeneticMolecularAnalysis(InputStream[] attachedCytogeneticMolecularAnalysis) {
		this.attachedCytogeneticMolecularAnalysis = attachedCytogeneticMolecularAnalysis;
	}
	
	
}
