package geng.model;

import java.rmi.server.UID;

public class Login {
    boolean loginSuccess = false;
    String uid;
    String password;

    public void setUId(String uid) {
        this.uid = uid;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getUId() {
        return uid;
    }
     public String getPassword(){
        return password;
     }

    public void setLoginSuccess(boolean bo) {
        loginSuccess = bo;
    }

    public boolean getLoginSuccess() {
        return loginSuccess;
    }
}




