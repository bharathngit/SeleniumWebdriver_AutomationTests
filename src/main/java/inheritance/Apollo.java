package inheritance;

public class Apollo implements Hospital {

	@Override
	public void Scan() {
		System.out.println("Apollo scan");
		
	}

	@Override
	public void Operate() {
		System.out.println("Apollo Operate");
		
	}

	@Override
	public void vaccinate() {
		System.out.println("Apollo vaccinate");
		
	}
	
	public void phoneconsult(){
		System.out.println("Apollo Phone consult");
	}
	
	
}
