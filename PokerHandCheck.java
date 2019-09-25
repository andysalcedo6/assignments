// Author: Andres Salcedo
// Created 09/24/2019
// CSE 02

import java.util.Scanner;

public class PokerHandCheck{

    public static void main(String args[]){
        Scanner myScanner=new Scanner(System.in);

        int one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0, ten=0
    , eleven=0,twelve=0 , thirteen = 0;

        int num1 = (int) (Math.random()*53);
        int num2 = (int) (Math.random()*53);
        int num3 = (int) (Math.random()*53);
        int num4 = (int) (Math.random()*53);
        int num5 = (int) (Math.random()*53);
    
        if(num1>39){

            int newValue = 52-num1;
            switch (newValue){
                case 0:
                System.out.println("You picked the King of Spades");
                thirteen++;
                break;
                case 1:
                System.out.println("You picked the Queen of Spades");
                twelve++;
                break;
                case 2:
                System.out.println("You picked the Jack of Spades");
                eleven++;
                break;
                case 3:
                System.out.println("You picked the 10 of Spades");
                ten++;
                break;
                case 4:
                System.out.println("You picked the 9 of Spades");
                nine++;
                break;
                case 5:
                System.out.println("You picked the 8 of Spades");
                eight++;
                break;
                case 6:
                System.out.println("You picked the 7 of Spades");
                seven++;
                break;
                case 7:
                System.out.println("You picked the 6 of Spades");
                six++;
                break;
                case 8:
                System.out.println("You picked the 5 of Spades");
                five++;
                break;
                case 9:
                System.out.println("You picked the 4 of Spades");
                four++;
                break;
                case 10:
                System.out.println("You picked the 3 of Spades");
                three++;
                break;
                case 11:
                System.out.println("You picked the 2 of Spades");
                two++;
                break;
                case 12:
                System.out.println("You picked the Ace of Spades");
                one++;
                break;  

            }
           }
          
                    
           else if(num1<39 && num1>26){

            int newVal =39-num1;
            switch (newVal){
                case 0:
            System.out.println("You picked the King of Hearts");
            thirteen++;
            break;
            case 1:
            System.out.println("You picked the Queen of Hearts");
            twelve++;
            break;
            case 2:
            System.out.println("You picked the Jack of Hearts");
            eleven++;
            break;
            case 3:
            System.out.println("You picked the 10 of Hearts");
            ten++;
            break;
            case 4:
            System.out.println("You picked the 9 of Hearts");
            nine++;
            break;
            case 5:
            System.out.println("You picked the 8 of Hearts");
            eight++;
            break;
            case 6:
            System.out.println("You picked the 7 of Hearts");
            seven++;
            break;
            case 7:
            System.out.println("You picked the 6 of Hearts");
            six++;
            break;
            case 8:
            System.out.println("You picked the 5 of Hearts");
            five++;
            break;
            case 9:
            System.out.println("You picked the 4 of Hearts");
            four++;
            break;
            case 10:
            System.out.println("You picked the 3 of Hearts");
            three++;
            break;
            case 11:
            System.out.println("You picked the 2 of Hearts");
            two++;
            break;
            case 12:
            System.out.println("You picked the Ace of Hearts");
            one++;
            break; 
            }
           }

 else if(num1<26 && num1>13){

                int newVal =26-num1;
                switch (newVal){
                    case 0:
                System.out.println("You picked the King of Clubs");
                thirteen++;
                break;
                case 1:
                System.out.println("You picked the Queen of Clubs");
                twelve++;
                break;
                case 2:
                System.out.println("You picked the Jack of Clubs");
                eleven++;
                break;
                case 3:
                System.out.println("You picked the 10 of Clubs");
                ten++;
                break;
                case 4:
                System.out.println("You picked the 9 of Clubs");
                nine++;
                break;
                case 5:
                System.out.println("You picked the 8 of Clubs");
                eight++;
                break;
                case 6:
                System.out.println("You picked the 7 of Clubs");
                seven++;
                break;
                case 7:
                System.out.println("You picked the 6 of Clubs");
                six++;
                break;
                case 8:
                System.out.println("You picked the 5 of Clubs");
                five++;
                break;
                case 9:
                System.out.println("You picked the 4 of Clubs");
                four++;
                break;
                case 10:
                System.out.println("You picked the 3 of Clubs");
                three++;
                break;
                case 11:
                System.out.println("You picked the 2 of Clubs");
                two++;
                break;
                case 12:
                System.out.println("You picked the Ace of Clubs");
                one++;
                break; 
                }
 }

 else if(num1<13 && num1>1){

    int newVal =13-num1;
    switch (newVal){
        case 0:
    System.out.println("You picked the King of Diamonds");
    thirteen++;
    break;
    case 1:
    System.out.println("You picked the Queen of Diamonds");
    twelve++;
    break;
    case 2:
    System.out.println("You picked the Jack of Diamonds");
    eleven++;
    break;
    case 3:
    System.out.println("You picked the 10 of Diamonds");
    ten++;
    break;
    case 4:
    System.out.println("You picked the 9 of Diamonds");
    nine++;
    break;
    case 5:
    System.out.println("You picked the 8 of Diamonds");
    eight++;
    break;
    case 6:
    System.out.println("You picked the 7 of Diamonds");
    seven++;
    break;
    case 7:
    System.out.println("You picked the 6 of Diamonds");
    six++;
    break;
    case 8:
    System.out.println("You picked the 5 of Diamonds");
    five++;
    break;
    case 9:
    System.out.println("You picked the 4 of Diamonds");
    four++;
    break;
    case 10:
    System.out.println("You picked the 3 of Diamonds");
    three++;
    break;
    case 11:
    System.out.println("You picked the 2 of Diamonds");
    two++;
    break;
    case 12:
    System.out.println("You picked the Ace of Diamonds");
    one++;
    break; 
    }
 }
 if(num2>39){

    int newValue = 52-num2;
    switch (newValue){
        case 0:
        System.out.println("You picked the King of Spades");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Spades");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Spades");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Spades");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Spades");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Spades");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Spades");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Spades");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Spades");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Spades");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Spades");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Spades");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Spades");
        one++;
        break;  

    }
   }
  
            
   else if(num2<39 && num2>26){

    int newVal =39-num2;
    switch (newVal){
        case 0:
    System.out.println("You picked the King of Hearts");
    thirteen++;
    break;
    case 1:
    System.out.println("You picked the Queen of Hearts");
    twelve++;
    break;
    case 2:
    System.out.println("You picked the Jack of Hearts");
    eleven++;
    break;
    case 3:
    System.out.println("You picked the 10 of Hearts");
    ten++;
    break;
    case 4:
    System.out.println("You picked the 9 of Hearts");
    nine++;
    break;
    case 5:
    System.out.println("You picked the 8 of Hearts");
    eight++;
    break;
    case 6:
    System.out.println("You picked the 7 of Hearts");
    seven++;
    break;
    case 7:
    System.out.println("You picked the 6 of Hearts");
    six++;
    break;
    case 8:
    System.out.println("You picked the 5 of Hearts");
    five++;
    break;
    case 9:
    System.out.println("You picked the 4 of Hearts");
    four++;
    break;
    case 10:
    System.out.println("You picked the 3 of Hearts");
    three++;
    break;
    case 11:
    System.out.println("You picked the 2 of Hearts");
    two++;
    break;
    case 12:
    System.out.println("You picked the Ace of Hearts");
    one++;
    break; 
    }
   }

