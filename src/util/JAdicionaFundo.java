
package util;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class JAdicionaFundo extends JDesktopPane{
    
    ImageIcon icon;
    Image image;
    public JAdicionaFundo(String NomeArquivo){
        icon = new ImageIcon(getClass().getResource("/img/"+NomeArquivo));
        image = icon.getImage();
        
    }
    
    protected void paintComponent(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        
    }
    
}
