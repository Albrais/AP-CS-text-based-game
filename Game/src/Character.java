


public abstract class Character {

    private int health;
    private String name;
    private Weapon weapon;

    public Character(int health1, String name1, Weapon weapon1){
        health = health1;
        name = name1;
        weapon = weapon1;
    }

    public abstract void attack(Character MainCharacter);

    public String toString(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeaponName() {
        return weapon.getName();
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
