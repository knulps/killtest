package exam.killtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
			case R.id.startbtn: 
				Intent intent = new Intent(this,SecondActivity.class);
				startActivity(intent);
		}
	}
}
