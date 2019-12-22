	package function;

import java.util.ArrayList;

public class FunctionConcepts {

	public static void main(String[] args) {
	
		FunctionConcepts obj = new FunctionConcepts();
		obj.test();
		obj.printCountry();

		String n = obj.getTrainerName();
		System.out.println(n);
		System.out.println(obj.getTrainerName());
		String names [] = obj.getStudentName();
		System.out.println(names.length);
		for (int i =0; i<names.length; i++) {
		System.out.println(names[i]); 
		String a = obj.getCountryName("Bangladesh");
		System.out.println(a);
		
		boolean b = obj.isUSCitizen("Nahian");
		System.out.println(b);
		System.out.println(obj.isUSCitizen("Sarang"));
		}
		
		
	}
	//No input no return
	public void test() {
		System.out.println("test method");
		System.out.println(10 + 20);
}

	public void printCountry() {
		System.out.println("India");
	}
// No input some return
	public String getTrainerName() {
	System.out.println("get trainer method");
	String Name = "Nahian";
	return Name;
	}

public String[] getStudentName() {
System.out.println("Get student name");                                                          
String names[]= new String [3];
	names[0]="Tom";
	names[1]="nom";
	names[2]="nahian";
	return names;
	}
public ArrayList<String> getHotelList()
{
	System.out.println("Get hotel name");
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("mariot1");
	ar.add("mariot2");
	ar.add("taj");
	return ar;
}
public int addition(int a, int b) {
	System.out.println("addition method...");
	int c = a + b;
	return c;
}

public String getCountryName(String countryname) {
System.out.println("get capital name...");
if(countryname.equals("india")) {
	return ("delhi");}
	else if (countryname.equals("Bangladesh")) {
		return("Dhaka");
		}


return "No country found ";
}
public boolean isUSCitizen(String studentName) {

	if (studentName.equals("Sarang")) {
		return false;
	} else if (studentName.equals("Lisa")) {
		return true;
	} else {
		return false;
	}


}
}

