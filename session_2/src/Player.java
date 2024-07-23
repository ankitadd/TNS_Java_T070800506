
public class Player {
	private String playerName, playerCountry;
	
	public Player()
	{
		this("Ankita");
		System.out.println("Default");
		playerCountry = "India";
	}
	
	public Player (String playerName)
	{
		//this()
		System.out.println("Parameterized");
		this.playerName = playerName;
	}
	
	public String toString() 
	{
		return "Player [playerName=" + playerName + ", playerCountry=" + playerCountry + "]";
	}
	
	public static void main(String [] args)
	{
		Player p = new Player();
		System.out.println(p);
	}
}
