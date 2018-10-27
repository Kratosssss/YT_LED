package com.example.lenovo.yt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    private float size = 100.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);// 去掉手机显示电池，时间和网络


        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        float textSize = intent.getFloatExtra("textSize", 5.0f);

        System.out.println("message:"+message);
        System.out.println("textSize:"+textSize);


        MarqueeView marqueeView = (MarqueeView)findViewById(R.id.tv_marquee);
        marqueeView.setFocusable(true);
        marqueeView.requestFocus();
        marqueeView.setmTextSize(textSize);
        marqueeView.setText(message);//设置文本
        marqueeView.startScroll(); //开始
    }

}
