import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page21 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JPanel p1;
	
	public Page21()
	{
		super("Hotels");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("Hotels");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		l1.setForeground(Color.YELLOW);
		l1.setBounds(600,50,900,200);
		p1.add(l1);
		
		b1 = new JButton("Holiday Xpress");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(200,300,500,50);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Best Western Plus Maple Leaf");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(200,400,500,50);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Hotel AS Shams International");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b3.setForeground(Color.BLUE);
		b3.setBounds(800,300,500,50);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Hotel Amirs");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b4.setForeground(Color.BLUE);
		b4.setBounds(800,400,500,50);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Grand Lake View Hotel");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b5.setForeground(Color.BLUE);
		b5.setBounds(200,500,500,50);
		b5.addActionListener(this);
		p1.add(b5);
		
		b11 = new JButton("Back");
		b11.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b11.setForeground(Color.BLUE);
		b11.setBounds(1250,850,170,50);
		b11.addActionListener(this);
		p1.add(b11);
		
		b12 = new JButton("Home");
		b12.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b12.setForeground(Color.BLUE);
		b12.setBounds(1050,850,170,50);
		b12.addActionListener(this);
		p1.add(b12);
		
		this.add(p1);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b11)
		{
			Page6 p2 = new Page6();
			this.setVisible(false);
			p2.setVisible(true);
		}
		else if(ae.getSource()==b12)
		{
			Page1 p1 = new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b1)
		{
			ISubPage21 p1 = new ISubPage21();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			ISubPage22 p1 = new ISubPage22();
			this.setVisible(false);
			p1.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			ISubPage23 p1 = new ISubPage23();
			this.setVisible(false);
			p1.setVisible(true);
		}		
		else if(ae.getSource()==b4)
		{
			ISubPage25 p1 = new ISubPage25();
			this.setVisible(false);
			p1.setVisible(true);
		}		
		else if(ae.getSource()==b5)
		{
			ISubPage24 p1 = new ISubPage24();
			this.setVisible(false);
			p1.setVisible(true);
		}
	}

	
}