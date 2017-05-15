package spark;

import spark.config.Path;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by hein on 5/15/17.
 */
public class Application {
    public static void main(String[] args) {
        port(1337);
        get(Path.helloWorld, (req, res) -> "Hello World!");
    }
}
