<<<<<<< HEAD
CREATE DATABASE BankDB;
USE BankDB;


CREATE TABLE Klient (
    klient_id INT PRIMARY KEY AUTO_INCREMENT,
    imie VARCHAR(50) NOT NULL,
    nazwisko VARCHAR(50) NOT NULL,
    pesel VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL,
    telefon VARCHAR(15) NOT NULL,
    data_rejestracji DATE NOT NULL
);


CREATE TABLE Adres_Klienta (
    adres_id INT PRIMARY KEY AUTO_INCREMENT,
    klient_id INT NOT NULL,  -- Klient_id jako klucz obcy powinien być wymagany
    ulica VARCHAR(100) NOT NULL,
    numer_budynku VARCHAR(10) NOT NULL,
    numer_mieszkania VARCHAR(10),
    miasto VARCHAR(50) NOT NULL,
    kod_pocztowy VARCHAR(10) NOT NULL,
    kraj VARCHAR(50) NOT NULL,
    FOREIGN KEY (klient_id) REFERENCES Klient(klient_id) ON DELETE CASCADE
);


CREATE TABLE Konto (
    konto_id INT PRIMARY KEY AUTO_INCREMENT,
    klient_id INT NOT NULL,  -- Klient_id powinien być wymagany, aby konto miało właściciela
    numer_konta VARCHAR(26) NOT NULL UNIQUE,
    waluta ENUM('PLN', 'USD', 'EUR', 'GBP') NOT NULL,
    saldo DECIMAL(15, 2) DEFAULT 0.0 NOT NULL,
    typ_konta ENUM('osobiste', 'oszczędnościowe') NOT NULL,
    data_utworzenia DATE NOT NULL,
    FOREIGN KEY (klient_id) REFERENCES Klient(klient_id) ON DELETE CASCADE
);


CREATE TABLE Transakcja (
    transakcja_id INT PRIMARY KEY AUTO_INCREMENT,
    konto_id INT NOT NULL,  -- Konto_id powinno być wymagane, aby każda transakcja była przypisana do konta
    typ_transakcji ENUM('wpłata', 'wypłata', 'przelew') NOT NULL,
    kwota DECIMAL(15, 2) NOT NULL,
    waluta ENUM('PLN', 'USD', 'EUR', 'GBP') NOT NULL,
    data_transakcji TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    odbiorca_id INT,  -- Pozostaje NULLABLE dla przelewów zewnętrznych
    FOREIGN KEY (konto_id) REFERENCES Konto(konto_id) ON DELETE CASCADE
);


CREATE TABLE Pracownik (
    pracownik_id INT PRIMARY KEY AUTO_INCREMENT,
    imie VARCHAR(50) NOT NULL,
    nazwisko VARCHAR(50) NOT NULL,
    pesel VARCHAR(11) NOT NULL UNIQUE,
    stanowisko VARCHAR(50) NOT NULL,
    data_zatrudnienia DATE NOT NULL,
    pensja DECIMAL(10, 2) NOT NULL
);


CREATE TABLE Adres_Pracownika (
    adres_id INT PRIMARY KEY AUTO_INCREMENT,
    pracownik_id INT NOT NULL,  -- Pracownik_id powinien być wymagany
    ulica VARCHAR(100) NOT NULL,
    numer_budynku VARCHAR(10) NOT NULL,
    numer_mieszkania VARCHAR(10),
    miasto VARCHAR(50) NOT NULL,
    kod_pocztowy VARCHAR(10) NOT NULL,
    kraj VARCHAR(50) NOT NULL,
    FOREIGN KEY (pracownik_id) REFERENCES Pracownik(pracownik_id) ON DELETE CASCADE
);


CREATE TABLE Kredyt (
    kredyt_id INT PRIMARY KEY AUTO_INCREMENT,
    klient_id INT NULL,  -- Klient_id jako klucz obcy może być NULL
    pracownik_id INT NULL,  -- Pracownik_id może być NULL
    kwota_kredytu DECIMAL(15, 2) NOT NULL,
    oprocentowanie DECIMAL(5, 2) NOT NULL,
    data_udzielenia DATE NOT NULL,
    okres_kredytowania INT NOT NULL,
    termin_splaty DATE NOT NULL,
    status ENUM('aktywny', 'spłacony') NOT NULL,
    FOREIGN KEY (klient_id) REFERENCES Klient(klient_id) ON DELETE CASCADE,
    FOREIGN KEY (pracownik_id) REFERENCES Pracownik(pracownik_id) ON DELETE SET NULL
<<<<<<< HEAD


=======
);// Zmiany w branchA
// Inna zmiana w main
>>>>>>> 6621d209a72cf1a903e5ae2fba830a4f59845427
Zmiana w main
=======
Skrypt A
>>>>>>> branchA1
