import java.util.Random;
import java.util.Scanner ;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/>
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Rock paper scissor
        //0 = rock
        //1 = paper
        //2 = scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n 0 for Rock \n  1 for Paper \n 2 for Scissor");
        System.out.print("Enter Youre Choice in digit : ");
       int userInput = sc.nextInt();


        Random random = new Random();
        int botInput = random.nextInt(3);
        
        if(userInput == botInput){
            System.out.println("Draw");
        } else if (userInput==0 && botInput==2 ||userInput==1 && botInput==0 || userInput==2 && botInput==1)
        {
            System.out.println(" User Win");
        }
        else {
            System.out.println(" Bot Win ");
        }
        if(botInput==0){
            System.out.println("Bot Choice : Rock");
        }
        else if(botInput == 1){
            System.out.println("Bot Choice : Paper");
        }
        else if(botInput == 2){
            System.out.println("Bot Choice : Scissor");
        }
    }
}