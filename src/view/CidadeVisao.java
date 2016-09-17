
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CidadeVisao extends FormularioPadrao {
    
    public CidadeVisao(){
        
        setTitle("Cadastro de Cidades");
    }
    @Override
    public void novosComponentes() {
         Font font = new Font("Tahoma", Font.BOLD, 11);
         
        JLabel jlUf = new JLabel ("UF");
        jlUf.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlUf.setForeground(Color.white);
        jlUf.setBounds(250, 60, 100, 27);
        jlUf.setFont(font);
        jpnFormulario.add(jlUf);
        
    
        JTextField jtfUF = new JTextField();
        jtfUF.setBounds(250, 80, 60, 27);
        jpnFormulario.add(jtfUF); 
         
        JLabel jlCidade = new JLabel ("Cidade");
        jlCidade.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlCidade.setForeground(Color.white);
        jlCidade.setBounds(9, 60, 100, 27);
        jlCidade.setFont(font);
        jpnFormulario.add(jlCidade);
        
         JTextField jtfCidade = new JTextField();
        jtfCidade.setBounds(9, 80, 230, 27);
        jpnFormulario.add(jtfCidade);
        
    }
    
    
    
}
