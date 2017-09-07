/**
 * @author Thomas Washington
 * CS310
 * Fall 2017
 */

/**
 * 
 */
class Ball
{
  private int number = 0;
  
  public Ball (int number) {
    this.number = number;     
  }
  public String toString() {
    return  ("(" + this.number + ")");     
  }
  public int getNumber() {
    return this.number;     
  }
}
