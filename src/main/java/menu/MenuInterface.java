package menu;

import characters.Character;
import Game.Location;

import java.util.List;

public interface MenuInterface {
    void launchRound();
    Character getPlayer();
    List<Location> getBoard();
    int getPosition();
    void initGame();
    void fight();
    void dropItem();
}
