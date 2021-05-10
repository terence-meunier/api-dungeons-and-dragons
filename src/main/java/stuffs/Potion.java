package stuffs;

import Game.Location;

public class Potion extends Stuff implements Location {
    private int life;

    public Potion(String name, String imgUrl, int life) {
        super(name, imgUrl);
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
