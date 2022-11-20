package org.Spring.proxy;

public class StudentProxy extends Student{
    public StudentProxy(Attendance attendance) {
        super(attendance);
    }
    public void attendKT(){
        if (super.getAttendance().isPresent()){
            super.attendKT();
        }
        else{
            throw new RuntimeException("Student is not present. KT cancelled.");
        }
    }
}
