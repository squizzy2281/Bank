package bank1;

public class pracownik {
    private String imie;
    private String nazwisko;
    private String stanowisko; // Stanowisko pracownika
    private adres_pracownika adres; // Adres pracownika (może być powiązany z klasą Adres)


    public pracownik(String imie, String nazwisko, String stanowisko, adres_pracownika adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.adres = adres;
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

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public adres_pracownika getAdres() {
        return adres;
    }

    public void setAdres(adres_pracownika adres) {
        this.adres = adres;
    }
}