else if(num2<26 && num2>13){

        int newVal =26-num2;
        switch (newVal){
            case 0:
        System.out.println("You picked the King of Clubs");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Clubs");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Clubs");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Clubs");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Clubs");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Clubs");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Clubs");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Clubs");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Clubs");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Clubs");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Clubs");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Clubs");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Clubs");
        one++;
        break; 
        }
}

else if(num2<13 && num2>1){

int newVal =13-num2;
switch (newVal){
case 0:
System.out.println("You picked the King of Diamonds");
thirteen++;
break;
case 1:
System.out.println("You picked the Queen of Diamonds");
twelve++;
break;
case 2:
System.out.println("You picked the Jack of Diamonds");
eleven++;
break;
case 3:
System.out.println("You picked the 10 of Diamonds");
ten++;
break;
case 4:
System.out.println("You picked the 9 of Diamonds");
nine++;
break;
case 5:
System.out.println("You picked the 8 of Diamonds");
eight++;
break;
case 6:
System.out.println("You picked the 7 of Diamonds");
seven++;
break;
case 7:
System.out.println("You picked the 6 of Diamonds");
six++;
break;
case 8:
System.out.println("You picked the 5 of Diamonds");
five++;
break;
case 9:
System.out.println("You picked the 4 of Diamonds");
four++;
break;
case 10:
System.out.println("You picked the 3 of Diamonds");
three++;
break;
case 11:
System.out.println("You picked the 2 of Diamonds");
two++;
break;
case 12:
System.out.println("You picked the Ace of Diamonds");
one++;
break; 
}
}
if(num3>39){

    int newValue = 52-num3;
    switch (newValue){
        case 0:
        System.out.println("You picked the King of Spades");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Spades");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Spades");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Spades");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Spades");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Spades");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Spades");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Spades");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Spades");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Spades");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Spades");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Spades");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Spades");
        one++;
        break;  

    }
   }
  
            
   else if(num3<39 && num3>26){

    int newVal =39-num3;
    switch (newVal){
        case 0:
    System.out.println("You picked the King of Hearts");
    thirteen++;
    break;
    case 1:
    System.out.println("You picked the Queen of Hearts");
    twelve++;
    break;
    case 2:
    System.out.println("You picked the Jack of Hearts");
    eleven++;
    break;
    case 3:
    System.out.println("You picked the 10 of Hearts");
    ten++;
    break;
    case 4:
    System.out.println("You picked the 9 of Hearts");
    nine++;
    break;
    case 5:
    System.out.println("You picked the 8 of Hearts");
    eight++;
    break;
    case 6:
    System.out.println("You picked the 7 of Hearts");
    seven++;
    break;
    case 7:
    System.out.println("You picked the 6 of Hearts");
    six++;
    break;
    case 8:
    System.out.println("You picked the 5 of Hearts");
    five++;
    break;
    case 9:
    System.out.println("You picked the 4 of Hearts");
    four++;
    break;
    case 10:
    System.out.println("You picked the 3 of Hearts");
    three++;
    break;
    case 11:
    System.out.println("You picked the 2 of Hearts");
    two++;
    break;
    case 12:
    System.out.println("You picked the Ace of Hearts");
    one++;
    break; 
    }
   }

