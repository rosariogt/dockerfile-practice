import org.sql2o.Sql2o;

public class PostgresConnection {

    protected Sql2o sql2o;

    public PostgresConnection(String url, String user, String password) {
        sql2o = new Sql2o(url, user, password);
    }

}
