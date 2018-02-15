package no.hiof.erikob.oblig3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produksjon {
    private String tittel;
    private int spilletid;
    private String beskrivelse;
    private LocalDate utgivelsesdato;
    private Person regissor;
    private ArrayList<Rolle> roller = new ArrayList<>();


    public Produksjon(String tittel, int spilletid, String besrkivelse, LocalDate utgivelsesDato) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.beskrivelse = besrkivelse;
        this.utgivelsesdato = utgivelsesDato;
    }

    public Produksjon(String tittel, int spilletid) {
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    //Settere
    public void setTittel(String tittel) {

    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    //Gettere


    public String getTittel() {
        return tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public Person getRegissor() {
        return regissor;
    }

    public ArrayList<Rolle> getRoller() {
        return roller;
    }

    public void leggTilEnRolle (Rolle rolle) {
        roller.add(rolle);
    }

    public void leggTilMangeRoller(ArrayList<Rolle> rolle) {
        roller.addAll(rolle);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
