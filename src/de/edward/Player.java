package de.edward;

public class Player {

    private String name;
    private double value;
    private String team;

    Player(String name, double value, String team){
        this.name = name;
        this.value = value;
        this.team = team;
    }

    public void print(){
        System.out.println("\n name = " + name);
        System.out.println("\n value = " + value);
        System.out.println("\n team = " + team);
    }

    public String toString(){
        String a = name;
        a += " ";
        a += Double.toString(value);
        a += " "; // This is stupid
        a += team;
        return a;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return team;
    }

}
