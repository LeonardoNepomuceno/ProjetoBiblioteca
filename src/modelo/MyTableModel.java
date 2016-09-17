/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Vector;
import javafx.scene.chart.PieChart;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class MyTableModel extends AbstractTableModel{
    
    private Class[] tiposColuna = { String.class, String.class, String.class};
    private String[] nomeColunas = { "a" , "b" ,"c" };
    private Object[][] dados = {
        { "1" , "2" ,"3"  },
        { "5" , "6" ,"7"  }
    };
    
    Vector m_dados;
    
    public MyTableModel(Vector out_dados){
        super();
        m_dados = out_dados;
    }

    @Override
    public int getRowCount() {
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }
    
    public void setValueAt(Object obj, int row, int col){
        
        switch(col){
            case 0:
                m_dados.add((String)obj);
                break;
            case 1:
                break;
            case 2:
                break;
            
        }
    }
     
}
