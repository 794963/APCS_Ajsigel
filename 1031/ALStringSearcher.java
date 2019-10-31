
/**
 * Write a description of class StringSearcher here.
 *
 * @author (jaan sigel
 * @version (1031
 */
import java.util.*;
public class ALStringSearcher
{
    // instance variables - replace the example below with your own
    static String[] str = new String[0];
    static ArrayList<String> aL= new ArrayList<String>();
    /**
     * Constructor for objects of class StringSearcher
     */
    public ALStringSearcher()
    {
        // initialise instance variables
       
    }

    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        int x = 0;
        while(!inputStr.equals("1")){
        System.out.println("Enter phrases or words, then when done press 1 to enter keyword");
        
        inputStr = kb.nextLine();
        inputStr = inputStr.toLowerCase();
        inputStr = inputStr.trim();
        aL.add(inputStr);
    }
    System.out.println("Enter a keyword to search the list for");
    inputStr = kb.nextLine();
    str = wordChecker(aL,inputStr);
    for(int i=0;i<str.length;i++){
    System.out.print(str[i]);
    System.out.print(", ");
    }
    }
    
    public static String[] wordChecker(ArrayList<String> aL, String key){
        String[] s1 = new String[0];
        int y = 0;
        for(int i=0;i<aL.size();i++){
        if(aL.get(i).indexOf(key)>-1){
        s1=extendArray(s1,1);
        s1[y]=aL.get(i);
        y++;
        }
        }
        return s1;
    }
    public static String[] extendArray(String[] p, int n){
        
        String[] p2 = new String[p.length+n];
        for(int i = 0; i < p.length;i++){
        p2[i] = p[i];
    }
    
        return p2;
    }
}
