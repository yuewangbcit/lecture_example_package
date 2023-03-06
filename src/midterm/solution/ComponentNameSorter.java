package src.midterm.solution;

import java.util.Comparator;

public class ComponentNameSorter implements Comparator<Component> {
    @Override
    public int compare(Component c1, Component c2) {
        if(c1.getName().compareTo(c2.getName())>0) {
            return 1;
        }
        else if(c1.getName().compareTo(c2.getName())<0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
