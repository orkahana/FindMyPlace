package com.example.findmyplace;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Next;
        Button button = (Button)findViewById(R.id.btn_Next);
        final TextView nameTV = (TextView) findViewById(R.id.editText_username);
        final TextView emailTV = (TextView) findViewById(R.id.editText_email);
        final TextView passwordTV = (TextView) findViewById(R.id.editText_password);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameTV.getText().toString();
                String email = emailTV.getText().toString();
                String password = passwordTV.getText().toString();
                if(name.length() < 5) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("FindMyPlace")
                            .setMessage("עלייך להזין שם משתמש חוקי!")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            }).show();
                }

            }
        });
    }
}
