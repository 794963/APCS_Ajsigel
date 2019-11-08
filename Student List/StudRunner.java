
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

                // if(x!=0){
                // for (int i = 0; i < y; ++i) System.out.println();
                // }
                // if(x==0)x++;

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
                System.out.println("Enter the student's last name you want to delete followed by a period\nOr enter the Student's number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(inputStr.indexOf(".")>-1){
                    sL.deleteStudent(inputStr.substring(0,inputStr.length()-1));
                }else{
                    if(checkInt(inputStr)){
                    sL.deleteStudent(Integer.parseInt(inputStr));
                }else{
                    System.out.println("Invalid input");
                }
                }
            }else if(inputStr.equals("3")){
                System.out.println();
                System.out.println("Enter the student's last name you want to edit followed by a period\nOr enter the Student's number");
                inputStr = kb.nextLine();
                inputStr = inputStr.toLowerCase();
                inputStr = inputStr.trim();
                if(inputStr.indexOf(".")>-1){
                    sL.editStudentList(inputStr.substring(0,inputStr.length()-1));
                }else{
                  if(checkInt(inputStr)){
                    sL.editStudentList(Integer.parseInt(inputStr));
                }else{
                    System.out.println("Invalid input");
                }
                }
            }else if(inputStr.equals("4")){

            }else if(inputStr.equals("5")){

            }else if(inputStr.equals("6")){

            }else if(inputStr.equals("7")){

            }else if(inputStr.equals("8")){

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
