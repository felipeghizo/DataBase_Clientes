
package modelo;

import dao.CameraDAO;

public class Camera {
    
    private String modelo;
    private String MAC;
    CameraDAO camera = new CameraDAO();

    public Camera() {
        this("","");
    }
    
    public Camera(String modelo, String MAC) {
        this.modelo = modelo;
        this.MAC = MAC;
       
    }

    public String getMAC() {
        return this.MAC;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public int getCameraid(String modelo, String Mac){
        return camera.getCameraidDAO(modelo, Mac);
    }

    public void setMAC(String MAC) {
        String auxMAC = this.MAC;
        this.MAC = MAC;
        camera.setMACDAO(this.getCameraid(this.modelo, auxMAC), this.MAC);
    }

    public void setModelo(String modelo) {
        String auxModelo = this.modelo;
        this.modelo = modelo;
        camera.setModeloDAO(this.getCameraid(auxModelo, this.MAC), this.modelo);
    }
    
    public void addCamera(){
        camera.addCameraDAO(this.modelo, this.MAC);
    }
    
    public void delCamera(String modelo, String MAC){
        camera.delCameraDAO(this.getCameraid(modelo, MAC));
    }
    
    
}
