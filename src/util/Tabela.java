package util;

import java.awt.Font;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.MyTableModel;

public class Tabela {
    
   
     

    public JTable criarTabela(JPanel jpn, Object[] largura, Object[] pos, Object[] col, Integer[] Bounds) throws NullPointerException {
        
      
        //JTable tabela = new JTable(new DefaultTableModel());
        //tabela.setVisible(true);
        JTable tabela = new JTable(new MyTableModel(new Vector<Object>()));
        
        
        //DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();    
        MyTableModel modeloTabela = (MyTableModel) tabela.getModel();

    
        tabela.setFont(new Font("Arial", Font.BOLD, 16));
        //JScrollPane jsp = new JScrollPane(tabela,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tabela.setRowHeight(50);
        JScrollPane jsp = new JScrollPane(tabela);
        //tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      
        //jsp.setHorizontalScrollBar(new JScrollBar(0));
        //tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        // Ordenando ao clicar no titulo da coluna da tabela
        
       jsp.setBounds(Bounds[0],Bounds[1],Bounds[2],Bounds[3]);
       jsp.setVisible(true);
       jpn.add(jsp);
        
        
        
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modeloTabela);
        tabela.setRowSorter(sorter);             
       
        //Adicionando coluna
   //     for (int i = 0; i < col.length; i++) {
   //        modeloTabela.addColumn(col[i]);
   //     }

        //Criando objeto para alinhamento dos dados dentro da tabela
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();

        //Adicionando as posiçoes
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);

        //Trabalhando com as colunas 
        for (int i = 0; i < largura.length; i++) {
            if (pos[i].equals("centro")) {
                pos[i] = centro;
            }
            if (pos[i].equals("direita")) {
                pos[i] = direita;
            }
            if (pos[i].equals("esquerda")) {
                pos[i] = esquerda;
            }

//            tabela.getColumnModel().getColumn(i).setMaxWidth(
//                    Integer.parseInt(largura[i].toString())
//            );

          //  tabela.getColumnModel().getColumn(i).setCellRenderer(
           //         (TableCellRenderer) pos[i]);
           

        }
        return tabela;
    }

    public void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

