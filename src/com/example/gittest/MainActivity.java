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
        hello.setText("����һ�����Ա���");
        hello.setOnClickListener(new CustomOnClickListener());
    }
    private class CustomOnClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			
			System.out.println("����������ı�");
			
		}
    	
    }
}

