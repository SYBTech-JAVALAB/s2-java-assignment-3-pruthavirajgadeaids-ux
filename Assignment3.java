package Assignments;
import java.util.Scanner;

//Create a class for an employee payroll system using method overloading 
//concept to handle multiple salary computation scenarios, including:
//a. employeeID
//b. hours_worked and rate
//c. ID with bonus
//d. annual_salary
//e. with_overtime
//f. with_deductions
//g.with bonus and deduction



class Employee{

	int Employee_Id;

	String Employee_Name;

	double Base_Salary;

	

	Employee(int Employee_Id,String Employee_Name,double Base_Salary){

		this.Employee_Id=Employee_Id;

		this.Employee_Name=Employee_Name;

		this.Base_Salary=Base_Salary;

		}

	

	public void Calculate_Salary(int Employee_Id) {

		System.out.println("Employee_Id: "+ Employee_Id);

		System.out.println("Base Salary: "+ Base_Salary);

	}

	

	public void  Calculate_Salary(double Hourly_Worked, double Hourly_Rate) {

		System.out.println("Salary Based on Hours Worked at Rate: "+ (Hourly_Worked *Hourly_Rate));
		}

	public  void Calaculate_Salary(int Employee_Id,double Bonus) {

		System.out.println("Salary with Bonus is: "+ (Base_Salary+Bonus));

	}

	

	public void Calculate_Salary(double Annual_Salary) {

		System.out.println("Salary is: "+ Annual_Salary/12);

	}

	

	public void Calculate_Salary(double Hourly_Worked, double Hourly_Rate,double Over_Time_Hours) {

		double Over_Time_Rate=Hourly_Rate*2;

		System.out.println("Salary With Over Time is: "+((Over_Time_Hours*Over_Time_Rate)+(Hourly_Worked *Hourly_Rate)));

		

	}

	

	public void Calculate_Salary(double Hourly_Worked,double Hourly_Rate,double Bonus, double Deductions) {

		double Total_Salary=(Hourly_Worked *Hourly_Rate)+ Bonus;

		System.out.println("Total Salary Without Deduction is: "+ Total_Salary);

		System.out.println("Total Salary with Deduction is: "+ (Total_Salary-Deductions));

}

	

	public void Display_Details() {

		System.out.println("====== Employee PayRoll System======");

		System.out.println("Employee ID: "+ Employee_Id);

		System.out.println("Employee Name: "+ Employee_Name);

		System.out.println("Employee  Base Salary: "+ Base_Salary);

	}
	
	
}



public class Assignment3 {

	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the ID: ");
		 int Employee_Id = sc.nextInt();
	        
	        System.out.print("Enter the  Employee Name: ");
	        String Employee_Name = sc.nextLine();
	        sc.nextLine(); 

	        System.out.print("Enter the Base Salary: ");

	        double Base_Salary=sc.nextFloat();

	        

	        

		Employee E1=new Employee(Employee_Id,Employee_Name,Base_Salary);
        E1.Display_Details();

        
        E1.Calculate_Salary(Employee_Id);
        E1.Calculate_Salary(40, 500);               // hours & rate
        E1.Calculate_Salary(Employee_Id, 5000);     // bonus
        E1.Calculate_Salary(600000);                // annual salary
        E1.Calculate_Salary(40, 500, 10);           // overtime
        E1.Calculate_Salary(40, 500, 5000, 2000);   // bonus + deduction

        sc.close();
}
	

}





