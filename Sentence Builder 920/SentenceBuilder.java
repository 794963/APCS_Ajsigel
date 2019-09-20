
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Jaan Sigel)
 * @version (920)
 */
public class SentenceBuilder
{
    // instance variables - replace the example below with your own
    String[] nouns = {"puppy", "pizza", "cat", "car" , "shoe", "frog", "snake", "house", "printer", "pencil"};
    String[] verbs = {"sleeps","pays","reads","rides","runs","sees","sings","fights","jumps","laughs"};
    String[] adj = {"tall","small","big","short","slow", "fast","smart","dumb", "funny","happy"};
    String[] deter = {"the","my","your","his","her","our","their","dad's","mom's","Greg's"};
    String[] adv = {"happily","quickly","often", "never","slowly", "loudly","quitely","abruptly","firmly","lightly"};
    String[] prep = {"over","under","near","on top of","behind","next to","outside of","inside of","in front","away from"};
    int random = 0;
    /**
     * Constructor for objects of class SentenceBuilder
     */
    public SentenceBuilder()
    {
        // initialise instance variables
        
    }
    public void loadSentences(){
    System.out.println(getSentence());
    }
    public String getSentence(){
    return getNounPhrase() + getVerbPhrase() + getPrepPhrase() + ".";
    }

    public String getRNoun(){
    random = (int)(Math.random()*10);
    return nouns[random];
    }
    public String getRVerb(){
    random = (int)(Math.random()*10);
    return verbs[random];
    }
    public String getRAdj(){
    random = (int)(Math.random()*10);
    return adj[random];
    }
    public String getRDm(){
    random = (int)(Math.random()*10);
    return deter[random];
    }
    public String getRAdv(){
    random = (int)(Math.random()*10);
    return adv[random];
    }
    public String getRPrep(){
    random = (int)(Math.random()*10);
    return prep[random];
    }
    public String getNounPhrase(){
        return " "+ getRDm() + " " + getRAdj() + " " + getRNoun();
    }
     public String getVerbPhrase(){
        return " "+ getRAdv() + " " + getRVerb();
    }
     public String getPrepPhrase(){
        return " "+ getRPrep() + getNounPhrase();
    }
}
