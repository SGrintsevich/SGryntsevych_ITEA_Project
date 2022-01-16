package com.itea.sgrintsevich.lesson7;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class BooksInfo {

    private static String bookName;
    private static String bookAuthor;
    private String bookPublisher;
    private Double bookPrice;

    BooksInfo(String bookName, String bookAuthor, String bookPublisher,Double bookPrice) {
        setBookName(bookName);
        setBookAuthor(bookAuthor);
        setBookPublisher(bookPublisher);
        setBookPrice(bookPrice);
    }

    public String getBookName() {
        return bookName;
    }

    private void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    private void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        if (bookPrice < 10.0) {
            System.out.println("Price can't be lower than 10");
            this.bookPrice = 10.0;
        } else {
            this.bookPrice = bookPrice;
        }
    }

    @Override
    public String toString() {
        return "BooksInfo{\n" +
                "   bookName='" +getBookName() + "',\n" +
                "   bookAuthor='" +getBookAuthor() + "',\n" +
                "   bookPublisher='" + bookPublisher + "',\n" +
                "   bookPrice=" + bookPrice + "',\n" +
                "}\n";
    }
}
