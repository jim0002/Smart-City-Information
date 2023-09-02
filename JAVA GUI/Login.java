import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b1,b2;
	JPanel p1;
	
	public Login()
	{
		super("Home");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("Smart City Information");
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
		
		b1 = new JButton("Admin");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(620,450,300,100);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("User");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(620,700,300,100);
		b2.addActionListener(this);
		p1.add(b2);
	
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Admin1 a1 = new Admin1();
			this.setVisible(false);
			a1.setVisible(true);
		}
		
		if(ae.getSource()==b2)
		{
			Page2 p2 = new Page2();
			this.setVisible(false);
			p2.setVisible(true);
		}
		
	}
	
}