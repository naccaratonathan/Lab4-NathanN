package q1;

import java.util.Scanner;

public class App {

    // TODO: Complete the application as described in the lab instructions

    int a;
    int b;


    public App() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                this.a = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("That is not an integer!");
            }
        }
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter another integer: ");
                this.b = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("That is not an integer!");
            }
        }
    }


    public int getAddCalculation(){
        return a + b;
    }
    public int getDifferenceCalculation() {
        return a - b;
    }
    public int getProductCalculation() {
        return a*b;
    }
    public double getAverageCalculation() {
        return (double) (a+b)/2;
    }

    public int getDistanceCalculation(){
        return Math.abs(b-a);
    }

    public int getMax(){
        return Math.max(a, b);
    }
    public int getMin(){
        return Math.min(a, b);
    }


    public void returnAllValues(){
        System.out.printf("Sum = %10d \n", getAddCalculation());
        System.out.printf("Difference = %3d \n", getDifferenceCalculation());
        System.out.printf("Product = %6d \n", getProductCalculation());
        System.out.printf("Average = %9.2f \n", getAverageCalculation());
        System.out.printf("Distance = %5d \n", getDistanceCalculation());
        System.out.printf("Min = %10d \n", getMin());
        System.out.printf("Max = %10d \n", getMax());
    }
}