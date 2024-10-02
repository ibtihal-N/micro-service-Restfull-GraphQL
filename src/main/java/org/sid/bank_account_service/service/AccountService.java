package org.sid.bank_account_service.service;

import org.sid.bank_account_service.dto.BankAccountRequestDto;
import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.entities.BankAccount;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDto bankAccountDto);

     BankAccountResponseDTO updateAccount(String id, BankAccountRequestDto bankAccountDto);
}
