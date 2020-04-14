
public class Weapon extends Item{
    private int damage;

    public Weapon(String weaponName, int weaponDamage, int goldValue){
        super(weaponName, goldValue);
        damage = weaponDamage;
    }

    public double getDamage() {
        return damage;
    }

    public int generateHit() {
        return ((int)(getDamage() *  (Math.random() +1)));
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
