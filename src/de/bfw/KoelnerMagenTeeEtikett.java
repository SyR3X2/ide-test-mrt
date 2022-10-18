package de.bfw;

public class KoelnerMagenTeeEtikett extends TeeEtikett{
    private double preis;

    public KoelnerMagenTeeEtikett(String name, double preis) {
        super(name);
        this.preis = preis;
    }

    @Override
    public double getPreis(){

        return preis;
    }
}
