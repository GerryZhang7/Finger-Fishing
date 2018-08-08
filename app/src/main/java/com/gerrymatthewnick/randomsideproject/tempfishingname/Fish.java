package com.gerrymatthewnick.randomsideproject.tempfishingname;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Fish {

    private int type;
    private int changeFreq;
    private RelativeLayout rl;
    private static Context context;

    private ImageView fish;

    public Fish(int fishType, int change, RelativeLayout relativeL, Context current) {

        type = fishType;
        changeFreq = change;
        rl = relativeL;
        context = current;

    }
    public void setX(float x) {
        fish.setX(x);

    }
    public void setY(float y) {
        fish.setY(y);
    }


    public void spawnFish() {
        fish = new ImageView(context);
        fish.setImageResource(type);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        fish.setLayoutParams(lp);
        rl.addView(fish);
    }

}
