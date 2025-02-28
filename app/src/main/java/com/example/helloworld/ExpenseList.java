package com.example.helloworld;

public class ExpenseList {
    private String category; // the category of expense
    private double amount; // the amount of expense
    private String date; // the amount of expense
    private String note; // the note of expense

    public ExpenseList(){}
    public ExpenseList(String category, double amount, String date, String note){
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
