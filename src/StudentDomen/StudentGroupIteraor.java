package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIteraor implements Iterator<Student> {
   private int counter;
   private final List<Student> students;

   /**
    * @param students - список студентов
    */
   public StudentGroupIteraor(List<Student> students) {
      this.counter = 0;
      this.students = students;
   }

   @Override
   public boolean hasNext() {
      return counter < students.size();
   }

   @Override
   public Student next() {
      if (!hasNext()){
         return null; 
      }
      return students.get(counter++);
   }

}
