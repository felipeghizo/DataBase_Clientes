// @author fe060311
package visualizacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cliente;
import modelo.Envio;


public final class visualizacaoCliente extends javax.swing.JFrame {

    public TableRowSorter sorter;
    public int clienteID;
    public int row;
    Cliente cliente = new Cliente();
    Envio envio = new Envio();
    
    public visualizacaoCliente() {
        // Configurações do JFrame
        setTitle("Cliente");
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
        
        // Criação do TableRowSorter com o modelo da tabela
        sorter = new TableRowSorter<>(tabelaClientes.getModel());
        tabelaClientes.setRowSorter(sorter);
        
        // Carrega os dados iniciais da tabela
        tabelaATT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addCamera1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botaoExcluir1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
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
        botaoEnvio = new javax.swing.JButton();
        botaoHistorico = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        textProcurar = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoVisualizar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 163, 74));
        jLabel3.setText("Intelbras");

        addCamera1.setText("Adiciona câmera");
        addCamera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCamera1ActionPerformed(evt);
            }
        });

        jButton5.setText("Editar câmera");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Câmeras");

        botaoExcluir1.setText("Excluir câmera");
        botaoExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jButton6.setText("Clientes");

        jButton7.setText("Câmeras");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Envios");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(addCamera1))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoExcluir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(379, 379, 379)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(addCamera1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 242, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(14, 163, 74));
        jLabel10.setText("Intelbras");

        botaoAdicionar.setText("Adicionar cliente");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar cliente");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Clientes");

        botaoExcluir.setText("Excluir cliente");
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

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(botaoEnvio)
                .addGap(18, 18, 18)
                .addComponent(botaoHistorico)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
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
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCamera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCamera1ActionPerformed

    }//GEN-LAST:event_addCamera1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void botaoExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir1ActionPerformed
        String nome = JOptionPane.showInputDialog("Nome: ");
        int numero_cliente = Integer.parseInt(JOptionPane.showInputDialog("Número do cliente: "));

        cliente.delCliente(nome, numero_cliente);
    }//GEN-LAST:event_botaoExcluir1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        // Input de dados do cliente a ser adicionado
        String nome = JOptionPane.showInputDialog("Nome: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        String email = JOptionPane.showInputDialog("E-mail: ");
        int numero_cliente = Integer.parseInt(JOptionPane.showInputDialog("Número do cliente: "));
        String endereco = JOptionPane.showInputDialog("Endereço: ");

        // Criação do cliente
        Cliente ADDcliente = new Cliente();
        ADDcliente.setNome(nome);
        ADDcliente.setTelefone(telefone);
        ADDcliente.setEmail(email);
        ADDcliente.setNumeroCliente(numero_cliente);
        ADDcliente.setEndereco(endereco);
        ADDcliente.addCliente();
        
        // Adição da câmera à tabela
        DefaultTableModel dtmClientes = (DefaultTableModel) tabelaClientes.getModel();
        Object[] dados = {ADDcliente.getClienteid(ADDcliente.getNome(), 
            ADDcliente.getNumeroCliente()), 
            ADDcliente.getNome(), 
            ADDcliente.getTelefone(), 
            ADDcliente.getEmail(), 
            ADDcliente.getNumeroCliente(), 
            ADDcliente.getEndereco()};
        dtmClientes.addRow(dados);
        
        // Atualização da tabela
        tabelaATT();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // Caso nenhum dado da tabela seja selecionado
        if (this.clienteID == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }else{
            // Definindo o look and feel do sistema operacional
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            }

            // Opções de botões
            String[] options = {"Nome", "telefone", "E-mail", "Nota fiscal", "Endereço", "Número", "Cancelar"};

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
                    // Nome
                    String novoNome = JOptionPane.showInputDialog("Novo nome: ");
                    cliente.setNomeID(this.clienteID, novoNome);
                }
                case 1 -> {
                    // Telefone
                    String novoTelefone = JOptionPane.showInputDialog("Novo telefone: ");
                    cliente.setTelefoneID(this.clienteID, novoTelefone);
                }
                case 2 -> {
                    // E-mail
                    String novoEmail = JOptionPane.showInputDialog("Novo E-mail: ");
                    cliente.setEmailID(this.clienteID, novoEmail);
                }
                case 3 -> {
                    // Nota fiscal
                    int novaNotaFiscal = Integer.parseInt(JOptionPane.showInputDialog("Nova número de cliente: "));
                    cliente.setNumeroClienteID(this.clienteID, novaNotaFiscal);
                }
                case 4 -> {
                    // Endereço
                    String novaEndereco = JOptionPane.showInputDialog("Novo Endereço: ");
                    cliente.setEnderecoID(this.clienteID, novaEndereco);
                }
                case 5 -> {
                    // Endereço
                    int novoNumero = Integer.parseInt(JOptionPane.showInputDialog("Novo Número do cliente: "));
                    cliente.setNumeroClienteID(this.clienteID, novoNumero);
                }
                case 6 -> // Cancelar
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                default -> System.out.println("Nenhuma opção selecionada");
            }
            
            // Atualização da tabela
            tabelaATT();
        } 
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (this.clienteID == 0){
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado!");
        }else{
            ArrayList listaEnvios = envio.getEnvios();
            boolean clienteRegistrado = false;
            for(Object obj : listaEnvios){
  
                int ID = ((Envio) obj).getClienteid();
                if (this.clienteID == ID){
                    JOptionPane.showMessageDialog(null, "Cliente em teste, não será possível excluí-lo enquanto o teste estiver ativo!");
                    clienteRegistrado = true;
                    break;
                }
            }
            if(!clienteRegistrado){
                // Confirmação dacâmera que deve ser excluída
                int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente de ID: "+this.clienteID+" ?");
                if (confirm == 0) {
                    // Exclui a camera do banco de dados
                    cliente.delClienteID(this.clienteID);
                    // Atualização da tabela
                    tabelaATT();
                }else{JOptionPane.showMessageDialog(null, "Operação cancelada!");}
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);
        
        // Cria uma instância de Menu e a torna visivel
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCameraActionPerformed
        // Esconde a janela de clientes
        this.setVisible(false);
        
        // Cria uma instância de Menu e a torna visivel
        visualizacaoCamera cameraV = new visualizacaoCamera();
        cameraV.setVisible(true);
    }//GEN-LAST:event_botaoCameraActionPerformed

    private void botaoEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnvioActionPerformed
        // Esconde a janela de câmeras
        this.setVisible(false);
        
        // Cria uma instância de menu e a torna visivel
        visualizacaoEnvio envioV = new visualizacaoEnvio();
        envioV.setVisible(true);
    }//GEN-LAST:event_botaoEnvioActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        // Input do dado a ser procurado
        String textoPesquisa = textProcurar.getText().trim();
        
        tabelaClientes.setRowSorter(sorter);
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

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        // Obtém a linha e coluna onde ocorreu o clique
        this.row = tabelaClientes.rowAtPoint(evt.getPoint());

        // Verifica se o clique foi dentro dos limites da tabela
        if (row >= 0) {
            // Passa o ID da câmera para o atributo 'cameraID'
            this.clienteID = (int) tabelaClientes.getValueAt(this.row, 0);
        }

        // Atualiza a tabela
        tabelaATT();
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void botaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoHistoricoActionPerformed

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        if (this.row == 0){
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada!");
        }else{
            JOptionPane.showMessageDialog(null,
            "Id: "+(int) tabelaClientes.getValueAt(this.row, 0)+
            "\nNome: "+(String) tabelaClientes.getValueAt(this.row, 1)+
            "\nTelefone: "+(String) tabelaClientes.getValueAt(this.row, 2)+
            "\nEndereço: "+(String) tabelaClientes.getValueAt(this.row, 3)+
            "\nE-mail: "+(String) tabelaClientes.getValueAt(this.row, 4)+
            "\nNúmero: "+(int) tabelaClientes.getValueAt(this.row, 5));
        }
    }//GEN-LAST:event_botaoVisualizarActionPerformed
    public void tabelaATT() {
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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new visualizacaoCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCamera1;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoCamera;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoEnvio;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExcluir1;
    private javax.swing.JButton botaoHistorico;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField textProcurar;
    // End of variables declaration//GEN-END:variables
}
