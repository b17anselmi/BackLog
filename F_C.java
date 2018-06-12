//testing code from book for error

import java.util.Scanner;
public class F_C{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees in fahrenheit: ");
        double F = input.nextDouble();
        double C = (5.0/9.0)*(F-32);
        System.out.println("Fahrenheit " + F + " is " + C + "in celcius.");
    }
}