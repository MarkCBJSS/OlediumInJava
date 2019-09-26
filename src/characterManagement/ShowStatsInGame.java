package characterManagement;

import olediuminjava.CoreValues;
import characterManagement.CreateInventory;


public class ShowStatsInGame {
    
    // Part of HELP - let's player see character info at any time    
    public static void showCharacterInfo() {
        System.out.println("  \n---------------  Character   ---------------");
        System.out.println("  Character Name:  " + CoreValues.thePlayerName);
        System.out.println("  Hit Points (HP): "     + CoreValues.playerCurrentHP);
        System.out.println("  Stamina (STA):   "        + CoreValues.playerCurrentSTA);
        System.out.println("  Strength (STR):  "       + CoreValues.playerCurrentSTR);
        System.out.println("  Luck (LUC):      "           + CoreValues.playerCurrentLUC);
    }
    
    public static void showInventoryInfo() {
        System.out.println("  \n---------------  Inventory   ---------------");
        System.out.println("Head: " + CreateInventory.singleInvItem("Head"));
        System.out.println("Neck: " + CreateInventory.singleInvItem("Neck"));
        System.out.println("Chest: " + CreateInventory.singleInvItem("Chest"));
    }
}