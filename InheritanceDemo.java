 import java.util.*;
class Employee
{
	String name,department;
	
	Employee(String name,String department)
	{
		this.name=name;
		this.department=department;
		
	}
	boolean equal(Employee p)
	{
		return name.equals(p.name)&&department.equals(p.department);
	}
	void print()
	{
		System.out.println(name+" "+department);
		
	}
}
class Tradesman extends Employee
{
	String trade;
	
	Tradesman(String n0,String d0, String trade)
	{
		super(n0,d0);
		this.trade=trade;
	}
	void print()
	{
		super.print();
		System.out.println(" "+trade);
		
	}
}
class Staff 
{
	int x;
	 ArrayList<Employee> list = new ArrayList<Employee>(x);

	
	Staff(){}
	
	
	void hire(Employee t)
	{
		
		list.add(t);
		x++;
		
	}
	void fire(Employee t)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equal(t))
			{
				list.remove(i);
			}
		}
	}
	void put()
	{
		for(Employee s: list)
		{
			s.print();
		}
	}
	
}

class InheritanceDemo {

	public static void main(String[] args) {  
    Staff personnel = new Staff();
		Employee e1 = new Employee("Mike","Sales");
		Employee e2 = new Tradesman(
						"Fred","Engineering","Welder");
		Employee e3 = new Employee("Pat","Sales");
		Employee e4 = new Tradesman(
						"Jean","Finishing", "Painter");
		Employee e5 = new Employee("Bill","Marketing");
		Employee e6 = new Tradesman(
						"Anne","Engineering", "Fitter");
		Employee e7 = new Tradesman(
						"Paul","Design", "Draughtsman");
		Employee e8 = new Tradesman(
						"Eddy","Finishing","Painter");
		Employee e9 = new Employee("John","Despatch"); 
		personnel.hire(e1); personnel.hire(e2); 
		personnel.hire(e3); personnel.hire(e4); 
		personnel.hire(e5); personnel.hire(e6);
		personnel.hire(e7); personnel.hire(e8); 
		personnel.hire(e9); 
		personnel.put(); System.out.println();
		personnel.fire(e1); personnel.fire(e5); 
		personnel.fire(e9);
		personnel.put(); System.out.println();
		personnel.fire(new Tradesman(
						"Eddy", "Finishing", "Painter"));				personnel.put(); 
	}


	
}


