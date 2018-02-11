package no.hiof.erikob.oblig3;

import java.time.LocalDate;

public class Film extends Produksjon {
    public Film(String tittel, String beskrivelse, LocalDate utgivelsesdato, int spilletid) {
        super.tittel = tittel;
        super.beskrivelse = beskrivelse;
        super.utgivelsesdato = utgivelsesdato;
        super.spilletid = spilletid; // i minutter
    }





}
