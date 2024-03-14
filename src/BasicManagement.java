import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicManagement {
    public static void main(String[] args) {
        mainService();
    }

    public  static void mainService(){
        EmployeeService employeeService = EmployeeService.getInstance();
        DepartmentService departmentService = DepartmentService.getInstance();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                *********************************MENU******************************* 
                1. Quản lý phòng ban
                2. Quản lý nhân viên
                3. Thoát chương trình""");
            System.out.println("Moi ban chon:");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    EmployeeService.addEmployment(scanner);
                    break;

                case 2:
                    DepartmentService.addDeparment(scanner);
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.err.println("Nhap sai, vui long nhap lai");
                    break;

            }
        } while (true);
    }
}
