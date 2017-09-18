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
  private ListItem<T> head, tail;
  private int size = 0;
  
  public Air () {
    head = tail = new ListItem<T>();
  }

  public boolean add(T item){
    if ((size + 1) > MAX_CAPACITY) {
      throw new IllegalStateException();
    }
    if (item == null) {
     throw new NullPointerException(); 
    }
    ListItem<T> n = new ListItem<T>(item);
    //If the head does not have a value, give it and the tail the same new ListItem.
    if (head.getItem() == null) { 
     head = tail = n;
     size ++;
     return true;
    }
    //If the head already has a value, put the value in the previous spot before head and make it the new head.
    n.next = head;
    head.setPrev(n);
    head = n;
    size ++;
    return true;
  }
  
  public boolean offer(T item) {
    return add(item);
  }
  
  public T remove(){
    if (size == 0) {
      throw new NoSuchElementException(); 
    }
    ListItem<T> hold = tail;
    tail.prev = tail;
    tail = tail.prev;
    size --;
    return hold.getItem();
  }
  
  public T poll(){
    return remove();
  }
  
  public T element() {
    if (size == 0) {
     throw new NoSuchElementException(); 
    }
    return head.item;
  }
  
  public T peek(){
    return element();
  }
  
  public String toString() {
    ListItem<T> now = head;
    String result = "";
    if(now.item != null) {
      result += now.toString() + "";
    }
    
    while (now.getNext() != null) {
      result += now.toString() + "";
      now = now.getNext();
      }
    return result;
  }
  
  public void clear() {
    ListItem<T> now = head;
    while (now.getNext() != null) {
      now = null;
      now.prev = null;
      now.item = null;
      now = now.next;
    }
    size = 0;
  }
  
  public boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }
  
  public int size() {
    return size;
  }
  public Object[] toArray() {
    ListItem[] result = new ListItem[MAX_CAPACITY];
    ListItem<T> now = head;
    int index = 0;
    
    while (now.getNext() != null) {
      result[index] = now;
      now = now.getNext();
      index++;
    }
    return result;
  }
  /**
   * 
   */
  private class ListItem<T>
  {
    private ListItem<T> next, prev;
    private T item;
    
    public ListItem() {
     next = prev = null;
     item = null;
    }
    public ListItem (T item) {
      this.item = item;
      next = prev = null;
    }
    public ListItem<T> getNext() {
      return this.next;
    }
    
    public void setNext(ListItem<T> next) {
     this.next = next;
    }
    
    public void setPrev(ListItem<T> prev) {
     this.prev = prev; 
    }
    
    public T getItem() {
      return this.item;
    }
    
    public String toString() {
      return this.item.toString();
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
