package com.mfh.rxjava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by Blessed-tec1 on 2017/6/13.
 */

public class MyTextView extends LinearLayout{
    private Paint mPain;

    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPain = new Paint();
        mPain.setAntiAlias(true);
        mPain.setStrokeWidth(1);
        mPain.setColor(Color.parseColor("#d5d5d5"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //下边
//        canvas.drawLine(getLeft()-getPaddingLeft(), getBottom(), getRight()-getPaddingRight(), getBottom(), mPain);
        Log.i("AAAA", "onDraw: "+getLeft()+","+ getBottom()+","+ getRight()+","+ getBottom()+"padding"+getPaddingLeft()+getPaddingTop());
        //左边
        canvas.drawLine(getLeft()-getPaddingLeft(), getTop()-getPaddingTop(), getLeft()-getPaddingLeft(), getBottom(), mPain);
//        //右边
//        canvas.drawLine(getRight(), getTop(), getRight(), getTop() + getHeight(), mPain);
    }
}
