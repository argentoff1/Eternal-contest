package Task1;

import Task2.Task2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fareCost = scanner.nextInt();
        int fareAmount = scanner.nextInt();
        int extraMbCost = scanner.nextInt();
        int trafficVolume = scanner.nextInt();
        int sum = 0;

        if (trafficVolume > fareAmount) {
            sum = fareCost + extraMbCost * (trafficVolume - fareAmount);
        } else if (fareAmount >= trafficVolume)
            sum = fareCost;
        System.out.println(sum);
    }
}
