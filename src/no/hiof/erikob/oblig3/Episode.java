package no.hiof.erikob.oblig3;

import java.time.LocalDate;

public class Episode extends Produksjon{
    private int episodeNummer;
    private int sesongNummer;

    public Episode(int episodeNummer, int sesongNummer, String tittel, int spilletid) {
        super(tittel, spilletid);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    public Episode(String tittel, int spilletid, LocalDate utgivelsesdato ,String beskrivelse, int episodeNummer, int sesongNummer) {
        super(tittel, spilletid, beskrivelse, utgivelsesdato);
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
    }

    //Settere
    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    //Gettere

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }



    @Override
    public String toString() {
        return super.getTittel() + " - S" + sesongNummer + "E" + episodeNummer;
    }
}

