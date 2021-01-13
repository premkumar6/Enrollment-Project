package school;
import java.util.*;
import java.io.*;

public class Details {
	public String fname;
	public String lname;
	public String father;
	public String mother;
	public int sem;
	public double fees;
	public String dob;
	public String courses;
	public int branch;
	public String branchname;
	public double percent;
	public double scholarship;
	public String usn;
	//public int count;
	public String mobile;
	
	void input()
	{
		Scanner in= new Scanner (System.in);

		System.out.print("Enter your first name: ");
		this.fname= in.next();
		System.out.print("Enter your last name: ");
		this.lname= in.next();
		
        if(this.sem==1)
        	fresher();
        else
        	senior();		
	}
	
	void setbranch()
	{
		if(branch==1)
		  branchname="Information Science";	
		else if(branch==2)
		  branchname="Electronics and Communication";	
		else if(branch==3)
		  branchname="Mechanical Engineering";	
		else
			branchname="Invalid";	
	}
	
	void fresher()
	{
		Scanner in= new Scanner (System.in);
		System.out.println("\nWelcome to BMSCE college\n");
		System.out.println("\nEnter the Branch you want to enroll to:");
		System.out.println("1:Information Science\n2:Electronics and Communication\n3:Mechanical Engineering");
		System.out.print("\nYour choice: ");
		this.branch= in.nextInt();
		setbranch();
		newcourses(branch);
		System.out.print("\nEnter your total percentage of 2nd PU: ");
		percent= in.nextDouble();
		scholarship= scholarshipcalc(percent);
		System.out.print("\nEnter your father's name: ");
		father= in.next();
		System.out.print("Enter your mother's name: "); 
		mother= in.next();
		System.out.print("Enter Date of birth: ");
		dob= in.next();
		System.out.print("\nEnter your contact number: ");
		mobile= in.next();
		fees=75000-scholarship;
		System.out.println("FEES TO BE PAID: "+fees);
		getusn();
		System.out.println("Your new USN created is: " +usn);
		
	}
	
	void getusn()
	{
		String bran;
		
		doMethod();
		int counter =getCount();
		if(branch==1)
			bran="IS";
		else if(branch==2)
			bran="EC";
		else if(branch==3)
			bran="ME";
		else
			bran="--";
		
		usn= "1BM20"+bran+"0"+counter;
	}
	

	public int getCount() {

        int count = 0 ;
        try {
            
                BufferedReader br = new BufferedReader(new FileReader(new File("d:\\myCount.txt")));
                String s = br.readLine();
                count = Integer.parseInt(s);
                br.close();
                        
        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public void putCount(int count)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:\\myCount.txt")));
            bw.write(Integer.toString(count));
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void doMethod() { 
        int count = getCount();            
        count++;
        putCount(count);            
    }

	
	void newcourses(int b)
	{
		System.out.println("\nYour courses for this semester are:");
		
		switch(b)
		{
		case 1: courses= "1.C programming\n2.Data Structures\n3.Operating Systems\n4.Linear Algebra-1";
			       System.out.println(courses);
		            break;
		case 2: courses= "1.Field theory\n2.Control systems\n3.Network Analysis\n4.Discrete Mathematics-1";
		          System.out.println(courses);
		          break;
		case 3: courses="1.Thermodynamics\n2.Fluid Mechanics\n3.Machine tools and operations\n4.Advanced Mathematics-1"; 
		          System.out.println(courses);
		          break;
		default: System.out.println("Please enter a valid branch number: ");
		          break;
		}
	}
	
	void senior()
	{
		Scanner in= new Scanner (System.in);

		System.out.println("\nEnter the Branch you are in:");
		System.out.println("1:Information Science\n2:Electronics and Communication\n3:Mechanical Engineering");
		System.out.print("\nYour choice: ");
		this.branch= in.nextInt();
		setbranch();
		oldcourses(branch, sem);
		System.out.println("Enter your USN");
		usn= in.next();
		System.out.println("\nEnter your total percentage in previous semester");
		percent= in.nextDouble();
		scholarship= scholarshipcalc(percent);
		System.out.print("\nEnter your father's name:");
		father= in.next();
		System.out.print("Enter your mother's name:"); 
		mother= in.next();
		System.out.print("Enter Date of birth:");
		dob= in.next();
		System.out.print("\nEnter your contact number: ");
		mobile= in.next();
		fees=40000-scholarship;
		System.out.println("FEES TO BE PAID: "+fees);
		
		
	}
	
	
	void oldcourses(int b, int s)
	{
	  switch(s)
	  {
		case 3: 
			{
				switch(b)
				{
				case 1: courses="1.Java Programming\n2.Database Management Systems\n3.Unix OS\n4.Linear Algebra-3";
			 	        System.out.println(courses);
			 	        break;
				case 2: courses="1.Optical communication\n2.Circuit Analysis\n3.Electromagnetism\n4.Discrete Mathematics-3";
	 	                System.out.println(courses);
	 	                 break;
				case 3: courses="1.Intermediate Dynamics\n2.CAED\n3.Mechanics of materials\n4.Advanced Mathematics-3";
	                    System.out.println(courses);
	                    break;
				}
				break;
			}	
		case 5: 
		   {
			   switch(b)
				{
				case 1: courses="1.Python Programming\n2.Machine Learning\n3.Microprocessors\n4.Cryptography";
			 	        System.out.println(courses);
			 	        break;
				case 2: courses="1.Microwaves and Radar Energy\n2.Microcontrollers\n3.Integrated Circuits\n4.Wireless communication";
	 	                System.out.println(courses);
	 	                 break;
				case 3: courses="1.Metrology & Instrumentation\n2.Manufacturing Technology\n3.CAED-2\n4.Statics";
	                    System.out.println(courses);
	                    break;
		       }
			   break;
		
		   }
		case 7:
		   {
			   switch(b)
				{
				case 1: courses="1.Project Work\n2.Technical Seminar\n3.Ethical Hacking\n4.Artificial Intelligence";
			 	        System.out.println(courses);
			 	        break;
				case 2: courses="1.Project Work\n2.Technical Seminar\n3.Quantum Science\n4.Nanophotonics";
	 	                System.out.println(courses);
	 	                 break;
				case 3: courses="1.Project Work\n2.Technical Seminar\n3.Industrial Engineering\n4.Mechatronics";
	                    System.out.println(courses);
	                    break;
		         }
			   break;
	       }
	   }//close of outer switch
	  
   }	//close of old courses
	
	
	double scholarshipcalc(double p)
	{
		if(p>=90 && p<=100)
		{
			System.out.println("Congraulations you've recieved scholarship of Rs.15,000");
			return 15000.00;
		}
		else if(p>=85 && p<90)
		{
			System.out.println("Congraulations you've recieved scholarship of Rs.10,000");
			return 10000.00;
		}
		else if(p>80 && p<85)
		{
			System.out.println("Congraulations you've recieved scholarship of Rs.8,000");
			return 8000.00;
		}
		else if(p>=77 && p<=80)
		{
			System.out.println("Congraulations you've recieved scholarship of Rs.5,000");
			return 5000.00;
		}
		else
		{ 
			System.out.println("Sorry, you are not eligible for scholarship");
			return 0;
		}
    }
			
	
 }	//close of class

	
	


