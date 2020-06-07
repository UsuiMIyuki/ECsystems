package geng.model;

public class Register {
    private static String uid;
    private static String password;
    private static String Address;
    public void setUid(String Uid){
        uid = uid;
    }
    public void setPassword(String password){
        Register.password = password;
    }
    public void setAddress(String Address){
        Register.Address = Address;
    }

    public static String getUID() {

        return uid;
    }

    public static String getPassword(){

        return password;
    }

    public static String getAddress(){

        return Address;
    }
}

