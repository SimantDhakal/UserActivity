package com.simant.useractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView txtName, txtAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.profile);
        txtAddress = findViewById(R.id.address);
        txtName = findViewById(R.id.name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            imageView.setImageResource(bundle.getInt("profile"));
            txtName.setText(bundle.getString("name"));
            txtAddress.setText(bundle.getString("address"));
        }
    }
}
