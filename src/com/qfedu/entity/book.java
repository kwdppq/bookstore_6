package com.qfedu.entity;

public class book {
    private String bid;
    private String bname;
    private Double price;
    private String author;
    private String did;

    public book() {
    }

    public book(String bid, String bname, Double price, String author, String did) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.author = author;
        this.did = did;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "book{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", did='" + did + '\'' +
                '}';
    }
}
