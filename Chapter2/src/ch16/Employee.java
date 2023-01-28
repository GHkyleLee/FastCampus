package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
		
	}
		
	public static int getSerialNum() {
		
		int i = 0; // 지역변수의 경우 사용하고 사라지기에 사용 가능
		
		System.out.println("i = " + i);
		
		i++;  //  한번 사용되고 버려지기 때문에 사용 안됨
		
		// employeeName = "Lee";   static 메소드에서는 바로 호출 가능하기 때문에 메모리 할당되지 않았기 때문에 사용 불가능 
		
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
