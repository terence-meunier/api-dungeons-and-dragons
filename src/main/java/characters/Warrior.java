package characters;

public class Warrior extends Character {

    private String weapon;
    private String shield;

    public Warrior(String name, int life, int atk, String imgUrl) {
        super(name, life, atk, imgUrl);
        this.weapon = "Arc";
        this.shield = "Enchantement";
    }

    public String getWeapon() {
        return weapon;
    }

    public String getShield() {
        return shield;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return super.toString() + "Warrior{" +
                "weapon='" + weapon + '\'' +
                ", shield='" + shield + '\'' +
                '}';
    }
}
