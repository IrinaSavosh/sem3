package Controllers;

import Services.EmploeeService;
import StudentDomen.Emploee;


public class EmploeeController implements iUserController<Emploee> {
   public final EmploeeService empServ = new EmploeeService();

   @Override
   public void create(String firstName, String secondName, int age) {
      empServ.create(firstName, secondName, age);

   }

   static public<T extends Emploee> void paySalary(T user){
      System.out.println(user.getFirstName() + " выплачена зарплата 10 000 рублей");
   }
}
