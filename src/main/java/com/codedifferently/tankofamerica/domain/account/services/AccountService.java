package com.codedifferently.tankofamerica.domain.user.account.services;

import com.codedifferently.tankofamerica.domain.user.account.models.Account;

public interface AccountService {
    Account create(Account account);
    String getAllAccounts();
}


