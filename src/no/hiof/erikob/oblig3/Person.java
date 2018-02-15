package no.hiof.erikob.oblig3;

import java.util.ArrayList;

public class Person {
    private int alder;
    private String fornavn;
    private String etternavn;
    private String kjonn;

    public Person(int alder, String fornavn, String etternavn, String kjonn) {
        this.alder = alder;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
    }

    //Settere
    public void setAlder(int alder) {
        this.alder = alder;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    // Gettere


    public int getAlder() {
        return alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getKjonn() {
        return kjonn;
    }

    public String getInfo () {
        return getFornavn() + " " + getEtternavn();
    }


    @Override
    public String toString() {
        return getInfo();
    }
}
