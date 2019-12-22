package abstractconcept2;

public abstract class TestAnimal {

	public static void main(String[] args) {
Tiger tiger1=new Tiger();
Animal animal1 = new Tiger();//TopCasting

tiger1.createSound();
tiger1.run();
tiger1.sleep();


animal1.doHunt();
animal1.sleep();


	}

}
