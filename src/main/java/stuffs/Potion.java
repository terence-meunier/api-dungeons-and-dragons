package stuffs;

import Game.Location;
import characters.Character;

public class Potion extends Stuff implements Location {
    private int life;

    public Potion(String name, String imgUrl, int life) {
        super(name, imgUrl);
        this.life = life;
    }

    public void interaction(Character character) {
        character.setLife(character.getLife() + this.life);
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
