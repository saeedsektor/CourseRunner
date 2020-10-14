import java.util.ArrayList;

/**
 * The type Quiz.
 */
public class Quiz {
    // instance variables
    private double scale;
    private double studentGrade;

    /**
     * Instantiates a new Quiz.
     *
     * @param scale        the scale
     * @param studentGrade the student grade
     */
    public Quiz(double scale, double studentGrade){
        this.scale = scale;
        this.studentGrade = studentGrade;
    }

    /**
     * Get grade double.
     *
     * @return the double
     */
    public double getGrade(){
        return this.studentGrade;
    }



}
