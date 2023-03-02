package src.week4;

import java.util.Objects;

/**
 * The ColorInstance program defines static factory methods for creating
 * instance-controlled color objects.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class ColorInstance {
    // A String representation of the color
    private String color;


    /**
     * A private constructor for creating a color instance
     *
     * @param color This is the name of the color
     */
    private ColorInstance(String color) {
        this.color = color;
    }

    /**
     * Get the color of the instance
     *
     * @return String This is a String representation of the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Return an instance of color red
     *
     * @return ColorInstance This is a color instance of red
     */
    public static ColorInstance getRedInstance() {
        return new ColorInstance("red");
    }

    /**
     * Return an instance of color yellow
     *
     * @return ColorInstance This is a color instance of yellow
     */
    public static ColorInstance getYellowInstance() {
        return new ColorInstance("yellow");
    }

    /**
     * Return an instance of color blue
     *
     * @return ColorInstance This is a color instance of blue
     */
    public static ColorInstance getBlueInstance() {
        return new ColorInstance("blue");
    }

    /**
     * Check if the object o is a ColorInstance object that has the same color
     * as the current object
     *
     * @param o This is another object to compare
     * @return boolean This is a boolean value that is true only if the object
     * o is a ColorInstance object with the same color as the current object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorInstance that = (ColorInstance) o;
        return Objects.equals(color, that.color);
    }

    /**
     * Get a hash code for the ColorInstance object
     *
     * @return int This is an integer hash code for the ColorInstance object
     */
    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    public static void main(String[] args) {
        ColorInstance redColor = ColorInstance.getRedInstance();
        System.out.println("This is a " + redColor.getColor() + " color.");
        ColorInstance yellowColor = ColorInstance.getYellowInstance();
        System.out.println("This is a " + yellowColor.getColor() + " color.");
        ColorInstance blueColor = ColorInstance.getBlueInstance();
        System.out.println("This is a " + blueColor.getColor() + " color.");

        ColorInstance redColor2 = ColorInstance.getRedInstance();
        System.out.println(redColor.equals(redColor2));
        System.out.println(redColor == redColor2);

        /*
         Can you modify the code so that only one instance can be created for
         each color?
         */
    }
}
