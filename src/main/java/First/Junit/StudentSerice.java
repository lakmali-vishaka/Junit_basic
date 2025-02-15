package First.Junit;

import java.util.ArrayList;
import java.util.List;

public class StudentSerice {

    private static List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }
public static void addStudent(Student student){
        students.add(student);
}

}
