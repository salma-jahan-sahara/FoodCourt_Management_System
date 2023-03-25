package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations
{
	private Restaurant restaurants[] = new Restaurant[500];
	private Employee employees[] = new Employee[100];
	
	public void insertRestaurant(Restaurant r)
	{
		int flag = 0;
		
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] == null)
			{
				restaurants[i] = r;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Restaurant Inserted");}
		else{System.out.println("Restaurant can Not be Inserted");}
	}
	
	public void removeRestaurant(Restaurant r)
	{
		int flag = 0;
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] == r)
			{
				restaurants[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Restaurant Removed");}
		else{System.out.println("Restaurant can Not be Removed");}
	}
	
	
	public void showAllRestaurants()
	{
		for(Restaurant r : restaurants)
		{
			if(r!= null)
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Restaurant Name: "+ r.getName());
				System.out.println("Restaurant ID: "+ r.getRid());
				System.out.println("----------------------------------");
				r.showAllFoodItems();
				System.out.println("----------------------------------");
				System.out.println();
			}
		}
	}
	
	public Restaurant getRestaurant(String rid)
	{
		Restaurant r = null;
		
		for(int i=0; i<restaurants.length; i++)
		{
			if(restaurants[i] != null)
			{
				if(restaurants[i].getRid().equals(rid))
				{
					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}
	
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Inserted");}
		else{System.out.println("Employee can Not be Inserted");}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Employee can Not be Removed");}
	}
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("/////////////////////////////////");
	}
	
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}