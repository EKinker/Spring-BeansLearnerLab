package rocks.zipcode.beans.learner.models;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void testExecute(){

        List<Student> students = alumni.getStudents().findAll();
        students.stream()
                .map(Student :: getTotalStudyTime)
                .forEach(System.out::println);



    }



}