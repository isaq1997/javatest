package com.company;

public class Person {
    private int id;
    private String fullname;
    private String passno;
    private String phone;
    private String email;

    public Person(int id, String fullname, String passno, String phone, String email) {
        this.id = id;
        this.fullname = fullname;
        this.passno = passno;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }



    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassno() {
        return passno;
    }

    public void setPassno(String passno) {
        this.passno = passno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}