package no.hiof.erikob.oblig3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main{


    public static void main(String[] args) {
        TvSerie strangerThings = new TvSerie("Stranger things", "tttttt", LocalDate.of(2016, 4, 4));


        Episode episode1 = new Episode("TEST2", 50, "dsdsd", 1, 1);


        strangerThings.leggTilEpisode(episode1);


        strangerThings.leggTilEpisode(new Episode("TEST1", 60, "d", 1, 2));


        ArrayList<Episode> episodeListe = strangerThings.getEpisodeListe();

        System.out.println("******************************");

        System.out.println(strangerThings);
        System.out.println("------------------------------");

        for (Episode episode : episodeListe) {
            System.out.println(episode);
        }

        System.out.println("******************************");

        TvSerie gameOfThrones = new TvSerie("Game of Thrones", "They are in a game for the throne.", LocalDate.of(2011, 4, 11));

        Random randomTallGenerator = new Random();

        for (int sesongNr = 1; sesongNr <= 5; sesongNr++) {
            for (int episodeNr = 1; episodeNr <= 20; episodeNr++) {


            }
        }

        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        System.out.println("******************************");

        System.out.println(gameOfThrones);
        System.out.println("Gjennomsnittligspilletid ");
        System.out.println("------------------------------");

        for (Episode episode : gameOfThronesSesong4Episoder) {
            System.out.println(episode);
        }

        System.out.println("******************************");

        gameOfThrones.leggTilEpisode(new Episode("dddd", 30, "ddfdf", 3, 5));

        // Oppgave 4 og 6

        Film film1 = new Film("Fight club", "Fighting and stuff", LocalDate.of(1996, 6, 6), 160);
        Film film2 = new Film("Emoji Movie", "Emoji's and stuff", LocalDate.of(2002, 6, 6), 160);

        film1.setRegissor(new Person(32,"John", "Doe", "Mann"));
        film2.setRegissor(new Person(69, "Susan", "Emoji", "Kvinne"));

        Person randomguy = new Person(45, "Idont", "Know", "Mann");
        Person cgi = new Person(0, "Fake", "Emoji", "CGI");
        Person p2 = new Person(14, "Real", "Actor", "unknown");

        Rolle tylerD = new Rolle("Tyler", "Durden", randomguy);
        Rolle poopemoji = new Rolle("Poop", "Emoji", cgi);
        Rolle genereicBadguy = new Rolle("Mister", "Evilhead", p2);

        film1.leggTilEnRolle(tylerD);
        film2.leggTilEnRolle(poopemoji);
        film1.leggTilEnRolle(genereicBadguy);


        System.out.println("\n" + "Første film: " + film1.getTittel() + " | " + film1.getBeskrivelse() + " | " + film1.getUtgivelsesdato() + " | " + "Regissør: "  + film1.getRegissor() + " | " + "Roller: " + film1.getRoller());
        System.out.println("\n" + "Andre film: " + film2.getTittel() + " | " + film2.getBeskrivelse() + " | " + film2.getUtgivelsesdato() + " | " + "Regissør: "  + film2.getRegissor() + " | " + "Roller: " + film2.getRoller());

        // Oppgave 9






    }


}

