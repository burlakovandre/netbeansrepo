import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
//    private int width;
//    private  int height;
    private Figure [] figures = new Figure[5];

    public PaintPanel(int width, int height) {
        setPreferredSize(new Dimension(width, height));
        setBorder(BorderFactory.createLineBorder(Color.red, 1));
//        this.width = width;
//        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    private class MyPanel extends JPanel{
        
    }
            
    
    
    
}
