package Q3_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Car {
	private final String modelName;
	private final String makeName;
	private final Date builtDate;
	
	public Car(String make, String model, Date whenBuilt) {
		this.makeName = make;
		this.modelName = model;
		this.builtDate = whenBuilt;
	}
	
	public String getMake() {
		return this.makeName;
	}
	
	public String getModel() {
		return this.modelName;
	}
	
	public Date getBuilt() {		
		return new Date(this.builtDate.getTime());
	}
	
	public String toString() {
		
		return "Car{ Model: " + this.getModel() + "  Make: " + this.getMake() + "  Date made: " + this.getBuilt() + " }";
	}
	
	/*
	 * returns a new comparator object for Car objects that compares 2 Car objects 
	 * by the String attributes make and model. E.g. logically, Chevrolet C10 < Dodge Demon
	 * and Buick Century < Buick Riviera (same make, and models compared lexicographically).
	 */
	public static Comparator<Car> getCompByMakeModel(){
		return new Comparator<Car>() {
			@Override
			public int compare(Car object1, Car object2) {
				int makeCompare = object1.getMake().compareTo(object2.getMake());
				int modelCompare = object1.getModel().compareTo(object2.getModel());
				
				if(makeCompare == 0) {
					return((modelCompare == 0) ? makeCompare : modelCompare);
				}else {
					return makeCompare;
				}
			}
			
		};		
		
	}
	
	 public static Comparator<Car> getCompByDate(){
		 return new Comparator<Car>() {
			@Override
			public int compare(Car object1, Car object2) {
				int compareDate = object1.getBuilt().compareTo(object2.getBuilt());
				return compareDate;				
			}			 
		 };
	 }
	 
	 @SuppressWarnings("deprecation")
	public static void main(String [] args) {
		 List<Car> c1 = new ArrayList<>();
		 
		
		 Date d1 = new Date(2000, 11, 21);
		 Date d2 = new Date(2017, 05, 04);
		 Date d3 = new Date(2007, 03, 18);
		 Date d4 = new Date(2020, 05, 11);
		 
		 Car vehicle1 = new Car("Honda", "Civic", d1);
		 Car vehicle2 = new Car("Toyota", "Camry", d2);
		 Car vehicle3 = new Car("Ford", "Fusion", d3);
		 Car vehicle4 = new Car("Lexus", "LS", d4);
		 
		 c1.add(vehicle1);
		 c1.add(vehicle2);
		 c1.add(vehicle3);
		 c1.add(vehicle4);
		 
		 Iterator<Car> carIterator = c1.iterator();
		 System.out.println("Before sorting by make/model.");
		 while(carIterator.hasNext()) {
			 System.out.println(carIterator.next());
		 }
		 
		 Collections.sort(c1, Car.getCompByMakeModel());
		 System.out.println("After sorting by make/model");
		 for(Car models : c1) {
			 System.out.println(models);
		 }
		 
		 Collections.sort(c1, Car.getCompByDate());
		 System.out.println("After sorting by date");
		 for(Car dates : c1) {
			 System.out.println(dates);
		 }
		 
	 }


}
