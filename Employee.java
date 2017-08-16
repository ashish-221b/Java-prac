public class Employee {
	public static double avg_salary=0;
	public static int number_of_emp=0;
	public String name;
	public double salary;
	public Employee(String empname){
		name=empname;
	}
	public void setSalary(double empSal){
		salary=empSal;
		avg_salary=((avg_salary*number_of_emp)+empSal)/(number_of_emp+1);
		number_of_emp++;
	}
   public static void main(String []args) {
      System.out.println("Hello World");
      Employee A = new Employee("ASHISH");
      A.setSalary(1000);
      System.out.println(avg_salary);
      Employee B = new Employee("Darth_Vader");
      B.setSalary(1);
      System.out.println(avg_salary);
   }
} 