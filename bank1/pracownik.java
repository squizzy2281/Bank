package bank1;

public class pracownik {
    private String imie;
    private String nazwisko;
    private adres_pracownika adres_pracownika; // Używamy klasy Adres

    // Konstruktor, gettery, settery, metody

    public pracownik(String imie, String nazwisko, adres_pracownika adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres_pracownika = adres;
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

    public adres_pracownika getAdres() {
        return adres_pracownika;
    }

    public void setAdres(adres_pracownika adres) {
        this.adres_pracownika = adres;
    }
}
