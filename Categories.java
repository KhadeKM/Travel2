package tour_details;

import java.util.Scanner;

public class Categories extends ATravel //implements Payment
{
	
	Scanner sc=new Scanner(System.in);
	
	
	public void choose_category()

	{
		System.out.println("choose tour category");
		System.out.println("historical");
		System.out.println("hill station");
		System.out.println("jungle");
		System.out.println("amusement park");
		System.out.println("natural beauty");
		//Scanner sc=new Scanner(System.in);
		String i=sc.next();
		switch(i)
		{
			case "historical":
				System.out.println("try these historical places");
				System.out.println("Udaipur");
				System.out.println("Jaipur");
				System.out.println("Tajmahal");
				System.out.println("QutubMinar");
				String j;
				//Scanner sc1=new Scanner(System.in);
				j=sc.next();
				switch(j)
				{
				case "Udaipur":
				System.out.println("enter the days and nights to get the total cost");
				days=sc.nextInt();
					nights=sc.nextInt();
				ATravel t=new Categories();
			t.cost_count(days, nights);
			System.out.println("view offers on train,flights and bus");
			System.out.println("train");
			System.out.println("flight");
			System.out.println("bus");
				
		    String a=sc.next();
			switch(a)
			{
			case "train":
				System.out.println("you will get 10% discout within state");
				t.discount1();
				break;
			case "flight":
				System.out.println("you will get 15% discount on international trips in SAARC countries");
				t.discount2();
				break;
			case "bus":
				//System.out.println("you will get 2 free bus tickets within city");
				t.discount3();
			}
				
				System.out.println("choose payment method");
				System.out.println("cash");
				System.out.println("EMI");
				System.out.println("netbanking");
				System.out.println("cheque");
				
				String s=sc.next();
				switch(s){
				case "cash":
					System.out.println("you will get extra 10 % discount");
					ATravel tl=new Categories();
					tl.cash(days,nights);
					System.out.println("tour has been booked");
					break;
				
				
				case "EMI":
				
					System.out.println("your monthly emi for 1 year is=");
					ATravel tll=new Categories();
					//int days=sc.nextInt();
					tll.EMI(days,nights);
					System.out.println("tour has been booked");
					break;
					
					
				case "cheque":
					
					ATravel chequeobj=new Categories();
					chequeobj.cheque(days,nights);
					System.out.println("tour has been booked");
					break;
					
				case "netbanking":
					System.out.println("enter user name and password");
					ATravel t113=new Categories();
					t113.netbanking(days, nights);
					System.out.println("tour has been booked");
					
					
					
					
					
				}
					
						
						
						
					
					
				
				
				
				
				
			
			
				
				
				break;
			
		
			
			
			//break;
				case "Jaipur":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel t1=new Categories();
				t1.cost_count(days, nights);
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a1=sc.next();
				switch(a1)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					t1.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					t1.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					t1.discount3();
				}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String stn=sc.next();
					switch(stn){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
						
					}
					
		
		
				break;
				
				case "Tajmahal":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel t2=new Categories();
				t2.cost_count(days, nights);
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a2=sc.next();
				switch(a2)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					t2.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					t2.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					t2.discount3();
				}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String str=sc.next();
					switch(str){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
						
					}
				
				break;
				
				case "QutubMinar":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel t3=new Categories();
				t3.cost_count(days, nights);
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a3=sc.next();
				switch(a3)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					t3.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					t3.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					t3.discount3();
				}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String str1=sc.next();
					switch(str1){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
						
					}
					
				
				//break;
				
				
				
				}
					
			break;
				
			case "Hillstation":
				
				
						System.out.println("try these hill stations places");
						System.out.println("ooty");
						System.out.println("mahabaleshawar");
						System.out.println("lonavla");
						System.out.println("matheran");
						String k;
						//Scanner sc1=new Scanner(System.in);
						k=sc.next();
						switch(k)
						{
						case "ooty":
						System.out.println("enter the days and nights to get the total cost");
							
							days=sc.nextInt();
							nights=sc.nextInt();
						ATravel tr=new Categories();
					tr.cost_count(days, nights);
					System.out.println("view offers on train,flights and bus");
					System.out.println("train");
					System.out.println("flight");
					System.out.println("bus");
				    String a4=sc.next();
					switch(a4)
					{
					case "train":
						System.out.println("you will get 10% discout within state");
						tr.discount1();
						break;
					case "flight":
						System.out.println("you will get 15% discount on international trips in SAARC countries");
						tr.discount2();
						break;
					case "bus":
						//System.out.println("you will get 2 free bus tickets within city");
						tr.discount3();
					}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String str4=sc.next();
					switch(str4){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
						
					}
					break;
						case "mahabaleshwar":
							System.out.println("enter the days and nights to get the total cost");
								
								days=sc.nextInt();
								nights=sc.nextInt();
							ATravel tr1=new Categories();
						tr1.cost_count(days, nights);
						System.out.println("view offers on train,flights and bus");
						System.out.println("train");
						System.out.println("flight");
						System.out.println("bus");
					    String a5=sc.next();
						switch(a5)
						{
						case "train":
							System.out.println("you will get 10% discout within state");
							tr1.discount1();
							break;
						case "flight":
							System.out.println("you will get 15% discount on international trips in SAARC countries");
							tr1.discount2();
							break;
						case "bus":
							//System.out.println("you will get 2 free bus tickets within city");
							tr1.discount3();
						}
						
						System.out.println("choose payment method");
						System.out.println("cash");
						System.out.println("EMI");
						System.out.println("netbanking");
						System.out.println("cheque");
						
						String str41=sc.next();
						switch(str41){
						case "cash":
							System.out.println("you will get extra 10 % discount");
							ATravel tl=new Categories();
							tl.cash(days,nights);
							System.out.println("tour has been booked");
							break;
						
						
						case "EMI":
						
							System.out.println("your monthly emi for 1 year is=");
							ATravel tll=new Categories();
							//int days=sc.nextInt();
							tll.EMI(days,nights);
							System.out.println("tour has been booked");
							break;
							
							
						case "cheque":
							
							ATravel chequeobj=new Categories();
							chequeobj.cheque(days,nights);
							System.out.println("tour has been booked");
							break;
							
						case "netbanking":
							System.out.println("enter user name and password");
							ATravel t113=new Categories();
							t113.netbanking(days, nights);
							System.out.println("tour has been booked");
							
							
							
							
							
						}
					
						break;
						
						case "lonavla":
							System.out.println("enter the days and nights to get the total cost");
								
								days=sc.nextInt();
								nights=sc.nextInt();
							ATravel tr2=new Categories();
						tr2.cost_count(days, nights);
						System.out.println("view offers on train,flights and bus");
						System.out.println("train");
						System.out.println("flight");
						System.out.println("bus");
					    String a6=sc.next();
						switch(a6)
						{
						case "train":
							System.out.println("you will get 10% discout within state");
							tr2.discount1();
							break;
						case "flight":
							System.out.println("you will get 15% discount on international trips in SAARC countries");
							tr2.discount2();
							break;
						case "bus":
							//System.out.println("you will get 2 free bus tickets within city");
							tr2.discount3();
						}
							System.out.println("choose payment method");
							System.out.println("cash");
							System.out.println("EMI");
							System.out.println("netbanking");
							System.out.println("cheque");
							
							String str45=sc.next();
							switch(str45){
							case "cash":
								System.out.println("you will get extra 10 % discount");
								ATravel tl=new Categories();
								tl.cash(days,nights);
								System.out.println("tour has been booked");
								break;
							
							
							case "EMI":
							
								System.out.println("your monthly emi for 1 year is=");
								ATravel tll=new Categories();
								//int days=sc.nextInt();
								tll.EMI(days,nights);
								System.out.println("tour has been booked");
								break;
								
								
							case "cheque":
								
								ATravel chequeobj=new Categories();
								chequeobj.cheque(days,nights);
								System.out.println("tour has been booked");
								break;
								
							case "netbanking":
								System.out.println("enter user name and password");
								ATravel t113=new Categories();
								t113.netbanking(days, nights);
								System.out.println("tour has been booked");
								
								
								
								
								
							}
						
						break;
						
						case "matheran":
							System.out.println("enter the days and nights to get the total cost");
								
								days=sc.nextInt();
								nights=sc.nextInt();
							ATravel tr3=new Categories();
						tr3.cost_count(days, nights);
						System.out.println("view offers on train,flights and bus");
						System.out.println("train");
						System.out.println("flight");
						System.out.println("bus");
					    String a7=sc.next();
						switch(a7)
						{
						case "train":
							System.out.println("you will get 10% discout within state");
							tr3.discount1();
							break;
						case "flight":
							System.out.println("you will get 15% discount on international trips in SAARC countries");
							tr3.discount2();
							break;
						case "bus":
							//System.out.println("you will get 2 free bus tickets within city");
							tr3.discount3();
							
						}
							System.out.println("choose payment method");
							System.out.println("cash");
							System.out.println("EMI");
							System.out.println("netbanking");
							System.out.println("cheque");
							
							String str5=sc.next();
							switch(str5){
							case "cash":
								System.out.println("you will get extra 10 % discount");
								ATravel tl=new Categories();
								tl.cash(days,nights);
								System.out.println("tour has been booked");
								break;
							
							
							case "EMI":
							
								System.out.println("your monthly emi for 1 year is=");
								ATravel tll=new Categories();
								//int days=sc.nextInt();
								tll.EMI(days,nights);
								System.out.println("tour has been booked");
								break;
								
								
							case "cheque":
								
								ATravel chequeobj=new Categories();
								chequeobj.cheque(days,nights);
								System.out.println("tour has been booked");
								break;
								
							case "netbanking":
								System.out.println("enter user name and password");
								ATravel t113=new Categories();
								t113.netbanking(days, nights);
								System.out.println("tour has been booked");
								
								
								
								
								
							}
					//	break;
						
						}			
						
				
				break;
			
				case "jungle":
					System.out.println("try these jungle places");
					System.out.println("sundarbans");
					System.out.println("bandhavgad");
					System.out.println("kanha national");
					
					String l;
					//Scanner sc1=new Scanner(System.in);
					l=sc.next();
					switch(l)
					{
					case "sundarbans":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel tr4=new Categories();
				tr4.cost_count(days, nights);
				
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a8=sc.next();
				switch(a8)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					tr4.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					tr4.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					tr4.discount3();
				}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String str6=sc.next();
					switch(str6){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
				
					
				}
				break;
					case "bandhavgad":
						System.out.println("enter the days and nights to get the total cost");
							
							days=sc.nextInt();
							nights=sc.nextInt();
						ATravel tr5=new Categories();
					tr5.cost_count(days, nights);
					System.out.println("view offers on train,flights and bus");
					System.out.println("train");
					System.out.println("flight");
					System.out.println("bus");
				    String a9=sc.next();
					switch(a9)
					{
					case "train":
						System.out.println("you will get 10% discout within state");
						tr5.discount1();
						break;
					case "flight":
						System.out.println("you will get 15% discount on international trips in SAARC countries");
						tr5.discount2();
						break;
					case "bus":
						//System.out.println("you will get 2 free bus tickets within city");
						tr5.discount3();
					}
						System.out.println("choose payment method");
						System.out.println("cash");
						System.out.println("EMI");
						System.out.println("netbanking");
						System.out.println("cheque");
						
						String str7=sc.next();
						switch(str7){
						case "cash":
							System.out.println("you will get extra 10 % discount");
							ATravel tl=new Categories();
							tl.cash(days,nights);
							System.out.println("tour has been booked");
							break;
						
						
						case "EMI":
						
							System.out.println("your monthly emi for 1 year is=");
							ATravel tll=new Categories();
							//int days=sc.nextInt();
							tll.EMI(days,nights);
							System.out.println("tour has been booked");
							break;
							
							
						case "cheque":
							
							ATravel chequeobj=new Categories();
							chequeobj.cheque(days,nights);
							System.out.println("tour has been booked");
							break;
							
						case "netbanking":
							System.out.println("enter user name and password");
							ATravel t113=new Categories();
							t113.netbanking(days, nights);
							System.out.println("tour has been booked");
							
							
							
							
							
						
					
					
					}
					
					break;
					case "kanha national":
						System.out.println("enter the days and nights to get the total cost");
							
							days=sc.nextInt();
							nights=sc.nextInt();
						ATravel tra2=new Categories();
					tra2.cost_count(days, nights);
					System.out.println("view offers on train,flights and bus");
					System.out.println("train");
					System.out.println("flight");
					System.out.println("bus");
				    String a0=sc.next();
					switch(a0)
					{
					case "train":
						System.out.println("you will get 10% discout within state");
						tra2.discount1();
						break;
					case "flight":
						System.out.println("you will get 15% discount on international trips in SAARC countries");
						tra2.discount2();
						break;
					case "bus":
						//System.out.println("you will get 2 free bus tickets within city");
						tra2.discount3();
						
					}
						System.out.println("choose payment method");
						System.out.println("cash");
						System.out.println("EMI");
						System.out.println("netbanking");
						System.out.println("cheque");
						
						String str8=sc.next();
						switch(str8){
						case "cash":
							System.out.println("you will get extra 10 % discount");
							ATravel tl=new Categories();
							tl.cash(days,nights);
							System.out.println("tour has been booked");
							break;
						
						
						case "EMI":
						
							System.out.println("your monthly emi for 1 year is=");
							ATravel tll=new Categories();
							//int days=sc.nextInt();
							tll.EMI(days,nights);
							System.out.println("tour has been booked");
							break;
							
							
						case "cheque":
							
							ATravel chequeobj=new Categories();
							chequeobj.cheque(days,nights);
							System.out.println("tour has been booked");
							break;
							
						case "netbanking":
							System.out.println("enter user name and password");
							ATravel t113=new Categories();
							t113.netbanking(days, nights);
							System.out.println("tour has been booked");
							
							
							
							
							
						}
					}
					//break;
			
					
				break;
				
				case "amusementpark":
					
					System.out.println("try these amusements");
				System.out.println("imagica");
				System.out.println("excelworld");
				
				
				String m;
				//Scanner sc1=new Scanner(System.in);
				m=sc.next();
				switch(m)
				{
				case "imagica":
				System.out.println("enter the days and nights to get the total cost");
					
					days=sc.nextInt();
					nights=sc.nextInt();
				ATravel tra3=new Categories();
			tra3.cost_count(days, nights);
			
			System.out.println("view offers on train,flights and bus");
			System.out.println("train");
			System.out.println("flight");
			System.out.println("bus");
		    String a02=sc.next();
			switch(a02)
			{
			case "train":
				System.out.println("you will get 10% discout within state");
				tra3.discount1();
				break;
			case "flight":
				System.out.println("you will get 15% discount on international trips in SAARC countries");
				tra3.discount2();
				break;
			case "bus":
				//System.out.println("you will get 2 free bus tickets within city");
				tra3.discount3();
			}
				System.out.println("choose payment method");
				System.out.println("cash");
				System.out.println("EMI");
				System.out.println("netbanking");
				System.out.println("cheque");
				
				String str9=sc.next();
				switch(str9){
				case "cash":
					System.out.println("you will get extra 10 % discount");
					ATravel tl=new Categories();
					tl.cash(days,nights);
					System.out.println("tour has been booked");
					break;
				
				
				case "EMI":
				
					System.out.println("your monthly emi for 1 year is=");
					ATravel tll=new Categories();
					//int days=sc.nextInt();
					tll.EMI(days,nights);
					System.out.println("tour has been booked");
					break;
					
					
				case "cheque":
					
					ATravel chequeobj=new Categories();
					chequeobj.cheque(days,nights);
					System.out.println("tour has been booked");
					break;
					
				case "netbanking":
					System.out.println("enter user name and password");
					ATravel t113=new Categories();
					t113.netbanking(days, nights);
					System.out.println("tour has been booked");
					
					
					
					
					
				
			
			}
			break;
				case "excelworld":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel tra4=new Categories();
				tra4.cost_count(days, nights);
				
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a01=sc.next();
				switch(a01)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					tra4.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					tra4.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					tra4.discount3();
				}
					System.out.println("choose payment method");
					System.out.println("cash");
					System.out.println("EMI");
					System.out.println("netbanking");
					System.out.println("cheque");
					
					String str0=sc.next();
					switch(str0){
					case "cash":
						System.out.println("you will get extra 10 % discount");
						ATravel tl=new Categories();
						tl.cash(days,nights);
						System.out.println("tour has been booked");
						break;
					
					
					case "EMI":
					
						System.out.println("your monthly emi for 1 year is=");
						ATravel tll=new Categories();
						//int days=sc.nextInt();
						tll.EMI(days,nights);
						System.out.println("tour has been booked");
						break;
						
						
					case "cheque":
						
						ATravel chequeobj=new Categories();
						chequeobj.cheque(days,nights);
						System.out.println("tour has been booked");
						break;
						
					case "netbanking":
						System.out.println("enter user name and password");
						ATravel t113=new Categories();
						t113.netbanking(days, nights);
						System.out.println("tour has been booked");
						
						
						
						
						
					}
				}
				
				break;
				
				
				
				
				case "naturalbeauty":
					System.out.println("try these natural beauties");
					System.out.println("manali");
					System.out.println("kashmir");
					System.out.println("shimla");
					
					String n;
					//Scanner sc1=new Scanner(System.in);
					n=sc.next();
					switch(n)
					{
					case "manali":
					System.out.println("enter the days and nights to get the total cost");
						
						days=sc.nextInt();
						nights=sc.nextInt();
					ATravel trav=new Categories();
				trav.cost_count(days, nights);
				
				System.out.println("view offers on train,flights and bus");
				System.out.println("train");
				System.out.println("flight");
				System.out.println("bus");
			    String a03=sc.next();
				switch(a03)
				{
				case "train":
					System.out.println("you will get 10% discout within state");
					trav.discount1();
					break;
				case "flight":
					System.out.println("you will get 15% discount on international trips in SAARC countries");
					trav.discount2();
					break;
				case "bus":
					//System.out.println("you will get 2 free bus tickets within city");
					trav.discount3();
				}
				System.out.println("choose payment method");
				System.out.println("cash");
				System.out.println("EMI");
				System.out.println("netbanking");
				System.out.println("cheque");
				
				String strn=sc.next();
				switch(strn){
				case "cash":
					System.out.println("you will get extra 10 % discount");
					ATravel tl=new Categories();
					tl.cash(days,nights);
					System.out.println("tour has been booked");
					break;
				
				
				case "EMI":
				
					System.out.println("your monthly emi for 1 year is=");
					ATravel tll=new Categories();
					//int days=sc.nextInt();
					tll.EMI(days,nights);
					System.out.println("tour has been booked");
					break;
					
					
				case "cheque":
					
					ATravel chequeobj=new Categories();
					chequeobj.cheque(days,nights);
					System.out.println("tour has been booked");
					break;
					
				case "netbanking":
					System.out.println("enter user name and password");
					ATravel t113=new Categories();
					t113.netbanking(days, nights);
					System.out.println("tour has been booked");
					
					
					
					
					
				}
				break;
					case "kashmir":
						System.out.println("enter the days and nights to get the total cost");
							
							days=sc.nextInt();
							nights=sc.nextInt();
						ATravel trav1=new Categories();
					trav1.cost_count(days, nights);
					System.out.println("view offers on train,flights and bus");
					System.out.println("train");
					System.out.println("flight");
					System.out.println("bus");
				    String a04=sc.next();
					switch(a04)
					{
					case "train":
						System.out.println("you will get 10% discout within state");
						trav1.discount1();
						break;
					case "flight":
						System.out.println("you will get 15% discount on international trips in SAARC countries");
						trav1.discount2();
						break;
					case "bus":
						//System.out.println("you will get 2 free bus tickets within city");
						trav1.discount3();
					}
						System.out.println("choose payment method");
						System.out.println("cash");
						System.out.println("EMI");
						System.out.println("netbanking");
						System.out.println("cheque");
						
						String strng=sc.next();
						switch(strng){
						case "cash":
							System.out.println("you will get extra 10 % discount");
							ATravel tl=new Categories();
							tl.cash(days,nights);
							System.out.println("tour has been booked");
							break;
						
						
						case "EMI":
						
							System.out.println("your monthly emi for 1 year is=");
							ATravel tll=new Categories();
							//int days=sc.nextInt();
							tll.EMI(days,nights);
							System.out.println("tour has been booked");
							break;
							
							
						case "cheque":
							
							ATravel chequeobj=new Categories();
							chequeobj.cheque(days,nights);
							System.out.println("tour has been booked");
							break;
							
						case "netbanking":
							System.out.println("enter user name and password");
							ATravel t113=new Categories();
							t113.netbanking(days, nights);
							System.out.println("tour has been booked");
							
							
							
							
							
						}
					}
					break;
					case "shimla":
						System.out.println("enter the days and nights to get the total cost");
							
							days=sc.nextInt();
							nights=sc.nextInt();
						ATravel trav2=new Categories();
					trav2.cost_count(days, nights);
					System.out.println("view offers on train,flights and bus");
					System.out.println("train");
					System.out.println("flight");
					System.out.println("bus");
				    String a05=sc.next();
					switch(a05)
					{
					case "train":
						System.out.println("you will get 10% discout within state");
						trav2.discount1();
						break;
					case "flight":
						System.out.println("you will get 15% discount on international trips in SAARC countries");
						trav2.discount2();
						break;
					case "bus":
						//System.out.println("you will get 2 free bus tickets within city");
						trav2.discount3();
					}
						System.out.println("choose payment method");
						System.out.println("cash");
						System.out.println("EMI");
						System.out.println("netbanking");
						System.out.println("cheque");
						
						String strng=sc.next();
						switch(strng){
						case "cash":
							System.out.println("you will get extra 10 % discount");
							ATravel tl=new Categories();
							tl.cash(days,nights);
							System.out.println("tour has been booked");
							break;
						
						
						case "EMI":
						
							System.out.println("your monthly emi for 1 year is=");
							ATravel tll=new Categories();
							//int days=sc.nextInt();
							tll.EMI(days,nights);
							System.out.println("tour has been booked");
							break;
							
							
						case "cheque":
							
							ATravel chequeobj=new Categories();
							chequeobj.cheque(days,nights);
							System.out.println("tour has been booked");
							break;
							
						case "netbanking":
							System.out.println("enter user name and password");
							ATravel t113=new Categories();
							t113.netbanking(days, nights);
							System.out.println("tour has been booked");
							
							
							
							
							
						}
					break;
					
					}
				}
				


	}
