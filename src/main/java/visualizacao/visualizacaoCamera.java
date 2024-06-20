
package visualizacao;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Camera;
import modelo.Envio;


public final class visualizacaoCamera extends javax.swing.JFrame {
    
    public TableRowSorter sorter;
    public int cameraID;
    public int row;
    Camera camera = new Camera();
    Envio envio = new Envio();
    
    public visualizacaoCamera() {
        // Configurações do JFrame
        setTitle("Cameras");
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
        
        // Criação do TableRowSorter com o modelo da tabela
        sorter = new TableRowSorter<>(tabelaCameras.getModel());
        tabelaCameras.setRowSorter(sorter);
        
        // Carrega os dados iniciais da tabela
        tabelaATT();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoMenu = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoEnvio = new javax.swing.JButton();
        botaoHistorico = new javax.swing.JButton();
        jPaneltabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCameras = new javax.swing.JTable();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        textProcurar = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 163, 74));
        jLabel1.setText("Intelbras");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Câmeras");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

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

        botaoEnvio.setText("Envios");
        botaoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnvioActionPerformed(evt);
            }
        });

        botaoHistorico.setText("Histórico");
        botaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoMenu)
                .addGap(18, 18, 18)
                .addComponent(botaoClientes)
                .addGap(18, 18, 18)
                .addComponent(botaoEnvio)
                .addGap(18, 18, 18)
                .addComponent(botaoHistorico)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jPaneltabela.setBackground(new java.awt.Color(204, 204, 204));

        tabelaCameras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelo", "MAC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCameras.setShowGrid(false);
        tabelaCameras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCamerasMouseClicked(evt);
            }
        });
        tabelaCameras.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaCamerasPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCameras);
        if (tabelaCameras.getColumnModel().getColumnCount() > 0) {
            tabelaCameras.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPaneltabelaLayout = new javax.swing.GroupLayout(jPaneltabela);
        jPaneltabela.setLayout(jPaneltabelaLayout);
        jPaneltabelaLayout.setHorizontalGroup(
            jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneltabelaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPaneltabelaLayout.setVerticalGroup(
            jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneltabelaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        botaoAdicionar.setText("Adicionar câmera");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar câmera");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir câmera");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        textProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProcurarActionPerformed(evt);
            }
        });

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

        botaoVisualizar.setText("<html><center>Visualizar<br>Dados</center></html>");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVisualizar))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addGap(0, 390, Short.MAX_VALUE))
                    .addComponent(jPaneltabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurar)
                    .addComponent(botaoLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPaneltabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        // Input de dados da câmera a ser adicionada
        String modelo = JOptionPane.showInputDialog("Modelo");
        String MAC = JOptionPane.showInputDialog("MAC");
        
        // Criação da câmera
        Camera ADDcamera = new Camera();
        ADDcamera.setModelo(modelo);
        ADDcamera.setMAC(MAC);
        ADDcamera.addCamera();
        
        // Adição da câmera à tabela
        DefaultTableModel dtmCameras = (DefaultTableModel) tabelaCameras.getModel();
        Object[] dados = {ADDcamera.getModelo(), ADDcamera.getMAC()};
        dtmCameras.addRow(dados);
        
        // Atualização da tabela
        tabelaATT();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // Caso nenhum dado da tabela seja selecionado
        if (this.cameraID == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }
        else{
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                }

                // Opções de botões
                String[] options = {"Modelo", "Mac", "Cancelar"};

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
                        // Modelo
                        String novoModelo = JOptionPane.showInputDialog("Novo Modelo: ");
                        camera.setModeloid(this.cameraID, novoModelo);
                }
                    case 1 -> {
                        // MAC
                        String novoMAC = JOptionPane.showInputDialog("Novo MAC: ");
                        camera.setMACid(this.cameraID, novoMAC);
                }
                    case 2 -> // Cancelar
                    JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    default -> System.out.println("Nenhuma opção selecionada");
                }
            tabelaATT();
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (this.cameraID == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma câmera selecionada!");
        }else{
            ArrayList listaEnvios = envio.getEnvios();
            boolean clienteRegistrado = false;
            for(Object obj : listaEnvios){
  
                int ID = ((Envio) obj).getCameraid();
                if (this.cameraID == ID){
                    JOptionPane.showMessageDialog(null, "Câmera em teste, não será possível excluí-la enquanto o teste estiver ativo!");
                    clienteRegistrado = true;
                    break;
                }
            }
            if(!clienteRegistrado){
                // Confirmação dacâmera que deve ser excluída
                int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir a câmera de ID: "+this.cameraID+" ?");
                if (confirm == 0) {
                    // Exclui a camera do banco de dados
                    camera.delCameraid(this.cameraID);
                    // Atualização da tabela
                    tabelaATT();
                }else{JOptionPane.showMessageDialog(null, "Operação cancelada!");}
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void textProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProcurarActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        // Input do dado a ser procurado
        String textoPesquisa = textProcurar.getText().trim();
        
        tabelaCameras.setRowSorter(sorter);
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

    private void tabelaCamerasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaCamerasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCamerasPropertyChange

    private void tabelaCamerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCamerasMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
        this.row = tabelaCameras.rowAtPoint(evt.getPoint());

        // Verifica se o clique foi dentro dos limites da tabela
        if (row >= 0) {
            // Passa o ID da câmera para o atributo 'cameraID'
            this.cameraID = (int) tabelaCameras.getValueAt(this.row, 0);
        }
        
        // Atualiza a tabela
        tabelaATT();
    }//GEN-LAST:event_tabelaCamerasMouseClicked

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);

        // Cria uma instância de Menu e a torna visivel
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);

        // Cria uma instância de Cliente e a torna visivel
        visualizacaoCliente clienteV = new visualizacaoCliente();
        clienteV.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnvioActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de Envio e a torna visivel
        visualizacaoEnvio envioV = new visualizacaoEnvio();
        envioV.setVisible(true);
    }//GEN-LAST:event_botaoEnvioActionPerformed

    private void botaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de Historico e a torna visivel
        visualizacaoHistorico historicoV = new visualizacaoHistorico();
        historicoV.setVisible(true);
    }//GEN-LAST:event_botaoHistoricoActionPerformed

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        if (this.row == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }else{
            JOptionPane.showMessageDialog(null,
            "ID: "+(int) tabelaCameras.getValueAt(this.row, 0)+
            "\nModelo: "+(String) tabelaCameras.getValueAt(this.row, 1)+
            "\nMAC: "+(String) tabelaCameras.getValueAt(this.row, 2));
        }
    }//GEN-LAST:event_botaoVisualizarActionPerformed

    public void tabelaATT() {
        DefaultTableModel dtmCameras = (DefaultTableModel) tabelaCameras.getModel();
        ArrayList lista = camera.getCameras();
    
        // Limpa todas as linhas da tabela antes de atualizar com novos dados
        dtmCameras.setRowCount(0);

        // Itera sobre a lista de câmeras e atualiza a tabela
        for (Object obj : lista) {
            // Verifica se o objeto é uma instância de Camera
            if (obj instanceof Camera cam) {
                String modelo = cam.getModelo();
                String MAC = cam.getMAC();
                int ID = cam.getCameraid(modelo, MAC);

                // Cria um novo array de objetos para adicionar à tabela
                Object[] dados = { ID, modelo, MAC };
                dtmCameras.addRow(dados);
            } else {
                System.out.println("O objeto na lista não é do tipo Camera.");
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizacaoCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new visualizacaoCamera().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoEnvio;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoHistorico;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPaneltabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCameras;
    private javax.swing.JTextField textProcurar;
    // End of variables declaration//GEN-END:variables
}
