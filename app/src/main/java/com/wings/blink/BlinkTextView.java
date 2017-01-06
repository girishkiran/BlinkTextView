package com.wings.blink;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

public class BlinkTextView extends TextView {

	public BlinkTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public BlinkTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public BlinkTextView(Context context) {
		super(context);
	}

	
	@Override
	public void setText(CharSequence text, BufferType type) {	
		super.setText(text, type);
		  final Animation animation = new AlphaAnimation(1, 0);
		  animation.setDuration(2000);
		  animation.setInterpolator(new LinearInterpolator());
		  animation.setRepeatCount(Animation.INFINITE);
		  animation.setRepeatMode(Animation.REVERSE);
		  startAnimation(animation);
	}
	

}
