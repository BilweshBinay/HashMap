package com.hashmap.bankaccount.bankdto;

public class BankAccountDto {
    private String name;
    private Double balance;

    public BankAccountDto(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Name : "+name+", Balance : ₹" +balance;
    }
}
