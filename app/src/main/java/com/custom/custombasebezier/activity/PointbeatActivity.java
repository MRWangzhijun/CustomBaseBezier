package com.custom.custombasebezier.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.custom.custombasebezier.R;
import com.custom.custombasebezier.customview.BeatBall;

public class PointbeatActivity extends AppCompatActivity {
    private BeatBall beatBall2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//版本判断
            Window window = getWindow();
// Translucent status bar
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);//设置statusbar应用所占的屏幕扩大到全屏，但是最顶上会有背景透明的状态栏，它的文字可能会盖着你的应用的标题栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pointbeat);
        beatBall2=findViewById(R.id.pointBeatView);
    }
}
