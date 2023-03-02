package src.week4;

/**
 * The BouncingBall program defines a bouncing ball with x and y positions.
 * All bouncing balls share the same gravity.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class BouncingBall {
    // gravity is a public static variable shared by all balls
    public static int gravity = 3;
    // x position of the ball
    private int xPosition;
    // y position of the ball
    private int yPosition;

    /**
     * Constructor for creating a bouncing ball
     *
     * @param xPosition x position of the ball
     * @param yPosition y position of the ball
     */
    public BouncingBall(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /**
     * Return the gravity
     *
     * @return int This returns the gravity shared by all balls
     */
    public static int getGravity() {
        return gravity;
    }

    /**
     * Set the gravity
     *
     * @param gravity This is the new gravity for all balls
     */
    public static void setGravity(int gravity) {
        BouncingBall.gravity = gravity;
    }

    /**
     * Get the x position of the ball
     *
     * @return int This returns the x position of the ball
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Set the x position of the ball
     *
     * @param xPosition This is the new x position of the ball
     */
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Get the y position of the ball
     *
     * @return int This returns the y position of the ball
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Set the y position of the ball
     *
     * @param yPosition This is the new y position of the ball
     */
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Get the String representation of the ball.
     *
     * @return String This is a String containing the current
     * x and y positions of the ball
     */
    @Override
    public String toString() {
        return "BouncingBall{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }

    /**
     * Check if the object o is a BouncingBall object that has the same x and
     * y positions as the current ball
     *
     * @param o This is another object to compare
     * @return boolean This is a boolean value that is true only if the object
     * o is a BouncingBall object that has the same x and y positions as the
     * current ball
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BouncingBall that = (BouncingBall) o;
        return xPosition == that.xPosition && yPosition == that.yPosition;
    }

    /**
     * Get a hash code for the ball
     *
     * @return int This is an integer hash code for the ball
     */
    @Override
    public int hashCode() {
        // Prime number is used to reduce the chance of collisions
        int result = 17;
        result = 37 * result + xPosition;
        result = 37 * result + yPosition;
        return result;
    }
}
