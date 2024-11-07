package bank1;

public class konto {
    private double saldo;
    private klient klient;


    public konto(double saldo, klient klient) {
        this.saldo = saldo;
        this.klient = klient;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public klient getKlient() {
        return klient;
    }

    public void setKlient(klient klient) {
        this.klient = klient;
    }
}
