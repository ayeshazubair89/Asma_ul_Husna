package com.example.namesofallah;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;

public class rate_us extends Dialog {
Button btn1,btn2;
RatingBar rate;
ImageView img;
    public rate_us(@NonNull Context context){
        super (context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        rate=findViewById(R.id.bar);
        img=findViewById(R.id.img);

        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating <=1){
                    img.setImageResource(R.drawable.e1);
                }
                else if(rating <=2){
                    img.setImageResource(R.drawable.e2);
                }
                else if(rating <=3){
                    img.setImageResource(R.drawable.e3);
                }
                else if(rating <=4){
                    img.setImageResource(R.drawable.e4);
                }
                else if(rating <=5){
                    img.setImageResource(R.drawable.e5);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              dismiss();

            }
        });
    }
}