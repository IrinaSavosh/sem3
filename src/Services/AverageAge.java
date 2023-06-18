package Services;

import java.util.List;

import StudentDomen.User;

public class AverageAge<T extends User> {

   /*
    * АНДРЕЙ,
    * почему я не могу сделать этот метод статичным?  Выдает ошибку:
    * Illegal modifier for the class AverageAge; only public, abstract & final are permitted
    */
   /**
    * @param mean - среднее арифмитическое
    */
   public double mean;

   /**
    * @param listT - список объектов
    * @return возвращает среднее арифметическое
    */
   public double mean(List<T> listT) {
      double sum = 0;
      for (T t : listT) {
         sum = sum + t.getAge();
      }
      mean = sum / listT.size();
      return mean;
   }

   /**
    * @param o1 - объект 1
    * @param o2 - объект 2
    * @return возвращает среднее арифметическое
    */
   public double mean(T o1, T o2) {
      mean = ((double)o1.getAge() + (double)o2.getAge()) / 2;
      return mean;
   }
}
