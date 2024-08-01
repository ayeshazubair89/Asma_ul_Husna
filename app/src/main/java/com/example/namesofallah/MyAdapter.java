package com.example.namesofallah;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter {
Activity mContext;
int mImages[];
String mText1[];
String mText2[];

     MyAdapter(Activity context, String Text1[], String Text2[], int Image1[]) {


        super(context, R.layout.custom_items,Text1);
        mContext=context;
        mText1=Text1;
        mText2=Text2;
        mImages=Image1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//            ListData user = getItem(position);
       LayoutInflater inflater=LayoutInflater.from(mContext);
       View row=inflater.inflate(R.layout.custom_items,parent,false);

        ImageView imageView = row.findViewById(R.id.image);
        TextView textView = row.findViewById(R.id.textview);
        TextView message = row.findViewById(R.id.textview2);
       // TextView time = row.findViewById(R.id.textview3);


        textView.setText(mText1[position]);
        message.setText(mText2[position]);
        //time.setText(m);
        imageView.setImageResource(mImages[position]);
        return row;

    }
}
