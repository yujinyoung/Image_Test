package kr.hs.emirim.dbwlsdud0407.image_test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator08 on 2016. 9. 26..
 */
public class MyImage extends View {
    int choose=MainActivity.ORIGINAL;
    Bitmap picture;
    MyImage(Context context) {

        super(context);  //view상속 가능
        picture = BitmapFactory.decodeResource(getResources(), R.drawable.daramge);
    }
    public void setChoose(int choose){
        this.choose=choose;


    }
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float cx = getWidth() / 2.0f;
        float cy = getHeight() / 2.0f;
        float x = (getWidth() - picture.getWidth()) / 2.0f;
        float y = (getHeight() - picture.getHeight()) / 2.0f;
        //canvas.rotate(180,cx,cy); //회전
        //canvas.translate(-150,200);//이동
        // canvas.scale(2,2,cx,cy);//크기변경
        //canvas.skew(0.4f, 0.4f);

        switch (choose){
            case MainActivity.ROTATE:
                canvas.rotate(180,cx,cy);
                break;
            case MainActivity.TRANSLATE:
                canvas.translate(-150,200);
                break;
            case MainActivity.SCALE:
                canvas.scale(2,2,cx,cy);
                break;
            case MainActivity.SKEW:
                canvas.skew(0.4f, 0.4f);
                break;
        }
        canvas.drawBitmap(picture, x, y, null);
    }
  }


