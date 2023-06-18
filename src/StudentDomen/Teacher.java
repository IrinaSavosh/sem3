package StudentDomen;

public class Teacher extends User implements Comparable<Teacher> {

    private String acadDegree;
    /**
     * @param firstName - имя учителя
     * @param secondName - фамилия учителя
     * @param age - возраст учителя
     * @param acadDegree - научная степень учителя
     */
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;


    }

    public String getAcadDegree() {
        return acadDegree;
    }
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
   public String toString() {

      return "Teacher:: acadDegree " + acadDegree + ", firstName = " + super.getFirstName() + ", secondName = "
            + super.getSecondName() + ", age = " + super.getAge();
   }

    @Override
    public int compareTo(Teacher o) {
        System.out.println(super.getFirstName() + " - " + o.getFirstName());
    
         if (super.getAge() == o.getAge()) {

            return 0;
         }
         if (super.getAge() < o.getAge()) {
            return -1;
         }
         return 1;
     
    }
   
}
