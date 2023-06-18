package Services;

import java.util.ArrayList;
import java.util.List;


import StudentDomen.Student;
import StudentDomen.UserComporator;

public class StudentService implements iUserService<Student> {
   private int count;
   private List<Student> students;
   public StudentService() {
      this.students = new ArrayList<Student>();
      
   }
   @Override
   public List<Student> getAll() {
      return students;
   }
   @Override
   public void create(String firstNAme, String secondName, int age) {
      Student per = new Student(firstNAme, secondName, age, count);
      count++;
      students.add(per);
     
   }

   public List <Student> getSortedFIOStudentsList(){
      List<Student> newStudList = new ArrayList<Student>(students);
      students.sort(new UserComporator<Student>());
      return newStudList;
   }
      
}
