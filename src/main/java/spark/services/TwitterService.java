package spark.services;

import spark.tweet.TweetDao;
import spark.user.User;
import spark.user.UserDao;

import java.util.List;

/**
 * Created by hein on 5/15/17.
 */
public class TwitterService {
    UserDao userDao = new UserDao();
    TweetDao tweetDao = new TweetDao();

    public TwitterService() {

    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
