
package view;
    
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ContatoVisao extends FormularioPadrao {
    
    public ContatoVisao(){
        
        setTitle("Cadastro de Contatos");
    }

    
    @Override
    public void novosComponentes() {
        Font font = new Font("Tahoma", Font.BOLD, 14);
         
        JLabel jlUf = new JLabel ("UF");
        jlUf.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlUf.setForeground(Color.white);
        jlUf.setBounds(390, 60, 100, 27);
        jlUf.setFont(font);
        jpnFormulario.add(jlUf);
        
    
        JComboBox jcbUf = new JComboBox();
        jcbUf.setBounds(390, 80, 60, 27);
        jpnFormulario.add(jcbUf); 
         
        JLabel jlCidade = new JLabel ("Cidade");
        jlCidade.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlCidade.setForeground(Color.white);
        jlCidade.setBounds(270, 60, 100, 27);
        jlCidade.setFont(font);
        jpnFormulario.add(jlCidade);
        
    
        JComboBox jcbCidade = new JComboBox();
        jcbCidade.setBounds(270, 80, 120, 27);
        jpnFormulario.add(jcbCidade);
    
    
        JLabel jlBairro = new JLabel ("Bairro");
        jlBairro.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlBairro.setForeground(Color.white);
        jlBairro.setBounds(9, 60, 300, 27);
        jlBairro.setFont(font);
        jpnFormulario.add(jlBairro);
        
    
        JTextField jcbBairro = new JTextField();
        jcbBairro.setBounds(9, 80, 250, 27);
        jpnFormulario.add(jcbBairro);
        
        
        JLabel jlEndereco = new JLabel ("Rua");
        jlEndereco.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlEndereco.setForeground(Color.white);
        jlEndereco.setBounds(9, 110, 140, 27);
        jlEndereco.setFont(font);
        jpnFormulario.add(jlEndereco);
        
        JTextField jtfEndereco = new JTextField();
        jtfEndereco.setBounds(9, 130, 380, 27);
        jpnFormulario.add(jtfEndereco);
        
        JLabel jlNumero = new JLabel ("N°");
        jlNumero.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlNumero.setForeground(Color.white);
        jlNumero.setBounds(400, 110, 140, 27);
        jlNumero.setFont(font);
        jpnFormulario.add(jlNumero);
        
        JTextField jtfNumero = new JTextField();
        jtfNumero.setBounds(400, 130, 80, 27);
        jpnFormulario.add(jtfNumero);
        
        JLabel jlTelefone = new JLabel ("Telefone");
        jlTelefone.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlTelefone.setForeground(Color.white);
        jlTelefone.setBounds(9, 170, 140, 27);
        jlTelefone.setFont(font);
        jpnFormulario.add(jlTelefone);
        
        JTextField jtfTelefone = new JTextField();
        jtfTelefone.setBounds(9, 190, 100, 27);
        jpnFormulario.add(jtfTelefone);
                
                
        JLabel jlCelular = new JLabel ("Celular");
        jlCelular.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlCelular.setForeground(Color.white);
        jlCelular.setBounds(130, 170, 140, 27);
        jlCelular.setFont(font);
        jpnFormulario.add(jlCelular);
        
        JTextField jtfCelular = new JTextField();
        jtfCelular.setBounds(130, 190, 100, 27);
        jpnFormulario.add(jtfCelular);        
        
        JLabel jlNascimento = new JLabel ("Nascimento");
        jlNascimento.setFont(new java.awt.Font("Tahoma", 1 , 14));
        jlNascimento.setForeground(Color.white);
        jlNascimento.setBounds(255, 170, 140, 27);
        jlNascimento.setFont(font);
        jpnFormulario.add(jlNascimento);
        
        JTextField jtfNascimento = new JTextField();
        jtfNascimento.setBounds(250, 190, 100, 27);
        jpnFormulario.add(jtfNascimento);
    
    }
}
   

