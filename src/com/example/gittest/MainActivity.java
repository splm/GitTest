package com.example.gittest;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
	private TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
    }
    
	@Override
	protected void initView() {
		
		hello=(TextView)findViewById(R.id.hello);
		
	}
	@Override
	protected void initData() {
		
		hello.setText("����һ�����Ա���");
		
	}
	@Override
	protected void bindEvent() {
		
		hello.setOnClickListener(new CustomOnClickListener());
		
	}
	
	private class CustomOnClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			
			System.out.println("����������ı�");
			
		}
    	
    }
	
}

