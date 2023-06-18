import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Controllers.TeachherController;
import Services.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentsTeam;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentDomen.UserComporator;

public class App {
    public static void main(String[] args) throws Exception {
        // Создание объекта User
        User u1 = new Student("Сергей", "Иванов", 25, 0);
        User u2 = new Emploee("Петр", "Петров", 24, "basic");
        AverageAge<User> meanU = new AverageAge<User>();
        
        System.out.println(meanU.mean(u1, u2));
        System.out.println("______________________________");

        // Создание объектов Student
        Student s1 = new Student("Сергей", "Иванов", 23, 101);
        Student s2 = new Student("Андрей", "Сидоров", 24, 125);
        UserComporator<Student> compS = new UserComporator<Student>();
        compS.compare(s1, s2);
        System.out.println();

        Student s3 = new Student("Петр", "Николаев", 25, 101);
        Student s4 = new Student("Валентина", "Тимофеева", 22, 9654);
        Student s5 = new Student("Елена", "Рогова", 23, 3651);
        Student s6 = new Student("Михаил", "Сивцов", 24, 2106);
        Student s7 = new Student("Римма", "Спиридонова", 22, 651);

        // создание списков студентов
        List<Student> ListStud1 = new ArrayList<Student>();
        List<Student> ListStud2 = new ArrayList<Student>();
        // добавление объектов Student в список
        ListStud1.add(s1);
        ListStud2.add(s2);
        ListStud1.add(s3);
        ListStud2.add(s4);
        ListStud1.add(s5);
        ListStud2.add(s6);
        ListStud1.add(s7);

        AverageAge<Student> meanAge = new AverageAge<Student>();

        System.out.println(meanAge.mean(ListStud1));
        System.out.println("______________________________");

        // создание объектов StudentGroup
        StudentGroup ListGroup1 = new StudentGroup(ListStud1, 1252);
        StudentGroup ListGroup2 = new StudentGroup(ListStud2, 546);

        /*
         * печать начального списка -> сортировка списка -> вывод отсортированного
         * списка
         * for(Student stud: ListStud1){
         * System.out.println(stud);
         * }
         * 
         * System.out.println();
         * 
         * for(Student stud: ListGroup2){
         * System.out.println(stud);
         * }
         * 
         * Collections.sort(ListGroup1.getStudents());
         * 
         * for(Student stud: ListStud1){
         * System.out.println(stud);
         * }
         */

        // создание списка групп
        List<StudentGroup> team1 = new ArrayList<StudentGroup>();
        // добавление групп в список
        team1.add(ListGroup1);
        team1.add(ListGroup2);

        // создание объекта StudentsTeam
        StudentsTeam ListTeam1 = new StudentsTeam(1, team1);

        // печать начального списка -> сортировка списка -> вывод отсортированного
        // списка
        for (StudentGroup group : ListTeam1) {
            System.out.println(group);
        }
        Collections.sort(ListTeam1.getListGroup());
        System.out.println();
        System.out.println();
        for (StudentGroup group : ListTeam1) {
            System.out.println(group);
        }

        /*
         * 1) Создать класс StudentSteam(поток студентов с полем номер потока)
         * содержащий в себе список учебных групп(StudentGroup). ГОТОВО
         * 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for
         * несколько групп со списком студентов на кансоль ГОТОВО
         * 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по
         * количеству студентов в группе) и отсортировать
         * группы студентов в потоке, а затем вывести в консоль ГОТОВО
         */

        /*
         * (задача со *)
         * 1) Отсортировать группы студентов в потоке сначало по количеству студентов, а
         * затем по идентификатору группы ГОТОВО
         * 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор
         * группы, количество студентов и список студентов)
         * и StudentSteam(выводить номер потока, количество групп и список студентов с
         * указанием идентификатора группы) ГОТОВО ЧАСТИЧНО
         */

        /*
         * 1) Создать класс TeacherService и реализовать аналогично проделанному на
         * семинаре. Подключить обобщенный интерфейс iUserService.
         * Добавить метод вывода списка учителей отсортированного обобщенным классом
         * UserComparator ГОТОВО
         * 2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс
         * iUserController. ГОТОВО
         * 3) Разработать обобщенный класс AverageAge для подсчета среднего возраста
         * студентов, учителей и работников. Вывести результат работы класса на консоль.
         * ГОТОВО
         * 
         * (Задача со *) Переписать иерархию User->Student/Teacher/Emploee в иерархию
         * обобщенных типов. НЕ ГОТОВО
         */

        System.out.println();
        Emploee per1 = new Emploee("Борис", "Иванов", 40, "basic");

        EmploeeController.paySalary(per1);

        // empContr.paySalary(per1);

        System.out.println();
        Teacher t1 = new Teacher("Василий", "Кравцов", 35, "master");
        TeachherController.paySalary(t1);
        // tContr.paySalary(t1);
    }

}
