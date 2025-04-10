/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENTT;

/**
 *
 * @author CHI KIEN
 */
public class Student {
    String id;
    String name;
    Student next;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
}
