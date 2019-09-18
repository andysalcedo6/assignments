// Author: Andres Salcedo
// Created: 09/17/2019
// CSE 02

import java.util.Scanner;
public class Cookies{
    // main method required for every Java program
   public static void main(String[] args) {

}  //end of main method   
} //end of class

public class BoxVolume {

    // this program will use three measurements given in order to find the volume of a box.
    public static void main(String args[]){
     Scanner myScanner = new Scanner( System.in);
   //enter the neccessary values for the volume equation
     
     System.out.print("Enter the width of the box(x): ");
     //values are in the form of X
     double width = myScanner.nextDouble();
     
     System.out.print("Enter the length of the box(x): ");
     double length = myScanner.nextDouble();
     
     System.out.print("Enter the height of the box(x): ");
     double height = myScanner.nextDouble();
    
        System.out.print("The volume of the box is:"+width*height*length );
        //equation of w*h*l used in order to print out the value we wanted
    }

}