package org.dimigo.inheritance;

public class Student extends Person {
    private String studentId;

    public Student(String studentId, String name, int age, int height, int weight) {
        this.studentId = studentId;

    }
    public Student(String name, int age, int height, int weight) {
        super(name, age, height, weight);
        this.studentId = studentId;
    }

    public Student() {

    }

    public void studyAtNight(){

        System.out.println(getName() + "이/가 야자를 한다.");
    }

    public void rollcall() {
        System.out.println(getName() + "이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}


