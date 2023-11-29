public class Employee {
    private String empid;
    private String empName;
    private double salary;

    public Employee() {
        this.empid = "1001";
        this.empName = "Hamas Kulas";
        this.salary = 15000;
    };

    public Employee(String empid, String empName, double salary) {
        this.empid = "1001";
        this.empName = "Employee ID : ";
        this.salary = salary;
    }

    // setter
    public void setEmpid(String empid) {
        this.empid = empid;
    };

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSize(double salary) {
        this.salary = salary;
    }

    // getter
    public String getEmpid() {
        return this.empid;
    }

    public String getEmpName() {
        return this.empName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayDetail() {
        System.out.println("===== Employee Detail =====");
        System.out.println(">>Employee ID : " + empid);
        System.out.println(">>Employee Name : " + empName);
        System.out.println(">>Salary : " + salary);
    }
}
