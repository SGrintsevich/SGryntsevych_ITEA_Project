package com.itea.sgrintsevich.lesson7;

public class Main {
    public static void main(String[] args) {
        BooksInfo book1=new BooksInfo("Гамлет", "В. Шекспир", "Рога и копыта", 9.0);
        System.out.println("Current book price = "+book1.getBookPrice());
        book1.setBookPrice(21.0);
        System.out.println("Current book price = "+book1.getBookPrice());

        System.out.println(book1);

        UserInfo user1=new UserInfo("Ivanov","123456");

        System.out.println(user1.Login("Ivanov","654321"));
        System.out.println(user1.Login("Ivanov","123456"));

    }
}
