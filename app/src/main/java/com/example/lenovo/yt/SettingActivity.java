package com.example.lenovo.yt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SettingActivity extends AppCompatActivity {

    protected EditText message,textSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void onClickStart(View view){
        message =(EditText)findViewById(R.id.edt_message);
        textSize =(EditText)findViewById(R.id.edt_textSize);

        float f_textsize = Float.valueOf(textSize.getText().toString());

        Intent intent = new Intent(SettingActivity.this,MainActivity.class);
        intent.putExtra("message",message.getText().toString());
        intent.putExtra("textSize",f_textsize);

        startActivity(intent);
    }

}
