package com.webster.entity;

public class Company {

    private int id;
    private String name;
    private int balance;

    public Company() {
    }

    public Company(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
