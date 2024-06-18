
package visualizacao;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Camera;

/**
 *
 * @author fe060311
 */
public class visualizacaoCamera extends javax.swing.JFrame {
    
    public TableRowSorter sorter;
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
    
    Camera camera = new Camera();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoClientes = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        botaoEnvios = new javax.swing.JButton();
        jPaneltabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCameras = new javax.swing.JTable();
        addCamera5 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        botaoExcluir5 = new javax.swing.JButton();
        textProcurar = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 163, 74));
        jLabel1.setText("Intelbras");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Câmeras");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        botaoClientes.setText("Clientes");
        botaoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClientesActionPerformed(evt);
            }
        });

        botaoMenu.setText("Menu");
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });

        botaoEnvios.setText("Envios");
        botaoEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoMenu)
                .addGap(18, 18, 18)
                .addComponent(botaoClientes)
                .addGap(18, 18, 18)
                .addComponent(botaoEnvios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 846, Short.MAX_VALUE)
            .addGroup(jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneltabelaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPaneltabelaLayout.setVerticalGroup(
            jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
            .addGroup(jPaneltabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneltabelaLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        addCamera5.setText("Adicionar câmera");
        addCamera5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCamera5ActionPerformed(evt);
            }
        });

        jButton21.setText("Editar câmera");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        botaoExcluir5.setText("Excluir câmera");
        botaoExcluir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir5ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCamera5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPaneltabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(390, 390, 390))))
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
                    .addComponent(jPaneltabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addCamera5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 248, Short.MAX_VALUE)))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        this.setVisible(false);
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void addCamera5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCamera5ActionPerformed

        String modelo = JOptionPane.showInputDialog("Modelo");
        String MAC = JOptionPane.showInputDialog("MAC");
        camera.setModelo(modelo);
        camera.setMAC(MAC);
        camera.addCamera();
        
        DefaultTableModel dtmCameras = (DefaultTableModel) tabelaCameras.getModel();
        Object[] dados = {camera.getModelo(), camera.getMAC()};
        dtmCameras.addRow(dados);
        tabelaATT();
    }//GEN-LAST:event_addCamera5ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int cameraid = Integer.parseInt(JOptionPane.showInputDialog("ID da câmera: "));
        // Definindo o look and feel do sistema operacional
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                e.printStackTrace();
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
                case 0: // Modelo
                String novoModelo = JOptionPane.showInputDialog("Novo Modelo: ");
                camera.setModeloid(cameraid, novoModelo);
                break;
                case 1: // MAC
                String novoMAC = JOptionPane.showInputDialog("Novo MAC: ");
                camera.setMACid(cameraid, novoMAC);
                break;
                case 2: // Cancelar
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                break;
                default:
                System.out.println("Nenhuma opção selecionada");
                break;
            }
        tabelaATT();    
    }//GEN-LAST:event_jButton21ActionPerformed

    private void botaoExcluir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir5ActionPerformed
        String modeloCamera = JOptionPane.showInputDialog(null, "Modelo: ");
        String macCamera = JOptionPane.showInputDialog(null, "MAC: ");
        camera.delCamera(modeloCamera, macCamera);
        tabelaATT();
    }//GEN-LAST:event_botaoExcluir5ActionPerformed

    private void textProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProcurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProcurarActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        String textoPesquisa =  textProcurar.getText().trim();
        tabelaCameras.setRowSorter(sorter);
        if (textoPesquisa.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(textoPesquisa));
        }
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        sorter.setRowFilter(null);
        tabelaATT();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClientesActionPerformed
        this.setVisible(false);
        visualizacaoCliente cliente = new visualizacaoCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_botaoClientesActionPerformed

    private void botaoEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviosActionPerformed
        this.setVisible(false);
        visualizacaoEnvio envio = new visualizacaoEnvio();
        envio.setVisible(true);
    }//GEN-LAST:event_botaoEnviosActionPerformed

    private void tabelaCamerasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaCamerasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCamerasPropertyChange

    private void tabelaCamerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCamerasMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
                int row = tabelaCameras.rowAtPoint(evt.getPoint());
                int col = tabelaCameras.columnAtPoint(evt.getPoint());

                // Verifica se o clique foi dentro dos limites da tabela
                if (row >= 0) {
                    int cameraid = (int) tabelaCameras.getValueAt(row, 0);
                    String novoValor;
                    if (col == 1){
                        novoValor = JOptionPane.showInputDialog(null, "Novo modelo: ");
                        camera.setModeloid(cameraid, novoValor);
                    } else if (col == 2){
                        novoValor = JOptionPane.showInputDialog(null, "Novo MAC: ");
                        camera.setMACid(cameraid, novoValor);
                    }
                }
    tabelaATT();
    }//GEN-LAST:event_tabelaCamerasMouseClicked

    public void tabelaATT() {
    DefaultTableModel dtmCameras = (DefaultTableModel) tabelaCameras.getModel();
    ArrayList lista = camera.getCameras();
    
    // Limpa todas as linhas da tabela antes de atualizar com novos dados
    dtmCameras.setRowCount(0);

    // Itera sobre a lista de câmeras e atualiza a tabela
    for (Object obj : lista) {
        // Verifica se o objeto é uma instância de Camera
        if (obj instanceof Camera) {
            Camera cam = (Camera) obj;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(visualizacaoCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visualizacaoCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visualizacaoCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizacaoCamera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizacaoCamera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCamera5;
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoEnvios;
    private javax.swing.JButton botaoExcluir5;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton jButton21;
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
