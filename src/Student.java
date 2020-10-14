import java.util.ArrayList;

/**
 * The type Student.
 */
public class Student {

    // field instances go here
    private String name;
    private String surname;
    private String loginId;
    private long studentId;

    // static studentId for each student
    private static long studentIdCounter = 10000000;

    // each student has a List of quizzes
    private ArrayList<Quiz> quizzes;

    /**
     * Instantiates a new Student.
     *
     * @param firstname the firstname
     * @param lastname  the lastname
     */
    public Student(String firstname, String lastname){
        name = firstname;
        surname = lastname;
        studentIdCounter++;
        studentId = studentIdCounter;
        int stuNumLength = String.valueOf(studentId).length();

        loginId = name.charAt(0) + surname.substring(0,4) + String.valueOf(studentId).substring(stuNumLength-2);
        quizzes = new ArrayList<Quiz>();
    }

    /**
     * Set name.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public void setName(String firstName, String lastName){
        name = firstName;
        surname = lastName;
    }

    /**
     * Add quiz.
     *
     * @param scale        the scale
     * @param studentGrade the student grade
     */
    public void addQuiz(double scale, double studentGrade){
        quizzes.add(new Quiz(scale,studentGrade));
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return name+" "+surname;
    }

    /**
     * Get student number long.
     *
     * @return the long
     */
    public long getStudentNumber(){
        return studentId;
    }

    /**
     * Get login id string.
     *
     * @return the string
     */
    public String getLoginId(){
        return loginId;
    }

    /**
     * Get info string.
     *
     * @return the string
     */
    public String getInfo(){
        return name+","+surname+"("+studentId+","+loginId+")";
    }

    /**
     * Gets average.
     *
     * @return the average
     */
    public double getAverage() {
        double total = 0;
        for(Quiz q: this.quizzes){
            total += q.getGrade();
        }
        return total / this.quizzes.size();
    }

    public String toString(){
        return "[name: "+name+", surname:"+surname+"(StudnetId:"+studentId+", loginId:"+loginId+")]";
    }

}
