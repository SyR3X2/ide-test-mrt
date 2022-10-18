package de.bfw;

public abstract class EtikettenFabrik {

    public TeeEtikett erstelleEtikett(String typ){
        TeeEtikett tk = this.fabrikMethode(typ);
        tk.berechneVerfallsDatum();
        return tk;
    }

    protected abstract TeeEtikett fabrikMethode(String typ);

}
