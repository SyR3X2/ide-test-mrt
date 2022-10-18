package de.bfw;

public abstract class TeeEtikett{
    protected String name;
    protected String verfallsDatum;
    public TeeEtikett(String name){
        this.name = name;
    }
    public abstract double getPreis();
    public void berechneVerfallsDatum(){
        this.verfallsDatum = "2025";
        System.out.println("berechneVerfallsdatum" + verfallsDatum);
    }
    public void druckeEtikett(){
        System.out.println("drucke Etikett");
    }
}
