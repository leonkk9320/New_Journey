import java.util.Random;
/**
 make a coin randomly tossed and show the up side of the coin,
 which can be "heads" or "tails". 
*/
public class Coin
{
   private String sideUp;// name for the up side of the coin
   private Random rand;//random number generator
   private int num;//record the random number
   
   /**
   The constructor call the toss method to randomly initialize the 
   up side of a coin 
   */
   public Coin()
   {
      toss();//call the toss method
   }
   
   
   /**
   The toss method randomly tosses a coin to determine the up side 
   of a coin, and assign the value to sideUp variable
   */
   public void toss()
   {
      rand = new Random();//create an object
      num = rand.nextInt(2);//randomly generate two numbers
      if(num == 0)
         sideUp = "heads";
      else
         sideUp = "tails";//decide what up side is
   }
   
   
   /**
   The getSideUp method returns the value of sideUp
   @return String sideUp
   */
   public String getSideUp()
   {
      return sideUp;
   }
   
   
} 