package abstractconcept2;

public class Tiger extends Animal {

	public Tiger() {
		System.out.println(" Tiger class constructor");
	}
	
	@Override
	public void createSound() {
		System.out.println("Tiger sounds.....Grr..roar");
		
	}

	@Override
	public void doHunt() {
		System.out.println("Tiger love to do hunting");
		
	}

	@Override
	public void eatFood() {
		System.out.println("Tiger love to eat human flesh");
		
	}
	public void run() {
		System.out.println("Tiger run fast");
		
	}

}
