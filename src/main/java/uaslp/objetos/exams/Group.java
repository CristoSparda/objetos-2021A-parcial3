package uaslp.objetos.exams;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private List<Student> list;
    int avaiability, capacity;
    double generalAverage;



    public Group(int size) {
        this.capacity = size;
        this.avaiability = capacity;
        list = new ArrayList<>(capacity);
    }


    public void addStudent(Student student) {
        if (avaiability <= 0)
            throw new GroupIsFullException();
        list.add(student);
        avaiability--;

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
        Student student;
        for(int i=0;i< list.size();i++)
        {
            student = list.get(i);
            generalAverage += student.getAverage();
        }
        generalAverage/=list.size();
        return generalAverage;
    }

}
