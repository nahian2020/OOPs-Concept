package interfaceconcept;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloHospital ap = new ApolloHospital();
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.medicalInsurance();
		ap.ENTServices();
		ap.RadiologyServices();
		ap.getPatientData();
		ap.polioServices();
		System.out.println(ap.min_fee);
		
		USMedical us = new ApolloHospital();
		us.physioService();
		us.oncologyServices();
		us.orthopedicServices();
		
		UKMedical uk =  new ApolloHospital();
		uk.ambulanceServices();
		uk.ENTServices();
	}

}
