import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
public class Main {
    public static void main(String[] args) {

                // generating a random number for user to guess it.
        Scanner sc=new Scanner(System.in);
        int mynumber= (int)(Math.random()*100);
        int usernumber;

        do{
            System.out.println("Guess My number (0-100) :");
            usernumber=sc.nextInt();
            if(usernumber==mynumber)
            {
                System.out.println("OHoooo!  You guessed it correct.");
                break;
            } else if (usernumber>mynumber) {
                System.out.println("Your number is too large.");
            }
            else
            {
                System.out.println("Your number is too short.");
            }
        }
        while (usernumber>=0);

        System.out.print("My Number was :");
        System.out.println(mynumber);
        System.out.println("The End.");


    }
}
