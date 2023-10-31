import java.lang.Math;

import java.util.Scanner;

public class GuessTheNumberTask2 {
      int random ;
    public GuessTheNumberTask2(){
        random = (int)(Math.random()*100);
    }
    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice Here");
        int choice = sc.nextInt();
        return choice;
    }
    public static void isCorrectNumber(int random ){
        System.out.println("............... This is  The Number GUESSING Game ..........\nYou Have only 10 Chances To Guess");
        int i = 0 , counter = 0;
        while(i<10){
            int guessingNumber = userInput();
            if(random > guessingNumber){
                System.out.println("You Guessed Smaller Number 😒😒");
                counter++;
            } else if(random < guessingNumber){
                System.out.println("You Guessed Bigger Number 😒😒");
                counter++;
            }else {
                System.out.println("Yippiee You Guessed Correctly 🤩🤩");
                counter++;
                System.out.println("You Guessed The Number in "+counter+ " times");
                break;
            }
          i++;
            }
        }

    public static void main(String[] args) {
    GuessTheNumberTask2 obj1 = new GuessTheNumberTask2();
    isCorrectNumber(obj1.random);

    }
}
