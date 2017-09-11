/**
 * @author Thomas Washington
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
  private ListItem head, tail;
  private int size;
  
  private Air () {
  	first = head = null;
    size = 0;
  }
  
  public boolean add(T item){
    
  }
  
  public boolean offer(T item) {
    
  }
  
  public T remove(){
       
  }
  
  public T poll(){}
  
  public T element() {}
  
  public T peek(){}
  
  public String toString() {}
  
  public void clear() {}
  
  public boolean isEmpty() {}
  
  public int size() {
    return air.size();
  }
  public Object[] toArray() {}
  /**
   * 
   */
  private class ListItem<T>
  {
    private int num;
    private ListItem<T> next;
    
    private ListItem (T item) {
      num = 0;
      next = item;
    }
    
    private ListItem (int num) {
      this.num = num;
    }
    
    
    private String toString() {
    	return this.num + "";
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
