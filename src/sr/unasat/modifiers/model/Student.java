package sr.unasat.modifiers.model;

public class Student extends Person {

    private String favoriteCourse;
    boolean isAlreadyAnswered = false;

    public Student(String favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    public void iLove() {
        System.out.println("I love " + favoriteCourse);
        if (!isAlreadyAnswered) {
            isAlreadyAnswered = true;
            countILoveAnswers += 1;
            System.out.println(countILoveAnswers);
        }

    }

}
