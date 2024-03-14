import java.util.Date;
import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean gender;
    private Date birthday;
    private float basicSalary;
    private float allowanceSalary;
    private float rate;
    private int departmentId;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, String email, String phoneNumber, String address, boolean gender, Date birthday, float basicSalary, float allowanceSalary, float rate, int departmentId) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.basicSalary = basicSalary;
        this.allowanceSalary = allowanceSalary;
        this.rate = rate;
        this.departmentId = departmentId;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getAllowanceSalary() {
        return allowanceSalary;
    }

    public void setAllowanceSalary(float allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void calTotalSalary(){
        float totalSalary = basicSalary*rate*allowanceSalary;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thong tin nhan vien");
        System.out.println("Nhap ma nhan vien");
        employeeID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten nhan vien");
        employeeName = scanner.nextLine();
        System.out.println("Nhap email cua nhan vien");
        email = scanner.nextLine();
        System.out.println("Nhap sdt nhan vien");
        phoneNumber = scanner.nextLine();
        System.out.println("Nhap dia chi nhan vien");
        address = scanner.nextLine();
        System.out.println("Nhap gioi tinh nhan vien, nam: true, nu: false");
        gender = scanner.nextBoolean();
//        System.out.println("Nhap ngay sinh nhan vien");
//        birthday = scanner.
        System.out.println("Nhap luong co ban");
        basicSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap phu cap");
        allowanceSalary = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap he so luong");
        rate = Integer.parseInt(scanner.nextLine());
    }

    public void display(){
        System.out.println("Ma NV: " + employeeID);
        System.out.println("Ten: " + employeeName);
        System.out.println("email: " + email);
        System.out.println("SDT: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("gender: " + gender);
        System.out.println("birthday: " + birthday);
        System.out.println("Luong CB: " + basicSalary);
        System.out.println("Phu cap: " + allowanceSalary);
        System.out.println("He so luong: " + rate);
    }

    public  void checkGender(){
        if (gender){
            System.out.println("Nam");
        } else {
            System.out.println("Nu");
        }
    }

    public void editById(){

    }

}
