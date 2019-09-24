
/**
 * Write a description of class ScannerRunner here.
 *
 * @author (Jaan Sigel)
 * @version (924)
 */
import java.util.Scanner;
public class ScannerTest{

    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            if(inputStr.lastIndexOf(" ") == (inputStr.length()-1)){
            inputStr = inputStr.substring(0,inputStr.length()-1);
            }
            Person p = new Person(inputStr);
            if(!inputStr.equals("quit")){
            p.parseName(inputStr);
            p.printName();
        }
        }
    }

    

}
