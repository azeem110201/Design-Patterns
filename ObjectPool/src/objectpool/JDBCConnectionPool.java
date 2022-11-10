package objectpool;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection>{
    String dsn, user, password;

    JDBCConnectionPool(String driver, String dsn, String user, String password)
    {
        super();
        try {
            Class.forName(driver).newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.user = user;
        this.password = password;
    }
    @Override
    Connection create() {
        try {
            return (DriverManager.getConnection(dsn, user, password));
        }
        catch (SQLException e) {
            e.printStackTrace();
            return (null);
        }
    }

    @Override
    boolean validate(Connection o) {
        try {
            return (!((Connection)o).isClosed());
        }
        catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    @Override
    void dead(Connection o) {
        try {
            ((Connection)o).close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
