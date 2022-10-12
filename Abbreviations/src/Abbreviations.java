import java.util.HashMap;

public class Abbreviations {


    private HashMap<String, String> directory;
    public Abbreviations(){
        this.directory = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        if (hasAbbreviation(abbreviation)) { //this.directory.containsKey(abbreviation)

        } else {
            directory.put(abbreviation, explanation);
        }
    }
    public boolean hasAbbreviation(String abbreviation){
        if (this.directory.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public String findExplanationFor(String abbreviation){
        if(hasAbbreviation(abbreviation)){
            System.out.println(directory.get(abbreviation));
        }
        return null;
    }
}
