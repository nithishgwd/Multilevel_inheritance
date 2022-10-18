package nithish_221047018;

class Car{
	//Constructor
	 public Car(){
		 System.out.println("Class Car");
	   }
	   public void vehicleType(){
		   System.out.println("Vehicle Type: Car");
	   }
}

//"Maruti" class inherits the features from a parent class "Car"  
class Maruti extends Car{
	//Constructor
	public Maruti(){
		System.out.println("Class Maruti");
	   }
	   public void brand(){
		System.out.println("Brand: Maruti");
	   }
	   public void speed(){
		System.out.println("Max: 90Kmph");
	   }
	}

//"Multilevel_inheritance" class inherits the features from a parent class "Maruti"  
public class Multilevel_inheritance extends Maruti{
	//Constructor
	public Multilevel_inheritance(){
		System.out.println("Maruti Model: 800");
	   }
	
	//method overriding,a subclass overrides a method with the same signature as that of in its superclass
	public void speed(){
		System.out.println("Max: 80Kmph");
	   }
	public static void main(String args[]){
		System.out.println("\nMultilevel_inheritance class extends Maruti class\n");
		Multilevel_inheritance obj = new Multilevel_inheritance();
		obj.vehicleType();
		obj.brand();
		//speed inherited is overridden 
		obj.speed();
		
		System.out.println("\nMaruti class extends Car class\n");
		Maruti obj1 = new Maruti();
		System.out.println("speed method of class Maruti");
		obj1.speed();
	   }
	}
		
	   
