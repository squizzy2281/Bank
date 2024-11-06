package bank;

import lombok.Getter;

@Getter
public enum AccountType {
    OSOBISTE("Osobiste"),
    OSZCZEDNOSCIOWE("Oszczędnościowe");

    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }
}
