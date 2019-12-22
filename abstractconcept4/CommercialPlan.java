package abstractconcept4;

public class CommercialPlan extends UtiltityPlan {

	@Override
	public void getRate() {
rate = 5.0;		
	}

	@Override
	public void userDiscount(int discount, double percent) {
		
		System.out.println("Discount is "+(discount*percent));
	}

	
}
