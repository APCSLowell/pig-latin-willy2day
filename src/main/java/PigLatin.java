import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
       if (word.substring(0,2).equals("qu"))
      return 7;
    for (int i = 0; i < word.length(); i++) {
        if (word.substring(i, i + 1).equals("a") ||//returns -1 if no letter is a constant
            word.substring(i, i + 1).equals("e") ||
            word.substring(i, i + 1).equals("i") ||
            word.substring(i, i + 1).equals("o") ||
            word.substring(i, i + 1).equals("u")) {
            return i;
         
        }
    }
    return -1;
    }

    public String pigLatin(String sWord) {
        if (findFirstVowel(sWord)==7){
          return sWord.substring(2)+"quay";
        }
        
	 if (findFirstVowel(sWord)==0){  
             return sWord+"way";
           }         
         
      for(int p = 0; p < sWord.length();p++){ //checks where the vowel starts and moves the 
      if(findFirstVowel(sWord) == p){
         return sWord.substring(p)  + sWord.substring(0,p)+"ay";
        }
      }
	    if(findFirstVowel(sWord) == -1) {
		    return sWord + "ay";
	    }
	    else {
		return "ERROR!";
	    }
    }
}//end PigLatin class
