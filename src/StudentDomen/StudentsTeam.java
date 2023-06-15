package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentsTeam implements Iterable<StudentGroup> {
   // 1) Создать класс StudentSteam(поток студентов с полем номер потока)
   // содержащий в себе список учебных групп(StudentGroup).
   // 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for
   // несколько групп со списком студентов на кансоль

   private int team;
   private List<StudentGroup> listGroup;

   /**
    * @param team - номер потока студентов
    * @param listGroup - список групп студентов
    */
   public StudentsTeam(int team, List<StudentGroup> listGroup) {
      this.team = team;
      this.listGroup = listGroup;
   }

   public int getTeam() {
      return team;
   }

   public void setTeam(int team) {
      this.team = team;
   }

   public List<StudentGroup> getListGroup() {
      return listGroup;
   }

   public void setListGroup(List<StudentGroup> listGroup) {
      this.listGroup = listGroup;
   }

   @Override
   public Iterator<StudentGroup> iterator() {
      return new StudentTeamIterator(listGroup);
   }
   // 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор
   // группы, количество студентов и список студентов)
   // и StudentSteam(выводить номер потока, количество групп и список студентов с
   // указанием идентификатора группы)

   @Override
   public String toString() {
      return "Team:: nameTeam " + this.getTeam() + ", number of groups " + this.getListGroup().size();
   }

}
