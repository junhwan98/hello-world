package assignment;

public class Manager extends Employee{

    int employees;

    public Manager(String empName, String rank, int sal , int employees) {
        super(empName, rank, sal);
        this.employees = employees;
    }

    public void salaryIncrease(Employee employee, int amount){
        if (amount > 0) {
            System.out.println(employee.empName + "님의 연봉이 " + amount + "원 인상되었습니다.");
            employee.sal += amount;
        } else {
            System.out.println(employee.empName + "님의 연봉이 " + -amount + "원 삭감되었습니다.");
            employee.sal += amount;
        }

        }

}
