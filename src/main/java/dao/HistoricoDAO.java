// @author fe060311
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Historico;


public class HistoricoDAO {
    
    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
   
    // gets
    public int getHistoricoidDAO(String nome_cliente, String modelo_camera) {
        String sql = """
                     SELECT COUNT(*) AS total 
                     FROM historico 
                     WHERE nome_cliente = ? AND modelo_camera = ?
                     """;
        int envioid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nome_cliente);
            stmt.setString(2, modelo_camera);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    int totalFerramentas = res.getInt("total");  // Obtém o total de historico encontrados
                    if (totalFerramentas > 0) {  // Pelo menos um envio foi encontrado
                        sql = "SELECT envioid FROM historico WHERE nome_cliente = ? AND modelo_camera = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nome_cliente);
                            stmt2.setString(2, modelo_camera);

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
            System.out.println("Erro ao procurar historicoid : " + e.getMessage());
        }
        return envioid;
    }
    public String getNomeClienteDAO(int envioid){  
    String sql = """
                 SELECT nome_cliente 
                 FROM historico 
                 WHERE envioid = ? 
                 """;
        String nomeCliente = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    nomeCliente = res.getString("nome_cliente");
                } else {
                    // Nenhum clienteid foi encontrado
                    System.out.println("Nenhum nome_cliente encontrado com o id: " + envioid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nome_cliente do historico: " + e.getMessage());
        }
        return nomeCliente;
    }
    public String getModeloCameraDAO(int envioid){  
    String sql = """
                 SELECT modelo_camera 
                 FROM historico 
                 WHERE envioid = ?
                 """;
        String cameraModelo = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, envioid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    cameraModelo = res.getString("modelo_camera");
                } else {
                    // Nenhum cameraid foi encontrado
                    System.out.println("Nenhum cameraid encontrado com o id: " + envioid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o cameraid do envio: " + e.getMessage());
        }
        return cameraModelo;
    }
    public String getData_EntregaDAO(int envioid){  
    String sql = """
                 SELECT data_entrega 
                 FROM historico 
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
                 FROM historico 
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
                 FROM historico 
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
                 FROM historico 
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
                 FROM historico 
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
                 FROM historico 
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
    
    
    // Retorna a Lista de emprestimos
    public ArrayList getHistoricosDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM historico");
            while (res.next()) {
                String nomeCliente = res.getString("nome_cliente");
                String modeloCamera = res.getString("modelo_camera");
                String dataEntrega = res.getString("data_entrega");
                String dataEnvio = res.getString("data_envio");
                String dataInstalacao = res.getString("data_instalacao");
                int notaFiscal = res.getInt("nota_fiscal");
                int sequencia = res.getInt("sequencia");
                int numeroPedido = res.getInt("numero_pedido");
                Historico historico = new Historico(nomeCliente, modeloCamera, dataEntrega, dataEnvio, dataInstalacao, notaFiscal, sequencia, numeroPedido);
                minhaLista.add(historico);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizaoooooo!");
        }
        return minhaLista;
    }
    
    // Adiciona Emprestimo
    public void addHistoricoDAO(String nomeCliente, String modeloCamera, String dataEntrega, String dataEnvio, String dataInstalacao, int notaFiscal, int sequencia, int numeroPedido) {
        String sql = "INSERT INTO historico(nome_cliente, modelo_camera, data_entrega, data_envio, data_instalacao, nota_fiscal, sequencia, numero_pedido) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nomeCliente);
            stmt.setString(2, modeloCamera);
            stmt.setString(3, dataEntrega);
            stmt.setString(4, dataEnvio);
            stmt.setString(5, dataInstalacao);
            stmt.setInt(6, notaFiscal);
            stmt.setInt(7, sequencia);
            stmt.setInt(8, numeroPedido);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui Cliente
    public void removeHistoricoDAO(int emprestimoid) {
        String sql = "DELETE FROM historico WHERE envioid = (?)";
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