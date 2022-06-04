package Operators;

public class InstanceVar {
	 public String name;

	   // salary variable is visible in Employee class only.
	   private double salary;

	   // The name variable is assigned in the constructor.
	   public InstanceVar (String empName) {
	      name = empName;
	   }

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }
	public void setSalary(double empSal) {
	      salary = empSal;
	   }

	 public void printEmp() {
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee empOne = new Employee("Ransika");
	      empOne.setSalary(1000);
	      empOne.printEmp();
	}

}
