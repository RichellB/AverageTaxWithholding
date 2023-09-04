import java.util.Scanner;

public class AverageWithholding {

    public static void main(String[] args){

        // variable assignments
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your income:");
        int income = input.nextInt();
        int taxRate;

        // conditional statements
        if (income < 500) {
            taxRate = 10; 
            System.out.println("\nYour weekly average tax withholding is " + taxRate + "%.");
        } else if (income >= 500 && income < 1500) {
            taxRate = 15; 
            System.out.println("\nYour weekly average tax withholding is " + taxRate + "%.");
        } else if (income >= 1500 && income < 2500) {
            taxRate = 20; 
            System.out.println("\nYour weekly average tax withholding is " + taxRate + "%.");
        } else if (income > 2500) {
            taxRate = 30; 
            System.out.println("\nYour weekly average tax withholding is " + taxRate + "%.");
        }

    }
}

// ====== PSEUDOCODE ======

// Initialize income to 0
// declare the rate variable 

// if income is less than 500, rate is set to 10
// a new variable is created to store the income and rate calculation
// print the Tax Withholding amount

// else if income is greater than 500 but less than 1500, rate is set to 15
// a new variable is created to store the income and rate calculation
// print the Tax Withholding amount

// else if income is greater than 1500 but less than 2500, rate is set to 20
// a new variable is created to store the income and rate calculation
// print the Tax Withholding amount

// else if income is greater than 2500, rate is set to 30
// a new variable is created to store the income and rate calculation
// print the Tax Withholding amount

// else print error message

// ====== PSEUDOCODE ======





// calculate the weekly avg tax withholding for a customer

// income less than $500 - rate 10%
// income >= $500 and less than $1500 - rate 15%
// income >= $1500 and < $2500 - rate 20% 
// income >=$2500 - rate 30%


     // if (income < 500) {
        //     Int rate = 10;
        //     Int tax_with = income * rate / 100;
        //     System.out.println(`The average Tax Withholding is ${tax_with}`);
        // } else if (income >= 500 && < 1500) {
        //     Int rate = 15;
        //     Int tax_with = income * rate / 100;
        //     System.out.println(`The average Tax Withholding is ${tax_with}`);
        // } else if (income >= 1500 && < 2500 ) {
        //     Int rate = 20;
        //     Int tax_with = income * rate / 100;
        //     System.out.println(`The average Tax Withholding is ${tax_with}`);
        // } else if (income >= 2500) {
        //     Int rate = 30;
        //     Int tax_with = income * rate / 100;
        //     System.out.println(`The average Tax Withholding is ${tax_with}`);
        // } else {
        //     System.out.println("Sorry, your income has to be atleast $500.00");
        // }