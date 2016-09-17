
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.MyTableModel;
import util.JAdicionaFundo;
import util.Tabela;

public class TelaEmprestimo extends javax.swing.JInternalFrame {
      
    JAdicionaFundo jDesktop = new JAdicionaFundo("FundoFormulario.jpg");
    Tabela utilTabela = new Tabela();
    JTable tabela;
    //DefaultTableModel modelo = new DefaultTableModel();
    MyTableModel modelo = new MyTableModel(new Vector<Object>());
    
    
    public TelaEmprestimo() {
        setContentPane(jDesktop);
        
        initComponents();
        centralizarComponente(); 
        setTitle("Empréstimo");
        criarTabela();
        
        
            
        
        jpnConsultaEmprestimo.setOpaque(false);
        jpnConsultaLivros.setOpaque(false);
        
        jPanel1.setOpaque(false);
        jcbNome.setOpaque(false);
        jcbLivro.setOpaque(false);
        jdcDataEmp.setOpaque(false);
        jdcDataDev.setOpaque(false);
        jFechar.setBackground(new Color(0,0,0,0));
     
    }
    
       public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 3);
    }
    
       public void criarTabela(){
            tabela = utilTabela.criarTabela(
            jpnConsultaEmprestimo,
            new Object[] {50,300,300,200,200}, 
            new Object[] {"centro","esquerda","esquerda","esquerda","esquerda"},
            new Object[] {"ID","Nome do aluno","Nome do livro","Data empréstimo","Data devolução"},
            new Integer[] {0,60,640,600}
        );
            tabela = utilTabela.criarTabela(
            jpnConsultaLivros,
            new Object[] {50,300,200,200,100}, 
            new Object[] {"centro","esquerda","esquerda","esquerda","esquerda"},
            new Object[] {"ID","Nome do livro","Autor","Editora","Estoque"},
            new Integer[] {0,60,640,600}

        );
        
            
            
//        modelo = (DefaultTableModel) tabela.getModel();
          modelo = (MyTableModel) tabela.getModel();

       }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbEmprestimoConsulta = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbNome = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbLivro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jdcDataEmp = new com.toedter.calendar.JDateChooser();
        jdcDataDev = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jpnConsultaEmprestimo = new javax.swing.JPanel();
        jpnConsultaLivros = new javax.swing.JPanel();
        jFechar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jcbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Livro:");

        jcbLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("e");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcbNome, 0, 522, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jdcDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jdcDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jdcDataDev, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(jdcDataEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(50, 50, 50))
        );

        jtbEmprestimoConsulta.addTab("Emprestar", jPanel1);

        javax.swing.GroupLayout jpnConsultaEmprestimoLayout = new javax.swing.GroupLayout(jpnConsultaEmprestimo);
        jpnConsultaEmprestimo.setLayout(jpnConsultaEmprestimoLayout);
        jpnConsultaEmprestimoLayout.setHorizontalGroup(
            jpnConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        jpnConsultaEmprestimoLayout.setVerticalGroup(
            jpnConsultaEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jtbEmprestimoConsulta.addTab("Empréstimos", jpnConsultaEmprestimo);

        javax.swing.GroupLayout jpnConsultaLivrosLayout = new javax.swing.GroupLayout(jpnConsultaLivros);
        jpnConsultaLivros.setLayout(jpnConsultaLivrosLayout);
        jpnConsultaLivrosLayout.setHorizontalGroup(
            jpnConsultaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        jpnConsultaLivrosLayout.setVerticalGroup(
            jpnConsultaLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jtbEmprestimoConsulta.addTab("Livros", jpnConsultaLivros);

        jFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1473985138_exit.png"))); // NOI18N
        jFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jtbEmprestimoConsulta)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtbEmprestimoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jFecharActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbLivro;
    private javax.swing.JComboBox<String> jcbNome;
    private com.toedter.calendar.JDateChooser jdcDataDev;
    private com.toedter.calendar.JDateChooser jdcDataEmp;
    private javax.swing.JPanel jpnConsultaEmprestimo;
    private javax.swing.JPanel jpnConsultaLivros;
    private javax.swing.JTabbedPane jtbEmprestimoConsulta;
    // End of variables declaration//GEN-END:variables
}
