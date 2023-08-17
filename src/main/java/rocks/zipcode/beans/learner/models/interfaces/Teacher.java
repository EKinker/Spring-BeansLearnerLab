package rocks.zipcode.beans.learner.models.interfaces;

import rocks.zipcode.beans.learner.models.interfaces.Learner;

public interface Teacher {
    public void lecture(Iterable<? extends Learner> learners, double NumberOfHours);
}