else if(num3<26 && num3>13){

        int newVal =26-num3;
        switch (newVal){
            case 0:
        System.out.println("You picked the King of Clubs");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Clubs");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Clubs");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Clubs");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Clubs");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Clubs");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Clubs");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Clubs");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Clubs");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Clubs");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Clubs");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Clubs");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Clubs");
        one++;
        break; 
        }
}

else if(num3<13 && num3>1){

int newVal =13-num3;
switch (newVal){
case 0:
System.out.println("You picked the King of Diamonds");
thirteen++;
break;
case 1:
System.out.println("You picked the Queen of Diamonds");
twelve++;
break;
case 2:
System.out.println("You picked the Jack of Diamonds");
eleven++;
break;
case 3:
System.out.println("You picked the 10 of Diamonds");
ten++;
break;
case 4:
System.out.println("You picked the 9 of Diamonds");
nine++;
break;
case 5:
System.out.println("You picked the 8 of Diamonds");
eight++;
break;
case 6:
System.out.println("You picked the 7 of Diamonds");
seven++;
break;
case 7:
System.out.println("You picked the 6 of Diamonds");
six++;
break;
case 8:
System.out.println("You picked the 5 of Diamonds");
five++;
break;
case 9:
System.out.println("You picked the 4 of Diamonds");
four++;
break;
case 10:
System.out.println("You picked the 3 of Diamonds");
three++;
break;
case 11:
System.out.println("You picked the 2 of Diamonds");
two++;
break;
case 12:
System.out.println("You picked the Ace of Diamonds");
one++;
break; 
}
}
if(num4>39){

    int newValue = 52-num4;
    switch (newValue){
        case 0:
        System.out.println("You picked the King of Spades");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Spades");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Spades");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Spades");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Spades");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Spades");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Spades");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Spades");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Spades");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Spades");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Spades");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Spades");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Spades");
        one++;
        break;  

    }
   }
  
            
   else if(num4<39 && num4>26){

    int newVal =39-num4;
    switch (newVal){
        case 0:
    System.out.println("You picked the King of Hearts");
    thirteen++;
    break;
    case 1:
    System.out.println("You picked the Queen of Hearts");
    twelve++;
    break;
    case 2:
    System.out.println("You picked the Jack of Hearts");
    eleven++;
    break;
    case 3:
    System.out.println("You picked the 10 of Hearts");
    ten++;
    break;
    case 4:
    System.out.println("You picked the 9 of Hearts");
    nine++;
    break;
    case 5:
    System.out.println("You picked the 8 of Hearts");
    eight++;
    break;
    case 6:
    System.out.println("You picked the 7 of Hearts");
    seven++;
    break;
    case 7:
    System.out.println("You picked the 6 of Hearts");
    six++;
    break;
    case 8:
    System.out.println("You picked the 5 of Hearts");
    five++;
    break;
    case 9:
    System.out.println("You picked the 4 of Hearts");
    four++;
    break;
    case 10:
    System.out.println("You picked the 3 of Hearts");
    three++;
    break;
    case 11:
    System.out.println("You picked the 2 of Hearts");
    two++;
    break;
    case 12:
    System.out.println("You picked the Ace of Hearts");
    one++;
    break; 
    }
   }

