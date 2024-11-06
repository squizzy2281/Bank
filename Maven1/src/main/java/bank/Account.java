package bank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private AccountType accountType;
    private Client owner;
    private Employee createdBy;
}


