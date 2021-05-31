package characters;

import Game.Location;

public class Ennemy extends Character implements Location {

    public Ennemy(String name, int life, int atk, String imgUrl) {
        super(name, life, atk, imgUrl);
    }

    public void interaction(Character character) {
        this.setLife(this.getLife() - character.getAtk());
        if (this.getLife() < 0) {
            this.setLife(0);
            this.setImgUrl("/img/gobelin2.png");
        } else {
            character.takeDamages(this.getAtk());
        }
    }
}
