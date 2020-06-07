package geng.handle;
import geng.model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleLogin {
    Connection 电子商务系统2;
    PreparedStatement preSql;
    ResultSet rs;



    public Login queryVerify(Login loginModel) {
        String id = loginModel.getUId();
        String pw = loginModel.getPassword();
        String sqlStr = "select id,password from register where" +
                "id = ? and password = ?";
        try {
            preSql = 电子商务系统2.prepareStatement(sqlStr);
            preSql.setString(1, id);
            preSql.setString(2, pw);
            rs = preSql.executeQuery();
            if (rs.next()) {//检查是否是注册用户
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null, "登陆成功",
                        "恭喜", JOptionPane.WARNING_MESSAGE);
            } else {
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "登陆失败",
                        "登陆失败，重新登录", JOptionPane.WARNING_MESSAGE);
            }
            电子商务系统2.close();

        } catch (SQLException ignored) {
        }
        return loginModel;
    }
}