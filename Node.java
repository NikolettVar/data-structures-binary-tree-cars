/* Node.java
 * N Varadi
 * 06 05 2021
 */

package binarytreecars;

public class Node<T> {
	
	protected Node<T> left;
	protected Node<T> right;
	protected T element;
	
	public Node (T element) {
		this.element = element;
		this.left = null;
		this.right = null;
		
	}
	
	public String toString() {
		return this.element.toString();
	}
	
	/*@Override
    public String toString() {
        return "BTNode{" + "element=" + element + ", left=" + left + ", right=" + right + '}';
    }*/

}
