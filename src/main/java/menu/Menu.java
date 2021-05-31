package menu;

import Game.Game;
import characters.Character;
import characters.Ennemy;
import stuffs.Potion;
import Game.Location;

import java.util.List;

public class Menu implements MenuInterface {

    private Game game;

    public Menu() {
        this.game = new Game();
    }

    public Character getPlayer() {
        return game.getPlayer();
    }

    public List<Location> getBoard() {
        return game.getBoard();
    }

    public int getPosition() {
        return game.getPosition();
    }

    public void launchRound() {
        // Jouer un tour
        game.run();
    }

    public void initGame() {
        // Mets le joueur à la position 0
        game.setPosition(0);
        game.getPlayer().reset();
    }

    public void fight() {
        // Combat
        Ennemy ennemy = (Ennemy) game.getBoard().get(game.getPosition());
        game.getPlayer().takeDamages(ennemy.getAtk());
    }

    public void dropItem() {
        Potion potion = (Potion) game.getBoard().get(game.getPosition());
        game.getPlayer().drinkPotion(potion.getLife());
    }
}
