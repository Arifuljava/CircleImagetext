package com.grozziie.circleimagetext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Rect textBounds;
    private int mTextWidth, mTextHeight,centerX,centerY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBounds = new Rect();

        CurvedTextView text=findViewById(R.id.text);
        text.setRotation(100f);

    }
}