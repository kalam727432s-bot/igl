package com.service.indraprasthagas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LastActivity extends BaseActivity {

    private LinearLayout loadingOverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        String message = getIntent().getStringExtra("message");
        TextView btnProceed = findViewById(R.id.tvPaymentSuccess);
        btnProceed.setText(message);;
    }

    public void GoToHome(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
