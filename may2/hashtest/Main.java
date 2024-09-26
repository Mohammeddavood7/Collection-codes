package com.may2.hashtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
    private Integer studentId;
    private String studentName;
    private Double GPA;

    public Student(Integer studentId, String studentName, Double GPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student [StudentId=" + studentId + ", StudentName=" + studentName + ", GPA=" + GPA + "]";
    }
}

class SortByStudentId implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStudentId().compareTo(s2.getStudentId());
    }
}

class SortByStudentName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStudentName().compareTo(s2.getStudentName());
    }
}

class SortByStudentGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGPA().compareTo(s2.getGPA());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Ramana chary", 9.8));
        studentList.add(new Student(102, "Amith shah", 8.2));
        studentList.add(new Student(103, "Akash singh", 9.4));

        Collections.sort(studentList, new SortByStudentId());
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();

        Collections.sort(studentList, new SortByStudentName());
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println();
        Collections.sort(studentList, new SortByStudentGPA());
        for (Student student : studentList) {
            System.out.println(student);
        }
        
       
        Collections.sort(studentList,(m,n)->n.getStudentName().compareTo(m.getStudentName()));
        Iterator<Student> it = studentList.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
    }
}
