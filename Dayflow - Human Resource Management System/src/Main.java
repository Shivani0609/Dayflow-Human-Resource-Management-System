import java.util.Scanner;
import auth.AuthService;
import model.Attendance;
import model.Employee;
import model.User;
import model.LeaveRequest;
import service.LeaveService;
import service.AttendanceService;
import service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Dayflow HRMS ===");

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = AuthService.login(email, password);

        if (user == null) {
            System.out.println("Login failed");
            return;
        }

        System.out.println("Login successful");

        if (user.role.equals("ADMIN")) {

    System.out.println("Admin Dashboard Loaded");

    EmployeeService.addEmployee(
        new Employee(1, "John Doe", "john@company.com")
    );

    EmployeeService.addEmployee(
        new Employee(2, "Jane Smith", "jane@company.com")
    );

    EmployeeService.listEmployees();
    LeaveService.approveLeaves();


} else {

    System.out.println("Employee Dashboard Loaded");

    AttendanceService.markAttendance(
        new Attendance(1, "2026-01-03", "Present")
    );

    AttendanceService.viewAttendance();

    LeaveService.applyLeave(
    new LeaveRequest(1, "Sick leave")
);

}


        sc.close();
    }
}
