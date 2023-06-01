package com.grozziie.circleimagetext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CurvedTextView extends AppCompatTextView {
    private Path path;

    public CurvedTextView(Context context) {
        super(context);
    }

    public CurvedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CurvedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (path != null) {
            canvas.drawTextOnPath(getText().toString(), path, 0, 0, getPaint());
        } else {
            super.onDraw(canvas);
        }
    }

    @Override
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        path = new Path();
        path.addArc(0, 0, width, height, 180, 180);
    }
}