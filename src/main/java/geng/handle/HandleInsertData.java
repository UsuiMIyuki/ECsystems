package geng.handle;
import geng.model.Register;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleInsertData {
    Connection  电子商务系统2;
    PreparedStatement preSql;

public void writeRegisterModel(Register register){
        String sqlStr ="insert into users values(?,?,?)";
        int ok = 0;
        try {
            preSql = 电子商务系统2.prepareStatement(sqlStr);
            preSql.setString(1, Register.getUID());
            preSql.setString(2, Register.getPassword());
            preSql.setString(3, Register.getAddress());
            ok = preSql.executeUpdate();
            电子商务系统2.close();

        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"id不能重复","警告",
            JOptionPane.WARNING_MESSAGE);
        }
        if (ok!=0){
            JOptionPane.showMessageDialog(null,"注册成功",
                    "恭喜",JOptionPane.WARNING_MESSAGE);
        }
    }
}