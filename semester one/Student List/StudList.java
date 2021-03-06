
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
       if(inputStr1.indexOf(".")>-1){
           if(!checkInt(inputStr1.substring(0,inputStr1.indexOf("."))) && !checkInt(inputStr1.substring(inputStr1.indexOf(".")+1))){
               System.out.println("Input Invalid");
            retry("Enter the student's gpa (enter with deciamls)");
            }
        }else{
            System.out.println("Input Invalid");
            retry("Enter the student's gpa (enter with deciamls)");
        }
       s1.gpaSetter(Double.parseDouble(inputStr1));
       System.out.println("Enter the student's number");
       inputStr1 = ks.nextLine();
       s1.stuNumSetter(Integer.parseInt(inputStr1));
       studList.add(s1);
    }
    public void deleteStudent(String lastName){
        if(checkName(lastName)){
        for(int i=0;i<studList.size();i++){
        if(studList.get(i).lName.equals(lastName)){
            studList.remove(i);
        }
        }
        }else{
    System.out.println();
    System.out.println("Input Invalid");
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
        if(checkName(lastName)){
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
    }else{
    System.out.println();
    System.out.println("Input Invalid");
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
    studList.clear();
    }
    public void printList(){
        System.out.println();
        for(int i = 0; i < studList.size(); i++){
        System.out.println("Name: " + studList.get(i).getName() + "; GPA:" + studList.get(i).gpaGetter() + "; Student Number:" + studList.get(i).stuNumGetter() + "; ");
        }
    }
    public void printStudent(String lastName){
        boolean done = false;
        System.out.println();
        for(int i = 0; i < studList.size(); i++){
        if(studList.get(i).lGet().equals(lastName)){
        System.out.println("Name: " + studList.get(i).getName() + "; GPA:" + studList.get(i).gpaGetter() + "; Student Number:" + studList.get(i).stuNumGetter() + "; ");
        }
        done = true;
        }
        if(!done)System.out.println("eeror");
    }
    public void printStudent(int stuNumber){
    System.out.println();
        for(int i = 0; i < studList.size(); i++){
        if(studList.get(i).stuNumGetter() == stuNumber){
        System.out.println("Name: " + studList.get(i).getName() + "; GPA: " + studList.get(i).gpaGetter() + "; Student Number:" + studList.get(i).stuNumGetter() + "; ");
        }
        }
    }
    
    public void sortStudents(String sorter){
    if(sorter.equals("1")){
        for(int i = studList.size()-1; i>0; i--){
            for(int j=0; j<i; j++){
                
               if(studList.get(j).lGet().compareTo(studList.get(j+1).lGet())>0){
                   Student temp = studList.get(i);
                   studList.set(i,studList.get(j));
                   studList.set(j,temp);
                }
              
            }
            
        }
    }else if(sorter.equals("2")){
        for(int i = studList.size()-1; i>0; i--){
            for(int j=0; j<i; j++){
                
               if(studList.get(j).gpaGetter()>studList.get(j+1).gpaGetter()){
                   Student temp = studList.get(i);
                   studList.set(i,studList.get(j));
                   studList.set(j,temp);
                }
              
            }
            
        }
    }else if(sorter.equals("3")){
        for(int i = studList.size()-1; i>0; i--){
            for(int j=0; j<i; j++){
                
               if(studList.get(j).stuNumGetter()>studList.get(j+1).stuNumGetter()){
                   Student temp = studList.get(i);
                   studList.set(i,studList.get(j));
                   studList.set(j,temp);
                }
              
            }
            
        }
        
    }else{
    System.out.println();
    System.out.println("Input Invalid");
    }
    }
    public void help(){
    System.out.println();
    }
    public ArrayList<Student> filterSearchStudentList(String key , String sorter){
        ArrayList<Student> sk = new ArrayList<Student>();
        if(sorter.equals("1")){
            for(int i = 0; i < studList.size(); i++){
        if(studList.get(i).lGet().indexOf(key) > -1){
        sk.add(studList.get(i));
        }
        }
        }else if(sorter.equals("2")){
              for(int i = 0; i < studList.size(); i++){
        if(studList.get(i).gpaGetter() == Double.parseDouble(key)){
        sk.add(studList.get(i));
        }
        }  
        }else if(sorter.equals("3")){
                  for(int i = 0; i < studList.size(); i++){
        if(studList.get(i).stuNumGetter() == Integer.parseInt(key)){
        sk.add(studList.get(i));
        }
        }
        }else{
    System.out.println();
    System.out.println("Input Invalid");
    }
        
        return sk;
    }
    public void retry(String s){
        System.out.println(s);
        inputStr1 = ks.nextLine();
    }
    public boolean checkInt(String s) {
    if (s == null)return false;
    
    int len = s.length();
    for (int i = 0; i < len; i++) {
        // checks whether the character is not a letter
        // if it is not a letter ,it will return false
        if ((Character.isLetter(s.charAt(i)) == true)) {
            return false;
        }
    }
    return true;
}
    public boolean checkName(String s) {
    if (s == null)return false;
    
    int len = s.length();
    for (int i = 0; i < len; i++) {
        // checks whether the character is not a letter
        // if it is not a letter ,it will return false
        if ((Character.isLetter(s.charAt(i)) == true)) {
            return true;
        }
    }
    return false;
}

        
    
}
