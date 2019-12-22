package exceptionHAndling;

public class ThrowsKeyWord {

	public static void main(String[] args){
		ThrowsKeyWord obj = new ThrowsKeyWord();
		try {
			obj.launchBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void launchBrowser () throws Exception{
		System.out.println("launchBrowser");
		launchUrl();
		
	}
	
	public void launchUrl() throws Exception{
		System.out.println("launchUrl");
		login();
	}
	public void login() throws Exception {
		System.out.println("Do....login");
		int i =9/0;
		System.out.println("ABC");
	}
	
	
	
	
}
