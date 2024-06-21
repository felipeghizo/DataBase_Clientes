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


public class CameraDAO {
   
    ArrayList minhaLista = new ArrayList();
    Conexao conexao = new Conexao();
    
    // Gets
    public int getCameraidDAO(String modeloEditar, String MACEditar) {
        String sql = "SELECT COUNT(*) AS total FROM cameras WHERE modelo = ? AND MAC = ?";
        int cameraid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, modeloEditar);
            stmt.setString(2, MACEditar);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de câmeras encontradas
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos uma câmera foi encontrada
                        sql = "SELECT cameraid FROM cameras WHERE modelo = ? AND MAC = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, modeloEditar);
                            stmt2.setString(2, MACEditar);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                cameraid = res2.getInt("cameraid");
                            }
                        }
                    } else {
                        // Nenhuma câmera foi encontrada
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao procurar câmera: " + e.getMessage());
        }
        return cameraid;
    }
    public String getModeloDAO(int cameraid){  
    String sql = """
                 SELECT modelo 
                 FROM cameras 
                 WHERE cameraid = ?
                 """;
        String modelo = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, cameraid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    modelo = res.getString("modelo");
                } else {
                    // Nenhum modelo foi encontrado
                    System.out.println("Nenhum modelo encontrado com o id: " + cameraid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o modelo da câmera: " + e.getMessage());
        }
        return modelo;
    }
    public String getMACDAO(int cameraid){  
    String sql = """
                 SELECT MAC 
                 FROM cameras 
                 WHERE cameraid = ?
                 """;
        String MAC = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, cameraid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    MAC = res.getString("MAC");
                } else {
                    // Nenhum MAC foi encontrado
                    System.out.println("Nenhum MAC encontrado com o id: " + cameraid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o MAC da câmera: " + e.getMessage());
        }
        return MAC;
    }
    
    // Sets
    public void setModeloDAO(int cameraid, String novoModelo){  
    String sql = """
                 UPDATE cameras
                 SET modelo = (?)
                 WHERE cameraid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoModelo);
            stmt.setInt(2, cameraid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setMACDAO(int cameraid, String novoMAC){
      String sql = """
                 UPDATE cameras
                 SET MAC = (?)
                 WHERE cameraid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoMAC);
            stmt.setInt(2, cameraid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Retorna a Lista de câmeras
    public ArrayList getCamerasDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM cameras");
            while (res.next()) {
                String nome = res.getString("modelo");
                String MAC = res.getString("MAC");
                Camera camera = new Camera(nome, MAC);
                minhaLista.add(camera);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        return minhaLista;
    }
    
    // Adiciona câmera
    public void addCameraDAO(String modelo, String MAC) {
        String sql = """
                    INSERT INTO cameras(modelo,MAC) 
                    VALUES(?,?)
                     """;
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, modelo);
            stmt.setString(2, MAC);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Exclui câmera
    public void delCameraDAO(int cameraid) {
        String sql = """
                     DELETE FROM cameras 
                     WHERE cameraid = (?)
                     """;
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setInt(1, cameraid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    
}