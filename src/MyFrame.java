import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{
    JLabel label;
    ImageIcon grumpy;
    ImageIcon uwu;
    ImageIcon shock;
    ImageIcon sleepy;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        grumpy= new ImageIcon("Images/grumpy.png");
        uwu = new ImageIcon("Images/uwu.png");
        shock = new ImageIcon("Images/shock.png");
        sleepy = new ImageIcon("Images/sleepy.png");

        //set at default
        label.setIcon(uwu);

        this.add(label);
        this.pack();
        //Set frame in middle of screen
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("You clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(sleepy);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(grumpy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(shock);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(uwu);
    }
}
