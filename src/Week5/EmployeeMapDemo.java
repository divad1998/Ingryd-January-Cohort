package Week5;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        EmployeeDemo employeeDemo1 = new EmployeeDemo("ING001", "David John", "Training", 150000.00);
        EmployeeDemo employeeDemo2 = new EmployeeDemo("ING002", "Sandra Bullock", "Marketing", 150000.00);
        EmployeeDemo employeeDemo3 = new EmployeeDemo("ING003", "David John", "Training", 150000.00);
        EmployeeDemo employeeDemo4 = new EmployeeDemo("ING004", "David John", "Training", 150000.00);

        Map<String, EmployeeDemo> employeeDemoMap = new HashMap<>();
        employeeDemoMap.put(employeeDemo1.getId(), employeeDemo1);
        employeeDemoMap.put(employeeDemo2.getId(), employeeDemo2);
        employeeDemoMap.put(employeeDemo3.getId(), employeeDemo3);
        employeeDemoMap.put(employeeDemo4.getId(), employeeDemo4);

        //call update
        updateSalary("ING001", 200000.00, employeeDemoMap);

        System.out.println(employeeDemoMap.get("ING001"));
    }

    static void updateSalary(String key, double salary, Map<String, EmployeeDemo> employees) {
        //is key valid?
        if (employees.get(key) != null) {
            EmployeeDemo employee = employees.get(key);
            //is salary different?
            if (employee.getSalary() != salary) {
                employee.setSalary(salary);
                employees.replace(key, employee);
            } else {
                System.out.println("Salary is same as previous");
            }
        } else {
            System.out.println("Invalid key.");
        }
    }
}