package spark;

import spark.config.Path;
import spark.dao.BaseDao;
import spark.dao.BaseDaoMock;
import spark.tweet.Tweet;
import spark.user.User;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

/**
 * Created by hein on 5/15/17.
 */
public class Application {

    private static BaseDao<Tweet> tweetDao;
    private static BaseDao<User> userDao;

    public static void main(String[] args) {
        port(4567);

        userDao = new BaseDaoMock<User>();
        tweetDao = new BaseDaoMock<Tweet>();

        get(Path.HELLO, (req, res) -> "Hello World");

        get(Path.USERS, (req, res) -> "");
        post(Path.USERS, (req, res) -> "");

        get(Path.TWEETS, (req, res) -> "");
        post(Path.TWEETS, (req, res) -> "");
    }
}
