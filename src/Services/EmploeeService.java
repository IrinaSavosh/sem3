package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComporator;

public class EmploeeService implements iUserService<Emploee>{
   private String special;
   private List<Emploee> emploees;
   public EmploeeService() {
      this.emploees = new ArrayList<Emploee>();
   }
   @Override
   public List<Emploee> getAll() {
      return emploees;
   }
   @Override
   public void create(String firstNAme, String secondName, int age) {
      Emploee per = new Emploee (firstNAme, secondName, age, special);
      
      emploees.add(per);
   }

   public List <Emploee> getSortedFIOEmploeesList(){
      List<Emploee> newEmploeeList = new ArrayList<Emploee>(emploees);
      emploees.sort(new UserComporator<Emploee>());
      return newEmploeeList;
   }
   
}
