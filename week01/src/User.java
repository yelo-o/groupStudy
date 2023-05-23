
public class User {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empNo = "2301";
		e1.empName = "오문정";
		e1.salary = 10000;
		
		Employee e2 = new Employee("2302", "홍길동", 10000);
		Employee e3 = new Employee("2303", "나자바");
		
		e1.print(); // "사번:2301, 사원명:오문정, 기본급:10000"
		e2.print(); // "사번:2302, 사원명:홍길동, 기본급:10000"
		e3.print(); // "사번:2303, 사원명:나자바, 기본급:0"
	}

}
