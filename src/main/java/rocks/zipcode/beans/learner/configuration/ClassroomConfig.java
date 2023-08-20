package rocks.zipcode.beans.learner.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import rocks.zipcode.beans.learner.models.Classroom;
import rocks.zipcode.beans.learner.models.Instructors;
import rocks.zipcode.beans.learner.models.Students;

@Configuration
public class ClassroomConfig {

    @Autowired
    Instructors instructors;

    @Autowired
    Students students;


    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents) {
        return new Classroom(instructors, previousStudents);
    }

}
