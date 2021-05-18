package uaslp.objetos.exams;
import java.util.ArrayList;
import java.util.List;

public class Student{
     List<Student> array;
     int size;
     String studentName;
     int studentID;
     double[] score;
     double prom;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
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

    public void setAverage(){
        for (int i = 0; i < size; i++) {
            prom += score[i];
        }
        prom /= size;
    }

    public double getAverage() {
        return prom;
    }

}
