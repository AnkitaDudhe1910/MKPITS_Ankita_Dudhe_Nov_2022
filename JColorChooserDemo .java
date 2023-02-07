import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JColorChooserDemo extends JFrame implements ActionListener
{
  JButton btn ;
  Color clr;
  Container c;

  public JColorChooserDemo()
  {
    c = getContentPane();
    c.setLayout(new FlowLayout());
    btn = new JButton("Change color");
    btn.addActionListener(this);
    c.add(btn);

    setTitle("Creating Color Pallete");
    setSize(400, 400);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
     clr = JColorChooser.showDialog(this, "Choose Your Color", Color.green);
     c.setBackground(clr); // calling with c is must
     //c.repaint();  // or simply repaint
  }
  public static void main(String [] args)
  {
    new JColorChooserDemo();
  }

}