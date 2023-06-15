package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

   // 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по
   // количеству студентов в группе) и отсортировать
   // группы студентов в потоке, а затем вывести в консоль

   private List<Student> students;
   private int nameGroup;

   /**
    * @param students - список студентов
    * @param nameGroup - номер группы
    */
   public StudentGroup(List<Student> students, int nameGroup) {
      this.students = students;
      this.nameGroup = nameGroup;
   }

   public int getNameGroup() {
      return nameGroup;
   }

   public void setNameGroup(int nameGroup) {
      this.nameGroup = nameGroup;
   }

   public List<Student> getStudents() {
      return students;
   }

   public void setStudents(List<Student> students) {
      this.students = students;
   }

   @Override
   public Iterator<Student> iterator() {
      return new StudentGroupIteraor(students);
   }
// 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор
        // группы, количество студентов и список студентов)
        // и StudentSteam(выводить номер потока, количество групп и список студентов с
        // указанием идентификатора группы)
   // @Override
   // public String toString() {

   //    return "Group:: nameGroup " + nameGroup + "; list of students in this group" + students;
   // }

@Override
public String toString() {
   return "Group:: nameGroup " + nameGroup + ", number of students " + this.getStudents().size() + ", list of students in this group " + students;
}



   // 1) Отсортировать группы студентов в потоке сначала по количеству студентов, а
   // затем по идентификатору группы
   @Override
   public int compareTo(StudentGroup o) {
      if (this.getStudents().size() == o.getStudents().size()) {
         if (this.nameGroup == o.nameGroup) {
            return 0;
         }
         if (this.nameGroup < o.nameGroup)
            return -1;

         return 1;
      }
      if (this.getStudents().size() < o.getStudents().size()) {
         return -1;
      }
      return 1;

   }

}
