package com.example.namesofallah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class niNine extends AppCompatActivity {
    Button btn1,btn2,btn3;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ni_nine);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        player=MediaPlayer.create(niNine.this,R.raw.ninine);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(niNine.this, " Working on BookMark", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject Here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
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
            Intent intent=new Intent(niNine.this,niEight.class);
            startActivity(intent);        }

        if (item.getItemId()==R.id.item2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(niNine.this);

            // Set the message show for the Alert time
            builder.setMessage("Go to Ar_Rahman Again?");

            // Set Alert Title
            builder.setTitle("Alert");

            // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
            builder.setCancelable(false);

            // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
            builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
                // When the user click yes button then app will close

                startActivity(new Intent(niNine.this, Ar_Rahman.class));


            });
        }


        return super.onOptionsItemSelected(item);
    }

}