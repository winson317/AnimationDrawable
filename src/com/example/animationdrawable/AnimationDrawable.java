package com.example.animationdrawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationDrawable extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

       final ImageView imageView = (ImageView)findViewById(R.id.imageView);
       final Animation animation = AnimationUtils.loadAnimation(this, R.anim.my_anim); //���ض�����Դ
       animation.setFillAfter(true); //���ö���������������״̬
       
       Button button = (Button)findViewById(R.id.button);
       button.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			imageView.startAnimation(animation); //��ʼ����
		}
	});
    }

}
