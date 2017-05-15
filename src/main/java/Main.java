import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by hein on 5/15/17.
 */
public class Main {
    public static void main(String[] args) {
        port(1337);
        get("/hello", (req, res) -> "Hello World!");
    }
}
