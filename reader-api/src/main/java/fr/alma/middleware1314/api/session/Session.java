package fr.alma.middleware1314.api.session;

public interface Session {
	
	public void signup(String user, String pass, String email);
	
	public void signin(String user, String pass);
	
	public void signout(String user, String pass);
	
	public void logout(String user, String pass);
	
}
