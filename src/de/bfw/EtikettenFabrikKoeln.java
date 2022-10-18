package de.bfw;

public class EtikettenFabrikKoeln extends EtikettenFabrik {

    protected TeeEtikett fabrikMethode(String typ){

        if(typ.equals("Bronchial")){
            return new KoelnerBronchialTeeEtikett("Pfeffi", 5.40);
        }
        else{
            System.out.println("fabrikMethode für Magen");
            return new KoelnerBronchialTeeEtikett("Kümmel", 6.40);
        }
    }
}
