package rocks.zipcode.beans.learner.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rocks.zipcode.beans.learner.models.Student;
import rocks.zipcode.beans.learner.models.Students;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Students current = new Students();
        current.add(new Student(1123L, "Liz"));
        current.add(new Student(5813L, "Danielle"));
        current.add(new Student(2134L, "Olamide"));

        return current;
    }

    @Bean
    public Students previousStudents() {
        Students previous = new Students();
        previous.add(new Student(9876L, "Frodo"));
        previous.add(new Student(8765L, "Sam"));
        previous.add(new Student(7654L, "Merri"));
        return new Students();
    }
}
