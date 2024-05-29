// @author fe060311
package modelo;

import dao.CameraDAO;

public class Camera {
    
    private String modelo;
    private String MAC;
    CameraDAO cameraDAO = new CameraDAO();

    public Camera() {
        this("","");
    }
    
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
    public String getMAC() {
        return cameraDAO.getMACDAO(getCameraid(this.modelo, this.MAC));
    }

    // Sets
    public void setMAC(String MAC) {
        String auxMAC = this.MAC;
        this.MAC = MAC;
        cameraDAO.setMACDAO(this.getCameraid(this.modelo, auxMAC), this.MAC);
    }
    public void setModelo(String modelo) {
        String auxModelo = this.modelo;
        this.modelo = modelo;
        cameraDAO.setModeloDAO(this.getCameraid(auxModelo, this.MAC), this.modelo);
    }
    
    // Adiciona camera ao banco de dados
    public void addCamera(){
        cameraDAO.addCameraDAO(this.modelo, this.MAC);
    }
    
    // deleta camera do banco de dados
    public void delCamera(String modelo, String MAC){
        cameraDAO.delCameraDAO(this.getCameraid(modelo, MAC));
    }
    
    
}
