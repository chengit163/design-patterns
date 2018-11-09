package com.cit.designpatterns.bridge;

public class ABCBank extends Bank
{
    public ABCBank(Account account)
    {
        super(account);
    }

    @Override
    public Account openAccount()
    {
        return account.openAccount();
    }
}
