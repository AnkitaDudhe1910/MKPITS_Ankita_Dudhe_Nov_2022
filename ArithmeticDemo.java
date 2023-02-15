import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class ArithmeticDemo implements ActionListener
{
	JFrame f;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton bt1, bt2, bt3, bt4;
   public ArithmeticDemo()
   {
	  f = new JFrame();
	  Container c = f.getContentPane();
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.setLayout(null);
	  l1 = new JLabel("Enter a :");
	  l1.setBounds(100,50,50,50);
	  l2 = new JLabel("Enter b :");
	  l2.setBounds(100,100,50,50);
	  l3 = new JLabel("Result :");
	  l3.setBounds(100,150,50,50);

      t1 = new JTextField(10);
      t1.setBounds(200,60,120,25);
      t2 = new JTextField(10);
      t2.setBounds(200,120,120,25);
      t3 = new JTextField(10);
      t3.setBounds(200,180,120,25);

      bt1 = new JButton("ADD");
      bt1.setBounds(100,240,60,50);
      bt2 = new JButton("SUB");
      bt2.setBounds(180,240,60,50);
      bt3 = new JButton("MUL");
      bt3.setBounds(260,240,60,50);
      bt4 = new JButton("DIV");
      bt4.setBounds(340,240,60,50);

      f.add(l1);
      f.add(l2);
      f.add(l3);
      f.add(t1);
      f.add(t2);
      f.add(t3);
      f.add(bt1);
      f.add(bt2);
      f.add(bt3);
      f.add(bt4);

      bt1.addActionListener(this);
      bt2.addActionListener(this);
      bt3.addActionListener(this);
      bt4.addActionListener(this);


      f.setSize(200,400);
      f.setVisible(true);
   }
   public static void main(String [] args)
   {
      new ArithmeticDemo();
   }
   public void actionPerformed(ActionEvent e)
   {
      String s1 = t1.getText();
      String s2 = t2.getText();

      int a = Integer.parseInt(s1);
      int b = Integer.parseInt(s2);

     if(e.getSource()==bt1)
     {
		  int sum = a+b;
		  String s3 = Integer.toString(sum);
		  t3.setText(s3);
	 }
	 if(e.getSource()==bt2)
     {
	      int sub = a-b;
	 	  String s3 = Integer.toString(sub);
	      t3.setText(s3);
	 }
	 if(e.getSource()==bt3)
     {
	 	  int mul = a*b;
	 	  String s3 = Integer.toString(mul);
	 	  t3.setText(s3);
	 }
	 if(e.getSource()==bt4)
     {
		 if(a>b)
		 {
		   float div = a/b;
		   String s3 = Float.toString(div);
	 	   t3.setText(s3);
		 }
		 else
		 {
	 	  float div = b/a;
	 	  String s3 = Float.toString(div);
	 	  t3.setText(s3);
	     }
	 }
   }
}