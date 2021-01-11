package inheritance;

public class GovtHospital implements Hospital{

	@Override
	public void Scan() {
		System.out.println("Govt Scan");
		
	}

	@Override
	public void Operate() {
		System.out.println("Govt Operate");
		
	}

	@Override
	public void vaccinate() {
		System.out.println("Govt vaccinate");		
	}

}
