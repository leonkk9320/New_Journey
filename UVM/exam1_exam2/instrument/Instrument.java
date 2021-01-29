public abstract class Instrument
{
   public void play(Note n)
   {
      System.out.println("Instruments playing note" + n.toString());
   }
   
   public abstract void tune();
}