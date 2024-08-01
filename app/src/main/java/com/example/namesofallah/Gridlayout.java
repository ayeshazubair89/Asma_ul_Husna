package com.example.namesofallah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Gridlayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        String Text1[] = {"ٱلْرَّحْمَـانُ", "ٱلْرَّحِيْمُ", "ٱلْمَلِكُ", "ٱلْقُدُّوسُ", "ٱلْسَّلَامُ", "ٱلْمُؤْمِنُ", "ٱلْمُهَيْمِنُ", "ٱلْعَزِيزُ", "ٱلْجَبَّارُ", "ٱلْمُتَكَبِّرُ", "ٱلْخَالِقُ",
                "ٱلْبَارِئُ", "ٱلْمُصَوِّرُ", "ٱلْغَفَّارُ", "ٱلْقَهَّارُ", "ٱلْوَهَّابُ", "ٱلْرَّزَّاقُ", "ٱلْفَتَّاحُ", "ٱلْعَلِيمُ", "ٱلْقَابِضُ", "ٱلْبَاسِطُ", "ٱلْخَافِضُ",
                "ٱلْرَّافِعُ", "ٱلْمُعِزُّ", "ٱلْمُذِلُّ", "ٱلْسَّمِيعُ", "ٱلْبَصِيرُ", "ٱلْحَكَمُ", "ٱلْعَدْلُ","ٱلْلَّطِيف", "ٱلْخَبِيرُ", "ٱلْحَلِيمُ", "ٱلْعَظِيمُ ", "ٱلْغَفُورُ", "ٱلْشَّكُورُ", "ٱلْعَلِيُّ",
                "ٱلْكَبِيرُ", "ٱلْحَفِيظُ", "ٱلْمُقِيتُ", "ٱلْحَسِيبُ", "ٱلْجَلِيلُ", "ٱلْكَرِيمُ", "ٱلْرَّقِيبُ", "ٱلْمُجِيبُ", "ٱلْوَاسِعُ",
                "ٱلْحَكِيمُ", "ٱلْوَدُودُ", "ٱلْمَجِيدُ", "ٱلْبَاعِثُ", "ٱلْشَّهِيدُ", "ٱلحَقُّ", "ٱلْوكِيلُ", "ٱلْقَوِيُّ", "ٱلْمَتِينُ", "ٱلْوَلِيُّ", "ٱلْحَمِيدُ", "ٱلْمُحْصِيُ", "ٱلْمُبْدِئُ", "ٱلْمُعِيدُ", "ٱلْمُحْيِى",
                "ٱلْمُمِيتُ", "ٱلْحَىُّ", "ٱلْقَيُّومُ", "ٱلْوَاجِدُ", "ٱلْمَاجِدُ", "ٱلْوَاحِدُ", "ٱلْأَحَد", "ٱلْصَّمَدُ",
                "ٱلْقَادِرُ", "ٱلْمُقْتَدِرُ", "ٱلْمُقَدِّمُ", "ٱلْمُؤَخِّرُ", "ٱلأَوَّلُ", "ٱلْآخِرُ", "ٱلْظَّاهِرُ", "ٱلْبَاطِنُ", "ٱلْوَالِي", "ٱلْمُتَعَالِي",
                "ٱلْبَرُّ", "ٱلْتَّوَّابُ", "ٱلْمُنْتَقِمُ", "ٱلْعَفُوُّ", "ٱلْرَّؤُفُ", "مَالِكُ ٱلْمُلْك", "ذُو ٱلْجَلَالِ وَٱلْإِكْرَامُ", "ٱلْمُقْسِطُ", "ٱلْجَامِعُ", "ٱلْغَنيُّ", "ٱلْمُغْنِيُّ", "ٱلْمَانِعُ", "ٱلْضَّارُ",
                "ٱلْنَّافِعُ", "ٱلْنُّورُ", "ٱلْهَادِي", "ٱلْبَدِيعُ", "ٱلْبَاقِي", "ٱلْوَارِثُ", "ٱلْرَّشِيدُ", "ٱلْصَّبُورُ"};
        String Text2[] = {
                "Al_Merciful", "The All Beneficient", "The Absolute Ruler", "The Pure One",
                "The Source of Peace", "The inspire of fatith", "The Guardian", "The Victorious", "The Compeller", "The Greatest", "The creator", "The Maker of Order", "The Shaper of beauty", "The Forgiving", "The Subduer", "The Giver of all", "The Sustainer", "The Opener", "The knower of All", "The Constrictor", "The Reliever", "The Abaser", "The Exalter", "The Best ower of Honors", "The Humilator", "The Hearer of All", "The Seer of All", "The Judge one", "The Just", "The Most Gentle", "The All Aware", "The most Forbearing", "The MAgnificent", "The Forgiving", "The Most Appreciactive", "The Highest", "The Greatest", "The Preserver", "The Sustainer", "The Reckoner", "The Majestic", "The Most Generous", "The Watchful", "The Responsive One", "The Boundless", "The All_Wise", "The Most Loving", "The Glorious", "The Resurrector", "The All and ever Witnsessing", "The Absolute Truth", "The Trustee", " The ALl Strong", "The Firm", "The Protecting Associate", "The Praiseworthy", "The All-Enumerating", "The Originator", "The Restorer", "The Giver of Life", "The Bringer Of Death", "The Ever living(Allah)", "The Sustainer", "The Perceiver", "The MAgnificent",
                "The Only One", "The Unique", "The Eternal", "The Capable", "The Omnipotent", "The Expediter", "The Delayer", "The Fisrt(Allah)", "The Last(Allah)", "The Manifest", "The Hidden one", "The Governer", "The Self Exalted", "The Source Of Goodness", "The Relenting",
                "The Avenger", "The Pardoner", "The Most Kind", "MAster Of the Universe", "Possessor of Majesty and Honur", "The Just one", "The Assembler of Scattered Creations", "The Sufficient One", "The Bestower of Sufficiency", "The Preventer", "The Destressor", "The Bestower of Benefits", "The Prime Light", "The Provider Of Guidance", "The Unique one", "" +
                "The Ever,Surviving One", "The Eternal Ineritor", "The Guide To Path of", "The Patient"
        };

        int Image1[] = {R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border, R.drawable.ic_baseline_bookmark_border,
                R.drawable.ic_baseline_bookmark_border
                };

        GridView gridView = (GridView) findViewById(R.id.grid);
        MyAdapter cus = new MyAdapter(Gridlayout.this,Text1,Text2,Image1);

        gridView.setAdapter(cus);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent=new Intent(Gridlayout.this,Ar_Rahman.class);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent=new Intent(Gridlayout.this, ar_raheem.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(Gridlayout.this,al_malik.class);
                    startActivity(intent);

                }
                if (position==3)
                {
                    Intent intent=new Intent(Gridlayout.this,al_quddus.class);
                    startActivity(intent);

                }
                if (position==4)
                {

                    Intent intent=new Intent(Gridlayout.this,As_salam.class);
                    startActivity(intent);
                }
                if (position==5)
                {
                    Intent intent=new Intent(Gridlayout.this,five.class);
                    startActivity(intent);

                }
                if (position==6)
                {
                    Intent intent=new Intent(Gridlayout.this,six.class);
                    startActivity(intent);
                }
                if (position==7)
                {
                    Intent intent=new Intent(Gridlayout.this,seven.class);
                    startActivity(intent);

                }
                if (position==8)
                {
                    Intent intent=new Intent(Gridlayout.this,eight.class);
                    startActivity(intent);
                }
            }
        });



    }}