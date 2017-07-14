/**
 * Created by TACasey-Calhoun on 7/13/2017.
 */
import java.util.Random;

import java.util.Scanner;

public class LabNumber5 {
    public static void main(String[] args) {
        int userInput;
        String answer;

        Scanner scan = new Scanner(System.in);
    //    scan.nextLine();


        System.out.println("Welcome to the Grand Circus Casino!");
    do {
        System.out.print("How many sides should each die have?  ");
        userInput = scan.nextInt();
        scan.nextLine();

        System.out.println("Roll 1...");
        System.out.println(roll(userInput));
        System.out.println(roll(userInput));

     //   System.out.println("Roll 2...");


                System.out.println("Roll again? (y/n):   ");
                answer = scan.nextLine();
            } while (answer.equalsIgnoreCase("y"));

        }

    public static int roll(int n) {
        Random roll1 = new Random();
        return 1 + (roll1.nextInt(n));
        }
    }
