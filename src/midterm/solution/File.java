package src.midterm.solution;

import java.util.Random;

public class File extends Component {
    enum Types {TXT, BIN, JAVA, CLASS, EXE};

    private Types type;

    public File(Types type, String name) {
        super(0, name);
        Random random = new Random();
        super.setSizeBytes(random.nextLong(1, 1000001));
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("File {Name: " + super.getName() + "}"
                + " {Type: " + type + "}"
                + " {Size: " + super.getSizeBytes() + "}");
    }

    @Override
    public void open() {
        System.out.println("Opening File " + super.getName());
    }

    public void close() {
        System.out.println("Closing File " + super.getName());
    }
}
