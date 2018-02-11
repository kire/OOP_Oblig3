package no.hiof.erikob.oblig3;

import java.time.LocalDate;

public class Produksjon {
    public String tittel;
    public String beskrivelse;
    public LocalDate utgivelsesdato;
    public int spilletid;
    Person regissor;



    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setUtgivelsesdato(LocalDate utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public String getTittel() {
        return tittel;
    }

    public Person getRegissor() {
        return regissor;
    }

    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    public LocalDate getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }
}
