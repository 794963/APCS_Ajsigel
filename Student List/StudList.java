
/**
 * Write a description of class StringSearcher here.
 *
 * @author (jaan sigel
 * @version (1031
 */
import java.util.*;
public class StudList
{
    int x =0;
    
    /**
     * Constructor for objects of class StudList
     */
    public StudList()
    {
        // initialise instance variables
        
    }

    public void addStudent(String fullName){
       
       Student s1 = new Student(fullName);
       System.out.println("Enter the student's gpa (enter with deciamls)");
       //inputStr = kb.nextLine();
    }
    public void deleteStudent(String lastName){
        
    }
    public void deleteStudent(int stuNumber){
    
    }
    public void editStudentList(String lastName){
        
    }
    public void editStudentList(int stuNumber){
        
    }
    public void clearList(){
    
    }
    public void printList(){
        
    }
    public void printStudent(String lastName){
        
    }
    public void printStudent(int stuNumber){
    
    }
    public void sortStudents(String lastName){
    
    }
    public void sortStudents(int stuNumber){
    
    }
    public void help(){
    System.out.println();
    }
    public ArrayList<Student> filterSearchStudentList(String key){
        ArrayList<Student> sk = new ArrayList<Student>();
        
        return sk;
    }
}
