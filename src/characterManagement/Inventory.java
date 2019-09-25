package characterManagement;

import java.util.HashMap;


public class Inventory {
    
    public static void createInventory() {
        HashMap<String, String> playerInventory = new HashMap<>(); 

          // 2 Adding values to HashMap as ("keys", "values") 
            playerInventory.put("Head", "One"); 
            playerInventory.put("Neck", "Two");
            playerInventory.put("Chest","Rough Cotton Shirt");
        
        System.out.println(playerInventory);
        
        System.out.println("Head is: " + playerInventory.get("Head"));
    }
    
}
