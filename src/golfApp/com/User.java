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
public class User extends BasicInfo{
    private String[] types;
    private String userName;
    private String password;
    private String email;
    private School schoolID;
    
    

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



	@Override
    public String displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
