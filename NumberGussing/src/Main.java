import java.util.Scanner;
import java.util.Random;

public class Main{
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Random random = new Random();

      char playAgain;

      System.out.println("=================================");
      System.out.println("       NUMBER GUESSING GAME      ");
      System.out.println("=================================");

      do {
          int randomNumber = random.nextInt(100) + 1;
          int guess = 0;
          int attempts = 0;

          System.out.println("\n I have selected a number beween 1 and 100 ");
          System.out.println("can you guess it? ");

          while (guess != randomNumber) {
              System.out.println(" Enter youre guess");
              guess = sc.nextInt();
              attempts++;

              if (guess > randomNumber) {
                  System.out.println(" Too High ");
              } else if (guess < randomNumber) {
                  System.out.println("  Too Low ! ");
              } else {
                  System.out.println("\nCongratulations ");
                  System.out.println("you guessed the correct number");
                  System.out.println("Number was : " + randomNumber);
                  System.out.println("Attempts : " + attempts);
              }
          }
          System.out.println(" Do you want to play Again Y /N :  ");
          playAgain = sc.next().charAt(0);
      } while (playAgain == 'Y' || playAgain == 'y');
      System.out.println("\n thank you for playing ! ");
      System.out.println("Have a great  day ! ");
  }
}