import java.util.ArrayList;

public class nameFind {

private String searchString;

private ArrayList<String> namesFound = new ArrayList<String>();
private ArrayList<String> gender = new ArrayList<String>();
private ArrayList<Integer> ages = new ArrayList<Integer>();
  
  
private int numOfM;
private int numOfF;

public String[] nameSet = FileReader.toStringArray("nameSet.txt");
public String[] genderSet = FileReader.toStringArray("genders.txt");
  

  public nameFind(String search){
    searchString = search;
  }
   public nameFind(){
    searchString = "N/A";
     numOfM = 0;
     numOfF=0;
  }

  /**
  * This is a student developed method
  * Searches database for names similar to anything in the String
  * No parameters no return
  */
  private void findNames(){
    for (int i = 0; i<nameSet.length; i++){
      if (searchString.indexOf(nameSet[i])>-1){
        namesFound.add(nameSet[i]);
        gender.add(genderSet[i]);
        if (genderSet[i].equals("M")){
          numOfM++;
        } else {
          numOfF++;
        }
      }
    }
  }

/**
* This is a student developed method
* finds any integers in the inputted text between 10 and 100
* no parameters or returns
*/
private void findAges(){
  boolean intInString = false;
  if (namesFound == null || ages == null || searchString == null) {
        return;
    }
  for (int i = 10; i<100; i++){
  if (searchString.indexOf(i + "") > -1){
    ages.add(i);
    intInString = true;
  }
  }
    if (intInString == false){
      ages.add(0);
    }
  }



/**
* This is a student develped method
* outputs the fully formatted sentence analysis
* @return string with entire sentence analysis
*/
public String toString() {
  findNames();
  findAges();
  String nfReturn = "";

  for (int i = 0; i<namesFound.size(); i++){
    nfReturn += namesFound.get(i) + ": " + gender.get(i) + "\n";
  }
  
return "In your inputted string we found the following names and searched for their ages:" +
  "\n" + nfReturn + "\n" + "We found " + ages.size() + " ages in the string: " + ages + "\n" +
  "There were " + numOfM + " male names" + "\n" +
  "There were " + numOfF + " female names";
  
}  
}