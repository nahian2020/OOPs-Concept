package exceptionHAndling;

public class TryCatchBlock {
String name= "Nahian";
	public static void main(String[] args) {
		TryCatchBlock obj = new TryCatchBlock();
		obj= null;
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try{
		int i =9/0;
		}
		catch (Throwable e) {// best approach Throwable 
			//reporting for exception
			e.printStackTrace();
			System.out.println("some exception occrued");
		}
		try {
		System.out.println(obj.name);
		}
		catch(Throwable e) {
			e.printStackTrace();

		}
//		
		
		TryCatchBlock obj1 = new TryCatchBlock();
		

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
		obj1.m1();
		}
		catch(Exception e) {
			
		}
	}
public void m1() {
	System.out.println("m1...method");
	int k= 9/0;
}
}
