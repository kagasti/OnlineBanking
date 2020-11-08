
package com.javaBeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kagas
 */
public class CreateAcc {

    private String fName = "Enter First Name";
    private String lName = "Enter Last Name";
    private String email = "Enter Email";
    private long pNum;
    private String uname = "Enter Username";
    private String pass = "Enter Password";

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getpNum() {
        return pNum;
    }

    public void setpNum(long pNum) {
        this.pNum = pNum;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void writeToDatabase() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException ex) {

        }
        System.out.println("...Driver loaded2");
        System.out.println(fName);
        Connection connection;
        try {
            connection = DriverManager.getConnection(
               "jdbc:ucanaccess://C:\\Users\\kagas\\Desktop\\IST412\\UserData.accdb");
            
            java.sql.Statement s = connection.createStatement();
            
            String sql = "INSERT INTO UserData (FirstName,LastName,Email,PhoneNumber,"
                  + "Username,Password) VALUES ('" + fName + "','" + lName + "','"
                    + email + "','" + pNum + "','" + uname + "','" + pass + "')";
            
            s.executeUpdate(sql);
            System.out.println("Done adding param in DB");

        } catch (SQLException e) {
        }
    }
}
