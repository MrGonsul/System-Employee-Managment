package HomeWork;


//================================================================================

// Import
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (
				// References (Create An Object)
		Scanner in = new Scanner (System.in)) {
			Manager Admin = new Manager();

			// Definition




			// While Loop
			while (true) {
				System.out.println("=============================================================");
				System.out.println("                   Welcome To                                      ");
				System.out.println("             System Employee Managment                                  ");
				System.out.println("=============================================================");
				System.out.println("1 - Add New Employee .");
				System.out.println("2 - Search On Employee .");
				System.out.println("3 - Show All New Employees .");
				System.out.println("4 - Delete Employee .");
				System.out.println("5 - Update Employee Salary .");
				System.out.println("6 - Save In File .");
				System.out.println("7 - Import File .");
				System.out.println("8 - Exit .");
				System.out.println("=============================================================");
				System.out.print("Choose Between 1 ~ 8 : ");

				int Choose = in.nextInt();

				switch(Choose) {


				case 1 : {
					System.out.print("Enter Your Employee ID : ");
					int ID = in.nextInt();

					in.nextLine();

					System.out.print("Enter Your Employee Name : ");
					String Name = in.nextLine();

					System.out.print("Enter Your Employee Salary : ");
					double Salary = in.nextDouble();

					System.out.println(" Add Seccsessful ...");
					// Calling Method
					Admin.AddEmployee(ID, Name, Salary);
					break;
				}

				case 2 : {
					System.out.print("Enter Your Employee ID : ");
					int ID = in.nextInt();
					Admin.SearchEmployee(ID);
					break;
				}

				case 3 : {

					Admin.ShowAllEmployee();
					break;
				}

				case 4 : {
					System.out.print("Enter Your Employee ID : ");
					int ID = in.nextInt();
					Admin.DeleteEmployee(ID);
					break;
				}

				case 5 : {
					System.out.print("Enter Your Employee ID : ");
					int ID = in.nextInt();
					System.out.print("Enter New Salary Info : ");
					double Salary = in.nextDouble();

					Admin.UpdateSalaryEmployee(ID, Salary);
					break;
				}

				case 6 : { Admin.WriteFile();
				break;
			    }

				case 7 : { Admin.ReadFile();
				break;
			    }

				case 8 : { System.out.println("Have A Nice Day ... ");
					System.exit(0);
					break;
				}

				default : System.out.println("Error Input Try Again ...");



				}






			}
		}






	}

}
