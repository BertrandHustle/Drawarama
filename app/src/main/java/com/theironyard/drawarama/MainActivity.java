/**
 * Main drawing class
 */

package com.theironyard.drawarama;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    //init

    SurfaceView paper;
    Paint paint;
    Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);

    Button eraseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paper = (SurfaceView) findViewById(R.id.paper);
        paper.setOnTouchListener(this);

        //paint setting

        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);



    }

    //touch event

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        //gets touch coordinates

        float x = motionEvent.getX();
        float y = motionEvent.getY();

        if (x > 0 && y > 0) {

            System.out.println("touch!");
            System.out.println(x);
            System.out.println(y);
        }
        return false;
    }
}


//// TODO: 4/26/16 print on touch & drag