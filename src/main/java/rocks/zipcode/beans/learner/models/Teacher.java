package rocks.zipcode.beans.learner.models;

public interface Teacher {
    public void lecture(Iterable<? extends Learner> learners, double NumberOfHours);
}
