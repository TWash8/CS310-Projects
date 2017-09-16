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
  private int number;
  
  public Ball (int number) {
    this.number = number;     
  }
  public String toString() {
    return  ("(" + this.getNumber() + ")");     
  }
  public int getNumber() {
    return this.number;     
  }
}
