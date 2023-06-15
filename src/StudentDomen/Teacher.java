package StudentDomen;

public class Teacher extends User{

    // для будущих разработок
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
}
