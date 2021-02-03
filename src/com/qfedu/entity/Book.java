package com.qfedu.entity;

public class Book {
    private String bid;
    private String bname;
    private Double price;
    private String author;
    private String cid;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Book(String bid, String bname, Double price, String author, String cid, String image) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.author = author;
        this.cid = cid;
        this.image = image;
    }

    public Book() {
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", cid='" + cid + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
