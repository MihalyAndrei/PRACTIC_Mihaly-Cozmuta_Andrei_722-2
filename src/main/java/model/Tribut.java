package model;

public class Tribut{
    private int id;
    private String name;
    Status status;
    private int distrikt;
    private int skillLevel;

    public Tribut() {}

    public int getId() { return id; }
    public String getName() { return name; }
    public int getDistrikt() { return distrikt; }
    public int getSkillLevel() { return skillLevel; }

    @Override
    public String toString() {
        return "Tribut"+id+" "+name+" "+status+" "+distrikt+" "+skillLevel;
    }
}