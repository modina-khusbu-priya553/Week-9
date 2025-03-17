package main;

import java.util.Scanner;

class Employee
{
    int employee_id;
    String name;
    Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();

        employee_id = Employee_manager.getEmployeeId();
    }
}

class Employee_manager{
    Employee[] emp_list = new Employee[5];
    static int emp_id_gen = 400;
    static int emp_count = 0;

    void create_new_employee()
    {
        emp_list[emp_count] = new Employee();
        emp_count++;
    }
    void display_all_emp_ids()
    {
        for(int i=0; i<emp_count; i++){
            System.out.print(emp_list[i].name);
            System.out.println(emp_list[i].employee_id);
        }
    }
    static int getEmployeeId()
    {
        emp_id_gen++;
        return emp_id_gen;
    }

}


