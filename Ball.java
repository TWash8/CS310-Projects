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
  
  private Ball (int number) {
    this.number = number;     
  }
  private String toString() {
    return  ("(" + this.number + ")");     
  }
  private int getNumber() {
    return this.number;     
  }
}
