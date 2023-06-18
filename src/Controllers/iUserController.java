package Controllers;

import StudentDomen.User;

public interface iUserController <T extends  User> {
   /**
    * @param firstName - имя объекта
    * @param secondName - фамилия объекта
    * @param age - возраст объекта
    */
   void create(String firstName, String secondName, int age);
}
