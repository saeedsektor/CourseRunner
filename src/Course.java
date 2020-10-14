import java.util.ArrayList;

/**
 * The type Course.
 */
public class Course {

    // instance fields
    private ArrayList<Student> students;


    /**
     * Instantiates a new Course.
     * Constructor
     */

    public Course(){
         students = new ArrayList<Student>();
    }

    /**
     * Add student student.
     *
     * @param name       the name
     * @param familyName the family name
     * @return the student
     * Add a new student to the list of the students, and return reference of the
     * newly created student. In case of failure it return null
     */

    Student addStudent (String name, String familyName){
        students.add(new Student(name,familyName));
        return students.get(students.size()-1);
    }

    /**
     * Find student student.
     *
     * @param studentId the student id
     * @return the student
     * Return a reference of the student. In case student is not found it return null
     */
    Student findStudent (long studentId){
        for(Student s: this.students){
            if(s.getStudentNumber() == studentId){
                return s;
            }
        }
        return null;
    }

    /**
     * Delete student student.
     *
     * @param studentId the student id
     * @return the student
     * Remove the student from the list and return reference of the student
     * being removed. In case student is not found it returns null
     */

    Student deleteStudent (long studentId){
        for(Student s: this.students){
            if(s.getStudentNumber() == studentId){
                this.students.remove(s);
                return s;
            }
        }
        return null;
    }

    /**
     * Add quiz boolean.
     * adds a quiz to a student given studentId
     * scale: the scale of the quiz
     * studentGrade: the grade student achieved
     *
     * @param StudentId    the student id
     * @param scale        the scale
     * @param studentGrade the student grade
     * @return the boolean
     * return true is case succeed, or false in case of failure
     */
    public boolean addQuiz(long StudentId, double scale, double studentGrade){
        for(Student s: this.students){
            if(s.getStudentNumber() == StudentId){
                s.addQuiz(scale, studentGrade);
                return true;
            }
        }
        return false;
    }

    /**
     * Find top student student.
     *
     * @return the student
     * Return reference of the student with the highest average quiz
     */
    Student findTopStudent(){
        double highest = 0;
        for(Student s: this.students){
            highest = s.getAverage();
            if(s.getAverage() >= highest ){
                return s;
            }
        }
        return null;
    }

    /**
     * Find top student student.
     *
     * @return the average
     * Return the average of the course. (average of the average of the students
     */
    public double getAverage (){
        double total = 0;
        for(Student s: this.students){
            total += s.getAverage();
        }
        return total / this.students.size();
    }
}
