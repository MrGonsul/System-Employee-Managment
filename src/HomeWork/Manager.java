package HomeWork;

// Import 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Manager {

	// Reference
	Scanner in = new Scanner (System.in);
	
	// Hash Map	  
	HashMap<Integer,Employee> admin;  // ID + Employee(Name + Salary)
	
	
	// Methods...
	
	// 1 - ADD
	public void AddEmployee (int ID , String Name , double Salary) {
		admin.put(ID, new Employee(Name,Salary));
		
	}
	
	// 2 - Search (By Using ID For Searching)
	public void SearchEmployee (int FID) { // FID = FIND THE ID
		if(admin.containsKey(FID)) {
			System.out.println("Employee Is Found ! ...");
			System.out.println(admin.get(FID));
		} else {
			System.out.println("Employee Is Not Found...");
		}
	}
	
	// 3 - Show All Employee
	public void ShowAllEmployee() {
		if(admin.isEmpty()) {
			System.out.println("There Is Not Employee Here ... "); 
			return;
		}

		for (Map.Entry<Integer, Employee> out : admin.entrySet()) {
			System.out.println(out.getKey() + " : " + out.getValue()); 
		}
	}
	
	// 4 - Delete (By Using ID For Searching)
	public void DeleteEmployee(int FID) { // FID = FIND THE ID
		if(admin.containsKey(FID)) {
			admin.remove(FID);
			System.out.println("Deleted Successfully ...");
		} else {
			System.out.println("Employee Not Found ...");
		}
	}
	
	// 5 - Update ( Salary )
	public void UpdateSalaryEmployee(int FID , double Salary) { // FID = FIND THE ID
		if(admin.containsKey(FID)) {
			
			Employee emp = admin.get(FID); // Select Key ID
			
			emp.setSalary(Salary);   // ADD New Salary
			
			System.out.println("Updated Successfully ...");
		} else {
			System.out.println("Employee Is Not Found ...");
		}
	}
	
	// 6 - Save In File (Write)
	public void WriteFile() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.data"));
			out.writeObject(admin);
			out.close();
			System.out.println("Stored To Employee.data");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 7 - Import File Into Console (Read)
	@SuppressWarnings("unchecked")
	public void ReadFile() {
		try {
			ObjectInputStream inFile = new ObjectInputStream(new FileInputStream("Employee.data"));
			admin = (HashMap<Integer, Employee>) inFile.readObject();
			inFile.close();
			System.out.println("Loaded From Employee.data");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public Manager() {
		admin = new HashMap<>(); 
		
	}

}
