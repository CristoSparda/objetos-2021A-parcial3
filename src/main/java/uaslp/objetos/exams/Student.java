package uaslp.objetos.exams;
import java.util.ArrayList;
import java.util.List;

public class Student{
    int size;
     String studentName;
     int studentID;
     private Integer score[];

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        score = new Integer[3];
    }

    public int getCode(){
         return studentID;
     }

     public String getName(){
         return studentName;
    }

    public void setScore(int position,int score){
        if( position > 3 || position < 1)
            throw new InvalidPartialException();
            this.score[position-1] = score;
    }

    public double getAverage() {
        double average = 0;
        for(int i=0;i<3;i++){
            if( score[i] == null )
                throw new MissingScoreException("Missing partial " + (i+1));
            average = average + score[i];
        }
        average = average / 3;
        return average;
    }

}
