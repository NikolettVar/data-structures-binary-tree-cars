/* Tree.java
 * N Varadi
 * 06 05 2021
 */

package binarytreecars;


//This class will provide implementations for all our abstract methods
//listed in the FoodInterface interface
//We must ensure that this class also inherits from the Comparable class 
public class Tree <T extends Comparable<T>> implements TreeInterface<T> {
	
	//First we must declare the variable we need to use
	//To build a binary search tree of comparable objects 
	//we must declare the root node 
	Node<T> root;
	
	//The constructor of this class sets the initial value of the root node to null
	public Tree() {
		root = null;
	}

	
	//This method allows us to add nodes into our binary search tree
	//First we define a public method that checks if the tree is empty
	
	@Override
	public void insertNode (T element){
		//is the tree empty?
		if (isEmpty()) {
			root = new Node<T> (element);			
		} else {
			insertNode(root, element);			
		}
	}	
	
	private void insertNode(Node<T> current, T element) {
		//Now need to do comparison
		if (element.compareTo(current.element) > 0) {
			//go to right
			if (current.right == null) {
				current.right = new Node<T> (element);
				return;
			} else {
				//Recur on right
				insertNode(current.right, element);
			}
		} else { 
			//go to left
			if (current.left == null) {
				current.left = new Node<T> (element);
				return;
			} else {
				//Recur on left
				insertNode(current.left, element);
			}
		}		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return root == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size(root);
	}
	
	private int size(Node<T> current) {
		 if (current == null) {//if current element is non-existent
	            return 0;
	     }
		 else {
			 return 1 + size(current.left) + size(current.right);
		 }
	}

	@Override
	public T minEmission() {
		if (isEmpty()) {
            return null;
        } else {
            return findMin(root);
        }
	}
	
	private T findMin(Node<T> current) {
		if (current.left == null) {
            return current.element;
        } else {
            return findMin(current.left);
        }
	}

	@Override
	public T maxEmission() {
		if (isEmpty()) {
            return null;
        } else {
            return findMax(root);
        }		
	}
	
	private T findMax(Node<T> current) {
		if (current.right == null) {
            return current.element;
        } else {
            return findMax(current.right);
        }
	}

	@Override
	public void inOrder() {
		 inOrder(root);		
	}
	
	private void inOrder(Node<T> current) {
        if (current == null) {
            return;
        } else

        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }

}
