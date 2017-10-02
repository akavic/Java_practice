abstract class Person
{
	private String name, address;
	//private Gender gender;
	private boolean gender= true;
	
	Person(String name, String address, boolean gender)
	{
		this.name=name;
		this.address=address;
		this.gender=gender;
	}
	/*public Gender getgender()
	{
		return gender();
	}*/
	abstract int completionYear();
	
	void put()
	{
		System.out.println(name +" "+ address+" " +" expected year of completion "+ completionYear());
	}
	class Pupil extends Person
	{
		private String student_id;
		private String subject;
		private int yearstudy;
		
		Pupil(String na,String add, boolean sex, String student_id, String subject, int yearstudy)
		{
			super(na,add,sex);
			this.student_id=student_id;
			this.subject=subject;
			this.yearstudy=yearstudy;
		}
		
		
		int completionYear()
		{
			return (2015+5-yearstudy);
		}
		void put()
		{
			System.out.println(student_id +" "+subject+"  expected year of completion "+ completionYear());
		}
	}
	class Lecturer extends Person
	{
		private String department;
		private String staff_no;
		
		Lecturer(String na,String add, boolean sexuality, String department,String staff_no)
		{
			super(na,add,sexuality);
			this.department=department;
			this.staff_no=staff_no;
		}
		void put()
		{
			System.out.println(department +" "+ staff_no +" expected year of completion "+completionYear());
		}
		int completionYear()
		{
			String x=staff_no.substring(0,2);
			int y=Integer.parseInt(x);
			return(2015+65-y);
		}
		
	}
	/*class Gender
	{
		public enum Gender {
				MALE,
				FEMALE
		}
	}*/
	
	

}
class University
{
	  public static void main(String[] args) {  
		//Person[] people = {new Pupil("Mike Smith","10 Main St", true, "5023765", "Computing", 2),
				//new Lecturer("Kay Brown", "25 Side St", false, "Business", "3734564"),
				//};
			Pupil pupil =new Pupil("victor akinla"," 57 castle Garden");
			/*for(Person  p: people)
			{
				p.put();
			}*/
			pupil.put();
	}


}