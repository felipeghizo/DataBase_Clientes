// @author fe060311
package modelo;

import dao.CameraDAO;
import java.util.ArrayList;

public class Camera {
    
    private String modelo;
    private String MAC;
    CameraDAO cameraDAO = new CameraDAO();

    // Construtor Default
    public Camera() {
        this("","");
    }
    
    // Construtor com parâmetros
    public Camera(String modelo, String MAC) {
        this.modelo = modelo;
        this.MAC = MAC;
    }
    
    // Gets
    public int getCameraid(String modelo, String MAC){
        return cameraDAO.getCameraidDAO(modelo, MAC);
    }
    public String getModelo() {
        return cameraDAO.getModeloDAO(getCameraid(this.modelo, this.MAC));
    }
    public String getModeloID(int ID) {
        return cameraDAO.getModeloDAO(ID);
    }
    public String getMAC() {
        return cameraDAO.getMACDAO(getCameraid(this.modelo, this.MAC));
    }
    public String getMACID(int ID) {
        return cameraDAO.getMACDAO(ID);
    }
    
    // Get lista de câmeras
    public ArrayList getCameras(){
        return cameraDAO.getCamerasDAO();
    }

    // Sets
    public void setMAC(String MAC) {
        String auxMAC = this.MAC;
        this.MAC = MAC;
        cameraDAO.setMACDAO(this.getCameraid(this.modelo, auxMAC), this.MAC);
    }
    public void setMACID(int ID, String MAC) {
        this.MAC = MAC;
        cameraDAO.setMACDAO(ID, this.MAC);
    }
    public void setModelo(String modelo) {
        String auxModelo = this.modelo;
        this.modelo = modelo;
        cameraDAO.setModeloDAO(this.getCameraid(auxModelo, this.MAC), this.modelo);
    }
    public void setModeloID(int ID, String modelo) {
        this.modelo = modelo;
        cameraDAO.setModeloDAO(ID, this.modelo);
    }
    
    // Adiciona camera ao banco de dados
    public void addCamera(){
        cameraDAO.addCameraDAO(this.modelo, this.MAC);
    }
    
    // deleta camera do banco de dados
    public void delCamera(String modelo, String MAC){
        cameraDAO.delCameraDAO(this.getCameraid(modelo, MAC));
    }
    public void delCameraID(int ID){
        cameraDAO.delCameraDAO(ID);
    }
    
    
}
