package com.example.namesofallah;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    Context context;
    String countryList[],text[],text2[];
    int flags[];
    LayoutInflater inflter;

    public ListAdapter(Context applicationContext, String countryList[], String text[], String text2[], int flags[]) {
        this.context = context;
        this.countryList = countryList;
        this.text=text;
        this.text2=text2;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_list_item, null);
        TextView country = (TextView)           view.findViewById(R.id.textview);
        ImageView icon = (ImageView) view.findViewById(R.id.image);
        TextView country2 = (TextView)           view.findViewById(R.id.textview2);
        TextView country3 = (TextView)           view.findViewById(R.id.textview3);
        country.setText(countryList[i]);
        country2.setText(text[i]);
        country3.setText(text2[i]);
        icon.setImageResource(flags[i]);
        return view;
    }
}
