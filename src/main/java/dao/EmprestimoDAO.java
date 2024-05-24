// @author fe060311
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Camera;
import modelo.Cliente;
import modelo.Emprestimo;


public class EmprestimoDAO {
    

    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    public void setAcesso(int emprestimoid, String novoAcesso){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET acesso = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoAcesso);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setUsuario(int emprestimoid, String novoUsuario){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET usuario = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoUsuario);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setSenha(int emprestimoid, String novaSenha){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET senha = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaSenha);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setPorta(int emprestimoid, String novaPorta){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET porta = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaPorta);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setDataEntrega(int emprestimoid, String novaDataEntrega){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET data_entrega = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaDataEntrega);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de emprestimos
    public ArrayList getEmprestimos() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
            while (res.next()) {
                String acesso = res.getString("acesso");
                String usuario = res.getString("usuario");
                String senha = res.getString("senha");
                String porta = res.getString("porta");
                String data_entrega = res.getString("data_entrega");
                Emprestimo emprestimo = new Emprestimo(acesso, usuario, senha, porta, data_entrega);
                minhaLista.add(emprestimo);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Emprestimo
    public void addEmprestimo(int clienteid, int cameraid, String acesso, String usuario, String senha, String porta, String data_entrega) {
        String sql = "INSERT INTO tb_emprestimos(clienteid, cameraid, acesso, usuario, senha, porta, data_entrega) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);
            stmt.setString(3, acesso);
            stmt.setString(4, usuario);
            stmt.setString(5, senha);
            stmt.setString(6, porta);
            stmt.setString(7, data_entrega);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui Cliente
    public void removeEmprestimo(int clienteid, int cameraid) {
        String sql = "DELETE FROM tb_emprestimos WHERE clienteid = (?) AND cameraid = (?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public int editarEmprestimo(int clienteid, int cameraid) {
        String sql = "SELECT COUNT(*) AS total FROM tb_emprestimos WHERE clienteid = ? AND cameraid = ?";
        int camera_id = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT emprestimoid FROM tb_emprestimoss WHERE clienteid = ? AND cameraid = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setInt(1, clienteid);
                            stmt2.setInt(2, cameraid);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                camera_id = res2.getInt("emprestimoid");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar camera: " + e.getMessage());
        }
        return camera_id;
    }
}