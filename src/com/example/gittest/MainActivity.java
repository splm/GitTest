package com.example.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello=(TextView)findViewById(R.id.hello);
        hello.setText("这是一个测试标题");
        hello.setOnClickListener(new CustomOnClickListener());
    }
    private class CustomOnClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			
			System.out.println("单击了这个文本");
			
		}
    	
    }
}

