package characters;

import Game.Location;

public class Ennemy extends Character implements Location {

    public Ennemy(String name, int life, int atk, String imgUrl) {
        super(name, life, atk, imgUrl);
    }
}
