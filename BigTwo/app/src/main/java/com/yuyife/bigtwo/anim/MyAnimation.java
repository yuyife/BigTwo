package com.yuyife.bigtwo.anim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;


public class MyAnimation {
    private static final String TAG = "MyAnimation";

    // 图标的动画(入动画)
	public static void startAnimationsIn(ViewGroup viewgroup, int durationMillis) {

		viewgroup.setVisibility(View.VISIBLE);

		Animation animation;
		animation = new RotateAnimation(-180, 0, Animation.RELATIVE_TO_SELF,
				0.5f, Animation.RELATIVE_TO_SELF, 1.0f);
		animation.setFillAfter(true);
		animation.setDuration(durationMillis);
		viewgroup.startAnimation(animation);

	}

	// 图标的动画(出动画)
	public static void startAnimationsOut(final ViewGroup viewgroup,
			int durationMillis, int startOffset) {

		Animation animation;
		animation = new RotateAnimation(0, -180, Animation.RELATIVE_TO_SELF,
				0.5f, Animation.RELATIVE_TO_SELF, 1.0f);
		animation.setFillAfter(true);
		animation.setDuration(durationMillis);
		animation.setStartOffset(startOffset);
		animation.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation arg0) {}
			@Override
			public void onAnimationRepeat(Animation arg0) {}
			@Override
			public void onAnimationEnd(Animation arg0) {

			}
		});
		viewgroup.startAnimation(animation);
	}



	public static  void viewAnim(View view,float fromX,float toX,float fromY,float toY){
		AnimatorSet a = new AnimatorSet();
		a.playTogether(ObjectAnimator.ofFloat(view,"X",fromX,toX)
				,ObjectAnimator.ofFloat(view,"Y",fromY,toY));
		a.setDuration(400);
		a.start();
	}
}







