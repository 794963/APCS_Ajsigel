
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner
{
    // instance variables - replace the example below with your own

    public StudentRunner()
    {
        // initialise instance variables

    }

    public static void main(){
        Student s1 = new Student("Joe",12345);
        System.out.println("Student's name: " + s1.getName() + "   Student's number: " + s1.getNum());

        Student s2 = new Student("Bob",54321);
        System.out.println("Student's name: " + s2.getName() + "   Student's number: " + s2.getNum());

        Student s3 = new Student("Guy",99999);
        System.out.println("Student's name: " + s3.getName() + "   Student's number: " + s3.getNum());
    }
}
