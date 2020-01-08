
/**
 * Write a description of class Student here.
 *
 * @author (Jaan Sigel)
 * @version (821)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String studentName;
    private int studentNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int num)
    {
        studentName = name;
        studentNumber = num;
    }
    
    public String getName(){
        return studentName;
    }

    public int getNum(){
        return studentNumber;
    }
    
}
