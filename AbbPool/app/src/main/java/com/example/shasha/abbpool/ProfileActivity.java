package com.example.shasha.abbpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmitProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnSubmitProfile = (Button) findViewById(R.id.btnSubmitProfile);
        btnSubmitProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSubmitProfile:
                Intent intent = new Intent(this, RideSelectionActivity.class);
                startActivity(intent);
        }
    }
}
