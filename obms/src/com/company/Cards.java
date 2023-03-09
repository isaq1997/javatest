package com.company;

import java.math.BigInteger;

public class Cards {
    private Account account;
    private String pan;
    private String nameOnCard;
    private BigInteger objectuid;
    private static  int getAcc;

    public Cards(Account account, String pan, String nameOnCard, BigInteger objectuid) {
        this.account = account;
        this.pan = pan;
        this.nameOnCard = nameOnCard;
        this.objectuid = objectuid;
    }

    public Account getAccount() {
        getAcc=getAcc+1;
        return account;

    }
    public static int getGetAcc(){
        return getAcc;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public BigInteger getObjectuid() {
        return objectuid;
    }

    public void setObjectuid(BigInteger objectuid) {
        this.objectuid = objectuid;
    }
}
