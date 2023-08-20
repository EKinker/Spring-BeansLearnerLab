package rocks.zipcode.beans.learner.configuration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.beans.learner.models.Students;

import static org.junit.jupiter.api.Assertions.*;

//Part 11.0 - Test Config classes
//        Each of the following Test classes should be annotated with
//@RunWith(SpringRunner.class)
//enforces which strategy junit should use to run tests
//@SpringBootTest
//indicates that this class is a Spring Boot test class
//provides support to scan for a ContextConfiguration that tells the test class how to load the ApplicationContext.
//        If no ContextConfiguration classes are specified as a parameter to the @SpringBootTest annotation, the default behavior is to load the ApplicationContext by scanning for a @SpringBootConfiguration annotation on a class in the package root.
//        Each bean can be injected into the class scope using @Autowired along with @Qualifier(name = "beanname")
//Part 11.1 - Test StudentConfig Class
//        Create a TestStudentConfig class in the test package.
//        The class should ensure that each Bean in the StudentConfig class is configured as expected.
//        Tip: You can use the toString method to get a representation of the aggregate state of any People object.

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {

    @Autowired
    private Students students;
    @Test
    void currentStudents() {

        String expected = "People: \n" +
                "Name: Liz, ID: 1123\n" +
                "Name: Danielle, ID: 5813\n" +
                "Name: Olamide, ID: 2134";
        String actual = students.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void previousStudents() {
    }
}