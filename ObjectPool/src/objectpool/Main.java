package objectpool;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/DossierBC",
                "root", "Fr57@zu70");

        // Get a connection:
        Connection connection = pool.takeOut();
        // Return the connection:
        pool.takeIn(connection);
    }
}
