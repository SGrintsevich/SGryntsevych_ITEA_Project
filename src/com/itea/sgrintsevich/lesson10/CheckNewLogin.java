package com.itea.sgrintsevich.lesson10;

public class CheckNewLogin {
    private String login;
    private String password;
    private String confirmPassword;

    public CheckNewLogin() {
    }

    public CheckNewLogin(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.LoginCheck();
        this.PasswordCheck();

    }

    private boolean LoginCheck() throws WrongLoginException {
        for (int j = 0; j <= this.login.length() - 1; j++) {
            //Привожу символ к int
            int intStr = (int) this.login.charAt(j);
            //Проверяю корректность каждого символа
            if ((intStr >= 48 && intStr <= 57) || (intStr >= 65 && intStr <= 90) || (intStr >= 97 && intStr <= 122) || intStr == 95) {
                continue;
            } else {
                throw new WrongLoginException("Symbol \"" + this.login.charAt(j) + "\" in login \"" + this.login + "\" incorrect");
            }
        }
        //проверяю на максимальную длину
        if (this.login.length() >= 20) {
            throw new WrongLoginException("login \"" + this.login + "\" must be less than 20 characters");
        }
        return true;
    }

    private boolean PasswordCheck() throws WrongPasswordException {
        for (int j = 0; j <= this.password.length() - 1; j++) {
            //Привожу символ к int
            int intStr = (int) this.password.charAt(j);
            //Проверяю корректность каждого символа
            if ((intStr >= 48 && intStr <= 57) || (intStr >= 65 && intStr <= 90) || (intStr >= 97 && intStr <= 122) || intStr == 95) {
                continue;
            } else {
                throw new WrongPasswordException("Symbol \"" + this.password.charAt(j) + "\" in password \"" + this.password + "\" incorrect");
            }
        }
        //проверяю на максимальную длину
        if (this.password.length() >= 20) {
            throw new WrongPasswordException("password \"" + this.password + "\" must be less than 20 characters");
        }
        //проверяю на совпадение
        if (this.password != this.confirmPassword) {
            throw new WrongPasswordException("password \"" + this.password + "\" is not equal to \"" + this.confirmPassword + "\"");
        }

        return true;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
