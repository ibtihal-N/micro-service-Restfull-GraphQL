package org.sid.bank_account_service.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank_account_service.enums.AccountType;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccountRequestDto {

    private Double balance;
    private String currency;
    private AccountType type;
}
