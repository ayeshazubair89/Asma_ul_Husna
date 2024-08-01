package com.example.namesofallah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ten extends AppCompatActivity {
    Button btn1,btn2,btn3;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        player=MediaPlayer.create(ten.this,R.raw.ten);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ten.this, " Working on BookMark", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ten.this, "Share", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.item1) {
            Intent intent=new Intent(ten.this,nine.class);
            startActivity(intent);        }

        if (item.getItemId()==R.id.item2) {
            Intent intent=new Intent(ten.this,eleven.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

}