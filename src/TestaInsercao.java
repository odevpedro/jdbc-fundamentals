import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recupaconexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')",
                Statement.RETURN_GENERATED_KEYS);
        ResultSet resultSet = stm.getGeneratedKeys();
        while (resultSet.next()){
            Integer id = resultSet.getInt(1);
            System.out.println("O id criado foi: " + id);
        }
    }
}
