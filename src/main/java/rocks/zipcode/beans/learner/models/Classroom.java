package rocks.zipcode.beans.learner.models;

import rocks.zipcode.beans.learner.models.interfaces.Teacher;

public class Classroom {

    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students){
        this.instructors= instructors;
        this.students= students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
