package bank1;

public class kredyt {
    private double kwota;
    private rata rata; // Używamy klasy Rata

    // Konstruktor, gettery, settery, metody

    public kredyt(double kwota, rata rata) {
        this.kwota = kwota;
        this.rata = rata;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public rata getRata() {
        return rata;
    }

    public void setRata(rata rata) {
        this.rata = rata;
    }
}
