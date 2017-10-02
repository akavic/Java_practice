 import java.util.*;
abstract class Shape
{
	String name;
	
	Shape(String name)
	{
		this.name=name;
	}
	abstract double area();
	
	abstract double perim();
	
	void put()
	{
		System.out.println(name +" with area "+area()+" and perimeter "+perim());
	}
}
	
	class Circle extends Shape
	{
		double radius;
		
		Circle(String s, double rad)
		{
			super(s);
			radius=rad;
		}
		
		double area(){
			return (radius*2.0);
		}
		double perim()
		{
		
			return(2*radius*Math.PI);
		}
		void put()
		{
			
			System.out.print(name +" the diameter "+area()+" The circumference " +perim());
		}
	}

	class Rectangle extends Shape
	{
		private double width, height; 
		
		Rectangle(String na,double width, double height)
		{
			super(na);
			this.width=width;
			this.height=height;
		}
		double area() {return(width*height);} // body added

		double perim() {return((width+height)*2);}

	}
	

class Shapes
{
	public static void main(String args[]) 
	{
		Shape [] figures = {new Rectangle("Rectangle", 2.0, 
			3.0), new Rectangle("Square", 4.0, 4.0),
			new Circle("Circle", 2.0)};
		for (Shape s: figures) 
			s.put();
			Circle  circ= new Circle("circle ",3.0);
	}

		
}