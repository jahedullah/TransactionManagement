package org.Spring.proxy;
public class Student implements DailySession{
    private Attendance attendance;
    public Student(Attendance attendance){
        this.attendance = attendance;
    }

    @Override
    public void attendKT() {
        System.out.println("Attending the KT Session.");
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }
}
