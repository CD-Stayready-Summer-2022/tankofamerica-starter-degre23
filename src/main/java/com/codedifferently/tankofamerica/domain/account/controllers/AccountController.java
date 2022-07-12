package com.codedifferently.tankofamerica.domain.user.account.controllers;

import com.codedifferently.tankofamerica.domain.user.account.services.AccountService;
import com.codedifferently.tankofamerica.domain.user.account.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @ShellMethod("Create a new Account")
    public Account createNewAccount(@ShellOption({"-F", "--firstname"}) String firstName,
                                    @ShellOption({"-L", "--lastname"}) String lastName){
        Account account = new Account(firstName, lastName);
        account = accountService.create(account);
        return account;
    }

    @ShellMethod("Get All Accounts")
    public String getAllAccounts(){
        return accountService.getAllAccounts();
    }
}
