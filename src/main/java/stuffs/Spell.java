package stuffs;

public class Spell extends Stuff {
    private int atk;

    public Spell(String name, String imgUrl, int atk) {
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
        return super.toString() + "Spell{" +
                "atk=" + atk +
                '}';
    }
}
