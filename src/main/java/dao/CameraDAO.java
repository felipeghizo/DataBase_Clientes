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
    
    public void setModelo(int cameraid, String novoModelo){  
    String sql = """
                 UPDATE tb_cameras
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
    
    public void setMAC(int cameraid, String novoMAC){
      String sql = """
                 UPDATE tb_cameras
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
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getCameras() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_cameras");
            while (res.next()) {
                String nome = res.getString("modelo");
                String MAC = res.getString("MAC");
                Camera camera = new Camera(nome, MAC);
                minhaLista.add(camera);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Camera
    public void addCamera(String modelo, String MAC) {
        String sql = "INSERT INTO tb_cameras(modelo,MAC) VALUES(?,?)";
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
    
    // Exclui Camera
    public void removeCamera(String modelo, String MAC) {
        String sql = "DELETE FROM tb_cameras WHERE modelo = (?) AND MAC = (?)";
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
    
    public int editarCamera(String modeloEditar, String MACEditar) {
        String sql = "SELECT COUNT(*) AS total FROM tb_cameras WHERE modelo = ? AND MAC = ?";
        int cameraid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, modeloEditar);
            stmt.setString(2, MACEditar);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalFerramentas = res.getInt("total");
                    if (totalFerramentas > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT cameraid FROM tb_cameras WHERE modelo = ? AND MAC = ?";
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
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar camera: " + e.getMessage());
        }
        return cameraid;
    }
}