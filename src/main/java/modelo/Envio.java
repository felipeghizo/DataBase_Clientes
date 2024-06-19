// @author fe060311
package modelo;

import dao.EnvioDAO;
import java.util.ArrayList;


public class Envio {
    
    private int clienteid;
    private int cameraid;
    private String acesso;
    private String data_entrega;
    private String data_envio;
    private String data_instalacao;
    private int nota_fiscal;
    private int sequencia;
    private int numero_pedido;
    private EnvioDAO envioDAO = new EnvioDAO();

    public Envio() {
    }

    public Envio(int clienteid, int cameraid, String acesso, String data_entrega, String data_envio, String data_instalacao, int nota_fiscal, int sequencia, int numero_pedido) {
        this.clienteid = clienteid;
        this.cameraid = cameraid;
        this.acesso = acesso;
        this.data_entrega = data_entrega;
        this.data_envio = data_envio;
        this.data_instalacao = data_instalacao;
        this.nota_fiscal = nota_fiscal;
        this.sequencia = sequencia;
        this.numero_pedido = numero_pedido;
    }

    // gets
    public int getEnvioid(int clienteid, int cameraid){
        return envioDAO.getEnvioidDAO(clienteid, cameraid);
    }
    public int getClienteid(){
        return envioDAO.getClienteidDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getClienteID(int ID){
        return envioDAO.getClienteidDAO(ID);
    }
    public int getCameraid(){
        return envioDAO.getCameraidDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getCameraID(int ID){
        return envioDAO.getCameraidDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getAcesso(){
        return envioDAO.getAcessoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getAcessoID(int ID){
        return envioDAO.getAcessoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_Entrega(){
        return envioDAO.getData_EntregaDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_EntregaID(int ID){
        return envioDAO.getData_EntregaDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_Envio(){
        return envioDAO.getData_EnvioDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_EnvioID(int ID){
        return envioDAO.getData_EnvioDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_Instalacao(){
        return envioDAO.getData_InstalacaoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public String getData_InstalacaoID(int ID){
        return envioDAO.getData_InstalacaoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getNotaFiscal(){
        return envioDAO.getNotaFiscalDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getNotaFiscalID(int ID){
        return envioDAO.getNotaFiscalDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getSequencia(){
        return envioDAO.getSequenciaDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getSequenciaID(int ID){
        return envioDAO.getSequenciaDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getNumero_Pedido(){
        return envioDAO.getNumero_PedidoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    public int getNumero_PedidoID(int ID){
        return envioDAO.getNumero_PedidoDAO(getEnvioid(this.clienteid, this.cameraid));
    }
    // Get lista de envios 
    public ArrayList getEnvios() {
        return envioDAO.getEnviosDAO();
    }
    
    // Sets
    public void setClienteid(int clienteid) {
        envioDAO.setClienteidDAO(getEnvioid(this.clienteid, this.cameraid), clienteid);
        this.clienteid = clienteid;
    }
    public void setCameraid(int cameraid) {
        envioDAO.setClienteidDAO(getEnvioid(this.clienteid, this.cameraid), cameraid);
        this.cameraid = cameraid;
    }
    public void setAcesso(String acesso) {
        envioDAO.setAcessoDAO(getEnvioid(this.clienteid, this.cameraid), acesso);
        this.acesso = acesso;
    }
    public void setData_Entrega(String Data_entrega) {
        envioDAO.setData_EntregaDAO(getEnvioid(this.clienteid, this.cameraid), Data_entrega);
        this.data_entrega = Data_entrega;
    }
    public void setData_Envio(String Data_envio) {
        envioDAO.setData_EnvioDAO(getEnvioid(this.clienteid, this.cameraid), Data_envio);
        this.data_envio = Data_envio;
    }
    public void setData_Instalacao(String Data_instalacao) {
        envioDAO.setData_InstalacaoDAO(getEnvioid(this.clienteid, this.cameraid), Data_instalacao);
        this.data_instalacao = Data_instalacao;
    }
    public void setNota_Fiscal(int Nota_fiscal) {
        envioDAO.setNota_FiscalDAO(getEnvioid(this.clienteid, this.cameraid), Nota_fiscal);
        this.nota_fiscal = Nota_fiscal;
    }
    public void setSequencia(int Sequencia) {
        envioDAO.setSequenciaDAO(getEnvioid(this.clienteid, this.cameraid), Sequencia);
        this.sequencia = Sequencia;
    }
    public void setNumero_Pedido(int Numero_pedido) {
        envioDAO.setNumero_PedidoDAO(getEnvioid(this.clienteid, this.cameraid), Numero_pedido);
        this.numero_pedido = Numero_pedido;
    }
    
    // Adiciona Envio ao banco de dados
    public void addEnvio(int clienteid, int cameraid, int nota_fiscal, int sequencia, int numero_pedido) {
        envioDAO.addEnvioDAO(clienteid, cameraid, nota_fiscal, sequencia, numero_pedido);
    }
    
    // Encerra periodo de Envio adicionando data de fin
    public void removeEnvio(int Envioid) {
        envioDAO.removeEnvioDAO(Envioid);
    }
}
