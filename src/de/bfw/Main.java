package de.bfw;

public class Main {
    public static void main(String[] args) {
        // ein EtikettenfabrikKöln Objekt erzeugen
        EtikettenFabrikKoeln ek = new EtikettenFabrikKoeln();
        //die Fabrikmethode aufrufen
        TeeEtikett kbte = ek.erstelleEtikett("Bronchial");
    }
}
