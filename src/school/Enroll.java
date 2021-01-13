package school;
import java.util.*;

public class Enroll 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		Details d1 = new Details();
		System.out.println("WELCOME TO COURSE ENROLLMENT PORTAL, BMSCE");
		do 
		{
			System.out.println("Enter the semester you belong to:");
			System.out.println("I / III / V / VI ");
			d1.sem= s.nextInt();
			
		}while(d1.sem!=1 && d1.sem!=3 && d1.sem!=5 && d1.sem!=7);

		Demo1 form1= new Demo1(d1);
		
	}
}
	
	
	