package interfaceconcept;

public class ApolloHospital extends GlobalPatientData implements USMedical,UKMedical, IndianMedical   {

	@Override
	public void physioService() {
System.out.println("AP...phsio");		
	}

	@Override
	public void oncologyServices() {
		System.out.println("AP...onco");		
		
	}

	@Override
	public void orthopedicServices() {
		System.out.println("AP...ortho");		
		
	}

	@Override
	public void ENTServices() {
		System.out.println("AP...ENT");		
		
	}

	@Override
	public void ambulanceServices() {
		System.out.println("AP...ambulance");		
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void peditricServices() {
		// TODO Auto-generated method stub
		
	}

	public void OPTServices() {
		System.out.println("AP...OPY");		

	}
	
	public void medicalInsurance() {
		System.out.println("AP...medicalInsurance");		

	}
	
	public void pathology() {
		System.out.println("AP...pathology");		

	}

	@Override
	public void RadiologyServices() {
		System.out.println("AP...Radiology");		
		
	}

	@Override
	public void polioServices() {
		// TODO Auto-generated method stub
		
	}

	
	

}
