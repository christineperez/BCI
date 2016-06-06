package Bio.model;

import java.io.InputStream;
import java.sql.Date;

public class FollowUpLaboratoryDataPlasma {
	private int followUpLaboratoryDataPlasmaId;
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
	// Blood Chemistry
	private boolean notDoneBloodChemistry;
	private String creatine;
	private String ionizedCalcium;
	private String totalProtein;
	private String albumin;
	private String globulin;
	private Date datePerformedImagingStudies;
	private String descriptionImagingStudies;
	private InputStream[] attachedImagingStudies;
	private Date datePerformedSerumFreeLightChainAssay;
	private String descriptionSerumFreeLightChainAssay;
	private InputStream[] attachedSerumFreeLightChainAssay;
	private Date datePerformedSerumProteinElectrophoresis;
	private String descriptionSerumProteinElectrophoresis;
	private InputStream[] attachedSerumProteinElectrophoresis;
	private Date datePerformedSerumImmunofixation;
	private String descriptionSerumImmunofixation;
	private InputStream[] attachedSerumImmunofixation;
	private Date datePerformedUrineProteinElectrophoresis;
	private String descriptionUrineProteinElectrophoresis;
	private InputStream[] attachedUrineProteinElectrophoresis;

	public int getFollowUpLaboratoryDataPlasmaId() {
		return followUpLaboratoryDataPlasmaId;
	}

	public void setFollowUpLaboratoryDataPlasmaId(int followUpLaboratoryDataPlasmaId) {
		this.followUpLaboratoryDataPlasmaId = followUpLaboratoryDataPlasmaId;
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

	public boolean isNotDoneBloodChemistry() {
		return notDoneBloodChemistry;
	}

	public void setNotDoneBloodChemistry(boolean notDoneBloodChemistry) {
		this.notDoneBloodChemistry = notDoneBloodChemistry;
	}

	public String getCreatine() {
		return creatine;
	}

	public void setCreatine(String creatine) {
		this.creatine = creatine;
	}

	public String getIonizedCalcium() {
		return ionizedCalcium;
	}

	public void setIonizedCalcium(String ionizedCalcium) {
		this.ionizedCalcium = ionizedCalcium;
	}

	public String getTotalProtein() {
		return totalProtein;
	}

	public void setTotalProtein(String totalProtein) {
		this.totalProtein = totalProtein;
	}

	public String getAlbumin() {
		return albumin;
	}

	public void setAlbumin(String albumin) {
		this.albumin = albumin;
	}

	public String getGlobulin() {
		return globulin;
	}

	public void setGlobulin(String globulin) {
		this.globulin = globulin;
	}

	public Date getDatePerformedImagingStudies() {
		return datePerformedImagingStudies;
	}

	public void setDatePerformedImagingStudies(Date datePerformedImagingStudies) {
		this.datePerformedImagingStudies = datePerformedImagingStudies;
	}

	public String getDescriptionImagingStudies() {
		return descriptionImagingStudies;
	}

	public void setDescriptionImagingStudies(String descriptionImagingStudies) {
		this.descriptionImagingStudies = descriptionImagingStudies;
	}

	public InputStream[] getAttachedImagingStudies() {
		return attachedImagingStudies;
	}

	public void setAttachedImagingStudies(InputStream[] attachedImagingStudies) {
		this.attachedImagingStudies = attachedImagingStudies;
	}

	public Date getDatePerformedSerumFreeLightChainAssay() {
		return datePerformedSerumFreeLightChainAssay;
	}

	public void setDatePerformedSerumFreeLightChainAssay(Date datePerformedSerumFreeLightChainAssay) {
		this.datePerformedSerumFreeLightChainAssay = datePerformedSerumFreeLightChainAssay;
	}

	public String getDescriptionSerumFreeLightChainAssay() {
		return descriptionSerumFreeLightChainAssay;
	}

	public void setDescriptionSerumFreeLightChainAssay(String descriptionSerumFreeLightChainAssay) {
		this.descriptionSerumFreeLightChainAssay = descriptionSerumFreeLightChainAssay;
	}

	public InputStream[] getAttachedSerumFreeLightChainAssay() {
		return attachedSerumFreeLightChainAssay;
	}

	public void setAttachedSerumFreeLightChainAssay(InputStream[] attachedSerumFreeLightChainAssay) {
		this.attachedSerumFreeLightChainAssay = attachedSerumFreeLightChainAssay;
	}

	public Date getDatePerformedSerumProteinElectrophoresis() {
		return datePerformedSerumProteinElectrophoresis;
	}

	public void setDatePerformedSerumProteinElectrophoresis(Date datePerformedSerumProteinElectrophoresis) {
		this.datePerformedSerumProteinElectrophoresis = datePerformedSerumProteinElectrophoresis;
	}

	public String getDescriptionSerumProteinElectrophoresis() {
		return descriptionSerumProteinElectrophoresis;
	}

	public void setDescriptionSerumProteinElectrophoresis(String descriptionSerumProteinElectrophoresis) {
		this.descriptionSerumProteinElectrophoresis = descriptionSerumProteinElectrophoresis;
	}

	public InputStream[] getAttachedSerumProteinElectrophoresis() {
		return attachedSerumProteinElectrophoresis;
	}

	public void setAttachedSerumProteinElectrophoresis(InputStream[] attachedSerumProteinElectrophoresis) {
		this.attachedSerumProteinElectrophoresis = attachedSerumProteinElectrophoresis;
	}

	public Date getDatePerformedSerumImmunofixation() {
		return datePerformedSerumImmunofixation;
	}

	public void setDatePerformedSerumImmunofixation(Date datePerformedSerumImmunofixation) {
		this.datePerformedSerumImmunofixation = datePerformedSerumImmunofixation;
	}

	public String getDescriptionSerumImmunofixation() {
		return descriptionSerumImmunofixation;
	}

	public void setDescriptionSerumImmunofixation(String descriptionSerumImmunofixation) {
		this.descriptionSerumImmunofixation = descriptionSerumImmunofixation;
	}

	public InputStream[] getAttachedSerumImmunofixation() {
		return attachedSerumImmunofixation;
	}

	public void setAttachedSerumImmunofixation(InputStream[] attachedSerumImmunofixation) {
		this.attachedSerumImmunofixation = attachedSerumImmunofixation;
	}

	public Date getDatePerformedUrineProteinElectrophoresis() {
		return datePerformedUrineProteinElectrophoresis;
	}

	public void setDatePerformedUrineProteinElectrophoresis(Date datePerformedUrineProteinElectrophoresis) {
		this.datePerformedUrineProteinElectrophoresis = datePerformedUrineProteinElectrophoresis;
	}

	public String getDescriptionUrineProteinElectrophoresis() {
		return descriptionUrineProteinElectrophoresis;
	}

	public void setDescriptionUrineProteinElectrophoresis(String descriptionUrineProteinElectrophoresis) {
		this.descriptionUrineProteinElectrophoresis = descriptionUrineProteinElectrophoresis;
	}

	public InputStream[] getAttachedUrineProteinElectrophoresis() {
		return attachedUrineProteinElectrophoresis;
	}

	public void setAttachedUrineProteinElectrophoresis(InputStream[] attachedUrineProteinElectrophoresis) {
		this.attachedUrineProteinElectrophoresis = attachedUrineProteinElectrophoresis;
	}

}
