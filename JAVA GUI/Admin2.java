import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4;
	JPanel p1;
	
	public Admin2()
	{
		super("Admin2");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("Admin");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		l1.setForeground(Color.YELLOW);
		l1.setBounds(460,30,900,200);
		p1.add(l1);
		
	    /*l2 = new JLabel("About");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.YELLOW);
		l2.setBounds(1220,800,400,40);
		p1.add(l2);
		
		l3 = new JLabel("Team: Code Poltergeists");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.YELLOW);
		l3.setBounds(1100,860,400,40);
		p1.add(l3);*/
		
		b1 = new JButton("National");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(620,450,300,100);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("International");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(620,600,300,100);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b3.setForeground(Color.BLUE);
		b3.setBounds(1250,850,170,50);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Home");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b4.setForeground(Color.BLUE);
		b4.setBounds(1050,850,170,50);
		b4.addActionListener(this);
		p1.add(b4);
		
		
	
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Admin3 l1  = new Admin3();
			this.setVisible(false);
			l1.setVisible(true);
		}
		
		else if(ae.getSource()==b2)
		{
			Admin4 l2  = new Admin4();
			this.setVisible(false);
			l2.setVisible(true);
		}
		
		if(ae.getSource()==b3)
		{
			Admin1 l1  = new Admin1();
			this.setVisible(false);
			l1.setVisible(true);
		}
		
		else if(ae.getSource()==b4)
		{
			Page1 l1  = new Page1();
			this.setVisible(false);
			l1.setVisible(true);
		}
	}
	
}