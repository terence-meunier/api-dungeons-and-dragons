package Game;

import characters.Ennemy;
import characters.Warrior;
import stuffs.Potion;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Warrior player;
    private List<Location> board;
    private int position;

    public Game() {
        this.position = 0;
        this.player = new Warrior("Conan", 3, 8, "/img/warrior.png");
        this.board = new ArrayList<>();
        for (int i=0; i<10; i++) {
            if (i % 2 == 0) {
                board.add(new Ennemy("Gobelin", 4, 2, "/img/gobelin.png"));
            } else {
                board.add(new Potion("Potion standard", "/img/potion-std.jpg", 2));
            }
        }
    }

    public void run() {
        if (position < 9) {
            position++;
        } else {
            position = 0;
        }
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
