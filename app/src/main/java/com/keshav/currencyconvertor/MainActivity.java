package com.keshav.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    TextView ed2;
    Button usd, yen, cny, eur, pound;

    //fix values
    double usd_rup = 0.01448;
    double cny_rup = 0.09961;
    double eur_rup = 0.01274;
    double yen_rup = 1.56031;
    double pound_rup = 0.01143;
    double calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding id's
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        usd = findViewById(R.id.usd);
        yen = findViewById(R.id.yen);
        cny = findViewById(R.id.cny);
        eur = findViewById(R.id.eur);
        pound = findViewById(R.id.pound);

        //setup onclick listeners
        usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc = Double.valueOf("" + ed1.getText());
                    ed2.setText("" + (calc*usd_rup) + " USD");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc = Double.valueOf("" + ed1.getText());
                    ed2.setText("" + (calc*yen_rup) + " YEN");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        cny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc = Double.valueOf("" + ed1.getText());
                    ed2.setText("" + (calc*cny_rup) + " CNY");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc = Double.valueOf("" + ed1.getText());
                    ed2.setText("" + (calc*eur_rup) + " EUROS");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    calc = Double.valueOf("" + ed1.getText());
                    ed2.setText("" + (calc*pound_rup) + " POUNDS");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Please Enter A Valid Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
