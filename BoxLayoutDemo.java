import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BoxLayoutDemo extends JFrame
{
   public BoxLayoutDemo()
   {
     Container contentPane = getContentPane();
     contentPane.setLayout(new FlowLayout());

     Box horbox = Box.createHorizontalBox();
     Box verbox = Box.createVerticalBox();

     horbox.add(new JButton("Button 1"));
     horbox.add(new JButton("Button 2"));
     horbox.add(new JButton("Button 3"));

     verbox.add(new JButton(new ImageIcon("cat1.jpeg")));
     verbox.add(new JButton(new ImageIcon("cat1.jpeg")));
     verbox.add(new JButton(new ImageIcon("cat1.jpeg")));

     contentPane.add(horbox);
     contentPane.add(verbox);

     pack(); // take minimum size of the frame sufficient to display the components
     setVisible(true);
   }

   public static void main(String [] args)
   {
      new BoxLayoutDemo();
   }
}