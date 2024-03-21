package rpg;

public class Personnage {
	private static int HEART_LOOSED_POINTS = 20;
	
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
	
	public void attack(Personnage victime) {
		victime.points = victime.points - 1;
	}
	
	public void hurt(Personnage victime) {
		victime.points = victime.points - this.HEART_LOOSED_POINTS;
	}
}
