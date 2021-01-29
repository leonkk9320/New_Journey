public class EnumTester
{
   private enum Day{SUNDAY, MONDAY, TUESDAT, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
   
   public static void mian(String[] args)
   {
      Car mycar = new Car("Toyota", "RAV4", Car.Color.RED);
      System.out.println(mycar.getColor());
      //Day today = Day.FRIDAY;
      //System.out.println(today.ordinal() );
      Car.Color c = Car.Color.GREEN;
   }
}