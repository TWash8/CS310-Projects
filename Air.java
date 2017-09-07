/**
 * @author Your Name Here
 * CS310
 * Fall 2017
 */

import java.util.*; //for Queue interface

/**
 * YOUR COMMENTS HERE
 * 
 * For the Queue interface, see http://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
 * and http://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html
 */
class Air<T> implements Queue<T>
{
	/**
	 * Wikipedia claims max solo record is 13
	 * see http://en.wikipedia.org/wiki/Juggling_world_records#Solo_records
	 * Allowing room for growth...
	 */
	public static final int MAX_CAPACITY = 15;

	/**
	 * 
	 */
	private class ListItem<T>
	{
		private ListItem<T> next;
		private int size;
		private int number;
		
		public ListItem<T> () {
		     size = 0;
		     next = null;
		}
		
		public ListItem<T> (int number) {
		     this.number = number;
		     this.size++;
		}
		
		public int getSize() {
		     return this.size;
		}
		
		public int getNumber(int number) {
		     
		}
		
	}
	
	//you code here - variables, required methods, etc.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*-------------- DO NOT CHANGE ANYTHING BELOW THIS LINE --------------*/
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean addAll(Collection<? extends T> c)  
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public int hashCode()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public Iterator<T> iterator()
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * DO NOT CHANGE THIS, no comment needed
	 */
	public <E> E[] toArray(E[] a)
	{
		throw new UnsupportedOperationException();
	}
}
