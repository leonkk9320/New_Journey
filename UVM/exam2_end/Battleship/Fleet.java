public class Fleet
{
   private Ship battleShip,
                aircraftCarrier,
                cruiser,
                sub,
                destroyer;//set variables
   
   /** Fleet()
       the constructor initializes each ship
   */
   public Fleet()
   {
     battleShip = new Battleship();
     aircraftCarrier  = new AircraftCarrier();
     cruiser = new Cruiser();
     sub = new Sub();
     destroyer = new Destroyer();
       
   } 
   
   /** updateFleet(ShipType type)
       @param ShipType
       @return boolean 
       the methods takes a ship type to determine whether a ship is hit
   */
   public boolean updateFleet(ShipType type)
   {
      if(type == ShipType.ST_AIRCRAFT_CARRIER)
      {
         return aircraftCarrier.hit();
      }
      if(type == ShipType.ST_BATTLESHIP)
      {
         return battleShip.hit();
      }
      if(type == ShipType.ST_CRUISER)
      {
         return cruiser.hit();
      }
      if(type == ShipType.ST_DESTROYER)
      {
         return destroyer.hit();
      }
      if(type == ShipType.ST_SUB)
      {
         return sub.hit();
      }
      return false;
   
   }
   
   /** gameOver()
       @return boolean 
       returns a boolean value to determine whether the game is over
   */
   public boolean gameOver()
   {
      if(battleShip.getSunk() && aircraftCarrier.getSunk() && cruiser.getSunk() && sub.getSunk() && destroyer.getSunk())
         return true;
      return false;
   }

}