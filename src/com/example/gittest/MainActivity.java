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
		
		hello.setText("����һ�����Ա���");
		
		userModel=new UserModel();
		
		userModel.setUsername("����");
		
		userModel.setUsersex("��");
		
		userModel.setUsertype("����Ա");
		
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
				
				cloneUserModel.setUsername("����");
				
				cloneUserModel.setUsersex("Ů");
				
				LogHelper.traceField("ԭ�ͣ�����\n:"+userModel.getUsername()+"\t�Ա�\n"+userModel.getUsersex());
				
				LogHelper.traceField("��¡������\n:"+cloneUserModel.getUsername()+"\t�Ա�\n"+cloneUserModel.getUsersex()+"-----"+cloneUserModel.getUsertype());
				
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			
			}
			
			System.out.println("����������ı�");
			
		}
    	
    }
	
}

