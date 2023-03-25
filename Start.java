import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have selected option: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							fc.insertEmployee(e1);
							
							System.out.println("#####################");
							break;
							
							

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Employee ");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							fc.removeEmployee(fc.getEmployee(empId2));
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Employees ");
							
							fc.showAllEmployees();
							System.out.println("#####################");
							break;	
						
						case 4:
							
							System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = fc.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Salary: "+e4.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;
						
						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
				
				case 2:
				
					System.out.println("********************");
					System.out.println("Restaurant Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove an Existing Restaurant");
					System.out.println("3. Show All Restaurants");
					System.out.println("4. Search  A Restaurant");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							
							System.out.print("Enter Restaurant Name: ");
							String name1 = sc.next();
			
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
				
							fc.insertRestaurant(r1);
							
							System.out.println("#####################");
							break;	

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							
							fc.removeRestaurant(fc.getRestaurant(rid2));
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Restaurants");
							
							fc.showAllRestaurants();
							System.out.println("#####################");
							break;	
						
						case 4:
							
							System.out.println("#####################");
							System.out.println("Search a Restaurant ");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							
							Restaurant r4 = fc.getRestaurant(rid4);
							
							if(r4 !=null)
							{
								System.out.println("Restaurant ID: "+r4.getRid());
								System.out.println("Restaurant Name: "+r4.getName());
								r4.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							System.out.println("#####################");
							break;
						
						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					
				case 3:
				
					System.out.println("********************");
					System.out.println("Restaurant FoodItem Management");
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New FoodItem");
					System.out.println("2. Remove an Existing FoodItem");
					System.out.println("3. Show All FoodItems");
					System.out.println("4. Search a FoodItem");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Insert New FoodItem of a Restaurant\n");
							
							System.out.println("Which Type of FoodItem  Do you Want to Choose?");
							System.out.println("1. Main Dish");
							System.out.println("2. Appetiziers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem fi = null;
							
							if(type == 1)
							{
								System.out.print("Enter Food ID: ");
								String fid1 = sc.next();
								System.out.print("Enter Food Name: ");
								String name1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Food Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Category: ");
								String c1 = sc.next();
								
								MainDish md = new MainDish();
								
								md.setFid(fid1);
								md.setName(name1);
								md.setAvailableQuantity(aq1);
								md.setPrice(price1);
								md.setCategory(c1);
								
								fi = md;
							}
							else if(type == 2)
							{
								System.out.print("Enter Food ID: ");
								String fid1 = sc.next();
								System.out.print("Enter Food Name: ");
								String name1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Food Price: ");
								double price1 = sc.nextDouble();
								System.out.print("Enter Size: ");
								String s1 = sc.next();
								
								Appetizier a = new Appetizier();
								
								a.setFid(fid1);
								a.setName(name1);
								a.setAvailableQuantity(aq1);
								a.setPrice(price1);
								a.setSize(s1);
								
								fi = a;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else 
							{
								System.out.println("Invalid Type");
							}
							
							
							if(fi != null)
							{
								System.out.print("Enter Restaurant ID: ");
								String rid1 = sc.next();
								
								fc.getRestaurant(rid1).insertFoodItem(fi);
								
							}
							
							System.out.println("#####################");
							break;
							
						
						case 2:
						
							System.out.println("#####################");
							System.out.println("Remove an Existing Food Item of a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter Food Item ID: ");
							String fid2 = sc.next();
							fc.getRestaurant(rid2).removeFoodItem(fc.getRestaurant(rid2).getFoodItem(fid2));
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show All Food Item of a Restaurant");
							System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
							
							fc.getRestaurant(rid3).showAllFoodItems();
							
							System.out.println("#####################");
							break;
						
						case 4:
						
							System.out.println("#####################");
							System.out.println("Get A Food Item of a Restaurant");
							
							System.out.print("Enter Restaurant ID: ");
							String rid4 = sc.next();
							System.out.print("Enter Food Item ID: ");
							String fid4 = sc.next();
							
							FoodItem fii = fc.getRestaurant(rid4).getFoodItem(fid4);
							
							if(fii != null)
							{
								fii.showInfo();
							}
							System.out.println("#####################");
							break;
							
						
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
								
				case 4:
				
					System.out.println("********************");
					System.out.println("FoodItem Quantity Add-Sell");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add FoodItem ");
					System.out.println("2. Sell FoodItem ");
					System.out.println("3. Show Add Sell History ");
					System.out.println("4. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add FoodItem\n");
							
							System.out.print("Enter Restaurant ID: ");
							String rid1 = sc.next();
							System.out.print("Enter Food Item ID: ");
							String fid1 = sc.next();
							System.out.print("Enter Number Amount To add: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								fc.getRestaurant(rid1).getFoodItem(fid1).addQuantity(amount1);
								
								frwd.writeInFile("Added FoodItem:	"+ amount1+" in "+ fid1);
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell FoodItem");
							
							System.out.print("Enter Restaurant ID: ");
							String rid2 = sc.next();
							System.out.print("Enter Food Item ID: ");
							String fid2 = sc.next();
							System.out.print("Enter Number of Amount Has Been Sold: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= fc.getRestaurant(rid2).getFoodItem(fid2).getAvailableQuantity())
							{
								fc.getRestaurant(rid2).getFoodItem(fid2).sellQuantity(amount2);
								
								frwd.writeInFile("Sold Food Item	:  "+ amount2+" from "+ fid2);
							}
							
							System.out.println("#####################");
							break;
								
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
			}
			
		}
		
		
	}
}
