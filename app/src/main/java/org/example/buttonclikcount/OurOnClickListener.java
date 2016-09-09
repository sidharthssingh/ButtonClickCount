package org.example.buttonclikcount;

import android.view.View;
import android.view.View.OnClickListener;


public class OurOnClickListener implements OnClickListener {

	MainActivity caller;
	private int count;
	
	public OurOnClickListener(MainActivity activity){
	
		this.caller = activity;
		this.count=0;
		}
	
	public void onClick(View view){
		count=count+1;
//		String tempResult=Integer.toString(count);
	caller.theTextView.setText("Now say Allah-hu-Akbar "+count+ " times, to save your life" );
	}
}
