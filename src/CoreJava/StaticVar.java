package CoreJava;

public class StaticVar {
	
	String name;//Instance Variable
	String address;
	static String city;//Class Variable
	static int i;
	static	{
		city = "Bangalore";
		i = 0;
	}
	
	StaticVar(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	static void getCity()
	{
		System.out.println(city);
	}
	public void getAddress()
	{
		System.out.println(address + " "+ city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj =new StaticVar("Bob","Marthalli"); 
		StaticVar objl =new StaticVar("Ram","Jayangar"); 
		StaticVar obj2 =new StaticVar("Ram","Jayangar"); 
		obj.getAddress(); 
		objl.getAddress(); 
		StaticVar.getCity(); 
		StaticVar.i=4; 
		obj.address="XYZ"; 
	}

}
