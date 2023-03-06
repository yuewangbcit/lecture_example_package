package src.midterm.solution;

import java.util.ArrayList;
import java.util.Random;

public class Directory extends Component {
    private ArrayList<Component> contents;

    public Directory(String name) {
        super(0, name);
        Random random = new Random();
        contents = new ArrayList<Component>();
    }

    public int add(Component component) {
        contents.add(component);
        super.setSizeBytes(super.getSizeBytes()+component.getSizeBytes());
        return contents.size();
    }

    public Component remove(Component component) {
        Component toRemove = null;
        for(Component c : contents) {
            if(c.equals(component)) {
                toRemove = c;
            }
        }
        if(toRemove!=null) {
            super.setSizeBytes(super.getSizeBytes()-component.getSizeBytes());
            contents.remove(toRemove);
        }
        return toRemove;
    }

    @Override
    public void print() {
        System.out.println("Directory {Name: " + super.getName() + "}"
                + " {Size: " + super.getSizeBytes() + "}");
        for(int i=0; i<contents.size(); i++) {
            System.out.print("- ");
            contents.get(i).print();
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Directory " + super.getName());
        for(Component c : contents) {
            System.out.print("- ");
            c.open();
        }
    }

    public void close() {
        System.out.println("Closing Directory " + super.getName());
        for(Component c : contents) {
            System.out.print("- ");
            c.close();
        }
    }
}
