
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import util.JAdicionaFundo;


public abstract class FormularioPadrao extends javax.swing.JInternalFrame {

     
    //adiciona fundo para trocar o background da tela    
    JAdicionaFundo jDesktop = new JAdicionaFundo("FundoFormulario.jpg");
    
     public abstract void novosComponentes();
    
     
     public FormularioPadrao() {
        setContentPane(jDesktop);
        
        initComponents();
        
    //Deixar Fundo transparente
       
        jTabbedPane.setOpaque(false);
        jpnFundoCadastro.setOpaque(false);
        jtfConsulta.setOpaque(false);
        jToolBarBaixo.setOpaque(false);
        jpnFormulario.setOpaque(false);
        jPanelConsulta.setOpaque(false);
        jbSair.setBackground(new Color(0,0,0,0));

    //seleciona a opcao descricao na guia consulta
        jrdDescricao.setSelected(true);
       
        novosComponentes();
        centralizarComponente();
        
        
        habilitaBotoes(true);
        habilitaCampos(false); 
     }
      public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 3);
    }
      
        public void habilitaBotoes(boolean estado){
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);
        jbCancelar.setEnabled(estado);
        
        jbRemover.setEnabled(estado);
        jbCancelar.setEnabled(!estado);
        jbSalvar.setEnabled(!estado);
        jbPrimeiro.setEnabled(estado);
        jbAnterior.setEnabled(estado);
        jbProximo.setEnabled(estado);
        jbUltimo.setEnabled(estado);
    }
       

       public void habilitaCampos(boolean estado){
       for (int i = 0; i < jpnFormulario.getComponentCount(); i++ ){
           
           Component c = jpnFormulario.getComponent(i);
           
           if (c instanceof JTextField) {
               JTextField campoTexto = (JTextField) c;
               campoTexto.setEnabled(estado);
               
              
           }
          if (c instanceof JComboBox) {
               JComboBox comboBox = (JComboBox) c;
               comboBox.setEnabled(estado);  
       }
       }
    
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotoesConsulta = new javax.swing.ButtonGroup();
        jpnFundoCadastro = new javax.swing.JPanel();
        jToolBarBaixo = new javax.swing.JToolBar();
        jbPrimeiro = new javax.swing.JButton();
        jbAnterior = new javax.swing.JButton();
        jbProximo = new javax.swing.JButton();
        jbUltimo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jbNovo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jbCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jTabbedPane = new javax.swing.JTabbedPane();
        jpnFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jPanelConsulta = new javax.swing.JPanel();
        jrdID = new javax.swing.JRadioButton();
        jrdDescricao = new javax.swing.JRadioButton();
        jtfConsulta = new javax.swing.JTextField();
        jbSair = new javax.swing.JButton();

        jToolBarBaixo.setBorder(null);
        jToolBarBaixo.setFloatable(false);
        jToolBarBaixo.setRollover(true);
        jToolBarBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jbPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1- Primeiro.png"))); // NOI18N
        jbPrimeiro.setToolTipText("Primeiro contato");
        jbPrimeiro.setAlignmentX(0.5F);
        jbPrimeiro.setFocusable(false);
        jbPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBaixo.add(jbPrimeiro);

        jbAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2-anterior.png"))); // NOI18N
        jbAnterior.setToolTipText("Contato anterior");
        jbAnterior.setFocusable(false);
        jbAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBaixo.add(jbAnterior);

        jbProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3- proximo.png"))); // NOI18N
        jbProximo.setToolTipText("Próximo contato");
        jbProximo.setFocusable(false);
        jbProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBaixo.add(jbProximo);

        jbUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4- ultimo.png"))); // NOI18N
        jbUltimo.setToolTipText("Último contato");
        jbUltimo.setAlignmentX(0.1F);
        jbUltimo.setFocusable(false);
        jbUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUltimoActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbUltimo);
        jToolBarBaixo.add(jSeparator1);

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1297713679_list-add-user.png"))); // NOI18N
        jbNovo.setToolTipText("Novo");
        jbNovo.setAlignmentX(-0.2F);
        jbNovo.setAlignmentY(0.3F);
        jbNovo.setFocusable(false);
        jbNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbNovo);
        jToolBarBaixo.add(jSeparator4);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hardware-Floppy-icon.png"))); // NOI18N
        jbSalvar.setToolTipText("Salvar");
        jbSalvar.setAlignmentX(-0.2F);
        jbSalvar.setFocusable(false);
        jbSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbSalvar);

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit-user-icon.png"))); // NOI18N
        jbAlterar.setToolTipText("Alterar");
        jbAlterar.setAlignmentX(-0.2F);
        jbAlterar.setFocusable(false);
        jbAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbAlterar);

        jbRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove-user-icon.png"))); // NOI18N
        jbRemover.setToolTipText("Excluir");
        jbRemover.setAlignmentX(-0.2F);
        jbRemover.setFocusable(false);
        jbRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbRemover);
        jToolBarBaixo.add(jSeparator3);

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel-icon.png"))); // NOI18N
        jbCancelar.setToolTipText("Cancelar");
        jbCancelar.setAlignmentX(-0.2F);
        jbCancelar.setFocusable(false);
        jbCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jToolBarBaixo.add(jbCancelar);
        jToolBarBaixo.add(jSeparator2);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição");
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menu_Cadastro.png"))); // NOI18N

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Cadastro", jpnFormulario);

        GrupoBotoesConsulta.add(jrdID);
        jrdID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdID.setText("ID");

        GrupoBotoesConsulta.add(jrdDescricao);
        jrdDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdDescricao.setText("Descrição");

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jrdID)
                .addGap(10, 10, 10)
                .addComponent(jrdDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrdDescricao)
                    .addComponent(jrdID))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Consultar", jPanelConsulta);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1473985138_exit.png"))); // NOI18N
        jbSair.setToolTipText("Sair");
        jbSair.setAlignmentX(0.1F);
        jbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSair.setFocusable(false);
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnFundoCadastroLayout = new javax.swing.GroupLayout(jpnFundoCadastro);
        jpnFundoCadastro.setLayout(jpnFundoCadastroLayout);
        jpnFundoCadastroLayout.setHorizontalGroup(
            jpnFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
            .addComponent(jToolBarBaixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFundoCadastroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnFundoCadastroLayout.setVerticalGroup(
            jpnFundoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnFundoCadastroLayout.createSequentialGroup()
                .addComponent(jbSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBarBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnFundoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnFundoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfDescricao.requestFocus();        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
         habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        habilitaBotoes(false);
        habilitaCampos(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
           habilitaBotoes(true);
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        habilitaBotoes(false);
        habilitaCampos(false);
                
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
       dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbUltimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotoesConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanelConsulta;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBarBaixo;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPrimeiro;
    private javax.swing.JButton jbProximo;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbUltimo;
    public javax.swing.JPanel jpnFormulario;
    private javax.swing.JPanel jpnFundoCadastro;
    private javax.swing.JRadioButton jrdDescricao;
    private javax.swing.JRadioButton jrdID;
    private javax.swing.JTextField jtfConsulta;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfID;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
