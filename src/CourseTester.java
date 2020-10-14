import java.util.ArrayList;

public class CourseTester {
    public static void main(String[] args)
    {
        Course Class1 = new Course();

        // test addstudent
        System.out.println("Adding new Student to the Course ...");
        System.out.println(" ");
        System.out.println(Class1.addStudent("David", "Blaine"));

        // test findstudent
        System.out.println(" ");
        System.out.println("finding student ...");
        System.out.println(Class1.findStudent(10000001));

        // test deleteStudent
        System.out.println(" ");
        System.out.println("removing student ...");
        System.out.println(Class1.deleteStudent(10000001));

        // test addstudent
        System.out.println(" ");
        System.out.println("Adding new Student to the Course ...");
        System.out.println(Class1.addStudent("Saeed", "Karimi"));
        System.out.println(" ");
        System.out.println("Adding new Student to the Course ...");
        System.out.println(Class1.addStudent("David", "Blaine"));
        System.out.println(" ");
        System.out.println("Adding new Student to the Course ...");
        System.out.println(Class1.addStudent("Bill", "Gates"));

        // test findstudent again
        System.out.println(" ");
        System.out.println("finding student ...");
        System.out.println(Class1.findStudent(10000003));

        // test addquiz
        System.out.println(" ");
        System.out.println("adding quizzes to students ...");
        System.out.println(Class1.addQuiz(10000001, 10,6));
        System.out.println(Class1.addQuiz(10000002, 10,8));
        System.out.println(Class1.addQuiz(10000002, 10,4));
        System.out.println(Class1.addQuiz(10000003, 10,5));
        System.out.println(Class1.addQuiz(10000003, 10,3));
        System.out.println(Class1.addQuiz(10000004, 10,5));
        System.out.println(Class1.addQuiz(10000004, 10,6));

        // test findTopStudent
        System.out.println(" ");
        System.out.println("finding top students ...");
        System.out.println(Class1.findTopStudent());

        // test getAverage of course
        System.out.println(" ");
        System.out.println("finding the average of the class ...");
        System.out.println(Class1.getAverage());
    }
}
