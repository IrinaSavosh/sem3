package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComporator;

public class TeacherService implements iUserService<Teacher>{
   private String acadDegree;
   private List<Teacher> teachers;
   public TeacherService() {
      this.teachers = new ArrayList<Teacher>();

   }
   @Override
   public List<Teacher> getAll() {
      return teachers;
   }
   @Override
   public void create(String firstNAme, String secondName, int age) {
      Teacher per = new Teacher(firstNAme, secondName, age, acadDegree);

      teachers.add(per);
   }

   public List <Teacher> getSortedFIOTeachersList(){
      List<Teacher> newTeachersList = new ArrayList<Teacher>(teachers);
      teachers.sort(new UserComporator<Teacher>());
      return newTeachersList;
   }
   

}
