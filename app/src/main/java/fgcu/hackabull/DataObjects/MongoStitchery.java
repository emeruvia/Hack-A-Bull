package fgcu.hackabull.DataObjects;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mongodb.stitch.android.StitchClient;
import com.mongodb.stitch.android.StitchClientFactory;
import com.mongodb.stitch.android.services.mongodb.MongoClient;

/**
 * Created by Andre on 3/25/2018.
 */

public class MongoStitchery {

    private final MongoClient.Database DataBase;
    private MongoClient _mongoClient;
    private StitchClient _client;
    private String UserDataBase = "UserAccounts";
    private String Accounts = "Accoutns";
    private String appID = "rubberworks-yvexd";

    public MongoStitchery(Context context){

        //Set up Mongo stitchy
        StitchClientFactory.create(context, appID).addOnCompleteListener(new OnCompleteListener<StitchClient>() {
            @Override
            public void onComplete(@NonNull Task<StitchClient> task) {
                if(!task.isSuccessful())     {
                    Log.e("STITCH", "error creating Stitch client", task.getException());
                return;
            }
                _client = task.getResult();
                _mongoClient = new MongoClient(_client, "mongodb-atlas");
            }
        });

        if(_client == null){
            Log.d("Stich","Client is null");
            // _mongoClient.getDatabase("UserAccounts").getCollection("Accounts");

        }

        DataBase = _mongoClient.getDatabase("Accounts");



    }

    public Boolean insertUser(User user){

       if(DataBase.getCollection(Accounts).insertOne(user.createDocument()).isSuccessful()){
           return true;
       }else{
           return false;
       }


    }

    public boolean faceBookLogin(){

        return true;

    }
}
