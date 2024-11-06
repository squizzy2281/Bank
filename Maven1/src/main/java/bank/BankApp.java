package bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Imię Klienta: ");
        String clientFirstName = scanner.nextLine();
        System.out.print("Nazwisko Klienta: ");
        String clientLastName = scanner.nextLine();

        Client client = new Client(clientFirstName, clientLastName);
        Employee employee = Employee.getInstance(); // Użycie Singletona

        System.out.println("Wybierz typ konta:");
        System.out.println("1 - Osobiste");
        System.out.println("2 - Oszczędnościowe");
        int choice = scanner.nextInt();
        AccountType accountType;

        switch (choice) {
            case 1:
                accountType = AccountType.OSOBISTE;
                break;
            case 2:
                accountType = AccountType.OSZCZEDNOSCIOWE;
                break;
            default:
                System.out.println("Niepoprawny wybór, konto zostanie ustawione na 'Osobiste'.");
                accountType = AccountType.OSOBISTE;
        }

        Account account = new Account(accountType, client, employee);

        System.out.println(client + " założył konto. " + account);

        scanner.close();
    }
}
