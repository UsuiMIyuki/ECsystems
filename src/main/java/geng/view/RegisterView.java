package geng.view;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import geng.model.*;
import geng.handle.*;
public class RegisterView extends JPanel implements ActionListener {
    Register register;
    JTextField inputUID,inputAddress;
    JPasswordField inputPassword;
    JButton buttonRegister;
    RegisterView(){
        register = new Register();
        inputUID = new JTextField(12);
        inputPassword = new JPasswordField(12);
        inputAddress = new JTextField(12);
        buttonRegister = new JButton("注册");
        add(new JLabel("UID:"));
        add(inputUID);
        add(new JLabel("密码:"));
        add(inputPassword);
        add(new JLabel("家庭地址:"));
        add(inputAddress);
        add(buttonRegister);
        buttonRegister.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        register.setUid(inputUID.getText());
        char [] pw = inputPassword.getPassword();
        register.setPassword(new String(pw));
        register.setAddress(inputAddress.getText());
        HandleInsertData handleRegister = new HandleInsertData();
        handleRegister.writeRegisterModel(register);

    }
}

