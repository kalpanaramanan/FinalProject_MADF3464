/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton.finalproject.main;

import com.lambton.finalproject.logic.EmployeeImpl;
import com.lambton.finalproject.model.Car;
import com.lambton.finalproject.model.CommissionBasedPartTime;
import com.lambton.finalproject.model.Employee;
import com.lambton.finalproject.model.FixedBasedPartTime;
import com.lambton.finalproject.model.Intern;
import com.lambton.finalproject.model.MotorCycle;
import java.util.ArrayList;

/**
 *
 * @author Kalpana Ramanan
 */
public class FinalProject_MADF3464 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double totalPayroll = 0d;

        // FIRST EMPLOYEE
        MotorCycle motorCycle = new MotorCycle("1", "Hondo", "s4546", "1", "Motorcycle");
        Employee employee = new Employee(1, "Kalpana", 26, motorCycle);
        CommissionBasedPartTime commissionBasedPartTime = new CommissionBasedPartTime(20, 30, 10, employee.getEmployeeNo(), employee.getEmployeeName(), 0, motorCycle);

        // SECOND EMPLOYEE
        Car car = new Car("1", "Hondo", "s4546", "2", "Car");
        Employee employee1 = new Employee(2, "Saiii", 30, car);
        FixedBasedPartTime fixedBasedPartTime = new FixedBasedPartTime(40, 30, 10, employee1.getEmployeeNo(), employee1.getEmployeeName(), 0, car);

        // THIRD EMPLOYEE
        Employee employee2 = new Employee(3, "Omika", 25, null);
        Intern intern = new Intern("Lambton College", employee2.getEmployeeNo(), employee2.getEmployeeName(), 0, null);

        
        EmployeeImpl employeeImpl = new EmployeeImpl();
        ArrayList<Employee> arrayEmployee = new ArrayList<>();
        //Employee arrayEmployee[] = new Employee[6];
        arrayEmployee.add(employee);
        arrayEmployee.add(employee1);
        arrayEmployee.add(fixedBasedPartTime);
        arrayEmployee.add(employee2);
        arrayEmployee.add(intern);

        for (Employee arrayEmployee1 : arrayEmployee) {
            if (arrayEmployee1.getClass() == Employee.class) {
                Employee e = (Employee) arrayEmployee1;
                System.out.println(e.toString());
                
                System.out.println(employeeImpl.calculateBirthYear(e));
            }
            if (arrayEmployee1 instanceof CommissionBasedPartTime) {
                CommissionBasedPartTime e = (CommissionBasedPartTime) arrayEmployee1;
                System.out.println(e.toString());
            }
            if (arrayEmployee1 instanceof FixedBasedPartTime) {
                FixedBasedPartTime e = (FixedBasedPartTime) arrayEmployee1;
                System.out.println(e.toString());
            }
            
            //Sample Comment
             if (arrayEmployee1 instanceof Intern) {
                Intern e = (Intern) arrayEmployee1;
                System.out.println("Earnings : "+employeeImpl.calculateEarnings(e));
                System.out.println(e.toString());
            }
        }
        //PAYROLL
        // System.out.println("\nTOTAL PAYROLL : " + totalPayroll + " Canadian Dollars");
    }

}
