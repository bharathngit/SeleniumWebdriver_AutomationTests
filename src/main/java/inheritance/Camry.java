package inheritance;

public class Camry {
	
	public static void main(String args[]){
		toyota t=new toyota();
		Car c=new Car();
		t.doors();
		
		c.doors();
		System.out.println("------------");
		//Overloading
		t.steering(2);
		t.steering("black");
		t.steering();
		
	}
}
