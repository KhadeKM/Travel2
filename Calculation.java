package tour_details;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) 
	{
		System.out.println("choose an option");
		System.out.println("1 calculate cost from source to destination");
		System.out.println("2 more travel options");
		
		
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		switch(i){
		
		case 1:
			System.out.println("calculate cost via train as per source and destination");
			
			//int days,nights;
			Source srcobj=new Source();
			srcobj.source1();
			srcobj.destination1();
			
			
			System.out.println("enter number of days and nights");
			int days=scan.nextInt();
			int nights=scan.nextInt();
			srcobj.cost_count1(days,nights);
			
			break;
		case 2:
			System.out.println("more options are available");
			Categories c=new Categories();
			c.choose_category();

		}
		
		
		
		/*int choice=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Choose Category :");
			System.out.println("Select mode of payment");
			System.out.println("Enter your ");
			
		}while(choice!=0;);
		*/
		
	
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of days and nights");
		
		int days= sc.nextInt();
		int nights=sc.nextInt();
		Source s1=new Source(days,nights);
		s1.cost_count();*/
		
		
	}
	
	
	
}
