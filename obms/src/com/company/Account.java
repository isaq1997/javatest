package com.company;

public class Account {
    private  Person p;
    private String accountno;
    private int accType;

    public Account(Person p, String accountno, int accType) {
        this.p = p;
        this.accountno = accountno;
        this.accType = accType;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public int getAccType() {
        return accType;
    }

    public void setAccType(int accType) {
        this.accType = accType;
    }
}
