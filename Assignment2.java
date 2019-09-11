// Author: Andres Salcedo
// Created: 09/08/19
// Assignment 2

// this program will calculate the annual growth rate of media users in the US & percentage of users worldwide
public class Assignment2{

    public static void main(String arg[]){
    
    //the next lines will find the percentage increase from each year 2017-2018, 2018-2019
      double eighteen = (((double)(243600000-240000000)/243600000)*100);
      double nineteen = (((double)(246700000-243600000)/246700000)*100);
    
    //these lines will find the % of users from the global pop. (7.7 billion) using data in the millions
      double FacebooK = (((double)2375 / (double)7700000)*100);
      double YouTubE = (((  double)20000 / (double)7700000)*100);
      double WhatsApP = (((double)1600 / (double)7700000)*100);
      double InstagraM = (((double)1000  / (double)7700000)*100);
      
      //the next lines will print out our data on to the terminal in a table format
      
      System.out.println("Year      Growth");
      System.out.println("2018        " + eighteen + "%");
      System.out.println("2019        " + nineteen + "%\n ");

      System.out.println("Social Media Platform    Total Number of Users     Percentage");
      System.out.println("Facebook                 2,375 millions" + "        "   + FacebooK +"%");
      System.out.println("YouTube                  2,000 millions" + "        "   + YouTubE +"%");
      System.out.println("WhatsApp                 1,600 millions" + "        "   + WhatsApP +"%");
      System.out.println("Instagram                1,000 millions" + "        "   + InstagraM +"%");
 

    }
}
