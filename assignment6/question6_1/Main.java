package question6_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student Adam = new Student(1, "Adam", 2.3, new SimpleDateFormat("yyyy-MM-dd").parse("1997-11-01"));
        Student Beck = new Student(2, "Beck", 3.5, new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-30"));
        Student David = new Student(3, "David", 1.6, new SimpleDateFormat("yyyy-MM-dd").parse("1995-01-21"));
        Student Sam = new Student(4, "Sam", 4.0, new SimpleDateFormat("yyyy-MM-dd").parse("2003-12-09"));
        List<Student> list = new ArrayList<>();
        list.add(Adam);
        list.add(Beck);
        list.add(David);
        list.add(Sam);

        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(list, Main::NameComparator);
        for(Student student : list) print(student);

        System.out.println("Sort by ascending order of 'gpa'");
        Collections.sort(list, Main::GpaComparator);
        for(Student student : list) print(student);

        System.out.println("Sort by ascending order of 'dateOfBirth'");
        Collections.sort(list, Main::DateOfBirthComparator);
        for(Student student : list) print(student);
    }

    //NameComparator: Student objects should be sorted in ascending order by 'name' field of the object;
    public static int NameComparator(Student a, Student b) {
        return a.name.compareTo(b.name);
    }

    //GpaComparator: Student objects should be sorted in descending order by 'gpa' field of the object;
    public static int GpaComparator(Student a, Student b) {
        if(a.gpa > b.gpa) return -1;
        else if (a.gpa > b.gpa) return 0;
        else return 1;
    }

    //DateOfBirthComparator: Student objects should be sorted in ascending order by 'dateOfBirth' field of the object;
    public static int DateOfBirthComparator(Student a, Student b) {
        return a.dateOfBirth.compareTo(b.dateOfBirth);
    }

    public static void print(Student student) {
        System.out.print("ID: " + student.id + " Name: " + student.name + " Gpa: " + student.gpa + " DateOfBirth: " + student.dateOfBirth);
        System.out.println();
    }
}
