package org.Spring.Welldev;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args){
        TraineeEmployee traineeEmployee = new TraineeEmployee();
        traineeEmployee.setId(101);
        traineeEmployee.setSalary(15000);
        traineeEmployee.setName("Jahedul");


        EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(traineeEmployee);

        WellEmployee employee = (WellEmployee) Proxy.newProxyInstance(
                TraineeEmployee.class.getClassLoader(),
                new Class[] {WellEmployee.class},
                empHandler);
        employee.giveRaise(10000);
        System.out.println(employee.getSalary());

    }
}
