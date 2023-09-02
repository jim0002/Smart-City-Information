import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class ISubPage23 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton b11,b12;
    JPanel p1;
    
    public ISubPage23()
    {
        super("Hotel AS Shams International");
        this.setSize(1500,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(1500,1000));
        p1.setBackground(Color.GRAY);
        p1.setLayout(null);
        
        l1 = new JLabel("Hotel AS Shams International");
        l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(450,50,900,200);
        p1.add(l1);
        
        l2 = new JLabel("Location: 205/5 Al-Bashir Plaza Box Culvert Road,Dhaka");
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(50,200,1600,200);
        p1.add(l2);
        
        l3 = new JLabel("Rating : 8.9/10");
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(550,400,900,200);
        p1.add(l3);
        
        l4 = new JLabel("Quality : 5 Star");
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(500,600,900,200);
        p1.add(l4);

 

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
            Page21 p2 = new Page21();
            this.setVisible(false);
            p2.setVisible(true);
        }
        else if(ae.getSource()==b12)
        {
            Page1 p1 = new Page1();
            this.setVisible(false);
            p1.setVisible(true);
        }
    }

 

    
}