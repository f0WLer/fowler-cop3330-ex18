import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
       char input = scanner.next().charAt(0);
       if (input == 'c' || input == 'C') {
           System.out.print("Enter the temperature in Fahrenheit: ");
           int temp = scanner.nextInt();
           double converted = (temp - 32) * 5 / 9;
           System.out.print(String.format("The temperature in Celsius is %.0f.", converted));
       } else if (input == 'f' || input == 'F') {
           System.out.print("Enter the temperature in Celsius: ");
           int temp = scanner.nextInt();
           double converted = (temp * 9 / 5) + 32;
           System.out.print(String.format("The temperature in Fahrenheit is %.0f.", converted));
       }
    }
}
