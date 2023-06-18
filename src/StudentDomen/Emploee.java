package StudentDomen;

public class Emploee extends User{
    private String special;
    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
}
