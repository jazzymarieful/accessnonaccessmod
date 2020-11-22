package sr.unasat.modifiers.app;

import sr.unasat.modifiers.model.Lecturer;
import sr.unasat.modifiers.model.Student;

public class Application {

    public static void main(String[] args) {
        Student stud1 = new Student("Math");
        stud1.iLove();
        Lecturer lec1 = new Lecturer("Chemistry");
        lec1.iLove();
        Student stud2 = new Student("Gym");
        stud2.iLove();
        stud1.iLove();
        Lecturer lec2 = new Lecturer("Physics");
        lec2.iLove();
        stud1.iLove();
        stud2.iLove();
        lec1.iLove();
    }
}
