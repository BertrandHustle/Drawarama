package com.theironyard.drawarama;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceView;

public class Drawer extends SurfaceView {

    SurfaceView paper;

    public Drawer(Context context) {
        super(context);
        paper = (SurfaceView) findViewById(R.id.paper);
    }

    //(supposedly) uses SurfaceView's own onTouchEvent and acts as its own Listener
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN) {
            System.out.println("touch!");


        }

        return super.onTouchEvent(event);
    }
}


