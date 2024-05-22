
package modelo;

public class Camera {

    public Camera() {
        this("","");
    }
    
    public Camera(String modelo, String MAC) {
        this.modelo = modelo;
        this.MAC = MAC;
    }
    
    
    private String modelo;
    private String MAC;

    public String getMAC() {
        return MAC;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
