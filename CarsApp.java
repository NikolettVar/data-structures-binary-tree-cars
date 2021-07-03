/* CarsApp.java
 * N Varadi
 * 06 05 2021
 */

package binarytreecars;

public class CarsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree<Car> myCars = new Tree<>();
		
		Car car1 = new Car("Ford", "2019", 40000, 2);
		myCars.insertNode(car1);
		
		Car car2 = new Car("Citroen", "2020", 21000, 4);
		myCars.insertNode(car2);
		
		Car car3 = new Car("Toyota", "2017", 18000, 5);
		myCars.insertNode(car3);
		
		Car car4 = new Car("Audi", "2015", 23000, 6);
		myCars.insertNode(car4);
		
		Car car5 = new Car("Tesla", "2021", 56000, 0);
		myCars.insertNode(car5);
		
		myCars.inOrder();
		System.out.println(myCars.size());
		
		System.out.println("The car with the lowest CO2 emission is: " + myCars.minEmission());
		
		System.out.println("The car with the highest CO2 emission is: " + myCars.maxEmission());
		
		
	}

}
