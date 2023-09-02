import java.io.IOException;
import java.io.*; 
import java.util.Scanner;


public class User2
{
	public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
           }
           catch(Exception E){
            System.out.println(E);
           }
        }
	//public static void main(String args[]){
		void showInfo(){
			
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("\n		Admin");
		System.out.println("		User");
			
	    System.out.println("\n		Press 1 if you are Admin: ");
		System.out.println("		Press 2 if you are User: ");
		int numb = 1;
        while(numb>0){	
		System.out.print("\n		Enter 1 for ADMIN & Enter 2 for USER = ");
		int ii = sc.nextInt();
		numb=ii;
		if(numb==1)
		{
			
			System.out.print("		Enter ID: ");
			Scanner ad = new Scanner(System.in);
			String ID = ad.nextLine();
			
			System.out.print("		Enter Password: ");
			Scanner ad1 = new Scanner(System.in);
			int Pass = ad1.nextInt();
			
			if (ID.equals("Error")&&Pass==654321)
			{
				System.out.println("			Welcome");
				System.out.println("		National User\n");
				ReadUserInfo.UserInfo();
				System.out.println("		International User\n");
				IReadUserInfo.IUserInfo();
			}
			else
			{
				System.out.print("		Wrong ID or Password");
			}	
			
		}
		else if(numb==2){
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n		Press 1 if you are an National user: ");
		System.out.println("		Press 2 if you are an International user ");
		System.out.println("\n\n        ***IMPORTANT INSTRUCTION ::: After User Login Press  one time  '0' to OPTION menu-----------");
		System.out.println("        ***IMPORTANT INSTRUCTION ::: After User Login Press  two time  '0' back to USER menu--------");
		System.out.println("        ***IMPORTANT INSTRUCTION ::: After User Login Press Three time '0' back to ADMIN/USER menu--");
		int num = 1;
		
		while(num>0){
			System.out.print("\n\n	Enter 1 for NATIONAL User & 2 for INTERNATIONAL User/ 0 for Admin/User = ");
			int i = input.nextInt();
			num=i;

		
			
			
			
	//START OF NATIONAL USER INFORMATION		
		cls(); //<-------------------------------	
			
			if(num==1){
				Scanner input2 = new Scanner(System.in);
				System.out.print("		Enter your Name: ");
				String name = input2.nextLine();
				System.out.print("		Enter your voter ID: ");
				String nid = input2.nextLine();
				System.out.print("		Enter your age: ");
				String age = input2.nextLine();
				System.out.print("		Enter your Gender: ");
				String gender = input2.nextLine();
				
				UserInfoWriter.WriteUserInfo(name, age, nid, gender);
				
				System.out.println("\n		Press 1 For Tourist place: ");
				System.out.println("		Press 2 For School and College: ");
				System.out.println("		Press 3 For University: ");
				System.out.println("		Press 4 For Resturant: ");
				System.out.println("		Press 5 For Jobsector: ");
				System.out.println("		Press 6 For Police Station: ");
				System.out.println("		Press 7 For Shopping Mall: ");
				System.out.println("		Press 8 For Stadium: ");
				System.out.println("		Press 9 For Hospital: ");
				System.out.println("		Press 10 For Bank: ");
				System.out.println("		Press 11 For Hotel: ");
				System.out.println("		Press 12 For Local Transport Services: ");
				System.out.println("		Press 13 For External Transport (Road) Services: ");
				System.out.println("		Press 14 For External Transport (Train) Services: ");


				int num1 = 1;
				while(num1>0){
					System.out.print("		Enter OPTION Number (1-14)  or  0 for USER Menu : = ");
					int i1 = input.nextInt();
					num1=i1;
					
				//START OF TOURIST PLACE INFORMATION	
					cls(); //<-------------------------------
					if(num1==1){
						System.out.println("		Tourist place in the city are: ");
						System.out.println("		Ahsan Manzil Museum");
						System.out.println("		Lalbagh Fort");
						System.out.println("		National Parliament House ");
						System.out.println("		Liberation War Museum");
						System.out.println("		National Museum");
						
						
						System.out.println("		Press 1 for Ahsan Manzil Museum");
						System.out.println("		Press 2 for Lalbagh Fort");
						System.out.println("		Press 3 for National Parliament House ");
						System.out.println("		Press 4 for Liberation War Museum");
						System.out.println("		Press 5 for National Museum");
						
						
						int num2 = 1;
						while(num2>0){
						System.out.print("\n		Enter number to check = ");
						int i2 = input.nextInt();
						num2=i2;
						cls(); //<-------------------------------
						if(num2==1){
							System.out.println("		1. Ahsan Manzil Museum");
							System.out.println("		Location : Shadarght, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Entry Fee :  100 BDT");
							}
						else if(num2==2){
							System.out.println("		2. Lalbagh Fort");
							System.out.println("		Location : Azimpur, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Entry Fee :   60 BDT");
							}
						else if(num2==3){
							System.out.println("		3. National Parliament House ");
							System.out.println("		Location : Bijoy-shoroni, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Entry Fee :  No Cost");
							}
						else if(num2==4){
							System.out.println("		4. Liberation War Museum");
							System.out.println("		Location : Agargaon, Dhaka");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Entry Fee :  40 BDT");
							}
						else if(num2==5){
							System.out.println("		5. National Museum");
							System.out.println("		Location : Shahbag, Dhaka");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Entry Fee : 50 BDT");
							}
						}
					}
					
					
					
		//START OF SCHOOL COLLEGE INFORMATION	
			cls(); //<-------------------------------		
					
					
					if(num1==2){
						System.out.println("		School and College in the city are: ");
						System.out.println("		RAJUCK UTTARA MODEL COLLEGE");
						System.out.println("		MILESTONE COLLEGE");
						System.out.println("		UTTARA HIGH SCHOOL & COLLEGE ");
						System.out.println("		SAINT JOSEPH HIGHER SEC. COLLEGE");
						System.out.println("		B A F SHAHEEN COLLEGE");
						
						
						System.out.println("		Press 1 for RAJUCK UTTARA MODEL COLLEGE");
						System.out.println("		Press 2 for MILESTONE COLLEGE");
						System.out.println("		Press 3 for UTTARA HIGH SCHOOL & COLLEGE ");
						System.out.println("		Press 4 for SAINT JOSEPH HIGHER SEC. COLLEGE");
						System.out.println("		Press 5 for B A F SHAHEEN COLLEGE");
						
						
						int num3 = 1;
						while(num3>0){
						System.out.print("\n		Enter number to check = ");
						int i3 = input.nextInt();
						num3=i3;
						cls(); //<-------------------------------
						if(num3==1){
							System.out.println("		1. RAJUCK UTTARA MODEL COLLEGE");
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: 01");
							
							}
						else if(num3==2){
							System.out.println("		2. MILESTONE COLLEGE");
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: 10");
							
							}
						else if(num3==3){
							System.out.println("		3. UTTARA HIGH SCHOOL & COLLEGE ");
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: No Rank");
							
							}
						else if(num3==4){
							System.out.println("		4. SAINT JOSEPH HIGHER SEC. COLLEGE");
							System.out.println("		Location : Mohammadpur, Dhaka");
							System.out.println("		Rank in 2020: 02");
							
							}
						else if(num3==5){
							System.out.println("		5. B A F SHAHEEN COLLEGE");
							System.out.println("		Location : Jahangir-Gate, Dhaka");
							System.out.println("		Rank in 2020: 05");
							
							}
						}
					}
					
					
					
		//STRAT OF UNIVERSITY INFORMATION
			cls(); //<-------------------------------		
					
					
					
					if(num1==3){
						System.out.println("		University in the city are: ");
						System.out.println("		American International University-Bangladesh");
						System.out.println("		East West University");
						System.out.println("		North South University");
						System.out.println("		Brac University");
						System.out.println("		Dhaka University");
						
						
						System.out.println("		Press 1 for American International University-Bangladesh");
						System.out.println("		Press 2 for East West University");
						System.out.println("		Press 3 for North South University ");
						System.out.println("		Press 4 for Brac University");
						System.out.println("		Press 5 for Dhaka University");
						
						
						int num4 = 1;
						while(num4>0){
						System.out.print("\n		Enter number to check = ");
						int i4 = input.nextInt();
						num4=i4;
						cls(); //<-------------------------------
						if(num4==1){
							System.out.println("		1. American International University-Bangladesh");
							System.out.println("		Location : Kuril, Dhaka");
							System.out.println("		Rank in 2020: 05");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==2){
							System.out.println("		2. East West University");
							System.out.println("		Location : Aftab Nagor, Dhaka");
							System.out.println("		Rank in 2020: 07");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==3){
							System.out.println("		3. North South University");
							System.out.println("		Location : Bashundhara, Dhaka");
							System.out.println("		Rank in 2020: 04");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==4){
							System.out.println("		4. Brac University");
							System.out.println("		Location : Mohakhali, Dhaka");
							System.out.println("		Rank in 2020: 03");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==5){
							System.out.println("		5. Dhaka University");
							System.out.println("		TSC, Dhaka ");
							System.out.println("		Rank in 2020: 02");
							System.out.println("		International Student facelity : YES");
							}
						}
					}
					
					
					
					
					
					cls(); //<-------------------------------
					if(num1==4){
						System.out.println("		Restaurants in the city are: ");
						System.out.println("		Tabaq Coffee");
						System.out.println("		Pizza lnn");
						System.out.println("		Madchef");
						System.out.println("		Cha Time Bangladesh");
						
						
						System.out.println("		Press 1 for Tabaq Coffee");
						System.out.println("		Press 2 for Pizza lnn");
						System.out.println("		Press 3 for Madchef");
						System.out.println("		Press 4 for Cha Time Bangladesh");
						
						
						int num5 = 1;
						while(num5>0){
						System.out.print("\n		Enter number to check = ");
						int i5 = input.nextInt();
						num5=i5;
						cls(); //<-------------------------------
						if(num5==1){
							System.out.println("		1. Tabaq Coffee");
							System.out.println("		Location : Jamuna Future Park, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Coffee & Snacks");
							System.out.println("		Card Payment : Available");
							}
						else if(num5==2){
							System.out.println("		2. Pizza lnn");
							System.out.println("		Location : RAK Tower,Jashimuddin, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Pizza & Snacks");
							System.out.println("		Card Payment : Available");
							}
						else if(num5==3){
							System.out.println("		3. Madchef");
							System.out.println("		Location : Bashundhara Get, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : American & Italian Food");
							System.out.println("		Card Payment : Available");
							}
						else if(num5==4){
							System.out.println("		4. Cha Time Bangladesh");
							System.out.println("		Location : House Building, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Refreshing Drink & Coffee");
							System.out.println("		Card Payment : Available");
							}
						}
					}
			
				
			cls(); //<-------------------------------
					if(num1==5){
						System.out.println("		Job Sector in the city are: ");
						System.out.println("		Navana Group");
						System.out.println("		ACI Group");
						System.out.println("		Bashundhara Group");
						System.out.println("		Beximco Group");
						System.out.println("		Square Group");
						System.out.println("		City Group");
						
						
						System.out.println("		Press 1 for Navana Group");
						System.out.println("		Press 2 for ACI Group");
						System.out.println("		Press 3 for Bashundhara Group");
						System.out.println("		Press 4 for Beximco Group");
						System.out.println("		Press 5 for Square Group");
						System.out.println("		Press 6 for City Group");
						
						
						int num6 = 1;
						while(num6>0) {
						System.out.print("\n		Enter number to check = ");
						int i6 = input.nextInt();
						num6=i6;
						cls(); //<-------------------------------
						if(num6==1){
							System.out.println("		1. Navana Group");
							System.out.println("		Location : Nabisco, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Engineer");
							System.out.println("		Salary :  56000");
							System.out.println("		CV send Mail :  navana@hotmail.com");
							}
						else if(num6==2){
							System.out.println("		2. ACI Group");
							System.out.println("		Location : Kallyanpur, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Pharmacist");
							System.out.println("		Salary :  49000");
							System.out.println("		CV send Mail :  aci@gmail.com");
							}
						else if(num6==3){
							System.out.println("		3. Bashundhara Group");
							System.out.println("		Location : Bashundhara, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Executive");
							System.out.println("		Salary :  34000");
							System.out.println("		CV send Mail :  b.dhara@hotmail.com");
							}
						else if(num6==4){
							System.out.println("		4. Beximco Group");
							System.out.println("		Location : Dhanmondi, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Pharmacist");
							System.out.println("		Salary :  72000");
							System.out.println("		CV send Mail :  beximco@outlook.com");
							}
						else if(num6==5){
							System.out.println("		5. Square Group");
							System.out.println("		Location : Mohakhali, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Pharmacist");
							System.out.println("		Salary :  52000");
							System.out.println("		CV send Mail :  square@yahoo.com");
							}
						else if(num6==6){
							System.out.println("		6. City Group");
							System.out.println("		Location : Dhanmondi, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Post :  Nutrisian");
							System.out.println("		Salary :  45000");
							System.out.println("		CV send Mail :  city.g@gmail.com.com");
							}
						}
					}
					
					cls(); //<-------------------------------
					if(num1==6){
						System.out.println("		Police Station in the city are: ");
						System.out.println("		Banani Police Station");
						System.out.println("		Vatara Police Station");
						System.out.println("		Pallabi Police Station");
						System.out.println("		Lalbagh Police Station");
						System.out.println("		Kalabagan Police Station, DMP");
						
						
						System.out.println("		Press 1 for Banani Police Station");
						System.out.println("		Press 2 for Vatara Police Station");
						System.out.println("		Press 3 for Pallabi Police Station ");
						System.out.println("		Press 4 for Lalbagh Police Station");
						System.out.println("		Press 5 for Kalabagan Police Station, DMP");
						
						
						int num7 = 1;
						while(num7>0){
						System.out.print("\n		Enter number to check = ");
						int i7 = input.nextInt();
						num7=i7;
						cls(); //<-------------------------------
						if(num7==1){
							System.out.println("		1. Banani Police Station");
							System.out.println("		Location : House #37, Rd No 7, Dhaka 1213");
							System.out.println("		Contact No: 09864");
							System.out.println("		Code no: 098");
							}
						else if(num7==2){
							System.out.println("		2. Vatara Police Station");
							System.out.println("		Location: House #2 Madani sharoni, Dhaka 1212");
							System.out.println("		Contact No: 09845");
							System.out.println("		Code no: 097");
							}
						else if(num7==3){
							System.out.println("		3. Pallabi Police Station");
							System.out.println("		Location : ECB canteen mor");
							System.out.println("		Contact No: 098356");
							System.out.println("		Code no: 096");
							}
						else if(num7==4){
							System.out.println("		4. Lalbagh Police Station");
							System.out.println("		Location : House#24 Raj Narayan Dhar Rd, Dhaka");
							System.out.println("		Contact No: 098567");
							System.out.println("		Code no: 093");
							}
						else if(num7==5){
							System.out.println("		5. Kalabagan Police Station");
							System.out.println("		Location: 30 North Road, Dhaka 1205");
							System.out.println("		Contact No: 09653");
							System.out.println("		Code no: 091");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==7){
						System.out.println("		Shopping Malls in the city are: ");
						System.out.println("		Bashundhara City Shopping Complex");
						System.out.println("		Eastern Plaza Shopping Complex");
						System.out.println("		Confidence Shopping Mall");
						System.out.println("		Shyamoli Square Shopping Mal");
						System.out.println("		Jamuna Future Park");
						
						
						System.out.println("		Press 1 for Bashundhara City Shopping Complex");
						System.out.println("		Press 2 for Eastern Plaza Shopping Complex");
						System.out.println("		Press 3 for Confidence Shopping Mall");
						System.out.println("		Press 4 for Shyamoli Square Shopping Mal");
						System.out.println("		Press 5 for Jamuna Future Park");
						
						
						int num8 = 1;
						while(num8>0){
						System.out.print("\n		Enter number to check = ");
						int i8 = input.nextInt();
						num8=i8;
						cls(); //<-------------------------------
						if(num8==1){
							System.out.println("		1. Bashundhara City Shopping Complex");
							System.out.println("		Location : 3 No Tejturi Bazar West, Panthapath, Dhaka 1215");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Cinema : Yes");
							}
						else if(num8==2){
							System.out.println("		2. Eastern Plaza Shopping Complex");
							System.out.println("		Location : Eastern plaza, Hatirpoo1, Dhaka-111, Dhaka 1205");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Cinema : Yes");
							}
						else if(num8==3){
							System.out.println("		3. Confidence Shopping Mall");
							System.out.println("		Location : Confidence Center 6A, Kha-9, Progoti Sharani, Shahjadpur, Gulshan, Building No: 1, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Cinema : No");
							}
						else if(num8==4){
							System.out.println("		4. Shyamoli Square Shopping Mal");
							System.out.println("	    Location : Shyamoli Square shopping Mall, Dhaka 1207");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Cinema : No");
							}
						else if(num8==5){
							System.out.println("		5. Jamuna Future Park");
							System.out.println("		Location : KA-244, Kuril, Progoti Shoroni, Dhaka");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Cinema : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==8){
						System.out.println("		Stadiums in the city are: ");
						System.out.println("		Bangabandhu National Stadium");
						System.out.println("		Sher-e-Bangla National Cricket Stadium");
						System.out.println("		Bangladesh Army Stadium");		
						System.out.println("	    Shaheed Suhrawardi Indoor Stadium");
						System.out.println("		Siddiq Indoor Badminton Stadium");
						
						System.out.println("		Press 1 for Bangabandhu National Stadium");
						System.out.println("		Press 2 for Sher-e-Bangla National Cricket Stadium");
						System.out.println("		Press 3 for Bangladesh Army Stadium");
						System.out.println("		Press 4 for Shaheed Suhrawardi Indoor Stadium");
						System.out.println("		Press 5 for Siddiq Indoor Badminton Stadium");
						
						
						int num9 = 1;
						while(num9>0){
						System.out.print("\n		Enter number to check = ");
						int i9 = input.nextInt();
						num9=i9;
						cls(); //<-------------------------------
						if(num9==1){
							System.out.println("		1. Bangabandhu National Stadium");
							System.out.println("		Location : Bangabandhu National Stadium Rd, Dhaka 1000");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==2){
							System.out.println("		2. Sher-e-Bangla National Cricket Stadium");
							System.out.println("		Location : Mirpur Rd, Dhaka 1216");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==3){
							System.out.println("		3. Bangladesh Army Stadium");
							System.out.println("		Location : Dhaka - Mymensingh Hwy, Dhaka 1212");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==4){
							System.out.println("	    4. Shaheed Suhrawardi Indoor Stadium");
							System.out.println("		Location : Mirpur 10 Roundabout, Dhaka 1216");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Type : Indoor");
							}
						else if(num9==5){
							System.out.println("		5. Siddiq Indoor Badminton Stadium");
							System.out.println("		Location : Siddiq Indoor Badminton Stadium");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		type : Indoor");
							}
						}
					
					}
					
					cls(); //<-------------------------------
					if(num1==9){
						System.out.println("		Hospitals in the city are: ");
						System.out.println("		Mitford Hospital, Dhaka");
						System.out.println("		Evercare Hospital Dhaka");
						System.out.println("		United Hospital Limited");
						System.out.println("		Dhaka Community Medical College and Hospital");
						System.out.println("		Kingston Hospital");
						
						
						System.out.println("		Press 1 for Mitford Hospital, Dhaka");
						System.out.println("		Press 2 for Evercare Hospital Dhaka");
						System.out.println("		Press 3 for United Hospital Limited");
						System.out.println("		Press 4 for Dhaka Community Medical College and Hospital");
						System.out.println("		Press 5 for Kingston Hospital");
						
						
						int num10 = 1;
						while(num10>0){
						System.out.print("\n		Enter number to check = ");
						int i10 = input.nextInt();
						num10=i10;
						cls(); //<-------------------------------
						if(num10==1){		
							System.out.println("		Location : Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==2){
							System.out.println("		Location : Plot: 81 Block: E, Dhaka 1229");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==3){
							System.out.println("		Location : Plot # 15 Rd No 71, Dhaka 1212");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==4){
							System.out.println("		Location : 190/1 Baro Moghbazar, Wireless Railgate Bara Moghbazar, Dhaka 1217");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==5){
							System.out.println("		Location : House 51-54, Road 01 & 02, Block-D, Shahidbag Mirpur -12 Dhaka, 1216");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		ICU : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==10){
						System.out.println("		Banks in the city are: ");
						System.out.println("		NCC BANK");
						System.out.println("		EXIM Bank Limited");
						System.out.println("		Bangladesh Bank, Sadarghat Office");
						System.out.println("		Export Import Bank Of Bangladesh Limited");
						System.out.println("		Dhaka Bank Limited");
						
						
						System.out.println("		Press 1 for NCC BANK");
						System.out.println("		Press 2 for EXIM Bank Limited");
						System.out.println("		Press 3 for Bangladesh Bank, Sadarghat Office");
						System.out.println("		Press 4 for Export Import Bank Of Bangladesh Limited");
						System.out.println("		Press 5 for Dhaka Bank Limited");
						
						
						int num11 = 1;
						while(num11>0){
						System.out.print("\n		Enter number to check = ");
						int i11 = input.nextInt();
						num11=i11;
						cls(); //<-------------------------------
						if(num11==1){
							System.out.println("		Location : 57/A, Abdul Aziz Lane Nilambar Shaha Rd Dhaka 1211 Nilambar Shaha Rd, Dhaka 1211");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==2){
							System.out.println("		Location : Dhaka - Mymensingh Highway, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==3){
							System.out.println("		Location : Johnson Rd, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==4){
							System.out.println("		Location : Symphony, Plot # SE (F): 9, Road # 142, Gulshan Avenue, Bir Uttam Mir Shawkat Sarak, Dhaka 1212");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==5){
							System.out.println("		Location : House 964/1 Block - B Sahid Baki Road Dhaka, 1219");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Online Service : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==11){
						System.out.println("		Hotels in the city are: ");
						System.out.println("		Holiday Xpress");
						System.out.println("		Best Western Plus Maple Leaf");
						System.out.println("		Hotel AS Shams International");
						System.out.println("		Grand Lake View Hotel");
						System.out.println("		Hotel Amirs");
						
						
						System.out.println("		Press 1 for Holiday Xpress");
						System.out.println("		Press 2 for Best Western Plus Maple Leaf");
						System.out.println("		Press 3 for Hotel AS Shams International");
						System.out.println("		Press 4 for Grand Lake View Hotel");
						System.out.println("		Press 5 for Hotel Amirs");
						
						
						int num12 = 1;
						while(num12>0){
						System.out.print("\n		Enter number to check = ");
						int i12 = input.nextInt();
						num12=i12;
						cls(); //<-------------------------------
						if(num12==1){
							System.out.println("		Location : Airport - Dakshinkhan Rd, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Quality : 3 Start");
							}
						else if(num12==2){
							System.out.println("		Location : Plot 1B, Rd No 1, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Quality : 5 Start");
							}
						else if(num12==3){
							System.out.println("		Location : 205/5 Al-Bashir Plaza Box Culvert Road, Fakirapool, Dhaka 1000");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Quality : 3 Start");
							}			
						else if(num12==4){
							System.out.println("		Location : House# 14, Road# 5/A, UTTARA Sector# 11 Dhaka, 1230");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Quality : 3 Start");
							}
						else if(num12==5){
							System.out.println("		Location : Taher Plaza, Shahid Latif Road Near Kosai Badi Rail Gate, Dhaka 1230");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Quality : 5 Start");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==12){
						System.out.println("		Local Transport Services");
						System.out.println("		Uber");
						System.out.println("		Pathao");
						System.out.println("		Obhai");
						System.out.println("		Anik Bus");
						System.out.println("		Winer");
						
						
						System.out.println("		Press 1 for Uber");
						System.out.println("		Press 2 for Pathao");
						System.out.println("		Press 3 for Obhai");
						System.out.println("		Press 4 for Anik Bus");
						System.out.println("		Press 5 for Winer");
						
						
						int num13 = 1;
						while(num13>0){
						System.out.print("\n		Enter number to check = ");
						int i13 = input.nextInt();
						num13=i13;
						cls(); //<-------------------------------
						if(num13==1){
							System.out.println("		Type : Car,Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : Yes");
							}
						else if(num13==2){
							System.out.println("		Type : Car,Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : Yes");
							}
						else if(num13==3){
								System.out.println("		Type : Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : No");
							}
						else if(num13==4){
								System.out.println("		Type : Bus");
							System.out.println("		Service : From Azimpur to Tongi Hossain Market");
							System.out.println("		AC Facility : No");
							}
						else if(num13==5){
								System.out.println("		Type : Car,Bike");
							System.out.println("		Service : From Azimpur to Kuril Biswaroad");
							System.out.println("		AC Facility : No");;
							}
						}
					}
					
					cls(); //<-------------------------------
					if(num1==13){
						System.out.println("		External Transport(Road) Services");
						System.out.println("		Ena");
						System.out.println("		Hanif");
						System.out.println("		Golden Line");
						System.out.println("		Desh Travels");
						System.out.println("		Shohag");
						
						
						System.out.println("		Press 1 for Ena");
						System.out.println("		Press 2 for Hanif");
						System.out.println("		Press 3 for Golden Line");
						System.out.println("		Press 4 for Desh Travels");
						System.out.println("		Press 5 for Shohag");
						
						
						int num14 = 1;
						while(num14>0){
						System.out.print("\n		Enter number to check = ");
						int i14 = input.nextInt();
						num14=i14;
						cls(); //<-------------------------------
						if(num14==1){
							System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==2){
							System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==3){
								System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==4){
								System.out.println("		Type : Business Class");
							System.out.println("		Service : Dhaka to Kolkata");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==5){
								System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");;
							}
						}
					}
					
					cls(); //<-------------------------------
					if(num1==14){
						System.out.println("		External Transport(Rail) Services");
						System.out.println("		Shonar Bangla Express");
						System.out.println("		Shuborno Express");
						System.out.println("		Tista Express");
						System.out.println("		Godholi Express");
						System.out.println("		Dhaka Mail");
						
						
						System.out.println("		Press 1 for Shonar Bangla Express");
						System.out.println("		Press 2 for Shuborno Express");
						System.out.println("		Press 3 for Tista Express");
						System.out.println("		Press 4 for Godholi Express");
						System.out.println("		Press 5 for Dhaka Mail");
						
						
						int num15 = 1;
						while(num15>0){
						System.out.print("\n		Enter number to check = ");
						int i15 = input.nextInt();
						num15=i15;
						cls(); //<-------------------------------
						if(num15==1){
							System.out.println("		Destination : Dhaka to Chittagong");
							System.out.println("		Time : 9am");
							System.out.println("		AC Facility : No");
							}
						else if(num15==2){
							System.out.println("		Destination : Dhaka to Chittagong");
							System.out.println("		Time : 10am");
							System.out.println("		AC Facility : Yes");
							}
						else if(num15==3){
								System.out.println("		Destination : Dhaka to Mymensingh");
							System.out.println("		Time : 1pm");
							System.out.println("		AC Facility : Yes");
							}
						else if(num15==4){
								System.out.println("		Destination : Dhaka to Jessore");
							System.out.println("		Time : 7pm");
							System.out.println("		AC Facility : No");
							}
						else if(num15==5){
								System.out.println("		Destination : Inside Dhaka");
							System.out.println("		Time : 10pm");
							System.out.println("		AC Facility : No");;
							}
						}
					}
					
					
					
					
					
					
					
					
					
					
					
					
			
					
			
			
			
				}





			}


//START OF INTERNATIONAL USER INFORMATION



cls(); //<-------------------------------
			if(num==2){
				Scanner input3 = new Scanner(System.in);
				System.out.print("		Enter your Name: ");
				String name = input3.nextLine();
				System.out.print("		Enter your Passport Number: ");
				String passport = input3.nextLine();
				System.out.print("		Enter your age: ");
				String age = input3.nextLine();
				System.out.print("		Enter your Gender: ");
				String gender = input3.nextLine();
				
				IUserInfoWriter.IWriteUserInfo(name, age, passport, gender);
				
				System.out.println("		Press 1 For Tourist place: ");
				System.out.println("		Press 2 For School and College: ");
				System.out.println("		Press 3 For University: ");
				System.out.println("		Press 4 For Resturant: ");
				System.out.println("		Press 6 For Police Station: ");
				System.out.println("		Press 7 For Shopping Mall: ");
				System.out.println("		Press 8 For Stadium: ");
				System.out.println("		Press 9 For Hospital: ");
				System.out.println("		Press 10 For Bank: ");
				System.out.println("		Press 11 For Hotel: ");
				System.out.println("		Press 12 For Local Transport Services: ");
				System.out.println("		Press 13 For External Transport (Road) Services: ");
				System.out.println("		Press 14 For External Transport (Train) Services: ");


				int num1 = 1;
				while(num1>0){
					System.out.print("		Enter OPTION Number (1-14)  or  0 for USER Menu : = ");
					int i1 = input.nextInt();
					num1=i1;
					cls(); //<-------------------------------
					if(num1==1){
						System.out.println("		Tourist place in the city are: ");
						System.out.println("		Ahsan Manzil Museum");
						System.out.println("		Lalbagh Fort");
						System.out.println("		National Parliament House ");
						System.out.println("		Liberation War Museum");
						System.out.println("		National Museum");
						
						
						System.out.println("		Press 1 for Ahsan Manzil Museum");
						System.out.println("		Press 2 for Lalbagh Fort");
						System.out.println("		Press 3 for National Parliament House ");
						System.out.println("		Press 4 for Liberation War Museum");
						System.out.println("		Press 5 for National Museum");
						
						int num2 = 1;
						while(num2>0){
						System.out.print("\n	Enter number to check = ");
						int i2 = input.nextInt();
						num2=i2;
						cls(); //<-------------------------------
						if(num2==1){
							System.out.println("		1. Ahsan Manzil Museum");
							System.out.println("		Location : Shadarght, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Entry Fee :  10 USD");
							}
						else if(num2==2){
							System.out.println("		2. Lalbagh Fort");
							System.out.println("		Location : Azimpur, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("	    Entry Fee :   6 USD");
							}
						else if(num2==3){
							System.out.println("		3. National Parliament House ");
							System.out.println("		Location : Bijoy-shoroni, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Entry Fee :  No Cost");
							}
						else if(num2==4){
							System.out.println("		4. Liberation War Museum");
							System.out.println("		Location : Agargaon, Dhaka");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Entry Fee :  4 USD");
							}
						else if(num2==5){
							System.out.println("		5. National Museum");
							System.out.println("		Location : Shahbag, Dhaka");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Entry Fee : 5 USD");
							}
						}
					}
					
					
					
					
					cls(); //<-------------------------------
					if(num1==2){
						System.out.println("		School and College in the city are: ");
						System.out.println("		RAJUCK UTTARA MODEL COLLEGE");
						System.out.println("		MILESTONE COLLEGE");
						System.out.println("		UTTARA HIGH SCHOOL & COLLEGE ");
						System.out.println("		SAINT JOSEPH HIGHER SEC. COLLEGE");
						System.out.println("		B A F SHAHEEN COLLEGE");
						
						
						System.out.println("		Press 1 for ABC international School.");
						System.out.println("		Press 2 for Oxford COLLEGE");
						System.out.println("		Press 3 for UTTARA International SCHOOL & COLLEGE ");
						System.out.println("		Press 4 for Learners School and College.");
						System.out.println("		Press 5 for Little Flower School");
						
						
						int num3 = 1;
						while(num3>0){
						System.out.print("\n		Enter number to check = ");
						int i3 = input.nextInt();
						num3=i3;
						cls(); //<-------------------------------
						if(num3==1){
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: 01");
							
							}
						else if(num3==2){
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: 10");
							
							}
						else if(num3==3){
							System.out.println("		Location : Uttara, Dhaka");
							System.out.println("		Rank in 2020: No Rank");
							
							}
						else if(num3==4){
							System.out.println("		Location : Mohammadpur, Dhaka");
							System.out.println("		Rank in 2020: 02");
							
							}
						else if(num3==5){
							System.out.println("		Location : Jahangir-Gate, Dhaka");
							System.out.println("		Rank in 2020: 05");
							
							}
						}
					}
					
					
					
					
					cls(); //<-------------------------------
					if(num1==3){
						System.out.println("		University in the city are: ");
						System.out.println("		American International University-Bangladesh");
						System.out.println("		East West University");
						System.out.println("		North South University");
						System.out.println("		Brac University");
						System.out.println("		Dhaka University");
						
						
						System.out.println("		Press 1 for American International University-Bangladesh");
						System.out.println("		Press 2 for East West University");
						System.out.println("		Press 3 for North South University ");
						System.out.println("		Press 4 for Brac University");
						System.out.println("		Press 5 for Dhaka University");
						
						
						int num4 = 1;
						while(num4>0){
						System.out.print("\n		Enter number to check = ");
						int i4 = input.nextInt();
						num4=i4;
						cls(); //<-------------------------------
						if(num4==1){
							System.out.println("		Location : Kuril, Dhaka");
							System.out.println("		Rank in 2020: 05");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==2){
							System.out.println("		Location : Aftab Nagor, Dhaka");
							System.out.println("		Rank in 2020: 04");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==3){
							System.out.println("		Location : Bashundhara, Dhaka");
							System.out.println("		Rank in 2020: 01");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==4){
							System.out.println("		Location : Mohakhali, Dhaka");
							System.out.println("		Rank in 2020: 01");
							System.out.println("		International Student facelity : YES");
							}
						else if(num4==5){
							System.out.println("		Nilkhet Rd, Dhaka ");
							System.out.println("		Rank in 2020: 03");
							System.out.println("		International Student facelity : YES");
							}
						}
					}
					
					cls(); //<-------------------------------
					if(num1==4){
						System.out.println("		Restaurants in the city are: ");
						System.out.println("		Tabaq Coffee");
						System.out.println("		Pizza lnn");
						System.out.println("		Madchef");
						System.out.println("		Cha Time Bangladesh");
						
						
						System.out.println("		Press 1 for Tabaq Coffee");
						System.out.println("		Press 2 for Pizza lnn");
						System.out.println("		Press 3 for Madchef");
						System.out.println("		Press 4 for Cha Time Bangladesh");
						
						
						int num5 = 1;
						while(num5>0){
						System.out.print("\n		Enter number to check = ");
						int i5 = input.nextInt();
						num5=i5;
						cls(); //<-------------------------------
						if(num5==1){
							System.out.println("		Location : Jamuna Future Park, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Coffee & Snacks");
							System.out.println("	Card Payment : Available");
							}
						else if(num5==2){
							System.out.println("		Location : Jashimuddin Square, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Pizza & Snacks");
							System.out.println("		Card Payment : Available");
							}
						else if(num5==3){
							System.out.println("		Location : Bashundhara Get, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : American & Italian Food");
							System.out.println("		Card Payment : Available");
							}
						else if(num5==4){
							System.out.println("		Location : House Building, Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Category : Refreshing Drink & Coffee");
							System.out.println("		Card Payment : Available");
							}
						}
					}
					
					
					
					cls(); //<-------------------------------
					if(num1==6){
						System.out.println("		Police Station in the city are: ");
						System.out.println("		Banani Police Station");
						System.out.println("		Vatara Police Station");
						System.out.println("		Pallabi Police Station");
						System.out.println("		Lalbagh Police Station");
						System.out.println("		Kalabagan Police Station, DMP");
						
						
						System.out.println("		Press 1 for Banani Police Station");
						System.out.println("		Press 2 for Vatara Police Station");
						System.out.println("		Press 3 for Pallabi Police Station ");
						System.out.println("		Press 4 for Lalbagh Police Station");
						System.out.println("		Press 5 for Kalabagan Police Station, DMP");
						
						
						int num7 = 1;
						while(num7>0){
						System.out.print("\n		Enter number to check = ");
						int i7 = input.nextInt();
						num7=i7;
						cls(); //<-------------------------------
						if(num7==1){
							System.out.println("		Location : House #37, Rd No 7, Dhaka 1213");
							System.out.println("		Contact No: 09864");
							System.out.println("		Code no: 098");
							}
						else if(num7==2){
							System.out.println("		Location: House #2 Madani sharoni, Dhaka 1212");
							System.out.println("		Contact No: 09845");
							System.out.println("		Code no: 097");
							}
						else if(num7==3){
							System.out.println("		Location : ECB canteen mor");
							System.out.println("		Contact No: 098356");
							System.out.println("		Code no: 096");
							}
						else if(num7==4){
							System.out.println("		Location : House#24 Raj Narayan Dhar Rd, Dhaka");
							System.out.println("		Contact No: 098567");
							System.out.println("		Code no: 093");
							}
						else if(num7==5){
							System.out.println("		Location: 30 North Road, Dhaka 1205");
							System.out.println("		Contact No: 09653");
							System.out.println("		Code no: 091");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==7){
						System.out.println("		Shopping Malls in the city are: ");
						System.out.println("		Bashundhara City Shopping Complex");
						System.out.println("		Eastern Plaza Shopping Complex");
						System.out.println("		Confidence Shopping Mall");
						System.out.println("		Shyamoli Square Shopping Mal");
						System.out.println("		Jamuna Future Park");
						
								
						System.out.println("		Press 1 for Bashundhara City Shopping Complex");
						System.out.println("		Press 2 for Eastern Plaza Shopping Complex");
						System.out.println("		Press 3 for Confidence Shopping Mall");
						System.out.println("		Press 4 for Shyamoli Square Shopping Mal");
						System.out.println("		Press 5 for Jamuna Future Park");
						
						
						int num8 = 1;
						while(num8>0){
						System.out.print("\n		Enter number to check = ");
						int i8 = input.nextInt();
						num8=i8;
						cls(); //<-------------------------------
						if(num8==1){
							System.out.println("		Location : 3 No Tejturi Bazar West, Panthapath, Dhaka 1215");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Cinema : Yes");
							}
						else if(num8==2){
							System.out.println("		Location : Eastern plaza, Hatirpoo1, Dhaka-111, Dhaka 1205");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Cinema : Yes");
							}
						else if(num8==3){
							System.out.println("		Location : Confidence Center 6A, Kha-9, Progoti Sharani, Shahjadpur, Gulshan, Building No: 1, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Cinema : No");
							}
						else if(num8==4){
							System.out.println("		Location : Shyamoli Square shopping Mall, Dhaka 1207");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Cinema : No");
							}
						else if(num8==5){
							System.out.println("		Location : KA-244, Kuril, Progoti Shoroni, Dhaka");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Cinema : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==8){
						System.out.println("		Stadiums in the city are: ");
						System.out.println("		Bangabandhu National Stadium");
						System.out.println("		Sher-e-Bangla National Cricket Stadium");
						System.out.println("		Bangladesh Army Stadium");
						System.out.println("		Shaheed Suhrawardi Indoor Stadium");
						System.out.println("		Siddiq Indoor Badminton Stadium");
						
						
						System.out.println("		Press 1 for Bangabandhu National Stadium");
						System.out.println("		Press 2 for Sher-e-Bangla National Cricket Stadium");
						System.out.println("		Press 3 for Bangladesh Army Stadium");
						System.out.println("		Press 4 for Shaheed Suhrawardi Indoor Stadium");
						System.out.println("		Press 5 for Siddiq Indoor Badminton Stadium");
						
						
						int num9 = 1;
						while(num9>0){
						System.out.print("\n		Enter number to check = ");
						int i9 = input.nextInt();
						num9=i9;
						cls(); //<-------------------------------
						if(num9==1){
							System.out.println("		Location : Bangabandhu National Stadium Rd, Dhaka 1000");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==2){
							System.out.println("		Location : Mirpur Rd, Dhaka 1216");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==3){
							System.out.println("		Location : Dhaka - Mymensingh Hwy, Dhaka 1212");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Type : Outdoor");
							}
						else if(num9==4){
							System.out.println("		Location : Mirpur 10 Roundabout, Dhaka 1216");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Type : Indoor");
							}
						else if(num9==5){
							System.out.println("		Location : Siddiq Indoor Badminton Stadium");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		type : Indoor");
							}
						}
					
					}
					
					cls(); //<-------------------------------
					if(num1==9){
						System.out.println("		Hospitals in the city are: ");
						System.out.println("		Mitford Hospital, Dhaka");
						System.out.println("		Evercare Hospital Dhaka");
						System.out.println("		United Hospital Limited");
						System.out.println("		Dhaka Community Medical College and Hospital");
						System.out.println("		Kingston Hospital");
						
						
						System.out.println("		Press 1 for Mitford Hospital, Dhaka");
						System.out.println("		Press 2 for Evercare Hospital Dhaka");
						System.out.println("		Press 3 for United Hospital Limited");
						System.out.println("		Press 4 for Dhaka Community Medical College and Hospital");
						System.out.println("		Press 5 for Kingston Hospital");
						
						
						int num10 = 1;
						while(num10>0){
						System.out.print("\n		Enter number to check = ");
						int i10 = input.nextInt();
						num10=i10;
						cls(); //<-------------------------------
						if(num10==1){
							System.out.println("		Location : Dhaka");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==2){
							System.out.println("		Location : Plot: 81 Block: E, Dhaka 1229");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==3){
							System.out.println("		Location : Plot # 15 Rd No 71, Dhaka 1212");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==4){
							System.out.println("		Location : 190/1 Baro Moghbazar, Wireless Railgate Bara Moghbazar, Dhaka 1217");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		ICU : Yes");
							}
						else if(num10==5){
							System.out.println("		Location : House 51-54, Road 01 & 02, Block-D, Shahidbag Mirpur -12 Dhaka, 1216");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		ICU : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==10){
						System.out.println("		Banks in the city are: ");
						System.out.println("		NCC BANK");
						System.out.println("		EXIM Bank Limited");
						System.out.println("		Bangladesh Bank, Sadarghat Office");
						System.out.println("		Export Import Bank Of Bangladesh Limited");
						System.out.println("		Dhaka Bank Limited");
						
						
						System.out.println("		Press 1 for NCC BANK");
						System.out.println("		Press 2 for EXIM Bank Limited");
						System.out.println("		Press 3 for Bangladesh Bank, Sadarghat Office");
						System.out.println("		Press 4 for Export Import Bank Of Bangladesh Limited");
						System.out.println("		Press 5 for Dhaka Bank Limited");
						
						
						int num11 = 1;
						while(num11>0){
						System.out.print("\n		Enter number to check = ");
						int i11 = input.nextInt();
						num11=i11;
						cls(); //<-------------------------------
						if(num11==1){
							System.out.println("		Location : 57/A, Abdul Aziz Lane Nilambar Shaha Rd Dhaka 1211 Nilambar Shaha Rd, Dhaka 1211");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==2){
							System.out.println("		Location : Dhaka - Mymensingh Highway, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==3){
							System.out.println("		Location : Johnson Rd, Dhaka");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==4){
							System.out.println("		Location : Symphony, Plot # SE (F): 9, Road # 142, Gulshan Avenue, Bir Uttam Mir Shawkat Sarak, Dhaka 1212");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Online Service : Yes");
							}
						else if(num11==5){
							System.out.println("		Location : House 964/1 Block - B Sahid Baki Road Dhaka, 1219");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Online Service : Yes");
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==11){
						System.out.println("		Hotels in the city are: ");
						System.out.println("		Holiday Xpress");
						System.out.println("		Best Western Plus Maple Leaf");
						System.out.println("		Hotel AS Shams International");
						System.out.println("		Grand Lake View Hotel");
						System.out.println("		Hotel Amirs");
						
						
						System.out.println("		Press 1 for Holiday Xpress");
						System.out.println("		Press 2 for Best Western Plus Maple Leaf");
						System.out.println("		Press 3 for Hotel AS Shams International");
						System.out.println("		Press 4 for Grand Lake View Hotel");
						System.out.println("		Press 5 for Hotel Amirs");
						
						
						int num12 = 1;
						while(num12>0){
						System.out.print("\n		Enter number to check = ");
						int i12 = input.nextInt();
						num12=i12;
						cls(); //<-------------------------------
						if(num12==1){
							System.out.println("		Location : Airport - Dakshinkhan Rd, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Quality : 3 Start");
							}
						else if(num12==2){
							System.out.println("		Location : Plot 1B, Rd No 1, Dhaka 1230");
							System.out.println("		Rating : 8.7/10");
							System.out.println("		Quality : 5 Start");
							}
						else if(num12==3){
							System.out.println("		Location : 205/5 Al-Bashir Plaza Box Culvert Road, Fakirapool, Dhaka 1000");
							System.out.println("		Rating : 8.9/10");
							System.out.println("		Quality : 3 Start");
							}
						else if(num12==4){
							System.out.println("		Location : House# 14, Road# 5/A, UTTARA Sector# 11 Dhaka, 1230");
							System.out.println("		Rating : 8.5/10");
							System.out.println("		Quality : 3 Start");
							}
						else if(num12==5){
							System.out.println("		Location : Taher Plaza, Shahid Latif Road Near Kosai Badi Rail Gate, Dhaka 1230");
							System.out.println("		Rating : 9.1/10");
							System.out.println("		Quality : 5 Start");
							}
						}
					}
					
					cls(); //<-------------------------------
					if(num1==12){
						System.out.println("		Local Transport Services");
						System.out.println("		Uber");
						System.out.println("		Pathao");
						System.out.println("		Obhai");
						System.out.println("		Anik Bus");
						System.out.println("		Winer");
						
						
						System.out.println("		Press 1 for Uber");
						System.out.println("		Press 2 for Pathao");
						System.out.println("		Press 3 for Obhai");
						System.out.println("		Press 4 for Anik Bus");
						System.out.println("		Press 5 for Winer");
						
						
						int num13 = 1;
						while(num13>0){
						System.out.print("\n		Enter number to check = ");
						int i13 = input.nextInt();
						num13=i13;
						cls(); //<-------------------------------
						if(num13==1){
							System.out.println("		Type : Car,Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : Yes");
							}
						else if(num13==2){
							System.out.println("		Type : Car,Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : Yes");
							}
						else if(num13==3){
								System.out.println("		Type : Bike");
							System.out.println("		Service : Whole City");
							System.out.println("		AC Facility : No");
							}
						else if(num13==4){
								System.out.println("		Type : Bus");
							System.out.println("		Service : From Azimpur to Tongi Hossain Market");
							System.out.println("		AC Facility : No");
							}
						else if(num13==5){
								System.out.println("		Type : Car,Bike");
							System.out.println("		Service : From Azimpur to Kuril Biswaroad");
							System.out.println("		AC Facility : No");;
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==13){
						System.out.println("		External Transport(Road) Services");
						System.out.println("		Ena");
						System.out.println("		Hanif");
						System.out.println("		Golden Line");
						System.out.println("		Desh Travels");
						System.out.println("		Shohag");
						
						
						System.out.println("		Press 1 for Ena");
						System.out.println("		Press 2 for Hanif");
						System.out.println("		Press 3 for Golden Line");
						System.out.println("		Press 4 for Desh Travels");
						System.out.println("		Press 5 for Shohag");
						
						
						int num14 = 1;
						while(num14>0){
						System.out.print("\n		Enter number to check = ");
						int i14 = input.nextInt();
						num14=i14;
						cls(); //<-------------------------------
						if(num14==1){
							System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==2){
							System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==3){
								System.out.println("		Type : Business Class");
							System.out.println("S		ervice : Whole Country");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==4){
								System.out.println("		Type : Business Class");
							System.out.println("		Service : Dhaka to Kolkata");
							System.out.println("		AC Facility : Yes");
							}
						else if(num14==5){
								System.out.println("		Type : Business Class");
							System.out.println("		Service : Whole Country");
							System.out.println("		AC Facility : Yes");;
							}
						}
					}
					
					
					cls(); //<-------------------------------
					if(num1==14){
						System.out.println("		External Transport(Rail) Services");
						System.out.println("		Shonar Bangla Express");
						System.out.println("		Shuborno Express");
						System.out.println("		Tista Express");
						System.out.println("		Godholi Express");
						System.out.println("		Dhaka Mail");
						
						
						System.out.println("		Press 1 for Shonar Bangla Express");
						System.out.println("		Press 2 for Shuborno Express");
						System.out.println("		Press 3 for Tista Express");
						System.out.println("		Press 4 for Godholi Express");
						System.out.println("		Press 5 for Dhaka Mail");
						
						
						int num15 = 1;
						while(num15>0){
						System.out.print("\n		Enter number to check = ");
						int i15 = input.nextInt();
						num15=i15;
						cls(); //<-------------------------------
						if(num15==1){
							System.out.println("		Destination : Dhaka to Chittagong");
							System.out.println("		Time : 9am");
							System.out.println("		AC Facility : No");
							}
						else if(num15==2){
							System.out.println("		Destination : Dhaka to Chittagong");
							System.out.println("		Time : 10am");
							System.out.println("		AC Facility : Yes");
							}
						else if(num15==3){
								System.out.println("		Destination : Dhaka to Mymensingh");
							System.out.println("		Time : 1pm");
							System.out.println("		AC Facility : Yes");
							}
						else if(num15==4){
								System.out.println("		Destination : Dhaka to Jessore");
							System.out.println("		Time : 7pm");
							System.out.println("		AC Facility : No");
							}
						else if(num15==5){
								System.out.println("		Destination : Inside Dhaka");
							System.out.println("		Time : 10pm");
							System.out.println("		AC Facility : No");;
							}
						}
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
			
			
			
				}








			
			}
				
			
			
			
			
			
			
			
			
			
			
			
		}
	}
		}	
}}
	

