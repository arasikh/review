package syntax;

public class Task1SyntaxEmployee {

    String empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        Task1SyntaxEmployee emp=new Task1SyntaxEmployee();
        emp.empID="123";
        emp.salary=20000;

        Task1SyntaxEmployee emp2=new Task1SyntaxEmployee();
        emp2.empID="1234";
        emp2.salary=25000;
        System.out.println(emp.empID);
        System.out.println(emp.salary);
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);

    }

}
