package com.ataghav.advancejava.ledger.services;

public interface IAccountManager {
    void create(String number, String owner, double balance);
    void read(String number);
    void update(String number, String owner, double balance);
    void delete(String number);
}
