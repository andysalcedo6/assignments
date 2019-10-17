//Author: Andres Salcedo
//CSE 02
//10/16/2019

import java.util.Scanner;

public class Checkerboard {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height = 0;
        int width = 0;
        int size = 0;
        int loopy = 0;

        while (true) {
            System.out.println("Input your window height:");
            boolean sHeight = s.hasNextInt();
            if (sHeight) {
                height = s.nextInt();
                break;
            } else {
                System.out.print("Invalid Input, try again with an integer:");
                String word = s.next();
            }
        }

        while (true) {
            System.out.println("Input your window width:");
            boolean sWidth = s.hasNextInt();
            if (sWidth) {
                width = s.nextInt();
                break;
            } else {
                System.out.print("Invalid Input, try again with an integer:");
                String word = s.next();
            }
        }
        while (true) {
            System.out.println("Input your window size:");
            boolean sSize = s.hasNextInt();
            if (sSize) {
                size = s.nextInt();
                break;
            } else {
                System.out.print("Invalid Input, try again with an integer:");
                String word = s.next();
            }
        }

        int tile = size;
        do {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if ((i % tile == 0) && (j % tile == 0)) {
                        System.out.print("+");
                        continue;
                    }
                    if ((i % tile == size) && (j % tile == 0)) {
                        System.out.print("+");
                        continue;
                    }

                    if ((i % tile == 0) && (j % tile > 0) && (j % tile < size)) {
                        System.out.print("-");
                        continue;
                    }
                    if ((i % tile == size) && (j % tile > 0) && (j % tile < size)) {
                        System.out.print("-");
                        continue;
                    }

                    if ((i % tile > 0) && (i % tile < size) && (j % tile == 0)) {
                        System.out.print("|");
                        continue;
                    }
                    if ((i % tile > 0) && (i % tile < size) && (j % tile == size)) {
                        System.out.print("|");
                        continue;
                    }
                    int yRemainder = (i / size) % 2;
                    int xRemainder = (j / size) % 2;

                    if ((xRemainder == 0 && yRemainder == 0) || (xRemainder != 0 && yRemainder != 0)) { //

                        System.out.print("#");
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.print("\n");
            }
            loopy++;
        } while (loopy < 3);
    }
}
