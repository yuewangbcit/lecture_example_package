package src.week6;

public class ComparableString implements Comparable<ComparableString> {
    private String name;

    public ComparableString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ComparableString o) {
        if(name.compareTo(o.getName())>0) {
            return -1;
        }
        else if(name.compareTo(o.getName())<0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
