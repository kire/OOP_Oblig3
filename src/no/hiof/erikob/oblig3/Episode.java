package no.hiof.erikob.oblig3;

public class Episode extends Produksjon{
    private int episodeNummer;
    private int sesongNummer;




    public Episode(String tittel, int spilletid, String beskrivelse, int episodeNummer, int sesongNummer) {
        super(tittel, spilletid, beskrivelse);
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
        return getTittel() + " - S" + sesongNummer + "E" + episodeNummer;
    }
}

