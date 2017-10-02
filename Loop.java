class Part1
{
	private int age=0;
	
	Part1(int num)
	{
		this.num=num;
	}
	Part1(){}

	boolean greater(part1 p)
	{
		
		return (num>p.num);
		
	}

	void print()
	{
		System.out.print(" "+num);
	}
	
class Part2 extends Part1
{
	private int life;
	
	Part2(int a0,int life)
	{
		age=a0;
		this.life=life;
	}
	
	void print()
	{
		super.print();
		System.out.print(" "+life);
	}
}

	
	public static void main(String [] args)
	{

		
	}
}