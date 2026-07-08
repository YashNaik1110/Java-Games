import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import  java.util.Scanner;

public  class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random  = new Random();

        String [] words ={
                "JAVA",
                "COMPUTER",
                "PROGRAM",
                "KEYBOARD",
                "MOUSE",
                "LAPTOP",
                "CODING",
                "COMPUTER",
                "VARIABLE",
                "FUNCTION",
        };
        char playAgain;

        System.out.println("===============");
        System.out.println(" Word Simulator Game ");
        System.out.println("===============");

        do{
            String originalWord = words[random.nextInt(words.length)];

            ArrayList<Character> letters = new ArrayList<>();
            for(char c : originalWord.toCharArray()){
                letters.add(c);
            }
            Collections.shuffle(letters);

            StringBuilder scrambleWord = new StringBuilder();
            for(char c : letters){
                scrambleWord.append(c);
            }
            System.out.println("\n Unscramble the word !");
            System.out.println("Scarambles word : "+ scrambleWord);
            System.out.println("Youre Guess : ");
            String guess = sc.nextLine().toUpperCase();

            if(guess.equals(originalWord)){
                System.out.println("\n Congratulations !");
                System.out.println("Correct Answer ! ");
            }else{
                System.out.println("\nWrong Guess ! ");
                System.out.println(" Correct Word : " + originalWord);
            }
            System.out.println("\n Play Again? (Y/N) : ");
            playAgain = sc.nextLine().charAt(0);
        }while(playAgain == 'Y' || playAgain == 'y');
        System.out.println("\n Thanks for Playing !");
        sc.close();
    }
}
