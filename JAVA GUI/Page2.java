import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page2 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3;
	JPanel p1;
	
	public Page2()
	{
		super("Menu");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("User");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		l1.setForeground(Color.YELLOW);
		l1.setBounds(680,30,900,200);
		p1.add(l1);
		
		b1 = new JButton("National");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(450,420,200,60);
	    b1.addActionListener(this);
		p1.add(b1);
		
	    b2 = new JButton("International");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(750,420,300,60);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Home");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b3.setForeground(Color.BLUE);
		b3.setBounds(1230,830,150,60);
		b3.addActionListener(this);
		p1.add(b3);
		
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Page3 p3 = new Page3();
			this.setVisible(false);
			p3.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			Page1 p1 = new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page4 p4 = new Page4();
			this.setVisible(false);
			p4.setVisible(true);
		}
	}
	
}