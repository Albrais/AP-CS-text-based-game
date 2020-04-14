


public class Enemy extends Character{

    private int amountGold;
    public Enemy(int enemyHealth, String enemyName, Weapon enemyWeapon, int goldDrop){
        super(enemyHealth, enemyName, enemyWeapon);
        amountGold = goldDrop;

    }

    public void attack(Character MainCharacter){
        int enemyHealth = MainCharacter.getHealth();
        int hit = getWeapon().generateHit();
        System.out.println("They did " + hit + " damage to you with their " + getWeapon().getName());
        MainCharacter.setHealth(enemyHealth - hit);
        System.out.println("You now have " + MainCharacter.getHealth() + " health points");
    }

}
