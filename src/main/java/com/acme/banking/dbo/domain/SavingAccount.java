package com.acme.banking.dbo.domain;

import java.util.UUID;

public class SavingAccount implements Account {
    private final UUID id;
    private final Client client;
    private final double amount;

    public SavingAccount(UUID id, Client client, double amount) {
        if (id == null) throw new IllegalArgumentException("Id is null");
        if (client == null) throw new IllegalArgumentException("Client is null");
        if (amount < 0) throw new IllegalArgumentException("Amount is negative");

        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public Client getClient() {
        return client;
    }
}
