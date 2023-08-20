package rocks.zipcode.beans.learner.models;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    private Instructors instructors;

    public Alumni(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp(){
        for(Student s: students){
            s.learn(1200);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
