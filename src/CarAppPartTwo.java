import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppPartTwo {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	
	
	
	static {
		cars.add(new Car("Ford", "Bronco", 2020, 35995.00));
		cars.add(new Car("Chevy", "Blazer", 2020, 32499.00));
		cars.add(new Car("Jeep", "Wrangler", 2020, 42250.00));
		cars.add(new UsedCar("Oldsmobile", "442", 1965, 22500.00, 52000.00));
		cars.add(new UsedCar("Ford", "Mustang", 1968, 45500.00, 105000.00));
		cars.add(new UsedCar("Pontiac", "Firebird", 1971, 32500.00, 75000.00));
		
	}
	
	public static void main(String [] args) {
		
		listCars();
		
		System.out.println("Which car do you like?");
		int response = scnr.nextInt();
		
		if (response == 1 ) {
			System.out.println(cars.get(0));
		}
		else if (response == 2) {
			System.out.println(cars.get(1));
		}
		else if (response == 3) {
			System.out.println(cars.get(2));
		}
		else if (response == 4) {
			System.out.println(cars.get(3));
		}
		else if (response == 5) {
			System.out.println(cars.get(4));
		}
		else if (response == 6) {
			System.out.println(cars.get(5));
		}
		scnr.nextLine();
		System.out.println("Would you like to buy this car? (y/n) ");
		 String answer = scnr.nextLine();
		 	
		 if (answer.equalsIgnoreCase("y")){
		 		System.out.println("Excellent!");
		 		cars.remove(response-1);
		 		listCars();
		 		
		 	}
		}
	
	
	
	
	public static void listCars() {
		for(int i=0; i<cars.size();i++) {
			System.out.println("Car "+ (i+1)+ " : "+cars.get(i));
		}
		}
		
		public static void buyCar(int id) {
			cars.remove(id-1);	
			
	}
	
}
