package assignment;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee em = new Employee("사원 1","사원",30000000);

        Manager manager = new Manager("관리자 1" , "관리자" , 5000000, 10);

        manager.salaryIncrease(em,1000000);
        manager.salaryIncrease(em,-1000000);

    }
}
