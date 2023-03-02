package week9;

public class Student implements java.io.Serializable {
    private String name;
    private String id;
    private String address;
    private transient int SIN;

    public Student(String name, String id, String address, int SIN) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.SIN = SIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSIN() {
        return SIN;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", SIN=" + SIN +
                '}';
    }
}
