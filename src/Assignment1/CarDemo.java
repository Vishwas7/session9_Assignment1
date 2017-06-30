package Assignment1;

abstract class Vehicle {
		
		abstract void Drive();
	}
	 class Car extends Vehicle {
		 
		 @Override
		 void Drive() {
			 System.out.println("My first car");
		 }
	 }
	 
	 public class CarDemo {
		 public static void main(String[] args){
			Vehicle obj= new Car(); 
			obj.Drive();
		 }
	 }


