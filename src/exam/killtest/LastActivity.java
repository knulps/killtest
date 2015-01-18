package exam.killtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LastActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
			case R.id.startbtn3: 
				Intent intent = new Intent(this,MainActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
		}
	}
}
