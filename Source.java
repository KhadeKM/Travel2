package tour_details;

import java.util.Scanner;


public class Source extends ATravel implements IPayment
{ 
	int days,nights;
	
	/*
*/
	Source(int days,int nights)
	{
		this.days=days;
		this.nights=nights;
}
	
	Source()
	{
		super();
	}
		
	public void cost_count() 
	{
		// TODO Auto-generated method stub
		int total_cost=5000*days+3000*nights;
		System.out.println(total_cost);
		
	}


	@Override
	public void source1()
	{
		System.out.println("enter source");
		Scanner s=new Scanner(System.in);
		String src=s.next();
		//System.out.println(src);
	}


	
	public void destination1() 
	{
		System.out.println("enter destination");
		Scanner se=new Scanner(System.in);
		String des=se.next();
		//System.out.println("destination is="+des);
		
	}
	public void cost_count1(int days, int nights) 
	{
		
		this.days=days;
		this.nights=nights;
		int total_cost12=5000*days+3000*nights;
		System.out.println("cost will be :"+total_cost12);
	}
	
	
		
		
}
		
	

