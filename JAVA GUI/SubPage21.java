import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SubPage21 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b11,b12;
    JPanel p1;
    
    public SubPage21()
    {
        super("Navana Group");
        this.setSize(1500,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1 = new JPanel();
        p1.setSize(new Dimension(1500,1000));
        p1.setBackground(Color.GRAY);
        p1.setLayout(null);
        
        l1 = new JLabel("Navana Group");
        l1.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(450,50,900,200);
        p1.add(l1);
        
        l2 = new JLabel("Location : Nabisco, Dhaka");
        l2.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(350,180,900,200);
        p1.add(l2);
        
        l3 = new JLabel("Rating : 8.7/10");
        l3.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(480,280,900,200);
        p1.add(l3);
        
        l4 = new JLabel("Post :  Engineer");
        l4.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(400,380,900,200);
        p1.add(l4);
		
		l5 = new JLabel("Salary :  56000");
        l5.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(400,480,900,200);
        p1.add(l5);
		
		l6 = new JLabel("CV send Mail :  navana@hotmail.com");
        l6.setFont(new Font("Comic Sans MS",Font.BOLD,50));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(400,580,900,200);
        p1.add(l6);

 

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
            Page11 p2 = new Page11();
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