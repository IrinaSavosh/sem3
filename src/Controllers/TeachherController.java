package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeachherController implements iUserController<Teacher>{
   public final TeacherService empServ = new TeacherService();

   @Override
   public void create(String firstName, String secondName, int age) {
      empServ.create(firstName, secondName, age);
   }

   static public<T extends Teacher> void paySalary(T user){  // модификатор static позволяет обращаться к методу без создания объекта
      System.out.println(user.getFirstName() + " выплачена зарплата 10 000 рублей");
   }
}
