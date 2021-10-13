package org.mediaagility.training.assignments.first.models;

public class Student {
    private String studentName;
    private int studentAge;
    private String studentSubject;

    public Student() { }
    public Student(String studentName, int studentAge, String studentSubject) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSubject = studentSubject;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.studentSubject = studentSubject;
    }
}
