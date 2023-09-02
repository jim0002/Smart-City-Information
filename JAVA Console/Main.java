import java.io.IOException;

 

public class Main
{
	 public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
           }
           catch(Exception E){
            System.out.println(E);
           }
        }
    public static void main (String args[])
    {
		for(int i=1; i<=100; i=i+25)
		{
			System.out.println("Loading... \n\nProgress : "+i+"%");
			cls();
		}
        System.out.println("\n\n                        -----------SMART CITY INFORMATION------------");
        System.out.println("\n\n");
        System.out.println("    This project is about a smart city information.\n    A person can get all the necessary information \n    like tourist place, restaurant, hotel, school etc.\n    he/she need to get a view of this city. \n    The project will show information for both \n    national and international user separately.");
        System.out.println("\n         -----------------------------------------------------");
        
        User2 u = new User2();
        u.showInfo();
        
        cls();
        System.out.println("\n\n                        -----------SMART CITY INFORMATION------------");
        System.out.println("\n\n");
        System.out.println("    This project is about a smart city information.\n    A person can get all the necessary information \n    like tourist place, restaurant, hotel, school etc.\n    he/she need to get a view of this city. \n    The project will show information for both \n    national and international user separately.");
        System.out.println("\n         -----------------------------------------------------");
    }
 

}