import StringStuff;
import java.util.Scanner;

class StringRunner {
    public static void main(String[] args) {
        
        //Create a new scanner
        Scanner keyboard = new Scanner(System.in);

        //Get input from user and save as text variable
        System.out.println("Enter a word: ");
        String text = keyboard.next();

        //Create new object
        StringStuff ref = new StringStuff();

        //Output first and last letters
        System.out.println("Has first last letters: " + ref.firstLast(text));

        //Output middle 
        System.out.println("Has middle letter: " + ref.middle(text));

        //Output if first and last are same
        System.out.println("Has same first and last letter: " + ref.isSame(text));

}
}