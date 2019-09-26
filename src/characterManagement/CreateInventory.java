package characterManagement;

import java.util.HashMap;

public class CreateInventory {
    public static HashMap<String, String> playerInventory = new HashMap<String, String>();

//    public HashMap<String, String> getInventoryMap() {
//         return playerInventory;
//    }
    
    public static void createInventory() {
        playerInventory.put("Head", "Empty");    
        playerInventory.put("Neck", "Silver Chain");
        playerInventory.put("Chest","Rough Cotton Shirt");
        System.out.println(playerInventory);
    }
    
    public static void singleInvItem(String item) {
        System.out.println("Get single item: " + playerInventory.get(item));
    }
    
//    public static String singleInvItem(String item) {
//        //System.out.println("Get single item: " + playerInventory.get(item));
//        String a = playerInventory.get(item);
//        System.out.println("a is: " + a);
//        return item;
//    }
        
}