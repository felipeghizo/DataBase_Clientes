// @author fe060311
package visualizacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Camera;
import modelo.Cliente;
import modelo.Envio;


public final class visualizacaoIniciarTeste extends javax.swing.JFrame {

    public Envio envio = new Envio();
    public Camera camera = new Camera();
    public Cliente cliente = new Cliente();
    public TableRowSorter sorterCamera;
    public TableRowSorter sorterCliente;
    public int clienteID;
    public int cameraID;
    
    public visualizacaoIniciarTeste() {
        // Configurações do JFrame
        setTitle("Testes");
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
        
        // Criação do TableRowSorter com o modelo da tabela
        sorterCamera = new TableRowSorter<>(tabelaCameras.getModel());
        tabelaCameras.setRowSorter(sorterCamera);
        sorterCliente = new TableRowSorter<>(tabelaClientes.getModel());
        tabelaClientes.setRowSorter(sorterCliente);
        
        // Carrega os dados iniciais da tabela
        tabelaClienteATT();
        tabelaCameraATT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        botaoMenu2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        botaoMenu = new javax.swing.JButton();
        botaoClientes = new javax.swing.JButton();
        botaoEnvio = new javax.swing.JButton();
        botaoHistorico = new javax.swing.JButton();
        botaoHistorico1 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        textProcurarCliente = new javax.swing.JTextField();
        botaoProcurarCliente = new javax.swing.JButton();
        botaoLimparCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        botaoLimparCamera = new javax.swing.JButton();
        botaoProcurarCamera = new javax.swing.JButton();
        textProcurarCamera = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCameras = new javax.swing.JTable();
        clienteSelecionado = new javax.swing.JLabel();
        cameraSelecionada = new javax.swing.JLabel();
        botaoMenu1 = new javax.swing.JButton();
        botaoMenu3 = new javax.swing.JButton();

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Clientes");

        botaoMenu2.setText("Registrar");
        botaoMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenu2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(14, 163, 74));
        jLabel10.setText("Intelbras");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Clientes");

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));

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

        botaoEnvio.setText("Câmeras");
        botaoEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnvioActionPerformed(evt);
            }
        });

        botaoHistorico.setText("Envios");
        botaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistoricoActionPerformed(evt);
            }
        });

        botaoHistorico1.setText("Histórico");
        botaoHistorico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistorico1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoHistorico1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoMenu)
                .addGap(18, 18, 18)
                .addComponent(botaoClientes)
                .addGap(18, 18, 18)
                .addComponent(botaoEnvio)
                .addGap(18, 18, 18)
                .addComponent(botaoHistorico)
                .addGap(18, 18, 18)
                .addComponent(botaoHistorico1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente ID", "Nome", "Telefone", "E-mail", "Endereço", "Numero"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoProcurarCliente.setText("Procurar");
        botaoProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarClienteActionPerformed(evt);
            }
        });

        botaoLimparCliente.setText("Limpar");
        botaoLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Câmeras");

        botaoLimparCamera.setText("Limpar");
        botaoLimparCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCameraActionPerformed(evt);
            }
        });

        botaoProcurarCamera.setText("Procurar");
        botaoProcurarCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarCameraActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));

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
        jScrollPane3.setViewportView(tabelaCameras);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        clienteSelecionado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clienteSelecionado.setText("Nenhum cliente selecionado");

        cameraSelecionada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cameraSelecionada.setText("Nenhuma câmera selecionada");

        botaoMenu1.setText("Registrar");
        botaoMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenu1ActionPerformed(evt);
            }
        });

        botaoMenu3.setText("Cancelar");
        botaoMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel11))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(clienteSelecionado))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(textProcurarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoProcurarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLimparCliente)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(cameraSelecionada)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(textProcurarCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoProcurarCamera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLimparCamera)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteSelecionado)
                    .addComponent(cameraSelecionada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textProcurarCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoProcurarCamera)
                            .addComponent(botaoLimparCamera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoMenu1)
                                .addGap(18, 18, 18)
                                .addComponent(botaoMenu3)
                                .addGap(140, 140, 140))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textProcurarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoProcurarCliente)
                            .addComponent(botaoLimparCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
        int row = tabelaClientes.rowAtPoint(evt.getPoint());

        // Verifica se o clique foi dentro dos limites da tabela
        if (row >= 0) {
            // Passa o ID da câmera para o atributo 'cameraID'
            this.clienteID = (int) tabelaClientes.getValueAt(row, 0);
            String valorCliente = (String) tabelaClientes.getValueAt(row, 1);
            clienteSelecionado.setText(valorCliente);
        }

        // Atualiza a tabela
        tabelaClienteATT();
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void botaoProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarClienteActionPerformed
        // Input do dado a ser procurado
        String textoPesquisa = textProcurarCliente.getText().trim();

        tabelaClientes.setRowSorter(sorterCliente);
        if (textoPesquisa.length() == 0) { // Caso não haja Input
            sorterCliente.setRowFilter(null);
        } else {
            sorterCliente.setRowFilter(RowFilter.regexFilter(textoPesquisa));
        }
    }//GEN-LAST:event_botaoProcurarClienteActionPerformed

    private void botaoLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparClienteActionPerformed
        // Define o filtro de pesquisa como vazio
        sorterCliente.setRowFilter(null);

        // Atualiza a tabela
        tabelaClienteATT();
    }//GEN-LAST:event_botaoLimparClienteActionPerformed

    private void botaoLimparCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCameraActionPerformed
        // Define o filtro de pesquisa como vazio
        sorterCamera.setRowFilter(null);
        
        // Atualiza a tabela
        tabelaCameraATT();
    }//GEN-LAST:event_botaoLimparCameraActionPerformed

    private void botaoProcurarCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarCameraActionPerformed
        // Input do dado a ser procurado
        String textoPesquisa = textProcurarCamera.getText().trim();
        
        tabelaCameras.setRowSorter(sorterCamera);
        if (textoPesquisa.length() == 0) { // Caso não haja Input
            sorterCamera.setRowFilter(null);
        } else {
            sorterCamera.setRowFilter(RowFilter.regexFilter(textoPesquisa));
        }
    }//GEN-LAST:event_botaoProcurarCameraActionPerformed

    private void botaoMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenu1ActionPerformed
        int nota_fiscal = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota fiscal: "));
        int sequencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Sequência: "));
        int numero_pedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Número do pedido: "));
        envio.addEnvio(clienteID, cameraID, nota_fiscal, sequencia, numero_pedido, "Ativo");
    }//GEN-LAST:event_botaoMenu1ActionPerformed

    private void botaoMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMenu2ActionPerformed

    private void botaoMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenu3ActionPerformed
        JOptionPane.showMessageDialog(null, "Teste cancelado!");
        this.setVisible(false);
    }//GEN-LAST:event_botaoMenu3ActionPerformed

    private void tabelaCamerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCamerasMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
        int row = tabelaCameras.rowAtPoint(evt.getPoint());

        // Verifica se o clique foi dentro dos limites da tabela
        if (row >= 0) {
            // Passa o ID da câmera para o atributo 'cameraID'
            this.cameraID = (int) tabelaCameras.getValueAt(row, 0);
            String valorCamera = (String) tabelaCameras.getValueAt(row, 1);
            cameraSelecionada.setText(valorCamera);
        }
        
        // Atualiza a tabela
        tabelaCameraATT();
    }//GEN-LAST:event_tabelaCamerasMouseClicked

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);

        // Cria uma instância de Menu e a torna visivel
        visualizacaoMenu menuV = new visualizacaoMenu();
        menuV.setVisible(true);
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

        // Cria uma instância de Camera e a torna visivel
        visualizacaoCamera cameraV = new visualizacaoCamera();
        cameraV.setVisible(true);
    }//GEN-LAST:event_botaoEnvioActionPerformed

    private void botaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de Envio e a torna visivel
        visualizacaoEnvio envioV = new visualizacaoEnvio();
        envioV.setVisible(true);
    }//GEN-LAST:event_botaoHistoricoActionPerformed

    private void botaoHistorico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistorico1ActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);

        // Cria uma instância de Historico e a torna visivel
        visualizacaoHistorico historicoV = new visualizacaoHistorico();
        historicoV.setVisible(true);
    }//GEN-LAST:event_botaoHistorico1ActionPerformed

    public void tabelaClienteATT() {
        DefaultTableModel dtmCameras = (DefaultTableModel) tabelaClientes.getModel();
        ArrayList lista = cliente.getClientes();

        // Limpa todas as linhas da tabela antes de atualizar com novos dados
        dtmCameras.setRowCount(0);

        // Itera sobre a lista de clientes e atualiza a tabela
        for (Object obj : lista) {
            // Verifica se o objeto é uma instância de Cliente
            if (obj instanceof Cliente cliente1) {

                String nome = cliente1.getNome();
                String telefone = cliente1.getTelefone();
                String email = cliente1.getEmail();
                String endereco = cliente1.getEndereco();
                int numeroCliente = cliente1.getNumeroCliente();
                int clienteIDAtual = cliente1.getClienteid(nome, numeroCliente);


                // Cria um novo array de objetos para adicionar à tabela
                Object[] dados = { clienteIDAtual, nome, telefone, email, endereco, numeroCliente};
                dtmCameras.addRow(dados);
            } else {
                System.out.println("O objeto na lista não é do tipo Cliente.");
            }
        }
    }
    
    public void tabelaCameraATT() {
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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new visualizacaoIniciarTeste().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoClientes;
    private javax.swing.JButton botaoEnvio;
    private javax.swing.JButton botaoHistorico;
    private javax.swing.JButton botaoHistorico1;
    private javax.swing.JButton botaoLimparCamera;
    private javax.swing.JButton botaoLimparCliente;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoMenu1;
    private javax.swing.JButton botaoMenu2;
    private javax.swing.JButton botaoMenu3;
    private javax.swing.JButton botaoProcurarCamera;
    private javax.swing.JButton botaoProcurarCliente;
    private javax.swing.JLabel cameraSelecionada;
    private javax.swing.JLabel clienteSelecionado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaCameras;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField textProcurarCamera;
    private javax.swing.JTextField textProcurarCliente;
    // End of variables declaration//GEN-END:variables
}
