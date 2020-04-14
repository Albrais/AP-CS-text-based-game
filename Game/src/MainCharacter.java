import java.util.ArrayList;

public class MainCharacter extends Character{
        private int mana;
        private ArrayList inventory;
        private int gold;
    public MainCharacter(int playerHealth, String playerName, Weapon playerWeapon, ArrayList stuff, int gold/*, int manaPoints*/){
        super(playerHealth, playerName, playerWeapon);
        inventory = stuff;
        this.gold = gold;
        //mana = manaPoints;
    }


    public void attack(Character enemy){
        int enemyHealth = enemy.getHealth();
        int hit = getWeapon().generateHit();
        System.out.println("You did " + hit + " damage with your " + getWeaponName());
        enemy.setHealth(enemyHealth - hit);
        System.out.println("They now have " + enemy.getHealth() + " health points");
    }

    /*public void useFireball(Character enemy){
        if ()

    }

     */

    public int getGold() {
        return gold;
    }

    public ArrayList getInventory() {
        return inventory;
    }

    public void addGold(int goldAmount) {
        this.gold += goldAmount;
    }

}
