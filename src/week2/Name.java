package src.week2;

public class Name {
    // Instance variables
    private String first;
    private String middle;
    private String last;

    // Default constructor
    public Name() {
        first= "N/A";
        middle= "N/A";
        last= "N/A";
    }

    // Another constructor with arguments
    public Name(String first, String middle, String last) {
        this.first= first;
        this.middle= middle;
        this.last= last;
    }

    // Accessors (getters) and mutators (setters)
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

}