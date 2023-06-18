package Services;

import java.util.List;

public interface iUserService<T>  {
   List<T> getAll();
   void create (String firstNAme, String secondName, int age);
}
