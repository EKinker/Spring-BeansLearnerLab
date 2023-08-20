package rocks.zipcode.beans.learner.models;

import java.util.Iterator;

public class Students extends People<Student>{

    public Students(Student...students){
        super(students);
    }

}
