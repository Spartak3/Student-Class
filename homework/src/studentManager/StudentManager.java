package studentManager;

import model.Student;

public class StudentManager {



    public static Student[] createStudentsFromFile(String[] students){
        String[] currStud;
        Student[] studentsR=new Student[students.length];
        for (int i=0;i<students.length;i++){
            currStud=students[i].split(",");
            studentsR[i]=new Student(currStud[0],currStud[1],Integer.parseInt(currStud[2]));
            studentsR[i].setGender(currStud[3].charAt(0));
            studentsR[i].setMark(Double.parseDouble(currStud[4]));
        }

        return studentsR;

    }


    //1
    public static void printFullName(Student[] students){
        for (Student student:students){
            System.out.println(student.getFirstName()+" "+student.getLastName());
        }
    }

    //2
    public static void printAllMaleStudents(Student[] students){
        for (Student student:students){
            if(student.getGender()=='m')
                System.out.println(student);
        }
    }

    //3
    public static void printAllFemaleStudentsHavingMoreMark(Student[] students){
        for (Student student:students){
            if(student.getGender()=='f' && student.getMark()>50.4)
                System.out.println(student);
        }
    }



    //4
    public static void printStudentWithMinimalMark(Student[] students){
        Student minimalMarkStudent=students[0];
        for (int i=1;i<students.length;i++){
            if(students[i].getMark()<minimalMarkStudent.getMark()){
                minimalMarkStudent=students[i];
            }
        }

        System.out.println(minimalMarkStudent);
    }

    //5
    public static void printBiggestMaleStudent(Student[] students){
        Student biggestMale=students[0];
        for (int i=1;i<students.length;i++){
            if(students[i].getGender()=='m'){
                if(biggestMale.getYear()>students[i].getYear()){
                    biggestMale=students[i];
                }
            }
        }

        System.out.println(biggestMale);
    }


    //6
    public static void printSortedByMark(Student[] students){

        int counter=0;
        for (int i=0;i<students.length-counter;i++){
            for (int j=0;j<students.length-1;j++){
                if(students[j].getMark()>students[j+1].getMark()){
                    Student tmpStudent=students[j+1];
                    students[j+1]=students[j];
                    students[j]=tmpStudent;
                }

            }
        }

        for (Student student:students){
            System.out.println(student);
        }
    }



    public static void printFemaleSortedByYear(Student[] students){

        int s=0,k=0;
        for (int i=0;i<students.length;i++){
            if(students[i].getGender()=='f'){
                s++;
            }
        }
        Student[] studentsF=new Student[s];
        for (int i=0;i<students.length;i++){
            if(students[i].getGender()=='f'){
                studentsF[k++]=students[i];
            }
        }


        int counter=0;
        for (int i=0;i<studentsF.length-counter;i++){
            for (int j=0;j<studentsF.length-1;j++){
                if(studentsF[j].getYear()>studentsF[j+1].getYear()){
                    Student tmpStudent=studentsF[j+1];
                    studentsF[j+1]=studentsF[j];
                    studentsF[j]=tmpStudent;
                }

            }
        }

        for (Student student:studentsF){
            System.out.println(student);
        }
    }














}
