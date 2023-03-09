package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	//Person p=new Person(1,"John Beck","12wsde&&","1234","ii@mail.ru");
    Person [] pp=new Person[3];
    pp[0]=new Person(1,"John Beck","12wsde&&","1234","ii@mail.ru");
    pp[1]=new Person(2,"Smith Yourke","wed123dc","1456","sy@gmail.com");
    Account ac=new Account(pp[0],"288890",1);
    Cards c=new Cards(ac,"4169111123456712","Becky", BigInteger.valueOf(1123));

    System.out.println(ac.getP().getFullname());
    System.out.println(c.getAccount().getP().getPhone());
    System.out.println(Cards.getGetAcc());

    }
}
