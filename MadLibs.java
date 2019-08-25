import java.util.*;

public class MadLibs{
    //1.-fields and properties. EX:adverbs(adv)-verbs-adjetives(adj)

    //2.-Strings
    private String name, story, adj,verb,adv,randNums;
    //3.- setters and getters
    //Getters for all the attributes
    public String getStory(){
        return story;
    }
    public String getName(){
        return name;
    }
    public String getAdj(){
        return adj;
    }
    public String getVerb(){
        return verb;
    }
    public String getAdv(){
        return adv;
    }
    //setters for all the attributes
    public void setStory(String newStory){
        this.story=newStory;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setAdj(String newAdj){
        this.adj=newAdj;
    }
    public void setVerb(String newverb){
        this.verb=newverb;
    }
    public void setAdv(String newAdv){
        this.adv=newAdv;
    }
    //method to do them random

    //instructions for the user
    public void instructions(){
        System.out.println("Welcome to the MadLibs game(In spanish, UPS). If you type in"
                            + "words, we'll give you a story."+"\n"
                            +"Start by typing a name:");
    }
    public void putAll2gether(){
        String story="Erase una vez, una tipa "+this.adj+", "+this.name+", que le gustaba "+this.verb+" "+this.adv+" por ahi."+"\n"
                            +"                                -FIN-                                   ";
        this.setStory(story);
        System.out.println(story);
    }

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      MadLibs game= new MadLibs();
      game.instructions();
      game.setName(scan.nextLine());
      System.out.println("Now, typing a verb in infinitive form (In spanish, UPS):");
      game.setVerb(scan.nextLine());
      System.out.println("Please, give us an adverb(In spanish, UPS):");
      game.setAdv(scan.nextLine());
      System.out.println("Finally, an adjetive in feminine(In spanish, UPS):");
      game.setAdj(scan.nextLine());
      game.putAll2gether();
    }
}
