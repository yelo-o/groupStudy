
public class Employee {
	String empNo;
	String empName;
	int salary = 0;
	Employee(){
		
	}
	Employee(String empNo, String empName){
		this(empNo, empName,0);
	}
	Employee(String empNo, String empName, int salary){
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	void print() {
//		System.out.println("사번:"+ empNo + " ,사원명:" + empName+ ", 기본급:" + salary); // 이것도 되긴 함
		System.out.println("사번:"+ this.empNo + " ,사원명:" + this.empName+ ", 기본급:" + this.salary);
	}

}
