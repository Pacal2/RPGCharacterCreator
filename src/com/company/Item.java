package com.company;


import java.io.Serializable;

public class Item implements Serializable{
    private String name;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void addAmount(int add) {
        this.amount += add;
    }


}
