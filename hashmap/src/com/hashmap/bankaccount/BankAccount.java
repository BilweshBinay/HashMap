package com.hashmap.bankaccount;

import com.hashmap.bankaccount.bankdto.BankAccountDto;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    public static void main(String[] args) {
        Map<String, BankAccountDto > accounts = new HashMap<>();
        accounts.put("AC001", new BankAccountDto("Ravi Kumar", 25000.0));
        accounts.put("AC002", new BankAccountDto("Anaya", 8000.0));
        accounts.put("AC003", new BankAccountDto("Rishi", 50000.0));

        System.out.println("All Bank Accounts ");

        for (Map.Entry<String, BankAccountDto> entry : accounts.entrySet()) {
            String accNo = entry.getKey();
            BankAccountDto details = entry.getValue();

            System.out.print("Account: " + accNo + " → " + details);
            if (details.getBalance() < 10000) {
                System.out.println("  Low Balance Warning");
            } else {
                System.out.println();
            }
        }
    }
}
