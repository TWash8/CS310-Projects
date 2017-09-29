import java.util.*;

class SimpleSet<T> {
	//use this class if you are doing open addressing
	//to represent a tombstone
	static class Tombstone { }
	
	public boolean add(T value) {
		//adds an item to the hash table
		//if the load on the table is > 0.7
		//rehash to the next prime number larger
		//than twice the size before returning
		
		//returns false if the value can not be added
		//(i.e. the value already exists in the set)
		
		//O(n) worst case, where n = the number of items
		//O(1) or O(n/m) average case (where n/m is the load)
		//the average case can be amortized Big-O
	}
	
	public boolean remove(T value) {
		//remove a value from the hash table
		//remember to use tombstones if you are
		//doing open addressing
		
		//return false if the item could not be found
		//return true if you remove the item
		
		//O(n) worst case, where n = the number of items
		//O(1) or O(n/m) average case (where n/m is the load)
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T get(T value) {
		//return null if the item could not be found
		//return the item FROM THE HASH TABLE if it was found
		//(do not return the parameter, while "equal" they
		//may not be the same)
		
		//O(n) worst case, where n = the number of items
		//O(1) or O(n/m) average case (where n/m is the load)
		return null;
	}
	
	public boolean contains(T value) {
		//return true if the item can be found in the
		//table, reuse code from get() to implement this
		//method
		
		//O(n) worst case, where n = the number of items
		//O(1) or O(n/m) average case (where n/m is the load)
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public boolean rehash(int newCapacity) {
		//rehash to a larger table size (specified as a
		//parameter to this method)
		//O(n) where n = the table size
		return false;
	}
	
	public int size() {
		//return the number of items in the table
		//O(1)
		return 0;
	}
	
	public double getLoad() {
		//return the load on the table
		//O(1)
		return 0.0;
	}
	
	@SuppressWarnings("unchecked")
	public Object[] valuesToArray() {
		//take all the values in the table and put them
		//into an array (the array should be the same
		//size returned by the size() method -- no extra space!).
		//Note: it doesn't matter what order the items are
		//returned in, this is a set rather than a list.
		
		//O(n) where n = the table size
		return null;
	}
	
	//inefficiently finds the next prime number >= x
	//this is written for you...
	public int nextPrime(int x) {
		while(true) {
			boolean isPrime = true;
			for(int i = 2; i < Math.sqrt(x); i++) {
				if(x % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) return x;
			x++;
		}
	}
	
	//example test code... edit this as much as you want!
	public static void main(String[] args) {
		SimpleSet<String> names = new SimpleSet<>();
		
		if(names.add("Fred") && names.add("Alex") && !names.add("Fred")) {
			System.out.println("Yay 0");
		}
		
		if(names.size() == 2 && names.contains("Fred") && names.get("Alex").equals("Alex")) {
			System.out.println("Yay 1");
		}
		
		if(names.remove("Alex") && names.size() == 1 && names.get("Alex") == null && names.valuesToArray()[0].equals("Fred")) {
			System.out.println("Yay 2");
		}
	
		boolean loadOk = true;
		if(names.getLoad() != 1/11.0 || !names.rehash(10) || names.getLoad() != 1/10.0 || names.rehash(1)) {
			loadOk = false;
		}
		
		SimpleSet<Integer> nums = new SimpleSet<>();
		for(int i = 1; i <= 67 && loadOk; i++) {
			nums.add(i);
			double load = nums.getLoad();
			if(load > 0.7 || (i < 8 && load != i/11.0) || (i > 7 && i < 17 && load != i/23.0) || (i > 16 && i < 33 && load != i/47.0) || (i > 32 && i < 68 && load != i/97.0)) {
				loadOk = false;
			}
		}
		if(loadOk) {
			System.out.println("Yay 3");
		}
	}
}