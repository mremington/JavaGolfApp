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
public class League extends BasicInfo implements Comparable {

    private User representative;
    private String conference;
    private String section;
    private String region;

    public League(String n, String ph, String add) {
        super(n, ph, add);
    }

    public League(String n, String ph, String add, User rep, String con, String sec, String reg) {
        super(n, ph, add);
        setRepresentative(rep);
        setConference(con);
        setRegion(reg);
    }

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
    public int compareTo(Object o) {
        League s = (League) o;
        if (this.getName().compareTo(s.getName()) < 0) {
            return -1;
        }
        if (this.getName().compareTo(s.getName()) > 0) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return getName() + " " + getPhone() + " " + getAddress() + " " + getRepresentative() + " " + getConference() + " " + getSection() + " " + getRegion();
    }

    @Override
    public boolean displayInfo() {
        return false;
    }
}
