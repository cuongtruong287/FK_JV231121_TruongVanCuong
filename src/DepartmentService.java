import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentService {

    private static DepartmentService instance;
    private static ArrayList<Department> listDepart;
    private DepartmentService(){
        listDepart = new ArrayList<>();;
    }

    public static DepartmentService getInstance(){
        if(instance == null){
            instance = new DepartmentService();
        }
        return instance;
    }
    static void addDeparment(Scanner scanner){
        List<Department> listDepartment = new ArrayList<>();
        do {
            System.out.println("""
                    **********************DEPARTMENT-MENU************************
                    1. Thêm mới phòng ban
                    2. Hiển thị thông tin tất cả phòng ban 
                    3. Sửa tên phòng ban
                    4. Xóa phòng ban
                    5. Tìm kiếm phòng ban
                    0. Quay lại""");
            System.out.println("Moi ban chon");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Them moi phong ban");
                    System.out.println("Ban muon them bao nhieu phong ban");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Department department = new Department();
                        department.inputDepart(scanner);
                        listDepartment.add(department);
                    }
                    break;

                case 2:
                    System.out.println("Hien thi tat ca phong ban");
                    for (Department department : listDepartment){
                        department.displayDepart();
                        System.out.println("----------------------");
                    }
                    break;

                case 3:

            }
        } while (true);
    }
}
