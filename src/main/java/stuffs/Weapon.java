package stuffs;

public class Weapon extends Stuff {
    private int atk;

    public Weapon(String name, String imgUrl, int atk) {
        super(name, imgUrl);
        this.atk = atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return super.toString() + "Weapon{" +
                "atk=" + atk +
                '}';
    }
}
