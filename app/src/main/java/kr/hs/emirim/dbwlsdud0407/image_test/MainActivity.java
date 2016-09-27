package kr.hs.emirim.dbwlsdud0407.image_test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    MyImage mIng;
    static final int ORIGINAL=0;
    static final int ROTATE=1;
    static final int TRANSLATE=2;
    static final int SCALE=3;
    static final int SKEW=4;
    int choose=ORIGINAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new MyImage(getApplicationContext()));
        setContentView(R.layout.activity_main);
        LinearLayout linear1 = (LinearLayout)findViewById(R.id.linear1);
        mIng = new MyImage(getApplicationContext());
        linear1.addView(mIng);
    }
    public void imageTurn(View v){
        switch (v.getId()){
            case R.id.b1 :
                choose=ROTATE;
                break;
            case R.id.b2:
                choose=TRANSLATE;
                break;
            case R.id.b3:
                choose=SCALE;
                break;
            case R.id.b4:
                choose=SKEW;
                break;
        }
        mIng.setChoose(choose);
        mIng.invalidate(); //onDraw를 다시 호출하는 방법

    }
}