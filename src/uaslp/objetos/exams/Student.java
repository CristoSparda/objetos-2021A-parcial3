package uaslp.objetos.exams;
import java.util.ArrayList;
import java.util.List;

public class Student{
     List<Student> array;
     int size;
     String studentName;
     int studentID;
     int[] score;
     int prom;

     public Student(){
         this.array = new Object[2];
     }

    public Student(String name, int id) {
         this.studentName = name;
         this.studentID = id;
    }


    public int getCode(){
         return studentID;
     }

     public String getName(){
         return studentName;
    }

    public void setScore(int position,int score){
         this.score[position] = score;
    }


    public List<Student> getStudents() {
         return array;
    }

    addStudent
}
