package characterManagement;

import java.util.HashMap;

public class PlayerInventoryMap {
    
// Creating a HashMap
    private HashMap<String, String> playerInventorySlots = new HashMap<>();        
    
// Make a Getter
    public HashMap<String, String> getInventorySlots() {
        return playerInventorySlots;
    }
}