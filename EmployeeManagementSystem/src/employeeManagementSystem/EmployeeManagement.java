package employeeManagementSystem;

import java.util.Scanner;
import jdbc.InsertUpdateDelete;


public class EmployeeManagement {
	Scanner sc = new Scanner(System.in);
	String Query;
	public void addExperience() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter full name: ");
		String fullName = sc.nextLine();
		System.out.println("Enter birthday: ");
		String birthday = sc.nextLine();
		System.out.println("Enter phone: ");
		String phone = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter type: ");
		String type = sc.nextLine();
		System.out.println("Enter experience in year: ");
		int exp = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter proskill: ");
		String proskill = sc.nextLine();
		Query = "insert into experience(id, fullname, birthday, phone, email, type, expinyear, proskill) values("+id+",'"+fullName+"','"+birthday+"','"+phone+"','"+email+"','"+type+"','"+exp+"','"+proskill+"')";
		InsertUpdateDelete.setData(Query, "Successfully add employee");
	}
	
	public void addFresher() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter full name: ");
		String fullName = sc.nextLine();
		System.out.println("Enter birthday: ");
		String birthday = sc.nextLine();
		System.out.println("Enter phone: ");
		String phone = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter type: ");
		String type = sc.nextLine();
		Query = "insert into experience(id, fullname, birthday, phone, email, type, expinyear, proskill) values("+id+",'"+fullName+"','"+birthday+"','"+phone+"','"+email+"','"+type+"')";
		InsertUpdateDelete.setData(Query, "Successfully add employee");
	}
	
	public void addIntern() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter full name: ");
		String fullName = sc.nextLine();
		System.out.println("Enter birthday: ");
		String birthday = sc.nextLine();
		System.out.println("Enter phone: ");
		String phone = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		System.out.println("Enter type: ");
		String type = sc.nextLine();
		Query = "insert into experience(id, fullname, birthday, phone, email, type, expinyear, proskill) values("+id+",'"+fullName+"','"+birthday+"','"+phone+"','"+email+"','"+type+"')";
		InsertUpdateDelete.setData(Query, "Successfully add employee");
	}
}
