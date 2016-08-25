package Bio.model;

public class AccountBean {
	private int accountID;
	private int personalInfoID;
	private String username;
	private String password;
	private String salt;
	private int roleID;
	private int active;
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getPersonalInfoID() {
		return personalInfoID;
	}
	public void setPersonalInfoID(int personalInfoID) {
		this.personalInfoID = personalInfoID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
	
}
