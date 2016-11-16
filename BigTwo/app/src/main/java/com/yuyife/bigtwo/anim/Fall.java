package com.yuyife.bigtwo.anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/*
 放缩 x y   +   alpha 0 -> 1
 */
public class Fall extends BaseEffects {

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.2f, 1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "scaleY", 1.5f, 1.2f, 1).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 1, 0.5f, 1).setDuration(mDuration * 3 / 2)

        );
    }
}
