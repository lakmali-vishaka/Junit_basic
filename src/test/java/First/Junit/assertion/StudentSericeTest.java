package First.Junit.assertion;

import First.Junit.Student;
import First.Junit.StudentSerice;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentSericeTest {


    @Test
    public void getStudentsTest(){

        StudentSerice studentService = new StudentSerice();
        //Student student = new Student(1,"ramesh");
        List<Student> ListOfStudents  =studentService.getStudents();
      // StudentSerice.addStudent(student);

        boolean actualResult = ListOfStudents.isEmpty();

        //assertTrue(actualResult);

        //assertTrue(() -> actualResult);

        //assertTrue(actualResult,"List of students is empty");

       // assertTrue(() -> actualResult,"List of student is empty");

       // assertTrue(actualResult,()-> "List of student is empty");

        assertTrue(()-> actualResult,()->"list of student is Empty");
    }

}