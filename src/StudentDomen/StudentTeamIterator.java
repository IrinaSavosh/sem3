package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentTeamIterator implements Iterator<StudentGroup>{
   private int count;
   private List<StudentGroup> studentGroups;


   /**
    * @param studentGroups - список групп студентов
    */
   public StudentTeamIterator(List<StudentGroup> studentGroups) {
      this.count = 0;
      this.studentGroups = studentGroups;
   }
   @Override
   public boolean hasNext() {
      return count < studentGroups.size();
   }
   @Override
   public StudentGroup next() {
      if (!hasNext()){
         return null; 
      }
      return studentGroups.get(count++);
   }
   
}
