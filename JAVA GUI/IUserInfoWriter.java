import java.io.*;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class IUserInfoWriter {

    public IUserInfoWriter(){

    }
  public static void IWriteUserInfo (String name, String age, String passport, String gender) {
    try {
      FileWriter myWriter = new FileWriter("IuserLogin.txt");
	  BufferedWriter buffer = new BufferedWriter(myWriter);  
	  //Scanner input = new Scanner(System.in);
	  //String name = input.nextLine();
	  buffer.write(name);
	  buffer.newLine();
	  ///String age = input.nextLine();
	  buffer.write(age);
	  buffer.newLine();
	  //String passport = input.nextLine();
	  buffer.write(passport);
	  buffer.newLine();
	  //String gender = input.nextLine();
      buffer.write(gender);
	  
      buffer.close();
      //System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
/*  public static void main(String[]args){
	  UserInfoWriter userInfoWriter = new UserInfoWriter();
	  userInfoWriter.WriteUserInfo();
	  
}*/
}