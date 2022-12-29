import java.sql.*;
import java.util.List;

public class TestConnection {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recupaconexao();

        Statement stm =  connection.createStatement();
        boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        System.out.println(resultado);

        ResultSet rst = stm.getResultSet();
        while(rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println(id);

            String nome = rst.getString("NOME");
            System.out.println(nome);

            String descricacao = rst.getString("DESCRICAO");
            System.out.println(descricacao);

        }

        connection.close();



    }
}
