package de.bfw;

public class KoelnerBronchialTeeEtikett extends TeeEtikett{
    private double preis;

    public KoelnerBronchialTeeEtikett(String name, double preis) {
        super(name);
        this.preis = preis;
    }

    @Override
    public double getPreis(){
        return preis;
    }
}
