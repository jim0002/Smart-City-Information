import java.awt.*;
import javax.swing.*;
import java.io.*;
class Admin4 extends JFrame
{
  public Admin4()
  {
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JTextArea ta = new JTextArea(20,40);
    getContentPane().add(new JScrollPane(ta));
    pack();
    try{ta.read(new FileReader("IuserLogin.txt"),null);}catch(IOException ioe){}
  }
  public static void main(String[] args){new Admin4().setVisible(true);}
}