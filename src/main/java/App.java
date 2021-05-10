import static spark.Spark.*;

import com.google.gson.Gson;
import menu.Menu;

public class App {
    public static void main(String[] args) {

        // Menu
        Menu menu = new Menu();

        // Gson Object
        Gson gson = new Gson();

        // Cors Origin allow access
        before("/demo", (req, res) -> res.header("Access-Control-Allow-Origin", "*"));

        // Get Player
        get("/demo", "application/json", (req, res) -> {
            if (req.queryParams("action") != null) {
                if (req.queryParams("action").equals("go")) {
                    menu.launchRound();
                }
                if (req.queryParams("action").equals("fight")) {
                    menu.fight();
                }
                if (req.queryParams("action").equals("drop")) {
                    menu.dropItem();
                }
                return menu.getDatas();
            } else {
                menu.initGame();
                return menu.getDatas();
            }
        }, gson::toJson);
    }
}
