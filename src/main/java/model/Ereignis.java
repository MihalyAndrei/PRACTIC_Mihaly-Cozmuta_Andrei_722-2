package model;

public class Ereignis {
    private int id;
    private int tributId;
    Eventyp eventyp;
    private int points;
    private int day;

    public Ereignis() {}

    // 2. Getters
    public int getId() { return id; }
    public int getTitle() { return tributId; }
    public int getGenre() { return points; }
    public int getRating() { return day; }

    @Override
    public String toString() {
        return "Ereignis"+id+" "+tributId+" "+eventyp+" "+points+" "+day;
    }
}