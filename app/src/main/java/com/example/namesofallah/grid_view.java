package com.example.namesofallah;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class grid_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        String Text1[] = {"ٱلْرَّحْمَـانُ", "ٱلْرَّحِيْمُ", "ٱلْمَلِكُ", "ٱلْقُدُّوسُ", "ٱلْسَّلَامُ", "ٱلْمُؤْمِنُ", "ٱلْمُهَيْمِنُ", "ٱلْعَزِيزُ", "ٱلْجَبَّارُ", "ٱلْمُتَكَبِّرُ", "ٱلْخَالِقُ",
                "ٱلْبَارِئُ", "ٱلْمُصَوِّرُ", "ٱلْغَفَّارُ", "ٱلْقَهَّارُ", "ٱلْوَهَّابُ", "ٱلْرَّزَّاقُ", "ٱلْفَتَّاحُ", "ٱلْعَلِيمُ", "ٱلْقَابِضُ", "ٱلْبَاسِطُ", "ٱلْخَافِضُ",
                "ٱلْرَّافِعُ", "ٱلْمُعِزُّ", "ٱلْمُذِلُّ", "ٱلْسَّمِيعُ", "ٱلْبَصِيرُ", "ٱلْحَكَمُ", "ٱلْعَدْلُ", "ٱلْلَّطِيف", "ٱلْخَبِيرُ", "ٱلْحَلِيمُ", "ٱلْعَظِيمُ ", "ٱلْغَفُورُ", "ٱلْشَّكُورُ", "ٱلْعَلِيُّ",
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
        MyAdapter cus = new MyAdapter(grid_view.this, Text1, Text2, Image1);

        gridView.setAdapter(cus);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(grid_view.this, Ar_Rahman.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(grid_view.this, ar_raheem.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(grid_view.this, al_malik.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(grid_view.this, al_quddus.class);
                    startActivity(intent);

                }
                if (position == 4) {

                    Intent intent = new Intent(grid_view.this, As_salam.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(grid_view.this, five.class);
                    startActivity(intent);

                }
                if (position == 6) {
                    Intent intent = new Intent(grid_view.this, six.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(grid_view.this, seven.class);
                    startActivity(intent);

                }
                if (position == 8) {
                    Intent intent = new Intent(grid_view.this, eight.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(grid_view.this, nine.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(grid_view.this, eleven.class);
                    startActivity(intent);

                }
                if (position == 11) {
                    Intent intent = new Intent(grid_view.this, tvelve.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(grid_view.this, thirteen.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(grid_view.this, forteen.class);
                    startActivity(intent);

                }
                if (position == 14) {
                    Intent intent = new Intent(grid_view.this, fifteen.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(grid_view.this, sixteen.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(grid_view.this, seventeen.class);
                    startActivity(intent);

                }
                if (position == 17) {
                    Intent intent = new Intent(grid_view.this, eighteen.class);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(grid_view.this, ninteen.class);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(grid_view.this, twenty.class);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(grid_view.this, twenty_one.class);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(grid_view.this, twenty_two.class);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(grid_view.this, twenty_three.class);
                    startActivity(intent);

                }
                if (position == 23) {
                    Intent intent = new Intent(grid_view.this, twFour.class);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(grid_view.this, twFive.class);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(grid_view.this, twSix.class);
                    startActivity(intent);

                }
                if (position == 26) {
                    Intent intent = new Intent(grid_view.this, twSeven.class);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(grid_view.this, twEight.class);
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(grid_view.this, twNine.class);
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(grid_view.this, thirty.class);
                    startActivity(intent);
                }
                if (position == 30) {
                    Intent intent = new Intent(grid_view.this, thrOne.class);
                    startActivity(intent);
                }
                if (position == 31) {
                    Intent intent = new Intent(grid_view.this, thrTwo.class);
                    startActivity(intent);
                }
                if (position == 32) {
                    Intent intent = new Intent(grid_view.this, thrThree.class);
                    startActivity(intent);

                }
                if (position == 33) {
                    Intent intent = new Intent(grid_view.this, thrFour.class);
                    startActivity(intent);
                }
                if (position == 34) {
                    Intent intent = new Intent(grid_view.this, thrFive.class);
                    startActivity(intent);
                }
                if (position == 35) {
                    Intent intent = new Intent(grid_view.this, thrSix.class);
                    startActivity(intent);

                }
                if (position == 36) {
                    Intent intent = new Intent(grid_view.this, thrSeven.class);
                    startActivity(intent);
                }
                if (position == 37) {
                    Intent intent = new Intent(grid_view.this, thrEight.class);
                    startActivity(intent);
                }
                if (position == 38) {
                    Intent intent = new Intent(grid_view.this, thrNine.class);
                    startActivity(intent);
                }
                if (position == 39) {
                    Intent intent = new Intent(grid_view.this, fourty.class);
                    startActivity(intent);
                }

                if (position == 40) {
                    Intent intent = new Intent(grid_view.this, foOne.class);
                    startActivity(intent);
                }
                if (position == 41) {
                    Intent intent = new Intent(grid_view.this, foTwo.class);
                    startActivity(intent);
                }
                if (position == 42) {
                    Intent intent = new Intent(grid_view.this, foThree.class);
                    startActivity(intent);

                }
                if (position == 43) {
                    Intent intent = new Intent(grid_view.this, foFour.class);
                    startActivity(intent);
                }
                if (position == 44) {
                    Intent intent = new Intent(grid_view.this, foFive.class);
                    startActivity(intent);
                }
                if (position == 45) {
                    Intent intent = new Intent(grid_view.this, foSix.class);
                    startActivity(intent);

                }
                if (position == 46) {
                    Intent intent = new Intent(grid_view.this, foseven.class);
                    startActivity(intent);
                }
                if (position == 47) {
                    Intent intent = new Intent(grid_view.this, foEight.class);
                    startActivity(intent);
                }
                if (position == 48) {
                    Intent intent = new Intent(grid_view.this, foNine.class);
                    startActivity(intent);
                }
                if (position == 49) {
                    Intent intent = new Intent(grid_view.this, fifty.class);
                    startActivity(intent);
                }
                if (position == 50) {
                    Intent intent = new Intent(grid_view.this, fiOne.class);
                    startActivity(intent);
                }
                if (position == 51) {
                    Intent intent = new Intent(grid_view.this, fiTwo.class);
                    startActivity(intent);
                }
                if (position == 52) {
                    Intent intent = new Intent(grid_view.this, fiThree.class);
                    startActivity(intent);

                }
                if (position == 53) {
                    Intent intent = new Intent(grid_view.this, fiFour.class);
                    startActivity(intent);
                }
                if (position == 54) {
                    Intent intent = new Intent(grid_view.this, fiFive.class);
                    startActivity(intent);
                }
                if (position == 55) {
                    Intent intent = new Intent(grid_view.this, fiSix.class);
                    startActivity(intent);

                }
                if (position == 56) {
                    Intent intent = new Intent(grid_view.this, fiSeven.class);
                    startActivity(intent);
                }
                if (position == 57) {
                    Intent intent = new Intent(grid_view.this, fiEight.class);
                    startActivity(intent);
                }
                if (position == 58) {
                    Intent intent = new Intent(grid_view.this, fiNine.class);
                    startActivity(intent);
                }
                if (position == 59) {
                    Intent intent = new Intent(grid_view.this, sixty.class);
                    startActivity(intent);
                }
                if (position == 60) {
                    Intent intent = new Intent(grid_view.this, siOne.class);
                    startActivity(intent);
                }
                if (position == 61) {
                    Intent intent = new Intent(grid_view.this, siTwo.class);
                    startActivity(intent);
                }
                if (position == 62) {
                    Intent intent = new Intent(grid_view.this, siThree.class);
                    startActivity(intent);

                }
                if (position == 63) {
                    Intent intent = new Intent(grid_view.this, siFour.class);
                    startActivity(intent);
                }
                if (position == 64) {
                    Intent intent = new Intent(grid_view.this, siFive.class);
                    startActivity(intent);
                }
                if (position == 65) {
                    Intent intent = new Intent(grid_view.this, siSix.class);
                    startActivity(intent);

                }
                if (position == 66) {
                    Intent intent = new Intent(grid_view.this, siSeven.class);
                    startActivity(intent);
                }
                if (position == 67) {
                    Intent intent = new Intent(grid_view.this, siEight.class);
                    startActivity(intent);
                }
                if (position == 68) {
                    Intent intent = new Intent(grid_view.this, siNine.class);
                    startActivity(intent);
                }
                if (position == 69) {
                    Intent intent = new Intent(grid_view.this, seventy.class);
                    startActivity(intent);
                }
                if (position == 70) {
                    Intent intent = new Intent(grid_view.this, seOne.class);
                    startActivity(intent);
                }
                if (position == 71) {
                    Intent intent = new Intent(grid_view.this, seTwo.class);
                    startActivity(intent);
                }
                if (position == 72) {
                    Intent intent = new Intent(grid_view.this, seThree.class);
                    startActivity(intent);

                }
                if (position == 73) {
                    Intent intent = new Intent(grid_view.this, seFour.class);
                    startActivity(intent);
                }
                if (position == 74) {
                    Intent intent = new Intent(grid_view.this, seFive.class);
                    startActivity(intent);

                }
                if (position == 75) {
                    Intent intent = new Intent(grid_view.this, seSix.class);
                    startActivity(intent);

                }
                if (position == 76) {
                    Intent intent = new Intent(grid_view.this, seSeven.class);
                    startActivity(intent);
                }
                if (position == 77) {
                    Intent intent = new Intent(grid_view.this, seEight.class);
                    startActivity(intent);
                }
                if (position == 78) {
                    Intent intent = new Intent(grid_view.this, seNine.class);
                    startActivity(intent);
                }
                if (position == 79) {
                    Intent intent = new Intent(grid_view.this, eighty.class);
                    startActivity(intent);
                }
                if (position == 80) {
                    Intent intent = new Intent(grid_view.this, eiOne.class);
                    startActivity(intent);
                }
                if (position == 81) {
                    Intent intent = new Intent(grid_view.this, eiTwo.class);
                    startActivity(intent);
                }
                if (position == 82) {
                    Intent intent = new Intent(grid_view.this, eiThree.class);
                    startActivity(intent);

                }
                if (position == 83) {
                    Intent intent = new Intent(grid_view.this, eiFour.class);
                    startActivity(intent);
                }
                if (position == 84) {
                    Intent intent = new Intent(grid_view.this, eiFive.class);
                    startActivity(intent);
                }
                if (position == 85) {
                    Intent intent = new Intent(grid_view.this, eiSix.class);
                    startActivity(intent);

                }
                if (position == 86) {
                    Intent intent = new Intent(grid_view.this, eiSeven.class);
                    startActivity(intent);
                }
                if (position == 87) {
                    Intent intent = new Intent(grid_view.this, eiEight.class);
                    startActivity(intent);
                }
                if (position == 88) {
                    Intent intent = new Intent(grid_view.this, eiNine.class);
                    startActivity(intent);
                }
                if (position == 89) {
                    Intent intent = new Intent(grid_view.this, ninety.class);
                    startActivity(intent);
                }
                if (position == 90) {
                    Intent intent = new Intent(grid_view.this, niOne.class);
                    startActivity(intent);
                }
                if (position == 91) {
                    Intent intent = new Intent(grid_view.this, niTwo.class);
                    startActivity(intent);
                }
                if (position == 92) {
                    Intent intent = new Intent(grid_view.this, niThree.class);
                    startActivity(intent);

                }
                if (position == 93) {
                    Intent intent = new Intent(grid_view.this, niFour.class);
                    startActivity(intent);
                }
                if (position == 94) {
                    Intent intent = new Intent(grid_view.this, niFive.class);
                    startActivity(intent);
                }
                if (position == 95) {
                    Intent intent = new Intent(grid_view.this, niSix.class);
                    startActivity(intent);

                }
                if (position == 96) {
                    Intent intent = new Intent(grid_view.this, niSeven.class);
                    startActivity(intent);
                }
                if (position == 97) {
                    Intent intent = new Intent(grid_view.this, niEight.class);
                    startActivity(intent);
                }
                if (position == 98) {
                    Intent intent = new Intent(grid_view.this, niNine.class);
                    startActivity(intent);
                }

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.list:

                Intent intent=new Intent(grid_view.this,MainActivity3.class);
                startActivity(intent);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main3,menu);
        return super.onCreateOptionsMenu(menu);
    }


}