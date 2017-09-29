import java.util.*;

class SimpleMap<K,V> {
	private static class Pair<K,V> {
		
		public Pair(K key, V value) {
			
		}
		
		@SuppressWarnings("unchecked")
		public boolean equals(Object o) {
			//Two pairs are equal ONLY if their KEYS are
			//equal. Values don't matter for equality.
			//O(1)
			return false;
		}
		
		public int hashCode() {
			//returns a hashcode for a pair...
			//remember: if two objects are equal, they should
			//have the same hashcode
			//O(1)
			return 0;
		}
		
		public String toString() {
			//this method is done for you
			return "<" + getKey() + "," + getValue() + ">";
		}
		
		public K getKey() {
			//returns the key from the pair
			//O(1)
			return null;
		}
		
		public V getValue() {
			//returns the value from the pair
			//O(1)
			return null;
		}
	}
	
	//example test code... edit this as much as you want!
	public static void main(String[] args) {
		Pair<String,Integer> p1 = new Pair<>("Fred", 1);
		Pair<String,Integer> p2 = new Pair<>("Alex", 1);
		Pair<String,Integer> p3 = new Pair<>("Fred", 2);
		
		if(p1.getKey().equals("Fred") && p1.getValue() == 1 && p1.equals(p3) && p1.hashCode() == p3.hashCode()) {
			System.out.println("Yay 1");
		}
		
		if(!p1.equals(p2)) {
			System.out.println("Yay 2");
		}
		
		//this is actually a test of SimpleSet, not SimpleMap
		SimpleSet<Pair<String,Integer>> set = new SimpleSet<>();
		set.add(p1);
		//get the value from the set that is _equal to_ p3 (in this case, p1)
		Pair<String,Integer> p1fromSet = set.get(p3);
		if(p1fromSet.getValue() == 1) {
			System.out.println("Yay 3");
		}
	}
	
	/*****************************************************************/
	/****************** DO NOT EDIT BELOW THIS LINE ******************/
	/*****************************************************************/
	
	private SimpleSet<Pair<K,V>> set = new SimpleSet<>();
	
	public boolean add(K key, V value) {
		Pair<K,V> pair = new Pair<>(key, value);
		return set.add(pair);
	}
	
	public boolean update(K key, V value) {
		Pair<K,V> pair = new Pair<>(key, value);
		if(!remove(key)) {
			return false;
		}
		return set.add(pair);
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(K key) {
		Pair<K,V> pair = new Pair<>(key, null);
		return set.remove(pair);
	}
	
	@SuppressWarnings("unchecked")
	public V getValue(K key) {
		Pair<K,V> pair = new Pair<>(key, null);
		return set.get(pair).getValue();
	}
	
	@SuppressWarnings("unchecked")
	public boolean rehash(int newCapacity) {
		return set.rehash(newCapacity);
	}
	
	public int size() {
		return set.size();
	}
	
	public double getLoad() {
		return set.getLoad();
	}
	
	@SuppressWarnings("unchecked")
	public Object[] valuesToArray() {
		Object[] setValues = set.valuesToArray();
		Object[] arr = new Object[setValues.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ((Pair<K,V>)setValues[i]).getValue();
		}
		
		return arr;
	}
}