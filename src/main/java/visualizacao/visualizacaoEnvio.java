// @author fe060311
package visualizacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Camera;
import modelo.Cliente;
import modelo.Envio;


public final class visualizacaoEnvio extends javax.swing.JFrame {

    public TableRowSorter sorter;
    public int envioID;
    public int row;
    Envio envio = new Envio();
    Camera camera = new Camera();
    Cliente cliente = new Cliente();
    
    public visualizacaoEnvio() {
        // Configurações do JFrame
        setTitle("Envios");
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
        
        // Criação do TableRowSorter com o modelo da tabela
        sorter = new TableRowSorter<>(tabelaEnvios.getModel());
        tabelaEnvios.setRowSorter(sorter);
        
        // Carrega os dados iniciais da tabela
        tabelaATT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuCameras2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        botaoCamera = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoHistorico = new javax.swing.JButton();
        textProcurar = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEnvios = new javax.swing.JTable();
        botaoVisualizar = new javax.swing.JButton();

        menuCameras2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuCameras2.setText("Câmeras");
        menuCameras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCameras2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(14, 163, 74));
        jLabel10.setText("Intelbras");

        botaoAdicionar.setText("Adicionar teste");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar teste");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Testes");

        botaoExcluir.setText("Encerrar teste");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));

        botaoCamera.setText("Câmeras");
        botaoCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCameraActionPerformed(evt);
            }
        });

        botaoMenu.setText("Menu");
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });

        botaoClientes.setText("Clientes");
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });

        botaoHistorico.setText("Histórico");
        botaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoMenu)
                .addGap(18, 18, 18)
                .addComponent(botaoCamera)
                .addGap(18, 18, 18)
                .addComponent(botaoClientes)
                .addGap(18, 18, 18)
                .addComponent(botaoHistorico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoProcurar.setText("Procurar");
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        tabelaEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Cliente", "Nome", "Modelo", "MAC", "Acesso", "Data envio", "Data entrega", "Data instalação", "Número pedido", "Sequência"
            }
        ));
        tabelaEnvios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEnviosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEnvios);
        if (tabelaEnvios.getColumnModel().getColumnCount() > 0) {
            tabelaEnvios.getColumnModel().getColumn(0).setMinWidth(10);
            tabelaEnvios.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(6).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(7).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(8).setPreferredWidth(150);
            tabelaEnvios.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoVisualizar.setText("<html><center>Visualizar<br>Dados</center></html>");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(botaoVisualizar))
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel11))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurar)
                    .addComponent(botaoLimpar)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCameras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCameras2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCameras2ActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        // Cria uma instância de Menu e a torna visivel
        visualizacaoIniciarTeste teste = new visualizacaoIniciarTeste();
        teste.setVisible(true);        
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // Caso nenhum dado da tabela seja selecionado
        if (this.envioID == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }else{
            // Definindo o look and feel do sistema operacional
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            }

            // Opções de botões
            String[] options = {"Acesso", "Data de envio", "Data de entrega", "Data de instalação"};

            // Mensagem da caixa de diálogo
            String message = "Qual dado você gostaria de alterar?";

            // Título da caixa de diálogo
            String title = "Editando dados de câmera";

            // Exibindo o JOptionPane com botões personalizados
            int option = JOptionPane.showOptionDialog(
                null,                                 // Componente pai
                message,                              // Mensagem
                title,                                // Título
                JOptionPane.YES_NO_CANCEL_OPTION,     // Tipo de opção
                JOptionPane.QUESTION_MESSAGE,         // Tipo de mensagem
                null,                                 // Ícone
                options,                              // Botões personalizados
                options[0]                            // Botão padrão
            );

            // Tratamento da opção selecionada
            switch (option) {
                case 0 -> {
                    // Acesso
                    String novoAcesso = JOptionPane.showInputDialog("Novo acesso: ");
                    envio.setAcessoID(this.envioID, novoAcesso);
                    System.out.println(this.envioID);
                }
                case 1 -> {
                    // Data de envio
                    String novaDataEnvio = JOptionPane.showInputDialog("Nova data de envio: ");
                    envio.setData_EnvioID(this.envioID, novaDataEnvio);
                }
                case 2 -> {
                    // Data de entrega
                    String novaDataEntrega = JOptionPane.showInputDialog("Nova data de entrega: ");
                    envio.setData_EntregaID(this.envioID, novaDataEntrega);
                }
                case 3 -> {
                    // Data de instalação
                    String novaDataInstalacao = JOptionPane.showInputDialog("Nova data de instalação: ");
                    envio.setData_InstalacaoID(this.envioID, novaDataInstalacao);
                }
                case 4 -> // Cancelar
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                default -> System.out.println("Nenhuma opção selecionada");
            }
            
            // Atualização da tabela
            tabelaATT();
        } 
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (this.envioID == 0){
            JOptionPane.showMessageDialog(null, "Nenhum teste selecionado!");
        }else{
            // Confirmação do teste que deve ser finalizado
            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar o teste de ID: "+this.envioID+" ?");
            if (confirm == 0) {
                     
                // Seta o status como inativo
                envio.setStatus(this.envioID, "Inativo");
                
                // Atualização da tabela
                tabelaATT();
            }else{JOptionPane.showMessageDialog(null, "Operação cancelada!");}
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCameraActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);

        // Cria uma instância de Menu e a torna visivel
        visualizacaoCamera cameraV = new visualizacaoCamera();
        cameraV.setVisible(true);
    }//GEN-LAST:event_botaoCameraActionPerformed

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);

        // Cria uma instância de Menu e a torna visivel
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de menu e a torna visivel
        visualizacaoEnvio envioV = new visualizacaoEnvio();
        envioV.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void tabelaEnviosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEnviosMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
        this.row = tabelaEnvios.rowAtPoint(evt.getPoint());

        // Verifica se o clique foi dentro dos limites da tabela
        if (row >= 0) {
            int clienteIDAtual = cliente.getClienteid((String) tabelaEnvios.getValueAt(row, 1), (int) tabelaEnvios.getValueAt(row, 0)); 
            int cameraIDAtual = camera.getCameraid((String) tabelaEnvios.getValueAt(row, 2), (String) tabelaEnvios.getValueAt(row, 3));
            // Passa o ID da câmera para o atributo 'cameraID'
            this.envioID = envio.getEnvioid(clienteIDAtual, cameraIDAtual);
        }

        // Atualiza a tabela
        tabelaATT();
    }//GEN-LAST:event_tabelaEnviosMouseClicked

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        // Input do dado a ser procurado
        String textoPesquisa = textProcurar.getText().trim();

        tabelaEnvios.setRowSorter(sorter);
        if (textoPesquisa.length() == 0) { // Caso não haja Input
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(textoPesquisa));
        }
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // Define o filtro de pesquisa como vazio
        sorter.setRowFilter(null);

        // Atualiza a tabela
        tabelaATT();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de menu e a torna visivel
        visualizacaoHistorico historicoV = new visualizacaoHistorico();
        historicoV.setVisible(true);
    }//GEN-LAST:event_botaoHistoricoActionPerformed

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        if (this.row == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Número do cliente: "+(int) tabelaEnvios.getValueAt(this.row, 0)+
                    "\nNome do cliente: "+(String) tabelaEnvios.getValueAt(this.row, 1)+
                    "\nModelo da câmera: "+(String) tabelaEnvios.getValueAt(this.row, 2)+
                    "\nMAC da câmera: "+(String) tabelaEnvios.getValueAt(this.row, 3)+
                    "\nAcesso: "+(String) tabelaEnvios.getValueAt(this.row, 4)+
                    "\nData de envio: "+(String) tabelaEnvios.getValueAt(this.row, 5)+
                    "\nData da entrega: "+(String) tabelaEnvios.getValueAt(this.row, 6)+
                    "\nData da instalação: "+(String) tabelaEnvios.getValueAt(this.row, 7)+
                    "\nNúmero do pedido: "+(int) tabelaEnvios.getValueAt(this.row, 8)+
                    "\nSequência: "+(int) tabelaEnvios.getValueAt(this.row, 9));
        }
    }//GEN-LAST:event_botaoVisualizarActionPerformed
   
    public void tabelaATT() {
        DefaultTableModel dtmCameras = (DefaultTableModel) tabelaEnvios.getModel();
        ArrayList lista = envio.getEnvios();
    
        // Limpa todas as linhas da tabela antes de atualizar com novos dados
        dtmCameras.setRowCount(0);

        // Itera sobre a lista de teste e atualiza a tabela
        for (Object obj : lista) {
            // Verifica se o objeto é uma instância de Envio
            if ((obj instanceof Envio envioO)) {
                if (envioO.getStatus().compareTo("Ativo") == 0){
                    int clienteID = envioO.getClienteid();
                    int clienteNumero = cliente.getNumeroClienteID(clienteID);
                    String clienteNome = cliente.getNomeID(clienteID);

                    int cameraID = envioO.getCameraid();
                    String cameraModelo = camera.getModeloID(cameraID);
                    String cameraMAC = camera.getMACID(cameraID);

                    String acesso = envioO.getAcesso();
                    String dataEnvio = envioO.getData_Envio();
                    String DataEntrega = envioO.getData_Entrega();
                    String dataInstalacao = envioO.getData_Instalacao();
                    int nota_fiscal = envioO.getNotaFiscal();
                    int sequencia = envioO.getSequencia();
                    int numero_pedido = envioO.getNumero_Pedido();

                    // Cria um novo array de objetos para adicionar à tabela
                    Object[] dados = { clienteNumero, clienteNome, cameraModelo, cameraMAC, acesso, dataEnvio, DataEntrega, dataInstalacao, nota_fiscal, sequencia, numero_pedido };
                    dtmCameras.addRow(dados);
                }
            } else {
                System.out.println("O objeto na lista não é do tipo Envio.");
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new visualizacaoEnvio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoCamera;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoHistorico;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton menuCameras2;
    private javax.swing.JTable tabelaEnvios;
    private javax.swing.JTextField textProcurar;
    // End of variables declaration//GEN-END:variables
}
