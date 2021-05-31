package menu;

import Game.Game;
import characters.Ennemy;
import stuffs.Potion;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuInterface {

    private Game game;

    public Menu() {
        this.game = new Game();
    }

    public List<Object> getDatas() {
        List<Object> datas = new ArrayList<>();
        datas.add(game.getPlayer());
        datas.add(game.getBoard());
        return datas;
    }

    public void launchRound() {
        // Jouer un tour
        game.run();
    }

    public void initGame() {
        // Mets le joueur à la position 0
        game.reset();
        game.getPlayer().setPosition(0);
    }

    public void reset() {
        game.getPlayer().reset();
    }
}
