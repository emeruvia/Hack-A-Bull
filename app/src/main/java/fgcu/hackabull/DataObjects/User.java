package fgcu.hackabull.DataObjects;

import org.bson.Document;

/**
 * Created by Andre on 3/25/2018.
 */

public class User {
    private String phone, name, email;
    private Document user;


    public User(String tele, String uName, String uEmail){
        this.phone = tele;
        this.name = uName;
        this.email = uEmail;
    }

    public Document createDocument(){
        user.append("Email", email);
        user.append("Name", name);
        user.append("Number", phone);
        return user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
