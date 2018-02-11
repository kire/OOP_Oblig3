package no.hiof.erikob.oblig3;

public class Episode extends Produksjon{
    private int episodeNummer;
    private int sesongNummer;




    public Episode(int episodeNummer, int sesongNummer, String tittel, int spilletid) {
        this.episodeNummer = episodeNummer;
        this.sesongNummer = sesongNummer;
        super.tittel = tittel;
        super.spilletid = spilletid;

    }

    public int getEpisodeNummer() {
        return episodeNummer;
    }

    public int getSesongNummer() {
        return sesongNummer;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setEpisodeNummer(int episodeNummer) {
        this.episodeNummer = episodeNummer;
    }

    public void setSesongNummer(int sesongNummer) {
        this.sesongNummer = sesongNummer;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    @Override
    public String toString() {
        return tittel + " - S" + sesongNummer + "E" + episodeNummer;
    }
}

