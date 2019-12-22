package abstractconcept4;

public abstract class UtiltityPlan {
	public abstract void getRate();
	double rate ;
	
	public  void calculateBill(int units) {
		System.out.println("Bill amount for " + units + " units : ");
		System.out.println(rate*units +" USD");
	};
	
	public abstract void userDiscount(int discount ,double percent);
	


}
