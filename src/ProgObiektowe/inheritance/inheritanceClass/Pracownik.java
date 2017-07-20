package ProgObiektowe.inheritance.inheritanceClass;

/**
 * Created by RENT on 2017-07-20.
 */
public class Pracownik extends Osoba {
    private double pensja;
    private String stanowisko;

    public Pracownik(String imie, String nazwisko, int wiek){
        super(imie, nazwisko, wiek);
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}
