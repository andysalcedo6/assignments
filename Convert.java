// Author: Andres Salcedo
// Created: 09/16/2019
// CSE 02

import java.util.Scanner;
public class Salcedo{
    // main method required for every Java program
   public static void main(String[] args) {

}  //end of main method   
} //end of class

public class Convert{
   
//this program will lets us convert "cm" to "miles"
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the distance in centimeters(xx.xx):");
        //program recieves the distance, with the numbers being in the format of xx.xx
        double centi = myScanner.nextDouble();

        double miles;

        miles= (centi * 0.0000062137);
        //program translates the distance into miles, this equation converts cm to mi.
       
        System.out.printf(centi+" centimeters is " + miles%7f +" miles.");
        //this prints the value we're looking for in a easily readible way.

    }
}
