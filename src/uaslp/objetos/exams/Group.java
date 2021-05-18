package uaslp.objetos.exams;
import java.util.LinkedList;
import java.util.List;

public class Group {
    List<Student> list = new LinkedList<>();
    int avaiability, capacity;
    double generalAverage;



    public Group(int size) {
        this.capacity = size;
    }


    public void addStudent(Student student) {
        if (avaiability == 0)
            list.add(student);
        else if( avaiability < capacity){

        }
    }

    int getCapacity() {
        return capacity;
    }

    int getAvailability() {
        return avaiability;
    }

    List<Student> getStudents() {
        return this.list;
    }

    public double getAverage(){
        for(int i=0;i<capacity;i++)
        {
            generalAverage += list.get(i).getAverage();
        }
        generalAverage/=capacity;
        return generalAverage;
    }

}
