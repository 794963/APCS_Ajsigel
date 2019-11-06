
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
    Scanner ks = new Scanner(System.in);
    String inputStr1 = "";
    ArrayList<Student> studList = new ArrayList<Student>();
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
       inputStr1 = ks.nextLine();
       s1.gpaSetter(Double.parseDouble(inputStr1));
       System.out.println("Enter the student's number");
       inputStr1 = ks.nextLine();
       s1.stuNumSetter(Integer.parseInt(inputStr1));
       studList.add(s1);
    }
    public void deleteStudent(String lastName){
        for(int i=0;i<studList.size();i++){
        if(studList.get(i).lName.equals(lastName)){
            studList.remove(i);
        }
        }
    }
    public void deleteStudent(int stuNumber){
            for(int i=0;i<studList.size();i++){
                if(studList.get(i).stuNumGetter()==stuNumber){
            studList.remove(i);
        }
    }
    }
    public void editStudentList(String lastName){
         for(int i=0;i<studList.size();i++){
        if(studList.get(i).lName.equals(lastName)){
            System.out.println();
            System.out.println("What do you want to edit?");
            System.out.println("1. Student Number");
            System.out.println("2. Student GPA");
            System.out.println("3. Student Name");
            System.out.println("4. nothing");
            inputStr1 = ks.nextLine();
         if(inputStr1.equals("1")){
            System.out.println();
            System.out.println("Enter the student's number");
            inputStr1 = ks.nextLine();
            studList.get(i).stuNumSetter(Integer.parseInt(inputStr1));
            
            
        } else if(inputStr1.equals("2")){
            System.out.println();
            System.out.println("Enter the student's GPA");
            inputStr1 = ks.nextLine();
            studList.get(i).gpaSetter(Double.parseDouble(inputStr1));
        
        }else if(inputStr1.equals("3")){
            System.out.println();
            System.out.println("Enter the student's name");
            inputStr1 = ks.nextLine();
            studList.get(i).parseName(inputStr1);
        }
        }
        }
    }
    public void editStudentList(int stuNumber){
            for(int i=0;i<studList.size();i++){
                if(studList.get(i).stuNumGetter()==stuNumber){
                System.out.println();
            System.out.println("What do you want to edit?");
            System.out.println("1. Student Number");
            System.out.println("2. Student GPA");
            System.out.println("3. Student Name");
            System.out.println("4. nothing");
            inputStr1 = ks.nextLine();
         if(inputStr1.equals("1")){
            System.out.println();
            System.out.println("Enter the student's number");
            inputStr1 = ks.nextLine();
            studList.get(i).stuNumSetter(Integer.parseInt(inputStr1));
            
            
        } else if(inputStr1.equals("2")){
            System.out.println();
            System.out.println("Enter the student's GPA");
            inputStr1 = ks.nextLine();
            studList.get(i).gpaSetter(Double.parseDouble(inputStr1));
        
        }else if(inputStr1.equals("3")){
            System.out.println();
            System.out.println("Enter the student's name");
            inputStr1 = ks.nextLine();
            studList.get(i).parseName(inputStr1);
        
        }
    }
    }
        
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
