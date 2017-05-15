package spark;

import spark.config.Path;
import spark.dao.BaseDao;
import spark.tweet.Tweet;
import spark.user.User;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by hein on 5/15/17.
 */
public class Application {

    private static BaseDao<Tweet> tweetDao;
    private static BaseDao<User> userDao;
    public static void main(String[] args) {


        port(1337);
        get(Path.helloWorld, (req, res) -> "Hello World!");
        get(Path.user, (req, res) -> twitterService.getAllUsers());
    }
}
