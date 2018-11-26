package cine;

public class Seats {
    int row;
    int column;
    Boolean taken;


    public Seats (int row, int column) {
        this.row = row;
        this.column = column;
        this.taken = false;
    }

    @Override
    public String toString() {
        return "" +this.row +this.column;
    }
}
