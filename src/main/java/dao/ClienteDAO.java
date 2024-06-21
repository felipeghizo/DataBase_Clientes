// @author fe060311
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;


public class ClienteDAO {
   
    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    // Gets
    public int getClienteidDAO(String nome, int NumeroCliente) {
        String sql = """
                    SELECT COUNT(*) AS total 
                    FROM clientes 
                    WHERE nome = ? AND numero_cliente = ?
                    """;
        int clienteid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nome);
            stmt.setInt(2, NumeroCliente);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de clientes encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um cliente foi encontrado
                        sql = """
                              SELECT clienteid 
                              FROM clientes 
                              WHERE nome = ? AND numero_cliente = ?
                              """;
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nome);
                            stmt2.setInt(2, NumeroCliente);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                clienteid = res2.getInt("clienteid");
                            }
                        }
                    } else {
                        // Nenhum cliente foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao procurar cliente: " + e.getMessage());
        }
        return clienteid;
    }
    public String getNomeDAO(int clienteid){  
    String sql = """
                 SELECT nome 
                 FROM clientes 
                 WHERE clienteid = ?
                 """;
        String nome = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    nome = res.getString("nome");
                } else {
                    // Nenhum nome foi encontrado
                    System.out.println("Nenhum nome encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nome do cliente: " + e.getMessage());
        }
        return nome;
    }
    public String getTelefoneDAO(int clienteid){  
    String sql = """
                 SELECT telefone 
                 FROM clientes 
                 WHERE clienteid = ?
                 """;
        String telefone = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    telefone = res.getString("telefone");
                } else {
                    // Nenhum telefone foi encontrado
                    System.out.println("Nenhum telefone encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o telefone do cliente: " + e.getMessage());
        }
        return telefone;
    }
    public String getEmailDAO(int clienteid){  
    String sql = """
                 SELECT email 
                 FROM clientes 
                 WHERE clienteid = ?
                 """;
        String email = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    email = res.getString("email");
                } else {
                    // Nenhum E-mail foi encontrado
                    System.out.println("Nenhum E-mail encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o E-mail do cliente: " + e.getMessage());
        }
        return email;
    }
    public String getEnderecoDAO(int clienteid){  
    String sql = """
                 SELECT endereco 
                 FROM clientes 
                 WHERE clienteid = ?
                 """;
        String endereco = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    endereco = res.getString("endereco");
                } else {
                    // Nenhum endereço foi encontrado
                    System.out.println("Nenhum endereço encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o endereço do cliente: " + e.getMessage());
        }
        return endereco;
    }
    public int getNumeroClienteDAO(int clienteid){  
    String sql = """
                 SELECT numero_cliente 
                 FROM clientes 
                 WHERE clienteid = ?
                 """;
        int numero_cliente = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    numero_cliente = res.getInt("numero_cliente");
                } else {
                    // Nenhum número de cliente foi encontrado
                    System.out.println("Nenhum número de cliente encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o número de cliente do cliente: " + e.getMessage());
        }
        return numero_cliente;
    }
    
    // Sets
    public void setNomeDAO(int clienteid, String novoNome){  
    String sql = """
                 UPDATE clientes
                 SET nome = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }   
    public void setTelefoneDAO(int clienteid, String novoTelefone){
      String sql = """
                 UPDATE clientes
                 SET telefone = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoTelefone);
            stmt.setInt(2, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }   
    public void setEmailDAO(int clienteid, String novoEmail){
      String sql = """
                 UPDATE clientes
                 SET email = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoEmail);
            stmt.setInt(2, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setEnderecoDAO(int clienteid, String novoEndereco){
      String sql = """
                 UPDATE clientes
                 SET endereco = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoEndereco);
            stmt.setInt(2, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setNumeroClienteDAO(int clienteid, int novaNumeroCliente){
      String sql = """
                 UPDATE clientes
                 SET numero_cliente = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novaNumeroCliente);
            stmt.setInt(2, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de clientes
    public ArrayList getClientesDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM clientes");
            while (res.next()) {
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                String email = res.getString("email");
                int numeroCliente = res.getInt("numero_cliente");
                String endereco = res.getString("endereco");
                Cliente cliente = new Cliente(nome, telefone, email, numeroCliente, endereco);
                minhaLista.add(cliente);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        return minhaLista;
    }
    
    // Adiciona Cliente
    public void addClienteDAO(String nome, String telefone, String email, int numeroCliente, String endereco) {
        String sql = "INSERT INTO clientes(nome, telefone, email, numero_cliente, endereco) VALUES(?,?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.setInt(4, numeroCliente);
            stmt.setString(5, endereco);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui Cliente
    public void delClienteDAO(int clienteid) {
        String sql = "DELETE FROM clientes WHERE clienteid = (?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, clienteid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}