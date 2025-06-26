package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int y = 90;
    int z = 90;
    public RollingBall(){
        Timer t = new Timer(10, this);
        t.start();
    }
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,80,80);
        g.fillArc(x, y, 80, 80, z, 180);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
           x = x-2;
           z = z+2;
           if(x==-80){ x = getWidth();}
           if(z==360){ z = 0;}
           repaint();
        }
}

