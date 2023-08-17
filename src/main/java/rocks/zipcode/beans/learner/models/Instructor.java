package rocks.zipcode.beans.learner.models;

import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int learnerCount = (int) StreamSupport.stream(learners.spliterator(), false).count();
        double numberOfHoursPerLearner = numberOfHours / learnerCount;

        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner); // Learn learn = new Learn(learnlearnlearn);
        }
    }
}
