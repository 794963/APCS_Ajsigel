
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
            
        } else if(inputStr.equals("2")){
            
        }else if(inputStr.equals("3")){
            
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
        System.out.println("\nDone!\nEnter another command or type \"quit\" to quit\nType \"help\" for the command list");
        inputStr = kb.nextLine();
        
    }

}
}