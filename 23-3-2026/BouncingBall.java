import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements ActionListener {
    int x = 100, y=100;
    int dx = 2, dy = 2;
    int radius = 40;

    Timer timer;

    public BouncingBall(){
        timer = new Timer(10, this);
        timer.start(); 
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
}
