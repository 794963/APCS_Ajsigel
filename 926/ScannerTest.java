
/**
 * Write a description of class ScannerRunner here.
 *
 * @author (Jaan Sigel)
 * @version (924)
 */
import java.util.Scanner;
public class ScannerTest{
    static Object[] person;
    
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        person = new Object[1];
    
        
        int x=0;

        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
            if(inputStr.lastIndexOf(" ") == (inputStr.length()-1)){
            inputStr = inputStr.substring(0,inputStr.length()-1);
            }
            Person p = new Person(inputStr);
            person[x] = p;
            extendArray(person,1);
           
            x++;
        }
    }
    
    public static person[] extendArray(person[] p, int n){
        Object person[];
        person = new Object[p.length+n];
        for(int i = 0; i < p.length;i++){
        person[i] = p[i];
    }
        return person;
    }
    public static void printNames(person[] p){
        for(int i = 0; i < p.length;i++){
        
        System.out.print(p[i].fName);
        System.out.print(" ");
        if(!p[i].mName.equals("")){
        System.out.print(p[i].mName);
        System.out.print(" ");
    }
        System.out.print(p[i].lName);
        System.out.print(", ");
    }
    }

}
