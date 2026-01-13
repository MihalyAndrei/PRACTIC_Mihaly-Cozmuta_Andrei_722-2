package model;

public class SponsorGeschenk extends Tribut{
    private int id;
    private int tributId;
    private String itemName;
    private int value;
    private int day;

    public SponsorGeschenk() {}

    public int getId() { return id; }
    public String getItemName() { return itemName; }
    public int getValue() { return value; }
    public int getDay() { return day; }

    @Override
    public String toString() {
        return "SponsorGeschenk"+id+" "+itemName+" "+value+" "+day;
    }
}