public class Team  {
	private String coach;	// coach's name
	private String sport;	// name of sport
	private int wins;	// team wins
	private int losses;	// team losses
	/** Constructor that creates a team given the sport name and coaches name.
	wins and losses default to 0
	@param sport The name of the sport
	@param coach The coach's name 11	*/
	public Team(String sport, String coach) 	{
		this(sport,coach,0,0); 	}
	/** Constructor that creates a team given the sport name, coaches name,
	team wins and losses.
	@param sport The name of the sport
	@param coach The coach's name
	@param wins Team wins
	@param losses Team losses 	*/
 	public Team(String sport, String coach, int w, int l) 	{
	this.sport = sport;
	this.coach = coach;
	wins = w;
	losses = l;

	}
	/**	getWins()
	@return number of team wins 	*/
	public int getWins() 	{
		return wins; 	}
 	/**	getLosses()
	@return number of team losses 40	*/
	public int getLosses() 	{
		return losses; 	}
	/**	addWin()
	increments number of wins 47	*/
	public void addWin() 	{
	wins++;
	}
 
	/**	addWin(num)
	@param num the number of wins to add to record 	*/
	public void addWin(int num) 	{
		wins += num; 	}
	/**	addLoss()
	increments number of losses 	*/
	public void addLoss() 	{
	losses++;
	}
	/**	getSport()
	@return name of sport 	*/
	public String getSport() 	{
		return sport; 	}
	/**	getCoach()
	@return name of coach 	*/
	public String getCoach() 	{
		return coach; 	}
	/** setCoach(String)
	@param name coach's name 	*/
	public void setCoach(String name) 	{
 		coach = name; 	}
	/** The toString method returns a String containing
	the team's data
	@return String containing sport name, coach name, wins and losses 	*/
	public String toString() 	{
	String s = "Sport: " + sport + " " +
	"Coach: " + coach + " " +
	"Record: " + wins + " wins, " + losses + " losses";
	return s;
	}
   
   public boolean equals(Object obj)
   {
      if(this == obj)
         return true;
      if(obj == null)
         return false;
      if(getClass() != obj.getClass())
         return false;
      
      Team newObj = (Team)obj;
      if((getWins() + getLosses()) == (newObj.getWins() + newObj.getLosses()))
         return true;
      return false;
   }
 }
