package com.example.helloworldandroidndk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View view) {
		Toast.makeText(this, this.stringTestNdk(), Toast.LENGTH_SHORT).show();
	}

	public native String stringTestNdk();

	static {
		System.loadLibrary("HelloworldAndroidNDK");
	}

}
