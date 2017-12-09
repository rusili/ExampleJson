package com.rusi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rusi.myapplication.models.Response;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Response response = new Response();

		// This will get the value of the 2nd menuitem onclick field ("OpenDoc()")
		response.getMenu().getPopup().getMenuItem()[1].getOnclick();
	}

//	http://jsonviewer.stack.hu/
//		{"menu": {
//			"id": "file",
//			"value": "File",
//			"popup": {
//				"menuitem": [
//						{"value": "New", "onclick": "CreateNewDoc()"},
//						{"value": "Open", "onclick": "OpenDoc()"},
//						{"value": "Close", "onclick": "CloseDoc()"}
//				}
//		}}

}
