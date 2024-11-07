package bank1;

public class adres_klienta {
    private String ulica;
    private String miasto;

    // Konstruktor
    public adres_klienta(String ulica, String miasto) {
        this.ulica = ulica;
        this.miasto = miasto;
    }

    // Gettery i settery
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
