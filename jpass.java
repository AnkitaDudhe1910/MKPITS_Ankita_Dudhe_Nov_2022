import javax.swing.*;
import java.awt.*;


class jpass
{
  JFrame f;
  JLabel l1;
  JPasswordField jf1;
 
 jpass()
  {
    f = new JFrame();
    l1 = new JLabel("enter password");
    jf1 = new JPasswordField(10);
    
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(l1);
    c.add(jf1);
    l1.setToolTipText("this is label 1.");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(200,400);
    f.setVisible(true);
    
  }
   public static void main(String [] args)
   {
     new jpass();
   }
  
}