import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the GC car app");
		
		System.out.println("How many cars would you like to enter?");
		
		scnr.nextInt();
		
		
		
		addCar();
		System.out.println("Current inventory.");
		listCars();
		
		//CarAppPartTwo.listCars();

	}
	
	public static void addCar() {
	
		Car car = new Car();
		
		System.out.print("Make: ");
		car.setMake(scnr.nextLine());
			
		System.out.print("Model: ");
		car.setModel(scnr.nextLine());
		
		System.out.print("Year: ");
		car.setYear(scnr.nextInt());
		
		System.out.println("Price: ");
		car.setPrice(scnr.nextDouble());
		
		//scnr.nextLine();
		
		cars.add(car);
		
	
		
	}
	
	public static void listCars() {
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car" + (i+1) + ": " + cars.get(i));
			
		}
	
	}
	
}
