package src.week5.database3;

public class Item {
    private String title;
    private String comment;

    public Item(String theTitle) {
        title = theTitle;
        comment = " ";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void print() {
        System.out.print(toString());
    }

}
