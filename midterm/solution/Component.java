package midterm.solution;

public abstract class Component implements Comparable<Component> {
    private long sizeBytes;
    private String name;

    public Component(long sizeBytes, String name) {
        this.sizeBytes = sizeBytes;
        this.name = name;
    }

    public long getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();
    public abstract void open();
    public abstract void close();

    @Override
    public int compareTo(Component c) {
        if(sizeBytes>c.getSizeBytes()) {
            return -1;
        }
        else if (sizeBytes==c.getSizeBytes()) {
            return 0;
        }
        return 1;
    }
}
