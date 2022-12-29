import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recupaconexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&ServerTimezone=UTC", "root", "root");


    }
}
