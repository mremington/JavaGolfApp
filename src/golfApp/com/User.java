/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

/**
 *
 * @author michael.remington
 */
public class User extends BasicInfo {

    private String[] types = {"Player", "Coach", "AD", "Guest"};
    private String userType;
    private String userName;
    private String password;
    private String email;
    private School schoolID;
    private String gender;

    public User() {
        super("default", "999-999-9999", "default address");
        setUserType("Guest");
        setUserName("default");
        setPassword("pw");
        setEmail("default@gmail.com");
        setSchoolID(new School("defaultName","defaultPH","defaultAddress"));
    }
    
    public User(String n, String ph, String add, String type, String un, String pw, String e, School s, String g) {
        super(n, ph, add);
        setUserType(type);
        setUserName(un);
        setPassword(pw);
        setEmail(e);
        setSchoolID(s);
        setGender(g);
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public School getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(School schoolID) {
        this.schoolID = schoolID;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String displayInfo() {
        return getName() + " from " + getSchoolID().getName();
    }
}
