package rocks.zipcode.beans.learner.configuration;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.beans.learner.models.Classroom;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClassroomConfigTest {

    @Autowired
    private Classroom currentCohort;

    @Autowired
    private Classroom previousCohort;


    @Test
    void currentCohort() {
        System.out.println(currentCohort.toString());
    }

    @Test
    void previousCohort() {
    }
}