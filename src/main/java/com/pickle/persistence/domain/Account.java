package com.pickle.persistence.domain;

import javax.persistence.Column;
import javax.persistence.PrePersist;

/**
 * Created by admin on 11/2/2015.
 */
public class Account extends Base {
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phone_number;
    @Column(name = "PHOTO_URL")
    private String photo_url;
    @PrePersist
    public void prePersist(){
        super.prePersist();
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer("Account{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone number='").append(phone_number).append('\'');
        sb.append(", photo url='").append(photo_url).append('\'');
        return sb.toString();
    }
}
