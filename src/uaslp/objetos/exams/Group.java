package uaslp.objetos.exams;


public class Group implements Student{
    Student student = new Student();
    int avaiability,capacity;

    public Group(int size) {
        this.capacity = size;
    }


    public void addStudent(String studentName, int studentId){
        if(this.student.size == capacity ){
            Object[] anterior = this.student.array;
            this.student.array = new Object[this.student.size * 2];
            for(int i=0 ; i< this.student.size ; i++){
                this.student.array[i] = anterior[i];
            }
        }
        this.student.array[size] =

    }

   int getCapacity(){
       return capacity;
   }

    void getAvailability() {
       return avaiability;
    }

     getStudents(){
       return this.student;
    }

    public int getAverage(){
        for(int i=0 ; i < student.size ; i++){
            student.prom += this.student.score[i];
        }
        student.prom /= student.size;
        return student.prom;
    }

}
