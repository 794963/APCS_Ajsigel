
/**
 * Write a description of class Person here.
 *
 * @author (Jaan)
 * @version (924)
 */
public class Person
{
    // instance variables - replace the example below with your own
    char someChar = ' ';
     int count = 0;
     String fName = "",mName= "",lName = "";
     String str;
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String x)
    {
        // initialise instance variables
        str = x;
        parseName(x);
        
    }
    public void parseName(String s){
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }

        if(s.indexOf(",")>-1 && s.indexOf(" ")>-1){
            lName = s.substring(0,s.indexOf(","));
            
            if(count != 2){
                mName = "";
                fName = s.substring(s.indexOf(" ")+1);
            }else{
              mName = s.substring(s.lastIndexOf(" ")+1);
              fName = s.substring(s.indexOf(" ")+1,s.lastIndexOf(" "));
            }
        }else if(s.indexOf(" ")>-1){
            fName = s.substring(0,s.indexOf(" "));
            if(count != 2){
                mName = "";
            }else{
                mName = s.substring(s.indexOf(" ")+1,s.lastIndexOf(" "));
            }
            lName = s.substring(s.lastIndexOf(" ")+1);
        }
        
    }     
    public void printName(){
        if(!fName.equals("")){
        System.out.print(fName + " ");
        if(mName!=""){
        
        System.out.print(mName + " ");
    }
        System.out.print(lName+", ");
        }
        else{
            System.out.println("Your name is incorrectly formatted, ");
        }
    }
}
