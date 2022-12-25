package com.example.registe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText getMail;
    private EditText getPassword;
    private EditText getPassword2;
    private Button accept;
    private TextView mailInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMail = findViewById(R.id.getMail);
        mailInfo = findViewById(R.id.mailInfo);
        getPassword = findViewById(R.id.getPassword);
        getPassword2 = findViewById(R.id.getPassword2);
    }

    public void getPersonInfo(View view) {

        String getPasswordInfo = getPassword.getText().toString();
        String getPasswordInfo2 = getPassword2.getText().toString();
        String callMailInfo = getMail.getText().toString();

        if (callMailInfo.contains("@")) {
            if (getPasswordInfo.contentEquals(getPasswordInfo2)) {
                mailInfo.setText("Witaj " + callMailInfo);
            } else {
                mailInfo.setText("Hasła się różnią");
            }
        } else {
            mailInfo.setText("Nie prawidłowy adres e-mail");
        }

    }
}