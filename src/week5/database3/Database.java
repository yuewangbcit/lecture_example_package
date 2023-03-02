package src.week5.database3;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> items;

    public Database() {
        items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void list() {
        for(Item item : items) {
            item.print();
            System.out.println();
        }
    }
}
