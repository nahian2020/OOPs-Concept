package function;

public class StaticAndNonStaticConcept {
	String name;
	static int age = 25;

	public static void main(String[] args) {
		getStart();
		System.out.println(age);
		StaticAndNonStaticConcept.getStart();
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.name = "Nahian";
		System.out.println(obj.name);
		obj.getname();

	}

	public void getname() {
		System.out.println(name + " " + "love you Sawmi");
	}

	public static void getStart() {
		System.out.println("get start");

	}

}
