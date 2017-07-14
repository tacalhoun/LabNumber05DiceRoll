/**
 * Created by TACasey-Calhoun on 7/13/2017.
 */
import java.util.Random;

import java.util.Scanner;

public class LabNumber5 {
    public static void main(String[] args) {
        int userInput;
    //    String answer;

        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Grand Circus Casino!");

        System.out.print("How many sides should each die have?  ");
        userInput = scan.nextInt();

        System.out.println("Roll 1...");
        System.out.println(roll(userInput));
        System.out.println(roll(userInput));


        /*    do {
                System.out.println("Roll again? (y/n):   ");
                answer = scan.nextLine();
                System.out.println();
            } while (answer.equalsIgnoreCase("yes"));
        */
        }

    public static int roll(int n) {
        Random roll1 = new Random();
        return (roll1.nextInt(n));
        }
    }
