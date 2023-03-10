package ch16;

public class EmployeeTest {
	
	// static 변수는 인스턴스에서 공통으로 사용하는 영역 ! 

	public static void main(String[] args) {
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		System.out.println(Employee.getSerialNum());
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());

	}

}
