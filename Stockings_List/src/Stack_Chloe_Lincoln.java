

import java.util.NoSuchElementException;

//Name:          Chloe Lincoln  
//Class:         CS 5040      
//Term:          Summer 2018 
//Instructor:    Dr. Haddad
//Assignment:    2

public class Stack_Chloe_Lincoln <T> {
	
	private class Node {
		private T data; //data field
		private Node next; //link field

	
	//constructor method
	public Node(T data){ 
	   this.data = data;
	   next = null;
		}
	}

	public Node top ;
	public int size ;

	// Constructor 
	public void Stack(){
		top = null;
		size = 0;
	}

	// Function to check if stack is empty 
	public boolean isEmpty() {
		return (size == 0);
	}

	// Function to get the size of the stack 
	public int size(){
		return size;
	}

	// Function to push an element to the stack 
	public void push(T data){
		Node oldfirst = top;
		top = new Node(data);
		top.data = data;
		top.next = oldfirst;
		size++;
	}
	
	// Function to pop an element from the stack 
	public T pop(){
		if (isEmpty()) throw new NoSuchElementException("Stack Underflow!");
		T data = top.data;        // save data to return
		top = top.next;           // delete first node
		size--;
		return data;              // return the saved data
	}


	// Function to check the top element of the stack 
	public T top(){
		if (isEmpty()) throw new NoSuchElementException("Stack Underflow!");
		return top.data;
		}
	
	//Reused your code that you provided on the last assignment
	public void printList(){
		if (top == null)  // if an empty list
		System.out.println("List is empty!");
		else {               // if non-empty list
			Node temp;
			temp = top;
			while (temp != null){
				System.out.print(temp.data + "   ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}





   




