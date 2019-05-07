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
public class League extends BasicInfo {
	
	private User representative;
	private String conference;
	private String section;
	private String region;
    
    

    public User getRepresentative() {
		return representative;
	}



	public void setRepresentative(User representative) {
		this.representative = representative;
	}



	public String getConference() {
		return conference;
	}



	public void setConference(String conference) {
		this.conference = conference;
	}



	public String getSection() {
		return section;
	}



	public void setSection(String section) {
		this.section = section;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	@Override
    public String displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
