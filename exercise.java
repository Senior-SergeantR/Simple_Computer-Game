
package com.company;
import java.util.Scanner;
public class exercise {

        public static void main(String[] args){
            System.out.println("This program is a computer game. Please, type in an integer in the range 1..... 213526737388");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number to win: ");

            int n = scan.nextInt();
            int nn;
            int nb;

            System.out.println("You Typed in: "+ n);
            n = n * 2 ;

            nn = n +1;
            nb = nn + 1;

            System.out.println("My numbers are: "+ n+", "+nn+" and " +nb+ ".");

            System.out.println(" Sorry, you lost the game");
            System.out.println(" I have more and larger numbers than you.");
            System.out.println ("_____________________________________________________________");
            System.out.println("Lets play another game. Please, type in an integer in the range 1..... 213526737388");

            Scanner scann = new Scanner(System.in);
            System.out.println("Enter a number to win: ");

            int a = scan.nextInt();
            int an;
            int ab;

            System.out.println("You Typed in: "+ a);
            a = a / 2 ;

            an = a /2;
            ab = an / 2;

            System.out.println("My numbers are: "+ a+", "+an+" and " +ab+ ".");

            System.out.println(" You have won the game congratulations.");
            System.out.println(" I have less and smaller numbers than you.");
        
        }


    }

