package exam.killtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
			case R.id.startbtn2: 
				Intent intent = new Intent(this,LastActivity.class);
				startActivity(intent);
		}
	}
}
