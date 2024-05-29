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
    public int getClienteidDAO(String nome, String NumeroCliente) {
        String sql = """
                    SELECT COUNT(*) AS total 
                    FROM tb_clientes 
                    WHERE nome = ? AND numero_cliente = ?
                    """;
        int clienteid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nome);
            stmt.setString(2, NumeroCliente);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = """
                              SELECT clienteid 
                              FROM tb_clientes 
                              WHERE nome = ? AND numero_cliente = ?
                              """;
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nome);
                            stmt2.setString(2, NumeroCliente);

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
            System.out.println("Erro ao editar camera: " + e.getMessage());
        }
        return clienteid;
    }
    public String getNomeDAO(int clienteid){  
    String sql = """
                 SELECT nome 
                 FROM tb_clientes 
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
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum cliente encontrado com o id: " + clienteid);
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
                 FROM tb_clientes 
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
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
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
                 FROM tb_clientes 
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
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum email encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o email do cliente: " + e.getMessage());
        }
        return email;
    }
    public String getEnderecoDAO(int clienteid){  
    String sql = """
                 SELECT endereco 
                 FROM tb_clientes 
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
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum endereco encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o endereco do cliente: " + e.getMessage());
        }
        return endereco;
    }
    public int getNumeroClienteDAO(int clienteid){  
    String sql = """
                 SELECT numero_cliente 
                 FROM tb_clientes 
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
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum numero_cliente encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o numero_cliente do cliente: " + e.getMessage());
        }
        return numero_cliente;
    }
    
    // Sets
    public void setNomeDAO(int clienteid, String novoNome){  
    String sql = """
                 UPDATE tb_clientes
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
                 UPDATE tb_clientes
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
                 UPDATE tb_clientes
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
                 UPDATE tb_clientes
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
    public void setNumeroClienteDAO(int clienteid, String novaNotaFiscal){
      String sql = """
                 UPDATE tb_clientes
                 SET NotaFiscal = (?)
                 WHERE clienteid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaNotaFiscal);
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
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_clientes");
            while (res.next()) {
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                String email = res.getString("email");
                String NotaFiscal = res.getString("NotaFiscal");
                String endereco = res.getString("endereco");
                Cliente cliente = new Cliente(nome, telefone, email, NotaFiscal, endereco);
                minhaLista.add(cliente);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona cliente
    public void addClienteDAO(String nome, String telefone, String email, String NotaFiscal, String endereco) {
        String sql = "INSERT INTO tb_clientes(nome, telefone, email, NotaFiscal, endereco) VALUES(?,?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.setString(4, NotaFiscal);
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
        String sql = "DELETE FROM tb_clientes WHERE clienteid = (?)";
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