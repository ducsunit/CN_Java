package com.ducsunit;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    private String fullName;
    private int age;

    public Student() {}
    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputInfo(){
        System.out.println("Nhap so luong: ");
        int soLuong = sc.nextInt();
        for(int i=0;  i < soLuong; i++){
            sc.nextLine();
            Student s = new Student();
            System.out.println("Nhap ten: ");
            s.setFullName(sc.nextLine());
            System.out.println("Nhap tuoi: ");
            s.setAge(sc.nextInt());
            students.add(s);
        }
    }

    public void printInfo(){
        for (Student student : students) {
            System.out.println(student.getFullName() + " " + student.getAge());
        }
    }
}
