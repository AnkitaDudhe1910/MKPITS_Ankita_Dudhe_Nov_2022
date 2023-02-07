import java.awt.*;
import javax.swing.*;


class optionpane
{
  JFrame f;

  optionpane()
  {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());

    JOptionPane.showMessageDialog(c, "alert", "alert", JOptionPane.ERROR_MESSAGE);

    //JOptionPane.showInternalMessageDialog(c, "information","informaton", JOptionPane.INFORMATION_MESSAGE);
    /*----show an information panel with the options, yes/no and mesage'choose one'-----*/

    //JOptionPane.showConfirmDialog(null,"choose one","choose one", JOptionPane.YES_OPTION);

    //String inputValue = JOptionPane.showInputDialog("Please input a value");

    //String inputValue = JOptionPane.showInputDialog("please input a value");

    f.setSize(200,400);
    f.setVisible(true);

    }

    public static void main(String [] args)
    {
      new optionpane();
    }
}