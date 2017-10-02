interface Order
{
	boolean ite(Order obj);
}
class Triangle implements Order
{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(double s1,double s2,double s3)
	{
		side1=s1;
		side2=s2;
		side3=s3;
	}
	double area()
	{
		double answer =(side1+side2+side3)/2;
		return answer;
	}
	public boolean ite(Order obj)
	{
		Triangle p = (Triangle) obj;
		return area()<=p.area();
	}
	
}

class triangleDemo
{
	public static void main(String [] args)
	{
		Triangle t= new Triangle(2.0,1.0,3.0);
		Triangle t1= new Triangle(4.0,3.0,1.0);
		Order t2 = new Triangle(4.0,4.0,2.0);
		
		if(t1.ite(t2))
		{
			System.out.print("yes");
			
			
		}
		else
			System.out.print("no");
	
	}
}