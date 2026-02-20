import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber{ 
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numbertoguess = random.nextInt(100)+1;
    int numberofAttempts = 0;
    int userGuess = 0;
    boolean hasGuessCorrectly = false;
    System.out.println("---welcome to the guessing game--");
    System.out.println("I've picked a number btw 1 to 100");
    while(!hasGuessCorrectly){
        System.out.println("enter your guess");
        if(scanner.hasNextInt()){
            userGuess= scanner.nextInt();
            numberofAttempts++;
            if(userGuess<1|| userGuess>100){
                System.out.println("please stay within 1 to 100 range");
            }else if (userGuess<numbertoguess)
            {
                System.out.println("too low try again");
            } else if (userGuess>numbertoguess)
            {
                System.out.println("too high try again");
            }else{
                hasGuessCorrectly= true;
                System.out.println("\nyou got it" + numberofAttempts+"tries");
            }
        } else{
            System.out.println("that's not a valid number");
            scanner.next();
        }
    } 
    scanner.close();
}
}