else if(num4<26 && num4>13){

        int newVal =26-num4;
        switch (newVal){
            case 0:
        System.out.println("You picked the King of Clubs");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Clubs");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Clubs");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Clubs");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Clubs");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Clubs");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Clubs");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Clubs");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Clubs");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Clubs");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Clubs");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Clubs");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Clubs");
        one++;
        break; 
        }
}

else if(num4<13 && num4>1){

int newVal =13-num4;
switch (newVal){
case 0:
System.out.println("You picked the King of Diamonds");
thirteen++;
break;
case 1:
System.out.println("You picked the Queen of Diamonds");
twelve++;
break;
case 2:
System.out.println("You picked the Jack of Diamonds");
eleven++;
break;
case 3:
System.out.println("You picked the 10 of Diamonds");
ten++;
break;
case 4:
System.out.println("You picked the 9 of Diamonds");
nine++;
break;
case 5:
System.out.println("You picked the 8 of Diamonds");
eight++;
break;
case 6:
System.out.println("You picked the 7 of Diamonds");
seven++;
break;
case 7:
System.out.println("You picked the 6 of Diamonds");
six++;
break;
case 8:
System.out.println("You picked the 5 of Diamonds");
five++;
break;
case 9:
System.out.println("You picked the 4 of Diamonds");
four++;
break;
case 10:
System.out.println("You picked the 3 of Diamonds");
three++;
break;
case 11:
System.out.println("You picked the 2 of Diamonds");
two++;
break;
case 12:
System.out.println("You picked the Ace of Diamonds");
one++;
break; 
}
}
if(num5>39){

    int newValue = 52-num5;
    switch (newValue){
        case 0:
        System.out.println("You picked the King of Spades");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Spades");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Spades");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Spades");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Spades");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Spades");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Spades");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Spades");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Spades");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Spades");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Spades");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Spades");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Spades");
        one++;
        break;  

    }
   }
  
            
   else if(num5<39 && num5>26){

    int newVal =39-num5;
    switch (newVal){
        case 0:
    System.out.println("You picked the King of Hearts");
    thirteen++;
    break;
    case 1:
    System.out.println("You picked the Queen of Hearts");
    twelve++;
    break;
    case 2:
    System.out.println("You picked the Jack of Hearts");
    eleven++;
    break;
    case 3:
    System.out.println("You picked the 10 of Hearts");
    ten++;
    break;
    case 4:
    System.out.println("You picked the 9 of Hearts");
    nine++;
    break;
    case 5:
    System.out.println("You picked the 8 of Hearts");
    eight++;
    break;
    case 6:
    System.out.println("You picked the 7 of Hearts");
    seven++;
    break;
    case 7:
    System.out.println("You picked the 6 of Hearts");
    six++;
    break;
    case 8:
    System.out.println("You picked the 5 of Hearts");
    five++;
    break;
    case 9:
    System.out.println("You picked the 4 of Hearts");
    four++;
    break;
    case 10:
    System.out.println("You picked the 3 of Hearts");
    three++;
    break;
    case 11:
    System.out.println("You picked the 2 of Hearts");
    two++;
    break;
    case 12:
    System.out.println("You picked the Ace of Hearts");
    one++;
    break; 
    }
   }

