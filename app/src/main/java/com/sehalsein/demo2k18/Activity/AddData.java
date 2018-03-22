package com.sehalsein.demo2k18.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sehalsein.demo2k18.Model.UserDetail;
import com.sehalsein.demo2k18.R;

public class AddData extends AppCompatActivity {

    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);


        mRef = mDatabase.getReference("users");
    }


    public void add(View view){
        UserDetail userDetail = new UserDetail("Sehal","22");

        String key = mRef.push().getKey();

        userDetail.setId(key);
        mRef.child(key).setValue(userDetail);

    }
}
