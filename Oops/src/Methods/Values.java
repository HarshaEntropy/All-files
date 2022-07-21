package Methods;

import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int currentPool = 100;
        getBet(keyboard, currentPool);
        getHighLow(keyboard);
        getRoll();
   //   determineWinnings(highLow, userBet, rollSum);


    }

    // Given a Scanner and a current maximum amount of money, prompt the user for
// an integer representing the number of dollars that they want to bet. This
// number must be between 0 and to maximum number of dollars. If the user enters
// a number that is out of bounds, display an error message and ask again.
// Return the bet to the calling program.
    private static int getBet(Scanner inScanner, int currentPool) {
        int userBet = -1;
        while (userBet == -1) {
            inScanner = new Scanner(System.in);
            System.out.println("You have $" + currentPool);
            System.out.println("Enter an amount to bet (0 to quit): ");
            userBet = inScanner.nextInt();
            if (userBet > currentPool || userBet < 0) {
                System.out.println("Your bet MUST be between 0 and " + currentPool + " dollars");
                userBet = -1;
            }
            if (userBet == 0) {
                System.out.println("You have " + currentPool + " dollars left.");
                System.out.println("Goodbye!");
            }
        }
        return userBet;
    }

    // Given a Scanner, prompt the user for a single character indicating whether
// they
// would like to bet High ('H'), Low ('L') or Sevens ('S'). Your code should
// accept
// either capital or lowercase answers, but should display an error if the user
// attempts
// to enter anything but one of these 3 values and prompt for a valid answer.
// Return the character to the calling program.
    private static char getHighLow(Scanner inScanner) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        String userChoice = "";
        while (i == 0) {
            System.out.println("High, low or sevens (H/L/S): ");
            userChoice = keyboard.nextLine();
            if (userChoice.length() > 1 || (userChoice.charAt(0) != 'H' && userChoice.charAt(0) != 'h'
                    && userChoice.charAt(0) != 'L' && userChoice.charAt(0) != 'l' && userChoice.charAt(0) != 'S'
                    && userChoice.charAt(0) != 's')) {
                System.out.println("ERROR: You must type H, L, or S.");
            } else {
                i++;
            }
        }
        char highLow = 'N';
        if (userChoice.charAt(0) == 'H' || userChoice.charAt(0) == 'h') {
            highLow = 'H';
        } else if (userChoice.charAt(0) == 'L' || userChoice.charAt(0) == 'l') {
            highLow = 'L';
        } else {
            highLow = 'S';
        }
        return highLow;
    }

    // Produce a random roll of a single six-sided die and return that value to the
// calling
// program
    private static int getRoll() {
        int dieOne = (int) (Math.random() * 6 + 1);
        System.out.println("Die 1 rolls: " + dieOne);
        int dieTwo = (int) (Math.random() * 6 + 1);
        System.out.println("Die 2 rolls: " + dieTwo);
        int rollSum = dieOne + dieTwo;
        System.out.println("The total of two dice is: " + rollSum);
        return rollSum;
    }

    // Given the choice of high, low or sevens, the player's bet and the total
// result of
// the roll of the dice, determine how much the player has won. If the player
// loses
// the bet then winnings should be negative. If the player wins, the winnings
// should
// be equal to the bet if the choice is High or Low and 4 times the bet if the
// choice
// was Sevens. Return the winnings to the calling program.
    private static int determineWinnings(char highLow, int bet, int roll) {
        int highLowValue = 0;
        int winnings = 0;
        if (highLow == 'H') {
            highLowValue = 8;
        } else if (highLow == 'L') {
            highLowValue = 6;
        } else {
            highLowValue = 7;
        }
        if (roll >= 8 && highLowValue == 8) {
            winnings = bet;
            System.out.println("You won " + winnings + " dollars!");
        } else if (roll <= 6 && highLowValue == 6) {
            winnings = bet;
            System.out.println("You won " + winnings + " dollars!");
        } else if (roll == 7 && highLowValue == 7) {
            winnings = bet * 4;
            System.out.println("You won " + winnings + " dollars!");
        } else {
            winnings = -1 * bet;
        }
        return winnings;

    }
}
