package com.cit.designpatterns.bridge;

public class ICBCBank extends Bank
{
    public ICBCBank(Account account)
    {
        super(account);
    }

    @Override
    public Account openAccount()
    {
        return account.openAccount();
    }
}
