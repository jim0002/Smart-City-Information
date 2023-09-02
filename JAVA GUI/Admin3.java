import java.awt.*;
import javax.swing.*;
import java.io.*;
class Admin3 extends JFrame
{
  public Admin3()
  {
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JTextArea ta = new JTextArea(20,40);
    getContentPane().add(new JScrollPane(ta));
    pack();
    try{ta.read(new FileReader("userLogin.txt"),null);}catch(IOException ioe){}
  }
  public static void main(String[] args){new Admin3().setVisible(true);}
}



