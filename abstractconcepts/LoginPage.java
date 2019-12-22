package abstractconcepts;

public class LoginPage extends Page {

	
	public LoginPage(){
		System.out.println("Login page const...");
	}
	
	
	@Override
	public void title() {
		System.out.println("login page");
	}

	@Override
	public void url() {
		System.out.println("http://google.com");
	}

	@Override
	public void footerlink() {
		System.out.println("privacy policy");		
	}
	
	@Override
	public void logo() {
		System.out.println("Login page logo");		
	}

	public void doLogin(){
		System.out.println("login to app...");
	}
	
	
	
}
