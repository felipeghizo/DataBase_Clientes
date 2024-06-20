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
                     FROM envios 
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
                        sql = "SELECT envioid FROM envios WHERE clienteid = ? AND cameraid = ?";
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
    public int getClienteidDAO(int envioid){  
    String sql = """
                 SELECT clienteid 
                 FROM envios 
                 WHERE envioid = ?
                 """;
        int clienteid = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
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
            System.out.println("Erro ao buscar o clienteid do envio: " + e.getMessage());
        }
        return clienteid;
    }
    public int getCameraidDAO(int envioid){  
    String sql = """
                 SELECT cameraid 
                 FROM envios 
                 WHERE envioid = ? 
                 """;
        int cameraid = 0;
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
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
            System.out.println("Erro ao buscar o cameraid do envio: " + e.getMessage());
        }
        return cameraid;
    }
    public String getAcessoDAO(int envioid){  
    String sql = """
                 SELECT acesso 
                 FROM envios 
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
            System.out.println("Erro ao buscar o acesso do envio: " + e.getMessage());
        }
        return acesso;
    }
    public String getData_EntregaDAO(int envioid){  
    String sql = """
                 SELECT data_entrega 
                 FROM envios 
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
            System.out.println("Erro ao buscar o data_entrega do envio: " + e.getMessage());
        }
        return data_entrega;
    }
    public String getData_EnvioDAO(int envioid){  
    String sql = """
                 SELECT data_envio 
                 FROM envios 
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
            System.out.println("Erro ao buscar o data_envio do envio: " + e.getMessage());
        }
        return data_envio;
    }
    public String getData_InstalacaoDAO(int envioid){  
    String sql = """
                 SELECT data_instalacao 
                 FROM envios 
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
            System.out.println("Erro ao buscar o data_instalacao do envio: " + e.getMessage());
        }
        return data_instalacao;
    }
    public int getNotaFiscalDAO(int envioid){  
    String sql = """
                 SELECT nota_fiscal 
                 FROM envios 
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
            System.out.println("Erro ao buscar o nota_fiscal do envio: " + e.getMessage());
        }
        return nota_fiscal;
    }
    public int getSequenciaDAO(int envioid){  
    String sql = """
                 SELECT sequencia 
                 FROM envios 
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
            System.out.println("Erro ao buscar o sequencia do envio: " + e.getMessage());
        }
        return sequencia;
    }
    public int getNumero_PedidoDAO(int envioid){  
    String sql = """
                 SELECT numero_pedido 
                 FROM envios 
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
            System.out.println("Erro ao buscar o numero_pedido do envio: " + e.getMessage());
        }
        return numero_pedido;
    }
    public String getStatusDAO(int envioid){  
    String sql = """
                 SELECT status 
                 FROM envios 
                 WHERE envioid = ?
                 """;
        String Status = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    Status = res.getString("status");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum status encontrado com o id: " + Status);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o status do envio: " + e.getMessage());
        }
        return Status;
    }
    
    // sets
    public void setClienteidDAO(int envioid, int novoClienteid){  
    String sql = """
                 UPDATE envios
                 SET clienteid = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoClienteid);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setCameraidDAO(int envioid, int novoCameraid){  
    String sql = """
                 UPDATE envios
                 SET cameraid = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoCameraid);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setAcessoDAO(int envioid, String novoAcesso){  
    String sql = """
                 UPDATE envios
                 SET acesso = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoAcesso);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setData_EntregaDAO(int envioid, String novaData_entrega){  
    String sql = """
                 UPDATE envios
                 SET data_entrega = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_entrega);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setData_EnvioDAO(int envioid, String novaData_envio){  
    String sql = """
                 UPDATE envios
                 SET data_envio = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_envio);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setData_InstalacaoDAO(int envioid, String novaData_instalacao){  
    String sql = """
                 UPDATE envios
                 SET data_instalacao = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novaData_instalacao);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setNota_FiscalDAO(int envioid, int novaNota_fiscal){  
    String sql = """
                 UPDATE envios
                 SET nota_fiscal = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novaNota_fiscal);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setSequenciaDAO(int envioid, int novaSequencia){  
    String sql = """
                 UPDATE envios
                 SET sequencia = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novaSequencia);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setNumero_PedidoDAO(int envioid, int novoNumero_pedido){  
    String sql = """
                 UPDATE envios
                 SET numero_pedido = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, novoNumero_pedido);
            stmt.setInt(2, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    public void setStatusDAO(int envioid, String novoStatus){  
    String sql = """
                 UPDATE envios
                 SET status = (?)
                 WHERE envioid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoStatus);
            stmt.setInt(2, envioid);
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
            ResultSet res = stmt.executeQuery("SELECT * FROM envios");
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
                String status = res.getString("status");
                Envio emprestimo = new Envio(clienteid, cameraid, acesso, data_entrega, data_envio, data_instalacao, nota_fiscal, sequencia, numero_pedido, status);
                minhaLista.add(emprestimo);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizaoooooo!");
        }
        return minhaLista;
    }
    
    // Adiciona Emprestimo
    public void addEnvioDAO(int clienteid, int cameraid, int nota_fiscal, int sequencia, int numero_pedido, String status) {
        String sql = "INSERT INTO envios(clienteid, cameraid, nota_fiscal, sequencia, numero_pedido, status) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, clienteid);
            stmt.setInt(2, cameraid);
            stmt.setInt(3, nota_fiscal);
            stmt.setInt(4, sequencia);
            stmt.setInt(5, numero_pedido);
            stmt.setString(6, status);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui Cliente
    public void removeEnvioDAO(int envioid) {
        String sql = "DELETE FROM envios WHERE envioid = (?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, envioid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
   
}