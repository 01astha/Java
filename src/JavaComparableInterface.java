//Program to sort the employees on the basis of their salary.


import java.util.*;
import java.util.Collections;

class Employees implements Comparable<Employees>
{
    int emp_id, emp_salary;
    String emp_name;

    public Employees(int emp_id, String emp_name, int emp_salary)
    {

        super();
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public String toString(){
        return " Employees[Employee ID = " + emp_id + "; Employee Name = " + emp_name + "; Employee Salary = " + emp_salary +"]";
    }

    public int compareTo(Employees e)
    {
        return emp_salary - e.emp_salary;
    }
}

public class JavaComparableInterface {

    public static void main(String[] args)
            
    {
        List<Employees> emp = new ArrayList<>();

        emp.add(new Employees(1, "John", 98000));
        emp.add(new Employees(4, "Ben", 80000));
        emp.add(new Employees(3, "Robin", 130000));
        emp.add(new Employees(2, "Andrew", 75000));

        Collections.sort(emp);

        emp.forEach(System.out::println);
    }
}
