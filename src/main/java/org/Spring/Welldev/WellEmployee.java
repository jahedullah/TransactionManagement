package org.Spring.Welldev;

public interface WellEmployee {
    void giveRaise(double amount);
    void payCut(double amount);
    public int getId();
    public void setId(int id);
    public double getSalary();
    public void setSalary(double salary);
    public String getName();
    public void setName(String name);
}
