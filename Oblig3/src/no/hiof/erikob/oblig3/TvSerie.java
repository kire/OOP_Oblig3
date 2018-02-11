package no.hiof.erikob.oblig3;


import java.time.LocalDate;
import java.util.ArrayList;

public class TvSerie extends Produksjon {
    private ArrayList<Episode> episodeListe = new ArrayList<>();
    private int gjennomSnittligSpilletid;
    private int antallSesonger;

    public TvSerie(String tittel, String beskrivelse, LocalDate utgivelsesdato) {
        super.tittel = tittel;
        super.beskrivelse = beskrivelse;
        super.utgivelsesdato = utgivelsesdato;

    }

    public void leggTilEpisode(Episode episode) {
        if (antallSesonger + 1 < episode.getSesongNummer()) {
            System.out.println("FEIL: Det er ikke mulig å legge til episoder for sesong " + episode.getSesongNummer() + ", den er " + (episode.getSesongNummer() - antallSesonger) + " høyere enn antallet sesonger");
        } else {
            episodeListe.add(episode);
            oppdaterGjennomsnittligSpilletid();

            if (antallSesonger + 1 == episode.getSesongNummer())
                antallSesonger++;
        }

    }




    public ArrayList<Episode> hentEpisoderISesong(int sesongNummer) {

        ArrayList<Episode> episoderISesong = new ArrayList<>();


        for (Episode episode : episodeListe) {

            if (episode.getSesongNummer() == sesongNummer) {

                episoderISesong.add(episode);
            }
        }


        return episoderISesong;
    }

    private void oppdaterGjennomsnittligSpilletid() {

        int totalSpilletid = 0;


        for (Episode episode : episodeListe) {
            totalSpilletid += episode.getSpilletid();
        }


        gjennomSnittligSpilletid = totalSpilletid / episodeListe.size();
    }


    @Override
    public String toString() {
        return tittel + " - " + utgivelsesdato.getYear();
    }

    public void setEpisodeListe(ArrayList<Episode> episodeListe) {
        this.episodeListe = episodeListe;
    }

    public ArrayList<Episode> getEpisodeListe() {
        return episodeListe;
    }

    public int getGjennomSnittligSpilletid() {
        return gjennomSnittligSpilletid;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }
}

