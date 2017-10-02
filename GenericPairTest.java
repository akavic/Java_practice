class Pair< extends Shape> 
{
	private T pair1;
	private U pair2;

	Pair(T p1, U p2)
	{
		pair1=p1;
		pair2=p2;
	}

	public String toString()
	{
		String x=(""+pair1+""+pair2);
		return x;
	}
}

class GenericPairTest {
	
	public static void main(String[] args) {		
		Pair<String,Integer> phoneNumber = 
			new Pair<>("Bill's number", 1324);	
    	//System.out.println(phoneNumber);
		phoneNumber.toString();
    	Pair<Double,Double> point = 
			new Pair<>(3.14, 2.32);
    	System.out.println(point);
	}
}
