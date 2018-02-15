package no.hiof.erikob.oblig3;

import java.time.LocalDate;

public class Film extends Produksjon {
    public Film(String tittel, String beskrivelse, LocalDate utgivelsesdato, int spilletid) {
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
    }


    @Override
    public String toString() {
        return getTittel();
    }


}
