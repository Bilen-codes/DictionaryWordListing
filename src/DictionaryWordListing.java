/*                   Pseudo Code
* 1, First prompt the user to enter 10 words. Give option to quit.
* 2, Store all 10 words in a string array named "original".
* 3, print out all the 10 orders in the order they were entered.
* 4, Do a bubble sort on the original words so that they are in a ascending order.
* 5, The ascending order will be stored in the same array as the original but rearranged.
* 6, print the ascending order.
* 7, Reverse the ascending order array "original" to backwards (descending order).
* 8, Store it in a new array.
* 8, Then print out the descending array.
*      //challenge program
* 1, Loop through  the original array.
* 2, Read the first character of each word stored in the array and store them in character array
* 3, Loop through the character array and check if it's equal to a,e,i, o, or u.
* 4, If it's true then print the original array at that i value.
*
* 5, Lastly, a good bye message is print to indicated the ending of the program.
*/


/*The program will ask the user to enter 10 words,
* sort the words in an ascending order.
* Then it will print out the original order, in the ascending order,
*  and in the descending order */
import java.util.Scanner;
public class DictionaryWordListing {
    public static void main(String []args ){
        Scanner sc = new Scanner(System.in);
        int oc = 0;
        //int i = 0, k = 0;
        String tempStr = " ";
        String[] original = new String [10];
        String[] asOrder = new String [10];
        Character[] fLetter = new Character [10];
        //reads all only ten words from the user
        System.out.println("Hello, please enter 10 words!");
        System.out.println("Press <Enter> each time you enter a word");
        System.out.println("Press <Q/q> to quit");
        for (oc = 0; oc <10; oc++){
            original[oc] = sc.next();
            if((original[oc].equalsIgnoreCase("Q"))){
                System.out.println("Good Bye!");
                System.exit(0);
            }
        }

        //print the original order
        System.out.println("Original Order:");
        for (String s: original){
            System.out.print(s + " ");
        }

        //Rearrange the words in ascending order
        //bubble sort
        for (int i = 0; i < (original.length-1); i ++ ){//length of the array index should be stepped on one less times's
            for (int k = 0; k < (original.length-i)-1; k++ ) {//swap not including the last
                if (original[k].compareToIgnoreCase(original[k + 1]) > 0) {
                    tempStr = original[k];
                    original[k] = original[k + 1];
                    original[k + 1] = tempStr;
                }
            }
        }

        //print the ascending order
        System.out.println("\n\nAlphabetical Order:");
        for (String a: original) {
            System.out.print(a + " ");
        }

        //reverse the sorted array to be in descending order
        //print out the ascending order first
        for (int i = 0; i < original.length; i++){
            asOrder[original.length-1-i] = original[i];
        }
        //print the descending order last
        System.out.println("\n\nReversed Alphabetical Order:");
        for (String d: asOrder){
            System.out.print(d + " ");
        }




                                              // Challenge program
        //loop through  the original array and read the first letter or each word.
        for(int i = 0; i < 9; i++){
            fLetter[i] = original[i].charAt(0);
        }

        //Loop through the fLetter and check for a, e, i, o  or u.
        System.out.println("Words that start with a vowel:");
        for (int i = 0; i < 9; i++){
            if ((fLetter[i] == 'a') || (fLetter[i] == 'e') || (fLetter[i] == 'i') || (fLetter[i] == 'o')||(fLetter[i] == 'u') || (fLetter[i] == 'A') || (fLetter[i] == 'E') || (fLetter[i] == 'I')||(fLetter[i] == 'O')|| (fLetter[i] == 'U')){
                System.out.print(original[i] + " ");
            }
        }

        System.out.println("Good bye! ");


    }
}
