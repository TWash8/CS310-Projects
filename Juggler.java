/**
 * @author Thomas Washington
 * CS310
 * Fall 2017
 */
import java.util.*;

/**
 * 
 */
class Juggler
{
  /**
   * 
   */
  private class Hand
  {
    Ball hold = null;
    
    public void catchBall (Ball ball) {
      if (hold == null) {
        throw new RuntimeException(); 
      }
      hold = ball;
    }
    
    public Ball throwBall() {
      if (hold == null) {
        throw new RuntimeException(); 
      }
      Ball now = hold;
      hold = null;
      return now;
    }
    
    public boolean hasBall() {
      if (hold != null) {
        return true;   
      }
      return false;
    }
    
    public String toString() {
      if (!hasBall()) {
        return "   "; 
      }
      return hold.toString();
    }
  }
  
  /*-------------- DO NOT CHANGE ANYTHING BELOW THIS LINE --------------*/
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  private Air<Ball> air = new Air<>();
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  private Hand[] hands = new Hand[2];
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  private int numUnthrownBalls;
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  private int totalBalls;
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  public Juggler()
  {
    hands[0] = new Hand();
    hands[1] = new Hand();
    this.totalBalls = this.numUnthrownBalls = 5; //((new Random()).nextInt(5))+3;
  }
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  public void passBall()
  {
    hands[0].catchBall(hands[1].throwBall());
  }
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  public void throwBall()
  {
    if(!hands[0].hasBall() && this.numUnthrownBalls > 0)
      air.add(new Ball(this.numUnthrownBalls--));
    else
      air.add(hands[0].throwBall());
  }
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   */
  public void catchBall()
  {
    hands[1].catchBall(air.remove());
  }
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   * @return 
   */
  public int getNumUnthrownBalls()
  {
    return this.numUnthrownBalls;
  }
  
  /**
   * DO NOT CHANGE THIS, but replace this comment
   * @return 
   */
  public String toString()
  {
    String spacing = "";
    if(this.totalBalls < 7) spacing += "   ";
    if(this.totalBalls < 5) spacing += "   ";
    
    return spacing + air.toString() + "\n\n      "
      + hands[0].toString() + "( )" + hands[1].toString() + "\n   "
      + "    \\__|__/\n   "
      + ((this.numUnthrownBalls > 6) ? "(7)" : "   ")
      + ((this.numUnthrownBalls > 5) ? "(6)" : "   ")
      + " |\n   "
      + ((this.numUnthrownBalls > 4) ? "(5)" : "   ")
      + ((this.numUnthrownBalls > 3) ? "(4)" : "   ")
      + " |\n   "
      + ((this.numUnthrownBalls > 2) ? "(3)" : "   ")
      + ((this.numUnthrownBalls > 1) ? "(2)" : "   ")
      + "/ \\\n   " 
      + ((this.numUnthrownBalls > 0) ? "(1)" : "   ")
      + "  /   \\\n";
  }
}
