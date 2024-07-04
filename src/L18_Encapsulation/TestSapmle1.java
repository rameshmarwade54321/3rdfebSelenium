package L18_Encapsulation;

public class TestSapmle1 
{

	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1(10);
		//System.out.println(s1.num1);   private variable in sample1 is not accessible
		s1.m1();
				
	}
}
