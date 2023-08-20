package rocks.zipcode.beans.learner.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import rocks.zipcode.beans.learner.models.Instructor;
import rocks.zipcode.beans.learner.models.Instructors;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors(){
        Instructors usa = new Instructors();
        usa.add(new Instructor(666L,"Randall"));
        usa.add(new Instructor(1332L, "Blaine"));
        usa.add(new Instructor(1998L, "Mordred"));

        return usa;
    }

    @Bean
    public Instructors tcUKInstructors(){
        Instructors uk = new Instructors();
        uk.add(new Instructor(19L, "Roland"));
        uk.add(new Instructor(38L, "Susannah"));
        uk.add(new Instructor(57L, "Eddie"));

        return uk;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors zcw = new Instructors();
        zcw.add(new Instructor(42L, "Kris"));
        zcw.add(new Instructor(84L, "Dolio"));
        zcw.add(new Instructor(126L, "Dan"));

        return zcw;
    }


}
