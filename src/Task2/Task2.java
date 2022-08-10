package Task2;

import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeoples = scanner.nextInt();

        BigInteger bigInteger = new BigInteger(String.valueOf(countOfPeoples - 1));

        int countOfCuts = bigInteger.bitLength();

        System.out.println(countOfCuts);
    }
}
