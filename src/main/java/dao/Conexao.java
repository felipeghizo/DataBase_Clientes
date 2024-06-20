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
            String server = "10.100.68.85"; // Altere para o endereço IP ou hostname do servidor
            String database = "envio";
            String url = "jdbc:mysql://" + server + ":3306/"
                         + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Camerasip135.";
            // Conectando..
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver não foi encontrado.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            e.printStackTrace();
            return null;
        }
    }
}
