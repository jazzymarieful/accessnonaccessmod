package sr.unasat.modifiers.model;

abstract class Person {

    private String name;
    private String dob;
    public static int countILoveAnswers;

    public void introduce() {
        System.out.println("Hi my name is" + name);
    }

    public abstract void iLove();
}
