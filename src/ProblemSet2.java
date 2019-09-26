/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
         System.out.print("Enter your first name: ");
         String firstName = in.nextLine();

         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();

         System.out.print("Enter your grade: ");
         int grade = in.nextInt();

         System.out.print("Enter your age: ");
         int age = in.nextInt();
         in.nextLine();

         System.out.print("Enter your hometown: ");
         String hometown = in.nextLine();

         System.out.println("\nNAME     : " + firstName + " " + lastName);
         System.out.println("GRADE    : " + grade);
         System.out.println("AGE      : " + age);
         System.out.println("HOMETOWN : " + hometown);



        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
         final int DOLLAR_VALUE = 100;
         final int QUARTER_VALUE = 25;
         final int DIME_VALUE = 10;
         final int NICKEL_VALUE = 5;
         final int PENNY_VALUE = 1;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();

         int pennyAmount = (int) (dollarAmount * 100);

         int amountDollar = pennyAmount / DOLLAR_VALUE;
         pennyAmount = pennyAmount % DOLLAR_VALUE;

         int amountQuarter = pennyAmount / QUARTER_VALUE;
         pennyAmount = pennyAmount % QUARTER_VALUE;

         int amountDime = pennyAmount / DIME_VALUE;
         pennyAmount = pennyAmount % DIME_VALUE;

         int amountNickel = pennyAmount / NICKEL_VALUE;
         pennyAmount = pennyAmount % NICKEL_VALUE;

         int amountPenny = pennyAmount / PENNY_VALUE;
         pennyAmount = pennyAmount % PENNY_VALUE;

         System.out.println("\nDOLLARS  : " + amountDollar);
         System.out.println("QUARTERS : " + amountQuarter);
         System.out.println("DIMES    : " + amountDime);
         System.out.println("NICKELS  : " + amountNickel);
         System.out.println("PENNIES  : " + amountPenny);


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
         final int TEN_VALUE = 1000;
         final int FIVE_VALUE = 500;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmounts = in.nextDouble();

         int pennyAmounts = (int) (dollarAmounts * 100);

         int amountTens = pennyAmounts / TEN_VALUE;
         pennyAmounts = pennyAmounts % TEN_VALUE;

         int amountFives = pennyAmounts / FIVE_VALUE;
         pennyAmounts = pennyAmounts % FIVE_VALUE;

         int amountDollars = pennyAmounts / DOLLAR_VALUE;
         pennyAmounts = pennyAmounts % DOLLAR_VALUE;

         int amountQuarters = pennyAmounts / QUARTER_VALUE;
         pennyAmounts = pennyAmounts % QUARTER_VALUE;

         int amountDimes = pennyAmounts / DIME_VALUE;
         pennyAmounts = pennyAmounts % DIME_VALUE;

         int amountNickels = pennyAmounts / NICKEL_VALUE;
         pennyAmounts = pennyAmounts % NICKEL_VALUE;

         int amountPennys = (int) (pennyAmounts / PENNY_VALUE);
         pennyAmounts = pennyAmounts % PENNY_VALUE;

         int amountBills = amountTens + amountFives + amountDollars;
         int amountCoins = amountQuarters + amountDimes + amountNickels + amountPennys;

         System.out.println("\nBILLS : " + amountBills);
         System.out.println("COINS : " + amountCoins);


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
         final int INCH_MILE_CONVERSION = 63360;
         final int INCH_YARD_CONVERSION = 36;
         final int INCH_FOOT_CONVERSION = 12;

         System.out.print("\nEnter a number of inches: ");
         int inchAmount = in.nextInt();

         int amountMile = inchAmount / INCH_MILE_CONVERSION;
         inchAmount = inchAmount % INCH_MILE_CONVERSION;

         int amountYard = inchAmount / INCH_YARD_CONVERSION;
         inchAmount = inchAmount % INCH_YARD_CONVERSION;

         int amountFeet = inchAmount / INCH_FOOT_CONVERSION;
         inchAmount = inchAmount % INCH_FOOT_CONVERSION;

         System.out.println("\nMILES  : " + amountMile);
         System.out.println("YARDS  : " + amountYard);
         System.out.println("FEET   : " + amountFeet);
         System.out.println("INCHES : " + inchAmount);


        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
         final int CM_METER_CONVERSION = 100;
         final int CM_KM_CONVERSION = 100000;

         System.out.print("\nEnter a number of centimeters: ");
         int cmAmount = in.nextInt();

         int kmAmount = cmAmount / CM_KM_CONVERSION;
         cmAmount = cmAmount % CM_KM_CONVERSION;

         int mAmount = cmAmount / CM_METER_CONVERSION;
         cmAmount = cmAmount % CM_METER_CONVERSION;

         System.out.println("\nKILOMETERS  : " + kmAmount);
         System.out.println("METERS      : " + mAmount);
         System.out.println("CENTIMETERS : " + cmAmount);



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
