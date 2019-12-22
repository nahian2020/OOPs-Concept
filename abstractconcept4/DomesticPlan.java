package abstractconcept4;

public class DomesticPlan extends UtiltityPlan {

	@Override
	public void getRate() {
rate = 2.60;		
	}

	@Override
	public void userDiscount(int discount, double percent) {
		System.out.println("Discount is "+(discount*percent));
	}

}
