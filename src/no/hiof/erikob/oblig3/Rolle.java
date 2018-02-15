package no.hiof.erikob.oblig3;

public class Rolle {
    private String karFornavn;
    private String karEtternavn;
    private Person actor;


    public Rolle(String karFornavn, String karEtternavn, Person actor) {
        this.karFornavn = karFornavn;
        this.karEtternavn = karEtternavn;
        this.actor = actor;
    }

    //Gettere
    public String getKarFornavn() {
        return karFornavn;
    }

    public void setKarFornavn(String karFornavn) {
        this.karFornavn = karFornavn;
    }

    public String getKarEtternavn() {
        return karEtternavn;
    }

    //Settere
    public void setKarEtternavn(String karEtternavn) {
        this.karEtternavn = karEtternavn;
    }

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }

    @Override
    public String toString(){
        return actor.getInfo() + " as " + getKarFornavn() + " " + getKarEtternavn();
    }


}
