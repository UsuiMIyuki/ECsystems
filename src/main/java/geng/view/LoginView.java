package geng.view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import geng.model.*;
import geng.handle.*;
public class LoginView extends JPanel implements  ActionListener{
    Login login;
    JTextField inputUID;
    JPasswordField inputPassword;
    JButton buttonLogin;
    boolean loginSuccess;
    LoginView(){
        login = new Login();
        inputUID = new JTextField(12);
        inputPassword = new JPasswordField(12);
        buttonLogin = new JButton("登录");
        add(new JLabel("ID:"));
        add(inputUID);
        add(new JLabel("密码:"));
        add(inputPassword);
        add(buttonLogin);
        buttonLogin.addActionListener(this);
    }
    public boolean isLoginSuccess(){
        return loginSuccess;
    }

    public void actionPerfromed(ActionEvent e) {
        login.setUId(inputUID.getText());
        char [] pw =inputPassword.getPassword();
        login.setPassword(new String(pw));
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        loginSuccess = login.getLoginSuccess();
    }


}
