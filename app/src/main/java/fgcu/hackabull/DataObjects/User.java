package fgcu.hackabull.DataObjects;

import com.mongodb.stitch.android.StitchClient;
import com.mongodb.stitch.android.services.mongodb.MongoClient;

import org.bson.Document;

/**
 * Created by Andre on 3/25/2018.
 */

public class User {
    private String phone, name, email;
    private StitchClient _client;
    private MongoClient _mongoClient;
    private String StichTag = "StichClient";
    private Document p;


    public User(String tele, String uName, String uEmail){
        this.phone = tele;
        this.name = uName;
        this.email = uEmail;
    }

    public boolean insertDocument(){



        return true;
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
