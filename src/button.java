import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class button extends JFrame implements MouseListener{
    public button(){
        super ("button");
        setBackground(Color.magenta);
        setBounds(100,100,400,400);
        JLabel button1 = new JLabel("Click me");
        button1.setBounds(400, 400, 100,100);
        add(button1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1.addMouseListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel button1 = (JLabel) e.getSource();


        button1.setBounds(200, 200, 100,100);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
}

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
