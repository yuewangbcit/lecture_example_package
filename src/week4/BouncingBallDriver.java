package src.week4;

/**
 * The BouncingBallDriver program that acts as a driver class for
 * instantiating BouncingBall objects to operate.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class BouncingBallDriver {
    public static void main(String[] args) {
        /*
         Create three BouncingBall objects with distinct x and y
         positions
         */
        BouncingBall ball1 = new BouncingBall(10, 233);
        BouncingBall ball2 = new BouncingBall(75, 155);
        BouncingBall ball3 = new BouncingBall(782, 33);

        // Print the String representation of the balls
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        /*
         Illustrate that all the balls share the static variable gravity,
         which is also a public static variable that can be accessed by
         the class name
         */
        System.out.println(BouncingBall.gravity);
        BouncingBall.gravity = 5;
        System.out.println(ball1.getGravity());
        System.out.println(ball2.getGravity());
        System.out.println(ball3.getGravity());

        // Use an instance to modify the non-constant static variable
        ball2.setGravity(6);
        System.out.println(ball1.getGravity());
        System.out.println(ball2.getGravity());
        System.out.println(ball3.getGravity());
    }
}
