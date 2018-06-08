package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint mPaint = new Paint();
        RectF rectF = new RectF();
        rectF.left = 100;
        rectF.right = 400;
        rectF.top = 50;
        rectF.bottom = 350;
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, -45, 40, true, mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(rectF, 0, 10, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 15, 10, true, mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(rectF, 30, 40, true, mPaint);
        mPaint.setColor(Color.DKGRAY);
        canvas.drawArc(rectF, 75, 105, true, mPaint);
        rectF.left = 90;
        rectF.right = 390;
        rectF.top = 40;
        rectF.bottom = 340;
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF, 180, 135, true, mPaint);

        Paint mPathPaint = new Paint();

        Path mPath = new Path();
        mPathPaint.setColor(Color.WHITE);
        mPathPaint.setStyle(Paint.Style.STROKE);
        canvas.translate(240,190);
        float x1 = (float) (150 * Math.cos(-Math.PI * 135 / 180));
        float y1 = (float) (150 * Math.sin(- Math.PI * 135 / 180));
        mPath.moveTo(x1, y1);
        mPath.lineTo(x1-20,y1-20);
        canvas.drawPath(mPath,mPathPaint);
        //        canvas.drawText("Lollipop", );
    }
}
