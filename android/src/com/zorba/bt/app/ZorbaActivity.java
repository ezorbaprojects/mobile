package com.zorba.bt.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ZorbaActivity extends Activity {
	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
}
