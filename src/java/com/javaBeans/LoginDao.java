
package com.javaBeans;

import static java.lang.System.console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kagas
 */
public class LoginDao {
        
    public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
        boolean status = false;
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        try (Connection connection = DriverManager.getConnection(
                "jdbc:ucanaccess://C:\\Users\\kagas\\Desktop\\IST412\\UserData.accdb", "root", "root");

            PreparedStatement ps = connection
            .prepareStatement("select * from UserData where Username = ? and Password = ? ")) {
            ps.setString(1, loginBean.getUsername());
            ps.setString(2, loginBean.getPassword());

            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (SQLException e) {            
        }
        return status;
    }
}
