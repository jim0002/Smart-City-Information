import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page6 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JPanel p1;
	
	public Page6()
	{
		super("International User");
		this.setSize(1500,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1500,1000));
		p1.setBackground(Color.GRAY);
		p1.setLayout(null);
		
		l1 = new JLabel("International");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		l1.setForeground(Color.YELLOW);
		l1.setBounds(640,50,900,200);
		p1.add(l1);
		
		b1 = new JButton("Tourist Place");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b1.setForeground(Color.BLUE);
		b1.setBounds(300,300,400,50);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("School and College");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.BLUE);
		b2.setBounds(300,400,400,50);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("University");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b3.setForeground(Color.BLUE);
		b3.setBounds(300,500,400,50);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("Resturant");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b4.setForeground(Color.BLUE);
		b4.setBounds(300,600,400,50);
		b4.addActionListener(this);
		p1.add(b4);
		
		b5 = new JButton("Hotels");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b5.setForeground(Color.BLUE);
		b5.setBounds(300,700,400,50);
		b5.addActionListener(this);
		p1.add(b5);
		
		b6 = new JButton("Police Station");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b6.setForeground(Color.BLUE);
		b6.setBounds(850,300,400,50);
		b6.addActionListener(this);
		p1.add(b6);
		
		b7 = new JButton("Shopping Mall");
		b7.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b7.setForeground(Color.BLUE);
		b7.setBounds(850,400,400,50);
		b7.addActionListener(this);
		p1.add(b7);
		
		b8 = new JButton("Stadium");
		b8.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b8.setForeground(Color.BLUE);
		b8.setBounds(850,500,400,50);
		b8.addActionListener(this);
		p1.add(b8);
		
		b9 = new JButton("Hospital");
		b9.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b9.setForeground(Color.BLUE);
		b9.setBounds(850,600,400,50);
		b9.addActionListener(this);
		p1.add(b9);
		
		b10 = new JButton("Bank");
		b10.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b10.setForeground(Color.BLUE);
		b10.setBounds(850,700,400,50);
		b10.addActionListener(this);
		p1.add(b10);
		
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
			Page2 p2 = new Page2();
			this.setVisible(false);
			p2.setVisible(true);
		}
		 else if(ae.getSource()==b1)
		{
			Page17 p7 = new Page17();
			this.setVisible(false);
			p7.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			Page18 p8 = new Page18();
			this.setVisible(false);
			p8.setVisible(true);
		}
	    else if(ae.getSource()==b3)
		{
			Page19 p9 = new Page19();
			this.setVisible(false);
			p9.setVisible(true);
		}
		else if(ae.getSource()==b4)
		{
			Page20 p10 = new Page20();
			this.setVisible(false);
			p10.setVisible(true);
		}
		else if(ae.getSource()==b5)
		{
			Page21 p11 = new Page21();
			this.setVisible(false);
			p11.setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			Page22 p12 = new Page22();
			this.setVisible(false);
			p12.setVisible(true);
		}
		else if(ae.getSource()==b7)
		{
			Page23 p13 = new Page23();
			this.setVisible(false);
			p13.setVisible(true);
		}
	    else if(ae.getSource()==b8)
		{
			Page24 p14 = new Page24();
			this.setVisible(false);
			p14.setVisible(true);
		}
		else if(ae.getSource()==b9)
		{
			Page25 p15 = new Page25();
			this.setVisible(false);
			p15.setVisible(true);
		}
		else if(ae.getSource()==b10)
		{
			Page26 p16 = new Page26();
			this.setVisible(false);
			p16.setVisible(true);
		}
		else if(ae.getSource()==b12)
		{
			Page1 p1 = new Page1();
			this.setVisible(false);
			p1.setVisible(true);
		}
	}

}