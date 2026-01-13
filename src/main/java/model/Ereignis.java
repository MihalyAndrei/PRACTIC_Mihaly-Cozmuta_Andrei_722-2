package model;

public class Ereignis extends Tribut{
    private int id;
    private int tributId;
    Eventyp eventyp;
    private int points;
    private int day;

    public Ereignis() {}

    // 2. Getters
    public int getId() { return id; }
    public int getTributId() { return tributId; }
    public int getPoints() { return points; }
    public int getDay() { return day; }

    @Override
    public String toString() {
        return "Ereignis"+id+" "+tributId+" "+eventyp+" "+points+" "+day;
    }
}