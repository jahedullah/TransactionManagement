package org.Spring.proxy;

import java.util.Date;

public class Teacher {
    public static void main(String[] args){
        Student student = new StudentProxy(new Attendance(new Date(), false ));
        student.attendKT();
    }
}
