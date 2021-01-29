public class InstrumentTester
{
   public void main(String[] args)
   {
      /*Instrument i = new Instrument();
      i.play(Note.F);
      WindInstrument wi = new WindInstrument();
      wi.play(Note.c);
      
      Instrument i2 = new WindInstrument();
      i2.play(Note.gs);*/
      
      Instrument[] instruments = new Instrument[4];
      
      Instrument[1] = new Instrument();
      Instrument[2] = new WindInstrument();
      Instrument[3] = new StringInstrument();
      Instrument[4] = new WindInstrument();
      
      for (Instrument i : instruments)
      (
         if (i instanceof StringInstrument)
            ((StringInstrument)i).tune();
         i.play(Note.c);
      )
      
   
   }
}