package main;

import model.Student;
import studentManager.StudentManager;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String[] studFile={};
        try {
            FileManager.createFile("objFile","students.rtf");
            //main.FileManager.writeFile("objFile/students.rtf","Spogk");
            studFile = FileManager.readFile("objFile/students.rtf");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Student[] students=StudentManager.createStudentsFromFile(studFile);

        //1
        System.out.println("Full names");
        StudentManager.printFullName(students);

        //2
        System.out.println("print all male students");
        StudentManager.printAllMaleStudents(students);
        //3
        System.out.println("print all female having mark more than 50.4");
        StudentManager.printAllFemaleStudentsHavingMoreMark(students);
        //4
        System.out.println("student with minimal mark");
        StudentManager.printStudentWithMinimalMark(students);

        //5
        System.out.println("biggest male student");
        StudentManager.printBiggestMaleStudent(students);

        //6
        System.out.println("sorted by mark");
        StudentManager.printSortedByMark(students);

        //7
        System.out.println("female sorted by year");
        StudentManager.printFemaleSortedByYear(students);












    }
}
