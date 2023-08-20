package rocks.zipcode.beans.learner.configuration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.beans.learner.models.Students;


@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students current;
    @Autowired
    @Qualifier("previousStudents")
    private Students previous;
    @Test
    void currentStudents() {

        String expected = """
                Name: Liz, ID: 1123
                Name: Danielle, ID: 5813
                Name: Olamide, ID: 2134""";
        String actual = current.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void previousStudents() {
        String expected = """
                Name: Frodo, ID: 9876
                Name: Sam, ID: 8765
                Name: Merri, ID: 7654""";
        String actual = previous.toString();

        Assert.assertEquals(expected, actual);
    }
}