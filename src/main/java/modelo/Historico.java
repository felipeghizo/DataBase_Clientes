// @author fe060311
package modelo;

import dao.HistoricoDAO;
import java.util.ArrayList;


public class Historico {
    
    private String nomeCliente;
    private String modeloCamera;
    private String data_entrega;
    private String data_envio;
    private String data_instalacao;
    private int nota_fiscal;
    private int sequencia;
    private int numero_pedido;
    private HistoricoDAO historicoDAO = new HistoricoDAO();

    public Historico() {
    }

    public Historico(String nomeCliente, String modeloCamera, String data_entrega, String data_envio, String data_instalacao, int nota_fiscal, int sequencia, int numero_pedido) {
        this.nomeCliente = nomeCliente;
        this.modeloCamera = modeloCamera;
        this.data_entrega = data_entrega;
        this.data_envio = data_envio;
        this.data_instalacao = data_instalacao;
        this.nota_fiscal = nota_fiscal;
        this.sequencia = sequencia;
        this.numero_pedido = numero_pedido;
    } 

    // gets
    public int getHistoricoid(String nomeCliente, String modeloCamera){
        return historicoDAO.getHistoricoidDAO(nomeCliente, modeloCamera);
    }
    public String getNomeCliente(){
        return historicoDAO.getNomeClienteDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public String getModeloCamera(){
        return historicoDAO.getModeloCameraDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public String getData_Entrega(){
        return historicoDAO.getData_EntregaDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public String getData_Envio(){
        return historicoDAO.getData_EnvioDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public String getData_Instalacao(){
        return historicoDAO.getData_InstalacaoDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public int getNotaFiscal(){
        return historicoDAO.getNotaFiscalDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public int getSequencia(){
        return historicoDAO.getSequenciaDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
    public int getNumero_Pedido(){
        return historicoDAO.getNumero_PedidoDAO(getHistoricoid(this.nomeCliente, this.modeloCamera));
    }
  
    // Get lista de envios 
    public ArrayList getHistorico() {
        return historicoDAO.getHistoricosDAO();
    }
    
    
    // Adiciona Envio ao banco de dados
    public void addHistorico(String nomeCliente, String modeloCamera, String dataEntrega, String dataEnvio, String dataInstalacao, int notaFiscal, int sequencia, int numeroPedido) {
        historicoDAO.addHistoricoDAO(nomeCliente, modeloCamera, dataEntrega, dataEnvio, dataInstalacao, notaFiscal, sequencia, numeroPedido);
    }
    
    // Encerra periodo de Envio adicionando data de fin
    public void removeHistorico(int historicoID) {
        historicoDAO.removeHistoricoDAO(historicoID);
    }
}
