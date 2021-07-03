/* TreeInterface.java
 * N Varadi
 * 06 05 2021
 */

package binarytreecars;

public interface TreeInterface <T extends Comparable<T>> {
	
	
	public void insertNode (T element); //adds new element into the tree
	
	public boolean isEmpty();//check if tree is empty
	
	public int size(); //counts the number of nodes in the tree
	
	public T minEmission();//finds the car with the lowest emission label
	
	public T maxEmission(); //finds the car with the highest emission label
	

	
	public void inOrder();//prints out the nodes in the tree in an ascending order

}
