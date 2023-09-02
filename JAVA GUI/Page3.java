import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page3 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	JPanel p1;
	public Page3()
	{
		super("National");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("National");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		l1.setForeground(Color.YELLOW);
		l1.setBounds(660,50,900,200);
		p1.add(l1);
		
	    l2 = new JLabel("Enter Name:");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.YELLOW);
		l2.setBounds(530,250,200,50);
		p1.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(750,250,200,50);
		p1.add(t1);
		
	    l3 = new JLabel("Enter Age:");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.YELLOW);
		l3.setBounds(530,350,200,50);
		p1.add(l3);
		
		t2 = new JTextField();
		t2.setBounds(750,350,200,50);
		p1.add(t2);
		
		l4 = new JLabel("Enter NID:");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.YELLOW);
		l4.setBounds(530,450,200,50);
		p1.add(l4);
		
		t3 = new JTextField();
		t3.setBounds(750,450,200,50);
		p1.add(t3);
		
		l5 = new JLabel("Enter Gender:");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l5.setForeground(Color.YELLOW);
		l5.setBounds(530,550,200,50);
		p1.add(l5);
		
		t4 = new JTextField();
		t4.setBounds(750,550,200,50);
		p1.add(t4);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(650,650,200,50);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(1250,850,170,50);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Home");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b3.setForeground(Color.BLUE);
		b3.setBounds(1050,850,170,50);
		b3.addActionListener(this);
		p1.add(b3);
		
		this.add(p1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			Page2 p2 = new Page2();
			this.setVisible(false);
			p2.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			Page1 p1 = new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b1)
		{
			String name = t1.getText();
			String age = t2.getText();
			String nid = t3.getText();
			String gender = t4.getText();
			UserInfoWriter.WriteUserInfo(name, age, nid, gender);
			Page5 p5 = new Page5();
			this.setVisible(false);
			p5.setVisible(true);
		}
	}

	
}