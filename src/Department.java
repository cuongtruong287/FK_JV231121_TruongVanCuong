import java.util.Scanner;

public class Department {
    private  int departmentId;
    private  String departmentName;

    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getdepartmentId() {
        return departmentId;
    }

    public void setdepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getdepartmentName() {
        return departmentName;
    }

    public void setdepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void inputDepart(Scanner scanner){
        System.out.println("Nhap vao ma phong ban");
        departmentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten phong ban");
        departmentName = scanner.nextLine();
    }

    public void displayDepart(){
        System.out.println("Ma phong ban " + departmentId);
        System.out.println("Ten phong ban " + departmentName);
    }
}







