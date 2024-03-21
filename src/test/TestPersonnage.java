package test;

import rpg.Personnage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPersonnage {
    
    @Test 
    public void initalesPointsInitTest() {
        // Create an instance of Personnage with initial hit points
        Personnage personnage = new Personnage(); // Assuming 100 is the expected value
        
        assertEquals(1000,personnage.getPoints());
        // Check if the initial hi
    }
    
    
}