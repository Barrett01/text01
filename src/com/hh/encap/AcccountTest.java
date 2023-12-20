package com.hh.encap;

public class AcccountTest {


    public static void main(String[] args) {
        Account account =  new Account();
        account.setName("張三");
        account.setPassword("hidbs6");
        account.setMoney(50);

        account.showInfo();
    }
}


