package Game;

import characters.Ennemy;
import characters.Warrior;
import stuffs.Potion;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Warrior player;
    private List<Location> board;

    private void buildBoard() {
        for (int i=0; i<30; i++) {
            if (i % 2 == 0) {
                board.add(new Ennemy("Gobelin", 4, 2, "/img/gobelin.png"));
            } else if (i % 3 == 0) {
                board.add(new Ennemy("Sorcier", 6, 4, "/img/sorcier.png"));
            } else {
                board.add(new Potion("Potion standard", "/img/potion-std.jpg", 2));
            }
        }
    }

    public Game() {
        this.player = new Warrior("Conan", 8, 3, "/img/warrior.png");
        this.board = new ArrayList<>();
        this.buildBoard();
    }

    public void run() {
        if (player.getPosition() < 9) {
            player.setPosition(player.getPosition() + 1);
        } else {
            player.setPosition(0);
        }
        board.get(player.getPosition()).interaction(player);
    }

    public void reset() {
        board.clear();
        this.buildBoard();
    }

    public Warrior getPlayer() {
        return player;
    }

    public void setPlayer(Warrior player) {
        this.player = player;
    }

    public List<Location> getBoard() {
        return board;
    }

    public void setBoard(List<Location> board) {
        this.board = board;
    }

}
