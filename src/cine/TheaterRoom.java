package cine;

import java.util.ArrayList;

//clases son singular
public class TheaterRoom {
    int numRoom;
    int rows;
    int columns;
    ArrayList<Seats> seats = new ArrayList();
    Movie movie;

    public TheaterRoom(int numRoom, Movie movie) {
        this.numRoom = numRoom;
        this.rows = 3;
        this.columns = 5;
        this.movie = movie;
        for(int row = 0; row < this.rows; ++row) {
            for(int column = 0; column < this.columns; ++column) {
                Seats seat = new Seats(row,column);
                seats.add(seat);

            }
        }
    }

    public Boolean thereIsASeat(int row, int column) {
        for (int a = 0; a < seats.size(); ++a) {
            Seats space = seats.get(a);
            if (space.getRow() == row && space.getColumn() == column);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String room = "Theater Room "+this.numRoom;
        room += "\n Movie: "+this.movie;
        for(int row = 0; row < this.rows; ++row) {
            for(int column = 0; column < this.columns; ++column) {
                if (thereIsASeat(row,column)) {
                    room+=row;
                    room+=column+" ";
                }

            }
            room+="\n";
        }
        return room;
    }
}
