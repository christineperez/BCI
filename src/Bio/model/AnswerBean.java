package Bio.model;

public class AnswerBean {
	private int answerIdNumber;
	private int medicalId;
	private byte answer;

	public int getAnswerIdNumber() {
		return answerIdNumber;
	}

	public void setAnswerIdNumber(int answerIdNumber) {
		this.answerIdNumber = answerIdNumber;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public byte getAnswer() {
		return answer;
	}

	public void setAnswer(byte answer) {
		this.answer = answer;
	}

}