else if(num5<26 && num5>13){

        int newVal =26-num5;
        switch (newVal){
            case 0:
        System.out.println("You picked the King of Clubs");
        thirteen++;
        break;
        case 1:
        System.out.println("You picked the Queen of Clubs");
        twelve++;
        break;
        case 2:
        System.out.println("You picked the Jack of Clubs");
        eleven++;
        break;
        case 3:
        System.out.println("You picked the 10 of Clubs");
        ten++;
        break;
        case 4:
        System.out.println("You picked the 9 of Clubs");
        nine++;
        break;
        case 5:
        System.out.println("You picked the 8 of Clubs");
        eight++;
        break;
        case 6:
        System.out.println("You picked the 7 of Clubs");
        seven++;
        break;
        case 7:
        System.out.println("You picked the 6 of Clubs");
        six++;
        break;
        case 8:
        System.out.println("You picked the 5 of Clubs");
        five++;
        break;
        case 9:
        System.out.println("You picked the 4 of Clubs");
        four++;
        break;
        case 10:
        System.out.println("You picked the 3 of Clubs");
        three++;
        break;
        case 11:
        System.out.println("You picked the 2 of Clubs");
        two++;
        break;
        case 12:
        System.out.println("You picked the Ace of Clubs");
        one++;
        break; 
        }
}

else if(num5<13 && num5>1){

int newVal =13-num5;
switch (newVal){
case 0:
System.out.println("You picked the King of Diamonds");
thirteen++;
break;
case 1:
System.out.println("You picked the Queen of Diamonds");
twelve++;
break;
case 2:
System.out.println("You picked the Jack of Diamonds");
eleven++;
break;
case 3:
System.out.println("You picked the 10 of Diamonds");
ten++;
break;
case 4:
System.out.println("You picked the 9 of Diamonds");
nine++;
break;
case 5:
System.out.println("You picked the 8 of Diamonds");
eight++;
break;
case 6:
System.out.println("You picked the 7 of Diamonds");
seven++;
break;
case 7:
System.out.println("You picked the 6 of Diamonds");
six++;
break;
case 8:
System.out.println("You picked the 5 of Diamonds");
five++;
break;
case 9:
System.out.println("You picked the 4 of Diamonds");
four++;
break;
case 10:
System.out.println("You picked the 3 of Diamonds");
three++;
break;
case 11:
System.out.println("You picked the 2 of Diamonds");
two++;
break;
case 12:
System.out.println("You picked the Ace of Diamonds");
one++;
break; 
}
}
if (one==4 || two==4|| three==4|| four==4|| five==4|| six==4|| seven==4|| eight==4|| nine==4|| ten==4||
 eleven==4|| twelve==4|| thirteen==4 ){
System.out.println("You have two pairs!");
    }
   else if (one==3 || two==3|| three==3 || four==3|| five==3|| six==3|| seven==3|| eight==3|| nine==3|| ten==3||
    eleven==3|| twelve==3|| thirteen==3 ){
   System.out.println("You have a three of a kind!");
    }
    else if 
        (one==2 || two==2|| three==2|| four==2|| five==2|| six==2|| seven==2|| eight==2|| nine==2|| ten==2||
 eleven==2|| twelve==2|| thirteen==2 ){
System.out.println("You have a high card hand!");
 }
 else{
     System.out.println("You have a high card hand!");
 }
 }
    }