package src.week4.database1;

import java.util.ArrayList;

public class Database {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    public Database() {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    public void addCD(CD cd) {
        cds.add(cd);
    }

    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public void list() {
        for(CD cd : cds) {
            cd.print();
            System.out.println();
        }

        for(DVD dvd : dvds) {
            dvd.print();
            System.out.println();
        }
    }
}
