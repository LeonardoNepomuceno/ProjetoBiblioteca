
package view;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.MyTableModel;
import util.Tabela;


public class LivroVisao extends FormularioPadrao {
    Tabela utilTabela = new Tabela();
    JTable tabela;
    //DefaultTableModel modelo = new DefaultTableModel();
    MyTableModel modelo = new MyTableModel(new Vector<Object>(),
                                           new Class[] { String.class, String.class, String.class },
                                           new String[] { "Coluna1" , "Coluna2" , "Coluna3" },
                                           new Object[][] { { "valor1" , "valor2" , "valor3" }}
                                          );
    
    public LivroVisao(){
       criarTabela();
        
       
        
        
        
    }
     /**public void redimensionarTabela(){
        Tabela jsp = new Tabela();
        jsp.setBounds(5, 60, 715, 200);
    }*/

    @Override    
    public void novosComponentes(){
            Font font = new Font("Tahoma", Font.BOLD, 14);
         
        JLabel jlAutor = new JLabel ("Autor");
        jlAutor.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlAutor.setForeground(Color.white);
        jlAutor.setBounds(9, 60, 100, 27);
        jlAutor.setFont(font);
        jpnFormulario.add(jlAutor);
        
    
        JComboBox jcbAutor = new JComboBox();
        jcbAutor.setBounds(9, 80, 300, 27);
        jpnFormulario.add(jcbAutor);
         
                 
        JLabel jlDisciplina = new JLabel ("Disciplina do livro");
        jlDisciplina .setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlDisciplina .setForeground(Color.white);
        jlDisciplina .setBounds(320, 60, 100, 27);
        jlDisciplina .setFont(font);
        jpnFormulario.add(jlDisciplina );
        
        JTextField jtfDisciplina = new JTextField();
        jtfDisciplina.setBounds(320, 80, 200, 27);
        jpnFormulario.add(jtfDisciplina);
        
        
        
       
 
       
        }
           
            public void criarTabela(){
            tabela = utilTabela.criarTabela(
            jPanelConsulta,
            new Object[] {50,300,300,200,200}, 
            new Object[] {"centro","esquerda","esquerda","esquerda","esquerda"},
            new Object[] {"ID","Nome do aluno","Nome do livro","Data empréstimo","Data devolução"},
            new Integer[] {0,60,740,600}
                    
                    
        );
             modelo = (MyTableModel) tabela.getModel();
}
}
