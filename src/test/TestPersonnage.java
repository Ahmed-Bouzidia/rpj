package test;

import rpg.Personnage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonnage {
    
    @Test 
    public void initalesPointsInitTest() {
        // Create an instance of Personnage with initial hit points
        Personnage personnage = new Personnage(); // Assuming 100 is the expected value
        
        assertEquals(100,personnage.getPoints());
        // Check if the initial hi
    }
    
 
    @Test 
    public void isAliveAtGameStartInitTest() {
        // Create an instance of Personnage with initial hit points
        Personnage personnage = new Personnage(); // Assuming 100 is the expected value
        
        assertEquals(true,personnage.isAlive());
        // Check if the initial hi
    }
    
    @Test 
    public void attackReduceOnePointsForVictimInitTest() {
        // Create an instance of Personnage with initial hit points
        Personnage mechant = new Personnage(); // Assuming 100 is the expected value
        Personnage victime = new Personnage();
        
        mechant.attack(victime);
        
        assertEquals(99,victime.getPoints());
    }
    
    
}