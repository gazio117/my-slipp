package net.slipp.myslipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * User
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false, length=20, unique=true)
    private String userid;

    private String userpassword;
    private String username;
    private String useremail;



    public boolean matchId(Long checkId) {
        if (checkId == null) {
            return false;
        }
        return checkId.equals(id);
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public boolean matchPassword(String checkPassword) {
        if (checkPassword == null) {
            return false;
        }
        return checkPassword.equals(userpassword);
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
    
    public void update(User newUser) {
        this.userpassword = newUser.userpassword;
        this.username = newUser.username;
        this.useremail = newUser.useremail;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", userid='" + userid + "'" +
            ", userpassword='" + userpassword + "'" +
            ", username='" + username + "'" +
            ", useremail='" + useremail + "'" +
            "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}