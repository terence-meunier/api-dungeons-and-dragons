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

        // Launch round
        get("/demo/go", (req, res) -> {
            menu.launchRound();
            return menu.getDatas();
        }, gson::toJson);

        get("/demo/reset", (req, res) -> {
            menu.initGame();
            menu.reset();
            return menu.getDatas();
        }, gson::toJson);
    }
}
