package ru.gb.oseminar;

import ru.gb.oseminar.controller.StudentController;
import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("a","a", "a", LocalDate.parse("2001-01-01"));
        studentController.createStudentGroup(new Teacher("b","b", "b", LocalDate.parse("1980-01-01")),controler.);
    }
}
