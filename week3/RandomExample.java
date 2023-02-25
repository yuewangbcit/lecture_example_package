package week3;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = 1;
        int b = 9;
        for(int i=0; i<50; i++) {
            // randomize a number between 0 and b-1
            System.out.print(rand.nextInt(b) + " ");
        }
        System.out.println();

        for(int i=0; i<50; i++) {
            // randomize a number between a and b
            System.out.print(rand.nextInt(b-a+1) + a + " ");
        }
        System.out.println();

        // set a seed for generating pseudorandom numbers
        rand.setSeed(10000);
        for(int i=0; i<50; i++) {
            System.out.print(rand.nextInt(b-a+1) + a + " ");
        }
        System.out.println();

        // randomize a double value between a and b
        for(int i=0; i<50; i++) {
            System.out.print(String.format("%.1f", rand.nextDouble() * (b-a) + a) + " ");
        }
        System.out.println();

        // randomize an integer from 1 to 9 except 4, 5, and 6
        for(int i=0; i<50; i++) {
            int c = rand.nextInt(a, b-2);
            if(c>3) {
                c += 3;
            }
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
