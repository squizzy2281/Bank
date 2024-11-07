package bank1;

import java.util.Set;

public class klient {
    private String imie;
    private String nazwisko;
    private Set<konto> konta; // Używamy klasy Konto

    // Konstruktor, gettery, settery, metody

    public klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
