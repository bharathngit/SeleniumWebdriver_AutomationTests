package inheritance;

public class patient {

	public static void main(String[] args) {
		/*
		Apollo a=new Apollo();
		GovtHospital h=new GovtHospital();
		Hospital h1=new Apollo();

		a.Operate();
		a.Scan();
		a.vaccinate();
		System.out.println("-------------");
		h.Operate();
		h.Scan();
		h.vaccinate();
		System.out.println("-------------");
		h1.Operate();
		h1.Scan();
		h1.vaccinate();
		a.phoneconsult();
		//h1.phoneconsult();
		*/

		//StreetHospital s=new StreetHospital(); //Cant create object of an abstractclass
				
				
		CityHospital c=new CityHospital();
		c.Operate();
		c.Scan();
		c.vaccinate();
		
	}

}
