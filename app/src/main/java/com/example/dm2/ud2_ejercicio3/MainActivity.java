package com.example.dm2.ud2_ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botY,botB,botG;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botY=findViewById(R.id.botY);
        botB=findViewById(R.id.botB);
        botG=findViewById(R.id.botG);

        img=findViewById(R.id.img);

        botB.setOnClickListener(this);


        botG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageDrawable(getDrawable(R.mipmap.ic_google));
            }
        });
    }






    public void cambiarImg(View view) {

        img.setImageDrawable(getDrawable(R.mipmap.ic_yahoo));


    }

    @Override
    public void onClick(View v) {
        img.setImageDrawable(getDrawable(R.mipmap.ic_bing));
    }
}
