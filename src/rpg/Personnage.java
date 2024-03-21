package rpg;

public class Personnage {
	private int points = 100;
	private  Boolean isAlive = true;
	
	
	/**
	 * Default consroctor 
	 */
	public Personnage() {
		
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public Boolean isAlive() {
		return this.isAlive;
	}

}
