
/**
 * Write a description of class StudRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudRunner
{
    // instance variables - replace the example below with your own
    
    public StudRunner()
    {
        // initialise instance variables
       
    }

    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit \n Type \"help\" for functions");
            inputStr = kb.nextLine();
            inputStr = inputStr.toLowerCase();
            inputStr = inputStr.trim();
            System.out.println(inputStr);
        
            if(!inputStr.equals("add student")){
            
        } else if(!inputStr.equals("delete student")){
            
        }else if(!inputStr.equals("edit student")){
            
        }else if(!inputStr.equals("clear list")){
            
        }else if(!inputStr.equals("print list")){
            
        }else if(!inputStr.equals("print student")){
            
        }else if(!inputStr.equals("sort students")){
            
        }else if(!inputStr.equals("find students")){
            
        }else if(!inputStr.equals("help")){
            
        }else{
            System.out.println("Try a different command");
        }
        }
    }
}
