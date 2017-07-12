import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;
        String letterToContinue = "";
        String userName;

        // Input

        // Get's user's name.
        System.out.println("Hello, please enter your name: ");
        userName = scan.nextLine();


        do {

            System.out.println("Please enter an integer between 1 and 100: ");
            userInput = scan.nextInt();

            // Processing

            /*
            // If the integer is less than 1 and greater than 100 it displays error.
            while (userInput < 1 || userInput > 100) {
                System.out.println("Invalid Entry.\nPlease enter an integer between 1 and 100: ");
                userInput = scan.nextInt();
                //break;
           }
           */

            if (userInput < 1 || userInput > 100) {
                System.out.println("Error: Invalid Input!");
            } else {
                // Output

                if (userInput % 2 != 0 && userInput < 60) {
                    System.out.println(userName + "'s number " + userInput + " is odd and less than 60");
                } else if (userInput >= 2 && userInput <= 25) {
                    System.out.println(userName + "'s " + "number is even and less than 25");
                } else if (userInput >= 26 && userInput <= 60) {
                    System.out.println(userName + "'s " + "number is even.");
                } else if (userInput % 2 != 0 && userInput > 60) {
                    System.out.println(userName + "'s " + "number is odd and over 60");
                } else if (userInput > 60) {
                    System.out.println(userName + "'s " + "number is even");
                }

                // Asks user if they would like to enter more numbers.
                System.out.println("Continue? Y/N");
                letterToContinue = scan.next().toUpperCase();
            }

        }
        while (!letterToContinue.equals("N"));
        System.out.println("Program closing, bye " + userName + "!");
    }
}




