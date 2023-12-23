package com.betelgeuse.corp.tachandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
//    float x;
//    float y;
//
//    String sUp[] = new String[10];
//    String sDown[] = new String[10];;
//    String sMove[] = new String[10];;
//    TextView textView;

    ImageView img;
    Animation spinAnimation;
//    Button btnStart;
//    Button btnStop;
//    ObjectAnimator animationRotateCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.roulette);
        spinAnimation = AnimationUtils.loadAnimation(this, R.anim.roulette_rotate);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_MOVE:
                        startSpinAnimation();
                        return true;
                    case MotionEvent.ACTION_DOWN:
                       stopSpinAnimation();
                        return true;
                }
                return false;
            }
        });
//        btnStart = findViewById(R.id.start);
//        btnStop = findViewById(R.id.stop);
//
//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////      imageView.startAnimation(animationRotateCenter);
//                animationRotateCenter = ObjectAnimator.ofFloat(img,"rotation",0, 360);
//                animationRotateCenter.setRepeatMode(ObjectAnimator.RESTART);
//                animationRotateCenter.setRepeatCount(ObjectAnimator.INFINITE);
//                animationRotateCenter.start();
//            }
//        }
//        );
//        setContentView(R.layout.activity_main);

//        textView = new TextView(this);
//        textView.setTextSize(15);
//        textView.setOnTouchListener(this);
//        setContentView(textView);
    }
    private void startSpinAnimation(){
        img.startAnimation(spinAnimation);
    }
    private void stopSpinAnimation(){
        img.clearAnimation();
    }

//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
////        event.getActionIndex();
////        int index = event.getActionIndex();
////        x = event.getX(index);
////        y = event.getY(index);
////        switch (event.getAction()){
////            case MotionEvent.ACTION_DOWN: //only first finger
////            case MotionEvent.ACTION_POINTER_DOWN: //two and > finger
////                sDown[index] = "["+ index +"] DOWN : x = " + x + " ,  y = " + y;
////                sMove[index] = "";
////                sUp[index] = "";
////                break;
////            case MotionEvent.ACTION_MOVE: //Only move fingers
////                sMove[index] = "["+ index +"] MOVE : x = " + x + " ,  y = " + y;
////                sDown[index] = "";
////                sUp[index] = "";
////                StringBuilder stringBuilder = new StringBuilder();
////                for (int i = 0; i < event.getPointerCount(); i++) {
////                    float x = event.getX(i);
////                    float y = event.getY(i);
////                    stringBuilder.append("   " + event.getPointerId(i) + " [" + i +"] x = " + x + " ,  y = " + y + "\n");
////                }
////                textView.setText(stringBuilder);
////                break;
////            case MotionEvent.ACTION_UP: //last finger
////            case MotionEvent.ACTION_POINTER_UP: //two and > finger
////            case MotionEvent.ACTION_CANCEL: //Action and
////                sUp[index] = "["+ index +"] UP : x = " + x + " ,  y = " + y;
////                sMove[index] = "";
////                sDown[index] = "";
////                break;
////        }
//        return true;
//    }
}