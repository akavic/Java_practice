class Person
{
	int age;
	String name;
	String surname;
	
	Person(){
		
	}
	
	Person(int age,String name, String surname)
	{
		this.age=age;
		this.name=name;
		this.surname=surname;
	}
	void getDetails()
	{
		System.out.print("Enter Age, name, surname: ");
		age=Console.readInt();
		name=Console.readString();
		surname=Console.readString();
	}
	boolean oldest(Person p)
	{
		Person t= new Person();
		return (t.age>p.age);
		
	}
	static void birthday(Person p)
	{
		p.age++;
	}
	 void print()
	{
		System.out.println("Details: "+ age+" "+name+" "+surname);
	}
	static Person []  sort(Person [] citizens)
	{
		Person tmp=new Person();
		int x =citizens.length;
		while(x!=0)
		{
		
			for(int j=0; j<citizens.length-1; j++)
			{
				if(citizens[j].oldest(citizens[j+1]))
				{
					tmp=citizens[j];
					citizens[j]=citizens[j+1];
					citizens[j+1]=tmp;
					
				}
				
			}
			x--;
			
		}
		
		return citizens;
	}
	
	public static void main(String [] args)
	{
		
		Person [] t={new Person(35,"Bill","smith"),new Person(20,"emman","akinla"),
		new Person(21,"prince","williams"),new Person(13,"jane","screw"),
		new Person(16,"alan","joe"),new Person(19,"raheem","sters"),
		new Person(20,"rich","quan"),new Person(60,"will","jaden")};

		Person p=new Person(29,"bill","yolo");
		//Person z= new Person();
		sort(t);
		/*Person tmp=new Person();
		for(int j=0; j<t.length-1; j++)
			{
				if(t[j].oldest(t[j+1]))
				{
					tmp=t[j];
					t[j]=t[j+1];
					t[j+1]=tmp;
					
				}
				
			}
			if(p.oldest(z))
		
			p.print();
		
		else
			z.print();
			
		//tmp.print();
		*/
		
		/*for(Person i: t)
		{
			i.print();
		}*/
		birthday(p);
		p.print();
	
		
		
	}
	
}