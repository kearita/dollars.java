import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        float dollars;
        float quarter = 0.25f;
        float dime = 0.10f;
        float nickel = 0.05f;
        float penny = 0.01f;
        int numQuarters;
        int numDimes;
        int numNickels;
        int numPennies;

        numQuarters = scnr.nextInt();
        numDimes = scnr.nextInt();
        numNickels = scnr.nextInt();
        numPennies = scnr.nextInt();

        dollars = (numQuarters * quarter) + (numDimes * dime) + (numNickels * nickel) +
                (numPennies * penny);

        System.out.printf("Amount: $%.2f\n", dollars);



    }
}
