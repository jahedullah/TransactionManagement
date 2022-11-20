package org.Spring.Welldev;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
    private WellEmployee employeeTarget;

    public EmployeeSalaryInvocationHandler(WellEmployee employeeTarget){
        this.employeeTarget = employeeTarget;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("getSalary")){
            System.out.println("Salary Initiating.");

            Object returnValue = method.invoke(employeeTarget, args);
            System.out.println("Salary Disbursed");
            return returnValue;
        }else {
            Object returnValue = method.invoke(employeeTarget, args);
            return returnValue;
        }

    }
}
