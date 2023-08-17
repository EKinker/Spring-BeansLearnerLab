package rocks.zipcode.beans.learner.models;

import rocks.zipcode.beans.learner.models.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
