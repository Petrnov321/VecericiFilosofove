package com.engeto.lekce08_domaciUkol;

public class Osoba {

    private String jmeno;
    private String prijmeni;

    public Osoba(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return  jmeno  +  " " +  prijmeni;
    }
}
