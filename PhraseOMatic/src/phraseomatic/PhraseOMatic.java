/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phraseomatic;

/**
 *
 * @author PC
 */
public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String[] wordListOne = {"Starred ", "Squared ", "Rounded ", "Circled ", "Inverted "};
      String[] wordListTwo = {"Red ", "Blue ", "Green ", "Grey ", "Black ", "Yellow "};
      String[] wordListThree = {"Ball ", "Chair ", "Stool ", "Table ", "Bed ", "Computer "};
      int oneLength = wordListOne.length;
      int twoLength = wordListTwo.length;
      int threeLength = wordListThree.length;
      
      int randOne = (int) (Math.random() * oneLength);
      int randTwo = (int) (Math.random()* twoLength);
      int randThree = (int) (Math.random()* threeLength);
      
      String phrase = wordListOne[randOne]+wordListTwo[randTwo]+wordListThree[randThree];
        System.out.println("Obtained phrase is:   "+ phrase);
    
}
   
}

