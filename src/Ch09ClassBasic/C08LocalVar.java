package Ch09ClassBasic;



class LocalTest
{
	int num=10;
	void Func1()
	{
		System.out.println("num : " + num);
		int num=100;
		num++;
		System.out.println("num :" + num);	
	}
	void Func2()
	{
		System.out.println("num : " + num);
		if(true)
		{
			int num=55;
			System.out.println("num : " + num);
		}
		System.out.println("num : " + num);
	}
	
	void Func3()
	{
		for(int num=1; num<=10; num++;)''
	}
}
public class C08LocalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTest obj = new LocalTest();
		obj.Func1();
		LocalTest obj2 = new LocalTest();
		obj2.Func2();
	}

}
