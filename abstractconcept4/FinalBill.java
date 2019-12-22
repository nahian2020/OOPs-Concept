package abstractconcept4;

public class FinalBill {

	public static void main(String[] args) {
		CommercialPlan bill = new CommercialPlan();
		DomesticPlan bill1 = new DomesticPlan();
		System.out.println("Commercial Connection");
		bill.getRate();
		bill.calculateBill(250);
		bill.userDiscount(100, 0.1);

		System.out.println("Domestic  Connection");

		bill1.getRate();
		bill1.calculateBill(150);
		bill1.userDiscount(100, 0.3);
	}

}
