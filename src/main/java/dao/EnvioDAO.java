// @author fe060311
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Envio;


public class EnvioDAO {
    

    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    // gets
    public int getEnvioidDAO(int clienteid, int cameraid) {
        String sql = """
                     SELECT COUNT(*) AS total 
                     FROM tb_envio 
                     WHERE clienteid = ? AND cameraid = ?
                     """;
        int envioid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    int totalFerramentas = res.getInt("total");  // Obtém o total de envios encontrados
                    if (totalFerramentas > 0) {  // Pelo menos um envio foi encontrado
                        sql = "SELECT envioid FROM tb_envio WHERE clienteid = ? AND cameraid = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setInt(1, clienteid);
                            stmt2.setInt(2, cameraid);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                envioid = res2.getInt("envioid");
                            }
                        }
                    } else {  // Nenhum envio foi encontrado
                        
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao procurar clienteid : " + e.getMessage());
        }
        return envioid;
    }
    public int getClienteidDAO(int sequencia, int numero_pedido){  
    String sql = """
                 SELECT clienteid 
                 FROM tb_envio 
                 WHERE sequencia = ? AND numero_pedido = ?
                 """;
        int clienteid = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, sequencia);
            stmt.setInt(2, numero_pedido);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    clienteid = res.getInt("clienteid");
                } else {
                    // Nenhum clienteid foi encontrado
                    System.out.println("Nenhum clienteid encontrado com o id: " + clienteid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o clienteid da câmera: " + e.getMessage());
        }
        return clienteid;
    }
    public int getCameraidDAO(int sequencia, int numero_pedido){  
    String sql = """
                 SELECT cameraid 
                 FROM tb_envio 
                 WHERE sequencia = ? AND numero_pedido = ?
                 """;
        int cameraid = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, sequencia);
            stmt.setInt(2, numero_pedido);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    cameraid = res.getInt("cameraid");
                } else {
                    // Nenhum cameraid foi encontrado
                    System.out.println("Nenhum cameraid encontrado com o id: " + cameraid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o cameraid da câmera: " + e.getMessage());
        }
        return cameraid;
    }
    public String getAcessoDAO(int envioid){  
    String sql = """
                 SELECT acesso 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        String acesso = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    acesso = res.getString("acesso");
                } else {
                    // Nenhum acesso foi encontrado
                    System.out.println("Nenhum acesso encontrado com o id: " + acesso);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o acesso da câmera: " + e.getMessage());
        }
        return acesso;
    }
    public String getData_EntregaDAO(int envioid){  
    String sql = """
                 SELECT data_entrega 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        String data_entrega = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    data_entrega = res.getString("data_entrega");
                } else {
                    // Nenhuma data_entrega foi encontrada
                    System.out.println("Nenhum data_entrega encontrado com o id: " + data_entrega);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o data_entrega da câmera: " + e.getMessage());
        }
        return data_entrega;
    }
    public String getData_EnvioDAO(int envioid){  
    String sql = """
                 SELECT data_envio 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        String data_envio = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    data_envio = res.getString("data_envio");
                } else {
                    // Nenhuma data_envio foi encontrada
                    System.out.println("Nenhum data_envio encontrado com o id: " + data_envio);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o data_envio da câmera: " + e.getMessage());
        }
        return data_envio;
    }
    public String getData_InstalacaoDAO(int envioid){  
    String sql = """
                 SELECT data_instalacao 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        String data_instalacao = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    data_instalacao = res.getString("data_instalacao");
                } else {
                    // Nenhuma data_instalacao foi encontrada
                    System.out.println("Nenhum data_instalacao encontrado com o id: " + data_instalacao);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o data_instalacao da câmera: " + e.getMessage());
        }
        return data_instalacao;
    }
    public int getNotaFiscalDAO(int envioid){  
    String sql = """
                 SELECT nota_fiscal 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        int nota_fiscal = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    nota_fiscal = res.getInt("nota_fiscal");
                } else {
                    // Nenhuma nota_fiscal foi encontrada
                    System.out.println("Nenhum nota_fiscal encontrado com o id: " + nota_fiscal);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nota_fiscal da câmera: " + e.getMessage());
        }
        return nota_fiscal;
    }
    public int getSequenciaDAO(int envioid){  
    String sql = """
                 SELECT sequencia 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        int sequencia = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    sequencia = res.getInt("sequencia");
                } else {
                    // Nenhuma sequencia foi encontrada
                    System.out.println("Nenhum sequencia encontrado com o id: " + sequencia);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o sequencia da câmera: " + e.getMessage());
        }
        return sequencia;
    }
    public int getNumero_PedidoDAO(int envioid){  
    String sql = """
                 SELECT numero_pedido 
                 FROM tb_envio 
                 WHERE envioid = ?
                 """;
        int numero_pedido = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    numero_pedido = res.getInt("numero_pedido");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum numero_pedido encontrado com o id: " + numero_pedido);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o numero_pedido da câmera: " + e.getMessage());
        }
        return numero_pedido;
    }
    
    // sets
    public void setClienteidDAO(int emprestimoid, int novoClienteid){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET clienteid = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoClienteid);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setCameraidDAO(int emprestimoid, int novoCameraid){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET cameraid = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoCameraid);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setAcessoDAO(int emprestimoid, String novoAcesso){  
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
    public void setData_EntregaDAO(int emprestimoid, String novaData_entrega){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET data_entrega = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_entrega);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setData_EnvioDAO(int emprestimoid, String novaData_envio){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET data_envio = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_envio);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setData_InstalacaoDAO(int emprestimoid, String novaData_instalacao){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET data_instalacao = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_instalacao);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setNota_FiscalDAO(int emprestimoid, int novaNota_fiscal){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET nota_fiscal = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novaNota_fiscal);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setSequenciaDAO(int emprestimoid, int novaSequencia){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET sequencia = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novaSequencia);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setNumero_PedidoDAO(int emprestimoid, int novoNumero_pedido){  
    String sql = """
                 UPDATE tb_emprestimos
                 SET numero_pedido = (?)
                 WHERE emprestimoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoNumero_pedido);
            stmt.setInt(2, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de emprestimos
    public ArrayList getEnviosDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
            while (res.next()) {
                int clienteid = res.getInt("clienteid");
                int cameraid = res.getInt("cameraid");
                String acesso = res.getString("acesso");
                String data_entrega = res.getString("data_entrega");
                String data_envio = res.getString("data_envio");
                String data_instalacao = res.getString("data_instalacao");
                int nota_fiscal = res.getInt("nota_fiscal");
                int sequencia = res.getInt("sequencia");
                int numero_pedido = res.getInt("numero_pedido");
                Envio emprestimo = new Envio(clienteid, cameraid, acesso, data_entrega, data_envio, data_instalacao, nota_fiscal, sequencia, numero_pedido);
                minhaLista.add(emprestimo);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Emprestimo
    public void addEnvioDAO(int clienteid, int cameraid, String acesso, String data_entrega, String data_envio, String data_instalacao, int nota_fiscal, int sequencia, int numero_pedido) {
        String sql = "INSERT INTO tb_emprestimos(clienteid, cameraid, acesso, data_entrega, data_envio, data_instalacao, nota_fiscal, sequencia, numero_pedido) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);
            stmt.setString(3, acesso);
            stmt.setString(4, data_entrega);
            stmt.setString(5, data_envio);
            stmt.setString(6, data_instalacao);
            stmt.setInt(7, nota_fiscal);
            stmt.setInt(8, sequencia);
            stmt.setInt(9, numero_pedido);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui Cliente
    public void removeEnvioDAO(int emprestimoid) {
        String sql = "DELETE FROM tb_emprestimos WHERE emprestimoid = (?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, emprestimoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
   
}