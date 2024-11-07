package bank1;

public class rata {
    private double kwota;
    private kredyt kredyt; // Używamy klasy Kredyt



    public rata(double kwota, kredyt kredyt) {
        this.kwota = kwota;
        this.kredyt = kredyt;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public kredyt getKredyt() {
        return kredyt;
    }

    public void setKredyt(kredyt kredyt) {
        this.kredyt = kredyt;
    }
}
