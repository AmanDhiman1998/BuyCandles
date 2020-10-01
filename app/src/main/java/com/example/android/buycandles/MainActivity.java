package com.example.android.buycandles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int qc1 = 0;
    int qc2 = 0;
    int qc3 = 0;
    int qc4 = 0;
    int Totalp = 0;

    public void decreaseone(View view) {

        if (qc1 > 0) {
            qc1--;
            Totalp = Totalp - 40;
        }
        TextView Price = (TextView) findViewById(R.id.priceone);
        TextView quantity = (TextView) findViewById(R.id.textView1);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc1 * 40 + "");
        quantity.setText(qc1 + "");


    }

    public void decreasetwo(View view) {
        if (qc2 > 0) {
            qc2--;
            Totalp = Totalp - 40;
        }

        TextView Price = (TextView) findViewById(R.id.pricetwo);
        TextView quantity = (TextView) findViewById(R.id.textView2);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc2 * 40 + "");
        quantity.setText(qc2 + "");
    }

    public void decreasethree(View view) {

        if (qc3 > 0) {
            qc3--;
            Totalp = Totalp - 40;
        }


        TextView Price = (TextView) findViewById(R.id.pricethree);
        TextView quantity = (TextView) findViewById(R.id.textView3);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc3 * 40 + "");
        quantity.setText(qc3 + "");
    }

    public void decreasefour(View view) {

        if (qc4 > 0) {
            qc4--;
            Totalp = Totalp - 40;
        }
        TextView Price = (TextView) findViewById(R.id.pricefour);
        TextView quantity = (TextView) findViewById(R.id.textView4);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc4 * 40 + "");
        quantity.setText(qc4 + "");

    }

    public void increaseone(View view) {
        qc1++;
        Totalp = Totalp + 40;
        TextView Price = (TextView) findViewById(R.id.priceone);
        TextView quantity = (TextView) findViewById(R.id.textView1);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc1 * 40 + "");
        quantity.setText(qc1 + "");


    }

    public void increasetwo(View view) {
        qc2++;
        Totalp = Totalp + 40;
        TextView Price = (TextView) findViewById(R.id.pricetwo);
        TextView quantity = (TextView) findViewById(R.id.textView2);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc2 * 40 + "");
        quantity.setText(qc2 + "");
    }

    public void increasethree(View view) {
        qc3++;
        Totalp = Totalp + 40;
        TextView Price = (TextView) findViewById(R.id.pricethree);
        TextView quantity = (TextView) findViewById(R.id.textView3);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc3 * 40 + "");
        quantity.setText(qc3 + "");
    }

    public void increasefour(View view) {
        qc4++;
        Totalp = Totalp + 40;
        TextView Price = (TextView) findViewById(R.id.pricefour);
        TextView quantity = (TextView) findViewById(R.id.textView4);
        TextView T = (TextView) findViewById(R.id.TotalPrice);
        T.setText(Totalp + "");
        Price.setText(qc4 * 40 + "");
        quantity.setText(qc4 + "");

    }
    public void orderbutton(View view){
        String message = getmessage();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,"Order Description\n" +message + "\nTotal is ₹"+Totalp+"/-");

        if(i.resolveActivity(getPackageManager())!=null)
        startActivity(i);
    }
    public String getmessage(){
        StringBuilder sb = new StringBuilder();
        if(qc1>0){
            sb.append("Candle1 : " + qc1 + " of ₹"+qc1*40+ "\n" );
        }
        if(qc2>0){
            sb.append("Candle2 : " + qc2 + " of ₹"+qc2*40+ "\n" );
        }
        if(qc3>0){
            sb.append("Candle3 : " + qc3 + " of ₹"+qc3*40+ "\n" );
        }
        if(qc4>0){
            sb.append("Candle4 : " + qc4 + " of ₹"+qc4*40+ "\n" );
        }
        String ret = String.valueOf(sb);
        return ret;
    }

}

//


