package spark;

import spark.config.Path;
import spark.services.TwitterService;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by hein on 5/15/17.
 */
public class Application {
    public static void main(String[] args) {
        TwitterService twitterService = new TwitterService();

        port(1337);
        get(Path.helloWorld, (req, res) -> "Hello World!");
        get(Path.user, (req, res) -> twitterService.getAllUsers());
    }
}
