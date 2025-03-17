package main;

public class manager {

    public static void main(String[] args) {
        Employee_manager mgr = new Employee_manager();  // Create an instance of Employee_managermgr
        
        // Create five new employees
        mgr.create_new_employee();
        mgr.create_new_employee();
        mgr.create_new_employee();
        mgr.create_new_employee();
        mgr.create_new_employee();

        // Display all employee IDs and names
        mgr.display_all_emp_ids();
    }
}
