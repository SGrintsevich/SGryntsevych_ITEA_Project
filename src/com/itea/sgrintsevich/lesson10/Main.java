package com.itea.sgrintsevich.lesson10;

public class Main {
    public static void main(String[] args) {

        try {
            CheckNewLogin checkNewLogin = new CheckNewLogin("LoginД1", "Pass22", "Pass2");
            System.out.println("Login \"" + checkNewLogin.getLogin() + "\" with password \"" + checkNewLogin.getPassword() + "\" successfully pass all checks");
        } catch (WrongLoginException e1) {
            System.out.println("Error " + e1.getMessage());
        } catch (WrongPasswordException e2) {
            System.out.println("Error " + e2.getMessage());
        }
    }
}
