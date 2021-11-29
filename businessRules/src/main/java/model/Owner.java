package model;

import java.util.Date;

public class Owner {
    private int ownerId;
    private String emailId;
    private Date dateOfBirth;

    public Owner(int ownerId, String emailId, Date dateOfBirth) {
        this.ownerId = ownerId;
        this.emailId = emailId;
        this.dateOfBirth = dateOfBirth;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
