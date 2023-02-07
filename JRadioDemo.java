import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JRadioDemo extends JFrame implements ItemListener
{
  JRadioButton shirtbut,pantbut,sareebut,brownbut,graybut,creambut;
   public JRadioDemo()
   {
      Container c = getContentPane();
      c.setLayout(new FlowLayout()); // to create ButtonGroup objects that group checkboxes
      ButtonGroup group1 = new ButtonGroup();
      ButtonGroup group2 = new ButtonGroup();

      shirtbut = new JRadioButton("Shirt");
      pantbut = new JRadioButton("Pant");
      sareebut = new JRadioButton("Saree");
     brownbut = new JRadioButton("Brown");
      graybut = new JRadioButton("Gray");
      creambut = new JRadioButton("Cream");

     group1.add(shirtbut );
     group1.add(pantbut  );
     group1.add(sareebut );

     group2.add(brownbut  );
     group2.add( graybut  );
     group2.add(creambut );

     c.add(shirtbut);
     c.add(pantbut);
     c.add(sareebut);
     c.add(brownbut );
     c.add(graybut);
     c.add(creambut);

     //register each checkbox with listener

    shirtbut.addItemListener(this);
    pantbut.addItemListener(this);
    sareebut.addItemListener(this);
    brownbut.addItemListener(this);
    graybut.addItemListener(this);
    creambut.addItemListener(this);

    setTitle("Learning Radio Buttons");
    setSize(250,250);
    setVisible(true);
   }
   public void itemStateChanged(ItemEvent e)
   {
    String name = " ", color = " "; //two local variable
    if(shirtbut.isSelected())
    name = "Shirt";
    else
    if(pantbut.isSelected())
    name = "Pant";
    if(sareebut.isSelected())
    name = "Saree";

    if(brownbut.isSelected())
    name = "Brown";
    else
    if(graybut.isSelected())
    name = "Gray";
    else
    if(creambut.isSelected())
    name = "Cream";

   JOptionPane.showMessageDialog(null,"You wanted "+ name+"in color" +color ,"Selection Application", JOptionPane.INFORMATION_MESSAGE);
   }
   public static void main(String [] args)
   {
     new JRadioDemo();
   }
}