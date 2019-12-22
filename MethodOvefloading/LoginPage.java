package MethodOvefloading;

public class LoginPage {
	String N;
	int C;
	int x;

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.login("nahiangmat15@gmail.com", "emba9071");
		lp.C = 518567999;
		lp.N = "Nahian";

		System.out.println(lp.C + "  " + lp.N);
		lp.login(519, "emba9071");

	}

	// within class, when we have different methods with same name but different
	// number of params and types / sequence of params.
	public void login() {
		System.out.println("login 0 param method");
	}

	public void login(String username) {
		System.out.println("login 1 param method");
	}

	public void login(String username, String password) {
		System.out.println(username + "   " + password);
	}

	public void login(int phone, String password) {
		System.out.println(phone + " " + password);
	}

	public void login(String username, int phone) {
		System.out.println("login 2 params method");
	}

	public void login(int OTP) {

	}

}
