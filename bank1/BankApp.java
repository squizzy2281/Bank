package bank1;

public class BankApp {
    public static void main(String[] args) {

        adres_pracownika adresPracownika = new adres_pracownika("Ul. Pięciomorgowa", "Warszawa", "00-123");


        pracownik pracownik = new pracownik("Marek", "Nowak", "Konsultant", adresPracownika);


        klient klient = new klient("Jan", "Kowalski");


        konto konto = new konto(1000.0, klient);


        System.out.println("Pracownik: " + pracownik.getImie() + " " + pracownik.getNazwisko() + ", Stanowisko: " + pracownik.getStanowisko());
        System.out.println("Adres pracownika: " + pracownik.getAdres().getUlica() + ", " + pracownik.getAdres().getMiasto() + ", " + pracownik.getAdres().getKodPocztowy());
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Saldo konta klienta: " + konto.getSaldo());
    }
}
