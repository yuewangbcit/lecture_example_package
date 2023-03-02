package src.week5.database3;

public class DatabaseDriver {
    public static void main(String[] args) {
        Database database = new Database();
        database.addItem(new CD("CD 1", "Artist 1"));
        database.addItem(new CD("CD 2", "Artist 2"));
        database.addItem(new CD("CD 3", "Artist 3"));
        database.addItem(new DVD("DVD 1", "Director 1"));
        database.addItem(new DVD("DVD 2", "Director 2"));
        database.addItem(new DVD("DVD 3", "Director 3"));
        database.addItem(new Game("Game 1", 2));
        database.addItem(new Game("Game 2", 5));
        database.addItem(new Game("Game 3", 10));

        database.list();
        System.out.println();

        database.getItems().clear();
        database.addItem(new VideoGame("VideoGame 1", 4,"Mobile"));
        database.addItem(new VideoGame("VideoGame 2", 1,"Window, Mac, Mobile"));
        database.addItem(new BoardGame("BoardGame 1", 2, 8, 8));
        database.addItem(new BoardGame("BoardGame 2", 4, 16, 16));

        database.list();
        System.out.println();
    }
}
