package com.example.gittest;

import com.example.gittest.model.UserModel;
import com.example.gittest.utils.LogHelper;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
	private TextView hello;
	
	private UserModel userModel;
	
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
		
		hello.setText("这是一个测试标题");
		
		userModel=new UserModel();
		
		userModel.setUsername("张三");
		
		userModel.setUsersex("男");
		
		userModel.setUsertype("管理员");
		
	}
	@Override
	protected void bindEvent() {
		
		hello.setOnClickListener(new CustomOnClickListener());
		
	}
	
	private class CustomOnClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			
			try {
				
				UserModel cloneUserModel=(UserModel) userModel.clone();
				
				cloneUserModel.setUsername("李四");
				
				cloneUserModel.setUsersex("女");
				
				LogHelper.traceField("原型：姓名\n:"+userModel.getUsername()+"\t性别：\n"+userModel.getUsersex());
				
				LogHelper.traceField("克隆：姓名\n:"+cloneUserModel.getUsername()+"\t性别：\n"+cloneUserModel.getUsersex()+"-----"+cloneUserModel.getUsertype());
				
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			
			}
			
			System.out.println("单击了这个文本");
			
		}
    	
    }
	
}

