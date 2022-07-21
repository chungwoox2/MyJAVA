package Ch10ClassBasic;


class Employee
{
	//+id : int;
	//+name : String;
	//+dept : String;
	//+title : String;
	//-salary : int;
	//-addr : String;
	
	//private항목만 getter and setter지정
	//모든 필드를 받는 생성자 함수 지정
	//toString() 재정의를 통한 필드 내용 출력가능하도록 할것
}
public class C02PracticeMain {

	public static void main(String[] args) {
		
		Employee hong=new Employee(1010,"홍길동","인사부","대리",4500,"대구");
		hong.setSalary(6000);
		hong.setAddr("울산");
		System.out.println(hong.toString()); //hong의 모든 필드 내용 출력

	}

}
