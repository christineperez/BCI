package Bio.utility.sql;

public interface SQLCommands {

	String LOGIN_DETAILS="select Username, Password from AccountTable where Username=? and Password=?";
	String SEARCH_ACCOUNT="select * from AccountTable where Username=?";
}
