package com.itea.sgrintsevich.lesson7;

public class UserInfo {
    private String userName;
    private String userPassword;

    UserInfo(String userName, String userPassword) {
        setUserName(userName);
        setUserPassword(userPassword);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String Login(String userName, String userPassword) {
        if (userName.equals(this.userName) && userPassword.equals(this.userPassword)) {
            return "Login for '"+userName+"' confirmed!" ;
        } else {
            return "Incorrect user name or password!";
        }
    }
}
