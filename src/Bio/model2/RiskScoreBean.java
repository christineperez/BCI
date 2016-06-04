package Bio.model2;

public class RiskScoreBean {

private int clinicalDataIdNumber;
private int riskScoreId;
private String score;

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
public String getScore() {
	return score;
}
public void setScore(String score) {
	this.score = score;
}
}
