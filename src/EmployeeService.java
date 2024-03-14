import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private static EmployeeService instance;
    private static ArrayList<Employee> listEmployment;
    private EmployeeService(){
        listEmployment = new ArrayList<>();
    }

    public static EmployeeService getInstance(){
        if (instance == null){
            instance = new EmployeeService();
        }
        return instance;
    }

    public ArrayList<Employee> getListEmployment(){
        return listEmployment;
    }

    public static void addEmployment(Scanner scanner){
        List<Employee> listEmployment = new ArrayList<>();
        do {
            System.out.println("""
                    *************************EMPLOYEE-MENU**************************
                    1. Thêm mới nhân viên
                    2. Hiển thị thông tin tất cả nhân viên
                    3. Xem chi tiết thông tin nhân viên
                    4. Thay đổi thông tin nhân viên
                    5. Xóa nhân viên
                    6. Hiển thị danh sách nhân viên theo phòng ban 
                    7. Sắp xếp danh sách nhân viên
                    0. Quay lại
                    """);
            System.out.println("Moi ban chon");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Them moi nhan vien");
                    System.out.println("Muon them bao nhieu nhan vien?");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Employee employee = new Employee();
                        employee.input();
                        listEmployment.add(employee);
                    }
                    break;

                case 2:
                    System.out.println("Hien thi thong tin nhan vien");
                    for (Employee employee :listEmployment){
                        employee.display();
                        System.out.println("------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Moi ma nhap sinh vien muon xem");
                    int idForShow = Integer.parseInt(scanner.nextLine());
                    Employee employee = findEmployeeByID(listEmployment,idForShow);
                    if (employee == null){
                        System.out.println("Khong tim thay nhan vien" + idForShow);
                    } else {
                        employee.display();
                }
                    break;

                case 4:
                    System.out.println("Thay doi thong tin nhan vien");
                    System.out.println("Nhap ma nhan vien muon thay doi");
                    int idForEdit = Integer.parseInt(scanner.nextLine());
                    boolean check = false;
                    Employee employee1 = findEmployeeByID(listEmployment,idForEdit);
                    if (employee1 == null){
                        System.out.println("Khong tim thay nhan vien" + idForEdit);
                    } else {
                        employee1.display();
                        System.out.println("Nhap thong tin moi");
                        System.out.println("Nhap ma nhan vien");
                        employee1.setEmployeeID(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nhap ten nhan vien");
                        employee1.setEmployeeName(scanner.nextLine());
                        System.out.println("Nhap email cua nhan vien");
                        employee1.setEmail(scanner.nextLine());
                        System.out.println("Nhap sdt nhan vien");
                        employee1.setEmployeeID(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nhap dia chi nhan vien");
                        employee1.setAddress(scanner.nextLine());
                        System.out.println("Nhap gioi tinh nhan vien, nam: true, nu: false");
                        employee1.setGender(scanner.nextBoolean());
//        System.out.println("Nhap ngay sinh nhan vien");
//        birthday = scanner.
                        System.out.println("Nhap luong co ban");
                        employee1.setBasicSalary(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nhap phu cap");
                        employee1.setAllowanceSalary(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nhap he so luong");
                        employee1.setRate(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Cap nhat thanh cong");
                    }
                    break;

                case 5:
                    System.out.println("Nhap ma nhan vien can xoa");
                    int idForDelete = Integer.parseInt(scanner.nextLine());
                    Employee employee2 = findEmployeeByID(listEmployment,idForDelete);
                    if (employee2 == null ){
                        System.out.println("Khong tim thay ma nhan vien " + idForDelete);
                    } else {
                        listEmployment.remove(employee2);
                        System.out.println("Xoa thanh cong");
                    }
                    break;

                case 6:
                    System.out.println("Hien thi nhan vien theo phong ban");

            }
        } while (true);

    }
    private static Employee findEmployeeByID(List<Employee> listEmployment, int ID){
        for (Employee employee : listEmployment){
            if (employee.getEmployeeID() == ID){
                return employee;
            }
        } return  null;
    }
}
