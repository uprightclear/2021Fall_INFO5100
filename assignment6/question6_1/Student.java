package question6_1;

import java.util.Date;

public class Student {
    public int id;
    public String name;
    public double gpa;
    public Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }
}
