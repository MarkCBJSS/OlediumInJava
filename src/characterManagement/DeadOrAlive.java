package characterManagement;

import olediuminjava.CoreValues;
import static olediuminjava.CoreValues.isPlayerAlive;

public class DeadOrAlive {
    
    // Check if the player is Dead or Alive
    public void isThePlayerAlive() {
        if (CoreValues.playerCurrentHP <= 0) {
            isPlayerAlive = false; //dead
        } else {
            isPlayerAlive = true; // alive
        }
    }
    
    public void resurectThePlayer() {
        // TODO
        // Use to bring a player character back from 0 points HP
        // Spell, random, ...
    }
    
}