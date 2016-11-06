package com.example.user.doitorno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button button_coin;
    private static Button button_bottle;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_coin = (Button) findViewById(R.id.coinbtn);
        button_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.user.doitorno.Coin");
                startActivity(intent);
            }
        });

        button_bottle = (Button) findViewById(R.id.bottlebtn);
        button_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.user.doitorno.Sbottle");
                startActivity(intent);
            }
        });

    }

}





