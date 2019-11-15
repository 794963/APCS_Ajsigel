
/**
 * Write a description of class StringSearcher here.
 *
 * @author (jaan sigel
 * @version (1031
 */
import java.util.*;
public class StudRunner
{
    // instance variables - replace the example below with your own
    static Scanner kb = new Scanner(System.in);
    static StudList sL = new StudList();
    
    public StudRunner()
    {
        // initialise instance variables

    }

    public static void main(){
        ArrayList<Student> key = new ArrayList<Student>();
        String keyChecker = "";
        String inputStr = "";
        int x = 0;
        int y=0;

        
        while(!inputStr.equals("quit")){
            if (x==0){    
                System.out.println("Enter a function number or type \"quit\" to quit");
                System.out.println();
                System.out.println("Functions:");
                System.out.println("1. add student");
                System.out.println("2. delete student");
                System.out.println("3. edit student");
                System.out.println("4. clear list");
                System.out.println("5. print all students");
                System.out.println("6. print student");
                System.out.println("7. sort student");
                System.out.println("8. search for students");

                

                inputStr = kb.nextLine();
                x++;
            }
            inputStr = inputStr.toLowerCase();
            inputStr = inputStr.trim();
            //System.out.println(inputStr);

            if(inputStr.equals("1")){
                System.out.println();
                System.out.println("Enter the student's name");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                checkName(inputStr);
                sL.addStudent(inputStr);

            } else if(inputStr.equals("2")){
                System.out.println();
                System.out.println("Enter the student's last name you want to delete\nOr enter the Student's number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(!checkInt(inputStr)){
                    sL.deleteStudent(inputStr);
                }else{
                    if(checkInt(inputStr)){
                    sL.deleteStudent(Integer.parseInt(inputStr));
                }else{
                    System.out.println("Invalid input");
                }
                }
            }else if(inputStr.equals("3")){
                System.out.println();
                System.out.println("Enter the Student's last name you want to edit\nOr enter the Student's number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(!checkInt(inputStr)){
                    sL.editStudentList(inputStr);
                }else{
                  if(checkInt(inputStr)){
                    sL.editStudentList(Integer.parseInt(inputStr));
                }else{
                    System.out.println("Invalid input");
                }
                }
            }else if(inputStr.equals("4")){
                sL.clearList();
            }else if(inputStr.equals("5")){
                sL.printList();
            }else if(inputStr.equals("6")){
                System.out.println();
                System.out.println("Enter the student's last name you want to print\nOr enter the Student's number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(!checkInt(inputStr)){
                    sL.printStudent(inputStr);
                }else{
                  if(checkInt(inputStr)){
                    sL.printStudent(Integer.parseInt(inputStr));
                }else{
                    System.out.println("Invalid input");
                }
                }
                
            }else if(inputStr.equals("7")){
                System.out.println();
                System.out.println("What do you want to sort the students by?");
                System.out.println("1. Last Name");
                System.out.println("2. GPA");
                System.out.println("3. Student Number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                sL.sortStudents(inputStr);
            }else if(inputStr.equals("8")){
                System.out.println();
                System.out.println("What do you want to search the students by?");
                System.out.println("1. Last Name");
                System.out.println("2. GPA");
                System.out.println("3. Student Number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(checkInt(inputStr)){
                keyChecker = inputStr;
                System.out.println();
                System.out.println("What key do you want to search by?");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                key = sL.filterSearchStudentList(inputStr,keyChecker);
                System.out.println();
                for(int i = 0; i < key.size(); i++){
                    System.out.println("Name: " + key.get(i).getName() + "; GPA:" + key.get(i).gpaGetter() + "; Student Number:" + key.get(i).stuNumGetter() + "; ");
                }
                if(key.size() == 0){
                    System.out.println("Could not find any students with that keyword");
                }
            }else{
                System.out.println("Invalid input");
            }
            }else if(inputStr.equals("help")){
                System.out.println("\nFunctions:");
                System.out.println("1. add student");
                System.out.println("2. delete student");
                System.out.println("3. edit student");
                System.out.println("4. clear list");
                System.out.println("5. print all students");
                System.out.println("6. print student");
                System.out.println("7. sort student");
                System.out.println("8. search for students");
            }else if(!inputStr.equals("quit")){

                System.out.println("Try a different command");

            }
            System.out.println("\n\nDone!\nEnter another command or type \"quit\" to quit\nType \"help\" for the command list");
            inputStr = kb.nextLine();

        }

    }

    public static void checkName(String x){
        if(x.indexOf(" ") == -1){
            System.out.println("Input invalid. Please enter the student's Full Name");
            x = kb.nextLine();
            checkName(x);
        }

    }

    public static boolean checkInt(String s) {
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
}
