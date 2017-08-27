package tour_details;

import java.util.Scanner;

public abstract class ATravel
{
	
	int days,nights;
	public int cost_count(int days,int nights)
	{
		
		this.days=days;
		this.nights=nights;
		
	int total_cost=5000*days+3000*nights;
	System.out.println(total_cost);
	return total_cost;

	}
	
	public int discount1(){
		
		int total_cost=5000*days+3000*nights;
		int dict_price=total_cost-(total_cost*10/100);
		System.out.println(dict_price);
		return dict_price;
		
		
	}
	public void discount2(){
		int total_cost=5000*days+3000*nights;
	int dict_price1=total_cost-(total_cost*15/100);
	System.out.println(dict_price1);
	   // return dict_price1;
	}
	
	public void discount3(){
		System.out.println("you will get 2 free bus tickets within city");
		
	}
	
	public void cash(int days,int nights)
	{
		
		
		this.days=days;
	this.nights=nights;
		int total_cost1=5000*days+3000*nights;
		int dict_price2=total_cost1-(total_cost1*20/100);
		System.out.println(dict_price2);
		//return dict_price2;
		
	
	}
	public void EMI(int days,int nights)
	{
		this.days=days;
		this.nights=nights;
		
		int total_cost3=5000*days+3000*nights;
		int dict_price2=total_cost3-(total_cost3*10/100);
		
		int monthly_emi=dict_price2/12;
		System.out.println(monthly_emi);
		
		
	}
	
	
	public void cheque(int days,int nights){
		this.days=days;
		this.nights=nights;
		System.out.println("enter cheque number");
		Scanner sc1=new Scanner(System.in);
		int name=sc1.nextInt();
		
		System.out.println("enter name on cheque");
		String name1=sc1.next();
		
		
		
	}
	public void netbanking(int days,int nights){
		this.days=days;
		this.nights=nights;
		Scanner sc2=new Scanner(System.in);
		String username=sc2.next();
		String password=sc2.next();
		
		
		
	}
	
	
	
}