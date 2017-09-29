import java.util.*;

class Car {
	public Car(String name) {
		
	}
	
	public Car getNext() {
		//returns the next car after this one
		//O(1)
		return null;
	}
	
	public Car getPrevious() {
		//returns the car before this one
		//O(1)
		return null;
	}
	
	public void setNext(Car next) {
		//sets the car after this one to next (the parameter)
		//O(1)
	}
	
	public void setPrevious(Car previous) {
		//sets the car before this one to previous (the parameter)
		//O(1)
	}
	
	public String getName() {
		//return's the car's name
		//O(1)
		return null;
	}
	
	public boolean equals(Object o) {
		//two cars are equal if they have the same name
		//O(1)
		return false;
	}
	
	public int hashCode() {
		//returns a hashcode for a car...
		//remember: if two objects are equal, they should
		//have the same hashcode
		//O(1)
		return 0;
	}
	
	public String toString() {
		//return's the car's name
		//O(1)
		return null;
	}
	
	//example test code... edit this as much as you want!
	public static void main(String[] args) {
		Car c1 = new Car("C1");
		Car c2 = new Car("C2");
		
		c1.setNext(c2);
		c2.setPrevious(c1);
		
		if(c1.getName().equals("C1")) {
			System.out.println("Yay 1");
		}
		
		if(c1.getNext().equals(c2) && c2.getPrevious().equals(c1)) {
			System.out.println("Yay 2");
		}
		
		Car c1b = new Car("C1");
		if(c1.equals(c1b) && c1.hashCode() == c1b.hashCode()) {
			System.out.println("Yay 3");
		}
		
		c1.printAscii();
	}
	
	/*****************************************************************/
	/****************** DO NOT EDIT BELOW THIS LINE ******************/
	/*****************************************************************/
	
	public void printAscii() {
		/*
		From: http://www.ascii-art.de/ascii/t/train.txt
		 _________
		 |O O O O|
		-|_______|
		   o   o  
		*/
		
		Car current = this;
		while(current != null) {
			System.out.print(" _________");
			current = current.getNext();
		}
		System.out.println();
		
		current = this;
		while(current != null) {
			System.out.print(" | "+String.format("%-5s",current.getName())+" |");
			current = current.getNext();
		}
		System.out.println();
		
		current = this;
		while(current != null) {
			System.out.print("-|_______|");
			current = current.getNext();
		}
		System.out.println();
		
		current = this;
		while(current != null) {
			System.out.print("   o   o  ");
			current = current.getNext();
		}
		System.out.println();
	}
}