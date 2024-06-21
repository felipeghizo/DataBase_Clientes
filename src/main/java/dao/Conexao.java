package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConexao() {
        Connection connection; // instância da conexão
        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            // Configurar a conexão

            String server = "192.168.1.114"; // Endereço IP do servidor MySQL na rede local
            String database = "envio";       // Nome do banco de dados que você deseja acessar
            String url = "jdbc:mysql://" + server + ":3306/" + database 
             + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";            // Nome de usuário do MySQL
            String password = "admin123";    // Senha do usuário do MySQL
            // Conectando..
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver não foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            return null;
        }
    }
}
