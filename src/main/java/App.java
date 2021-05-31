import static spark.Spark.*;

import com.google.gson.Gson;
import menu.Menu;

public class App {
    public static void main(String[] args) {

        // Menu
        Menu menu = new Menu();
        menu.initGame();

        // Gson Object
        Gson gson = new Gson();

        // Cors Origin allow access
        before("/*", (req, res) -> res.header("Access-Control-Allow-Origin", "*"));

        // Get player
        get("/demo/player", (req, res) -> {
            return menu.getPlayer();
        }, gson::toJson);

        // Get board and position
        get("demo/game", (req, res) -> {
            return menu.getBoard();
        }, gson::toJson);

        // Get position
        get("demo/position", (req, res) -> {
            return menu.getPosition();
        }, gson::toJson);

        // Launch round
        get("/demo/go", (req, res) -> {
            menu.launchRound();
            res.redirect("/demo");
            return null;
        });

        // Fight
        get("/demo/fight", (req, res) -> {
            menu.fight();
            res.redirect("/demo");
            return null;
        });

        // drop item
        get("/demo/drop", (req, res) -> {
            menu.dropItem();
            res.redirect("/demo");
            return null;
        });
    }
}
