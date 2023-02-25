package week4.database2;

public class DatabaseDriver {
    public static void main(String[] args) {
        Database database = new Database();
        database.addItem(new CD("CD 1", "Artist 1"));
        database.addItem(new CD("CD 2", "Artist 2"));
        database.addItem(new CD("CD 3", "Artist 3"));
        database.addItem(new DVD("DVD 1", "Director 1"));
        database.addItem(new DVD("DVD 2", "Director 2"));
        database.addItem(new DVD("DVD 3", "Director 3"));
        database.list();
        System.out.println();

        Item firstItem = database.getItems().get(0);
        Item newItem = new CD("CD 1", "Artist 1");
        System.out.println(firstItem.equals(newItem));
        System.out.println(firstItem.toString());
        System.out.println(firstItem.hashCode());
        System.out.println(newItem.hashCode());
    }
}
