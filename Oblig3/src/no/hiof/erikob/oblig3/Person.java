package no.hiof.erikob.oblig3;

import java.util.ArrayList;

public class Person {
    private int alder;
    private String fornavn;
    private String etternavn;
    private ArrayList <Person> personList = new ArrayList<>();


    public Person(int alder, String fornavn, String etternavn) {
        this.alder = alder;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }


    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void leggTilPerson(Person person){
        personList.add(person);
    }

}
