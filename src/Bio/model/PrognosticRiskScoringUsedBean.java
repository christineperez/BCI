package Bio.model;

public class PrognosticRiskScoringUsedBean {
private int clinicalDataIdNumber;
private int riskScoreId;
private String riskScoring;

public int getClinicalDataIdNumber() {
	return clinicalDataIdNumber;
}
public void setClinicalDataIdNumber(int clinicalDataIdNumber) {
	this.clinicalDataIdNumber = clinicalDataIdNumber;
}
public int getRiskScoreId() {
	return riskScoreId;
}
public void setRiskScoreId(int riskScoreId) {
	this.riskScoreId = riskScoreId;
}
public String getRiskScoring() {
	return riskScoring;
}
public void setRiskScoring(String riskScoring) {
	this.riskScoring = riskScoring;
}
}
