package no.hiof.erikob.oblig3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main{


    public static void main(String[] args) {



        TvSerie strangerThings = new TvSerie("Stranger Things", "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.", LocalDate.of(2016, 7,15));

        Episode episode1 = new Episode(1, 1, "Chapter One: DAYMAN ", 25);
        Episode episode2 = new Episode(2, 1, "Chapter Two: Fighter of the NIGHTMAN", 25);
        Episode episode3 = new Episode(3, 1, "Chapter Three: Champion of the Sun ", 25);
        Episode episode4 = new Episode(4, 1, "Chapter Four: You're a Master of Karate", 25);


        strangerThings.leggTilEpisode(episode1);
        strangerThings.leggTilEpisode(episode2);
        strangerThings.leggTilEpisode(episode3);
        strangerThings.leggTilEpisode(episode4);

        strangerThings.leggTilEpisode(new Episode(1, 2, "Chapter One: MADMAX", 25));
        strangerThings.leggTilEpisode(new Episode(2, 2, "Chapter Two: HAPPYMAX", 25));
        strangerThings.leggTilEpisode(new Episode(3, 2, "Chapter Three: DEPRESSEDMAX", 25));


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
            for (int episodeNr = 1; episodeNr <= 5; episodeNr++) {

                gameOfThrones.leggTilEpisode(new Episode(episodeNr, sesongNr, "Generic title", randomTallGenerator.nextInt(11) + 20));
            }
        }

        ArrayList<Episode> gameOfThronesSesong4Episoder = gameOfThrones.hentEpisoderISesong(4);

        System.out.println("******************************");

        System.out.println(gameOfThrones);

        System.out.println("------------------------------");

        for (Episode episode : gameOfThronesSesong4Episoder) {
            System.out.println(episode);
        }

        System.out.println("\n" + "******************************");
        System.out.println("******************************");

        gameOfThrones.leggTilEpisode(new Episode(1, 7, "People die", 120));

        // Oppgave 4 og 6



        Film film1 = new Film("Fight club", "Fighting and stuff", LocalDate.of(1996, 6, 6), 160);
        Film film2 = new Film("Emoji Movie", "Emoji's and stuff", LocalDate.of(2002, 6, 6), 160);


        film1.setRegissor(new Person(32,"John", "Doe", "Mann"));
        film2.setRegissor(new Person(69, "Susan", "Emoji", "Kvinne"));

        Person randomguy = new Person(45, "Dolph", "Lundgren", "Mann");
        Person cgi = new Person(0, "Susan", "Boyle", "CGI");
        Person p2 = new Person(14, "Lars", "Emil", "unknown");

        Rolle tylerD = new Rolle("Tyler", "Durden", randomguy);
        Rolle poopemoji = new Rolle("Poop", "Emoji", cgi);
        Rolle genereicBadguy = new Rolle("Mister", "Evilhead", p2);

        film1.leggTilEnRolle(tylerD);
        film2.leggTilEnRolle(poopemoji);
        film1.leggTilEnRolle(genereicBadguy);


        System.out.println("\n" + "******************************");
        System.out.println("******************************");

        System.out.println("\n" + "Første film: " + film1.getTittel() + " | " + film1.getBeskrivelse() + " | " + film1.getUtgivelsesdato() + " | " + "Regissør: "  + film1.getRegissor() + " | " + "Roller: " + film1.getRoller());
        System.out.println("\n" + "Andre film: " + film2.getTittel() + " | " + film2.getBeskrivelse() + " | " + film2.getUtgivelsesdato() + " | " + "Regissør: "  + film2.getRegissor() + " | " + "Roller: " + film2.getRoller());




        //Oppgave 9

        ArrayList<Rolle> strangerThingscast = new ArrayList<>();

        Person person1 = new Person(10,"Millie bobby", "Brown", "Jente");
        Person person2 = new Person(10,"Finn", "Wolfhard", "Gutt");
        Person person3 = new Person(10,"Gaten", "Matarazzo", "Gutt");
        Person person4 = new Person(10,"CGI", "Animations", "Ukjent");

        Rolle eleven = new Rolle("Eleven", "", person1);
        Rolle mike = new Rolle("Mike", "Wheeler", person2);
        Rolle dustin = new Rolle("Dustin", "Henderson", person3);
        Rolle monster = new Rolle("Demigorgen", "Monster", person4);


        strangerThingscast.add(eleven);
        strangerThingscast.add(mike);
        strangerThingscast.add(dustin);
        strangerThingscast.add(monster);

        episode1.leggTilMangeRoller(strangerThingscast);
        episode2.leggTilMangeRoller(strangerThingscast);
        episode1.setRegissor(new Person(65,"Lars Emil", "Knudsen", "Mann"));

        System.out.println("\n" + "******************************");
        System.out.println("******************************");

        System.out.println("\n" + "Stranger things is Directed by " + episode1.getRegissor() + " and stars: " + strangerThings.hentCast());







    }


}

 /*
        Noen av episode i tv serie funker ikke, siden jeg brukte lars emil sin oblig 2 og jeg fucket opp litt, men oblig 3 funker :)


        Oppgave 1 og 2 oblig 3

        Oppgave 1:

        Refaktorere: Det er simpelt å restrukturere eksisterende kode uten å endre hvordan koden fungerer. Selve koden kan bli mer effektiv og eventuelle fremtidige problemer kan forsvinne med dette
        Den simpleste formen er endring av object og metode navn.

        Static(variabel, metode): Static variabel er em felles variabel for alle objektene i klassen og denne vil deles med objektene. Dette sparer minne ved bruk av java og alle objektene har tilgang til den uten å måtte komme i kontakt

        Static metode henger sammen med selve klassen og ikke objektene i klassen. Du kan ikke normalt kalle en metode i en klasse uten å lage en instans av klassen, men ved bruk av static method kan vi gjøre akkuray dette

        Abstract(klasse, metode): Abstract er en annen versjon av static. Som nevnt over kan static kalles uten en instans, men abstract klasse kan ikke instantieres. Abstrakte klasser kan inneholde metober og objekter
        men en abstrakt metode kan bare lages i en abstrakt klasse. Vi kan bruke abstract til for å lage superklasser som produksjon hvor det bare skal arves fra

        Interface: I interface kan det bare være abstrakte metoder, interface gjør at vi kan arve fra flere klasser


        Oppgave 2:

        Jeg sammenlignet med Edgaras Slezas sin oppgave:
        Vi er begge sirka på samme nivå innenfor OOP. Vi har gjort mye likt og gjort det simpelt.
        Vi valgte forskjellige datatyper på utgivelsesdato og Edgaras har objekt navnene på Engelsk. Bortsett fra dette, så er det ikke så mye forskjell.
        Oblig 2 var ikke så veldig stor, så finner ikke mye å skrive bortsett fra at vi hadde små forskjeller. Han har kanskje litt finere kode struktur enn det jeg har og det er noe jeg kan ta fra dette.



         */