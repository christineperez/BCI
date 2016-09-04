package Bio.utility;
import Bio.model.*;

public class BioBeanFactory {
	public static AccountBean getFactoryBean(int accountID,int personalInfoID, String username, String password, String salt, int roleID, int active) {
		AccountBean ab = new AccountBean();
		ab.setAccountID(accountID);
		ab.setActive(active);
		ab.setPassword(password);
		ab.setPersonalInfoID(personalInfoID);
		ab.setRoleID(roleID);
		ab.setSalt(salt);
		ab.setUsername(username);
		
		return ab;
	}
}
