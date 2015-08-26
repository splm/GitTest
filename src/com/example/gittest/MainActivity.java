package com.example.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello=(TextView)findViewById(R.id.hello);
        hello.setText("这是一个测试标题");
    }
}
