package menu;

import characters.Character;
import Game.Location;

import java.util.List;

public interface MenuInterface {
    void launchRound();
    List<Object> getDatas();
    void initGame();
    void reset();
}
