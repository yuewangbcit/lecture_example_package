package src.week4.database1;

public class DatabaseDriver {
    public static void main(String[] args) {
        Database database = new Database();
        database.addCD(new CD("CD 1", "Artist 1"));
        database.addCD(new CD("CD 2", "Artist 2"));
        database.addCD(new CD("CD 3", "Artist 3"));
        database.addDVD(new DVD("DVD 1", "Director 1"));
        database.addDVD(new DVD("DVD 2", "Director 2"));
        database.addDVD(new DVD("DVD 3", "Director 3"));
        database.list();
    }
}
