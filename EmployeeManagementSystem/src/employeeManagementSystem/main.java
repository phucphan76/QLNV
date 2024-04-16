package employeeManagementSystem;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	EmployeeManagement manage = new EmployeeManagement();
	Scanner sc = new Scanner(System.in);
	int option;
	
	do {
		System.out.println("MENU");
        System.out.println("1: Add experience employee");
        System.out.println("2: Add fresher");
        System.out.println("3: Add intern");
        System.out.print("Enter your selection : ");
        
        option = sc.nextInt();
        
        switch (option) {
		case 1:
			manage.addExperience();
			break;
		case 2:
			manage.addFresher();
			break;
		case 3:
			manage.addIntern();
			break;
		default:
			break;
		}
	}while(option!=9);
	}
	
}

