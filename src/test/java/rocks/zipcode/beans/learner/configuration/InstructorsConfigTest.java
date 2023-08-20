package rocks.zipcode.beans.learner.configuration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.beans.learner.models.Instructors;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorsConfigTest {

    @Autowired
    private Instructors instructors;

    @Autowired
    @Qualifier("tcUSAInstructors")
    private Instructors tcUSA;

    @Autowired
    @Qualifier("tcUKInstructors")
    private Instructors tcUK;

    @Test
    void tcUSAInstructors() {
        String expected = """
                Name: Randall, ID: 666
                Name: Blaine, ID: 1332
                Name: Mordred, ID: 1998""";
        String actual = tcUSA.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void ucUKInstructors() {
        String expected = """
                Name: Roland, ID: 19
                Name: Susannah, ID: 38
                Name: Eddie, ID: 57""";
        String actual = tcUK.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void instructors() {
        String expected = """
                Name: Kris, ID: 42
                Name: Dolio, ID: 84
                Name: Dan, ID: 126""";
        String actual = instructors.toString();
        Assert.assertEquals(expected, actual);
    }
}