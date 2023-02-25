package week6;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.compareTo(o2)>0) {
            return -1;
        }
        else if(o1.compareTo(o2)<0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
