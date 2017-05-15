package spark.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hein on 5/15/17.
 */
public class UserDao {
    public List<User> users = new ArrayList<User>();

    public UserDao() {
        users.add(new User(new Long(1), "Christian", "test", "test"));
        users.add(new User(new Long(2), "Hein", "test", "test"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}
