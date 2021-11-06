package Java08;
class CTest
{
	void test (int n)
	{
		System.out.print("n= "+n);
		
		if(n%2==1)
			 System.out.println(", 计计");
			 else if(n==0)
			 System.out.println(", 计 0");
			 else
			 System.out.println(", 计案计");
	}
}
public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest t = new CTest();
		
		t.test(0);
		t.test(1);
		t.test(2);
	}

}
