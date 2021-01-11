package inheritance;

public class toyota extends Car{

	//Overloading
	public void steering(String color){
		System.out.println("Toyota Steering wheel"+color);
	}
	public void steering(int number){
		System.out.println("Toyota Steering wheel"+number);
	}
	@Override
	public void doors(){
		System.out.println("Toyota Doors");
	}
}
