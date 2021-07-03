/*Car.java
 * N Varadi
 * 06 05 2021
 */

package binarytreecars;

public class Car implements Comparable<Car> {

	private String model;
	private String year;
	private int price;
	private int emissions;
	
	
	public Car(String model, String year, int price, int emissions) {
		
		this.model = model;
		this.year = year;
		this.price = price;
		this.emissions = emissions;
	}

	

	@Override
	public int compareTo(Car otherCar) {
		//
		if (this.emissions == otherCar.getEmissions())
			return 0;
		
		if (this.emissions > otherCar.getEmissions()) {
			return 1;
			
		} else {
			return -1;
		}

	}
	
	
	
	
	@Override
	public String toString() {
		return  model + ", "+ year + ", "+  "€" + price + ", " + emissions;
		
	}
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getEmissions() {
		return emissions;
	}

	public void setEmissions(int emissions) {
		this.emissions = emissions;
	}
}



