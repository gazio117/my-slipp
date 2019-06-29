package net.slipp.myslipp.web;

/**
 * User
 */
public class User {

    private String userid;
    private String userpassword;
    private String username;
    private String useremail;


    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return this.userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return this.useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }


    @Override
    public String toString() {
        return "{" +
            " userid='" + getUserid() + "'" +
            ", userpassword='" + getUserpassword() + "'" +
            ", username='" + getUsername() + "'" +
            ", useremail='" + getUseremail() + "'" +
            "}";
    }
    
}