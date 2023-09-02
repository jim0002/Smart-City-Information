import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Error extends JFrame implements ActionListener
{
JLabel l1;
JButton b1;
JPanel p1;
public Error()
{
super("Wrong Input");
this.setSize(500,300);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p1 = new JPanel();
p1.setSize(new Dimension(500,300));
p1.setBackground(Color.GRAY);
p1.setLayout(null);
l1 = new JLabel("Wrond ID or Password");
l1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
l1.setForeground(Color.YELLOW);
l1.setBounds(140,20,300,30);
p1.add(l1);
b1 = new JButton("Ok");
b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
b1.setForeground(Color.BLUE);
b1.setBounds(190,170,100,30);
b1.addActionListener(this);
p1.add(b1);

this.add(p1);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
Admin1 p1 = new Admin1();
this.setVisible(false);
p1.setVisible(true);

 }

 }

}