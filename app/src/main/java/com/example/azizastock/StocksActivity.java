package com.example.azizastock;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StocksActivity extends AppCompatActivity {

    String items[] = {
            "milk", "yogurt", "cheese", "chips", "cooking oil",
            "tomato paste", "judy", "shampoo", "soap",
            "rice", "pasta", "grains", "harissa", "cereals",
            "coffee", "paper towels"
    };

    String Price[]={
            "1,350 DT","0,500 DT","7,980 DT","3,590  DT","8,750 DT",
            "3,590 DT","3,100 DT ","5,990 DT","1,790 DT",
            "4,980 DT","0,400 DT","3,500 DT","2,750 DT","3,990DT",
            "7,690 DT","2,500 DT"

    };

    int images[] = {
            R.drawable.milk, R.drawable.yogurt, R.drawable.cheese,
            R.drawable.chips, R.drawable.cooking_oil, R.drawable.tomato_paste,
            R.drawable.judy, R.drawable.shampoo, R.drawable.soap,
            R.drawable.rice, R.drawable.pasta, R.drawable.grains,
            R.drawable.harissa, R.drawable.cereals, R.drawable.coffee,
            R.drawable.paper_towels
    };



    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks);

        listView = findViewById(R.id.listview);
        CustumBaseAdapter custumBaseAdapter = new CustumBaseAdapter(this, items, images,Price);
        listView.setAdapter(custumBaseAdapter);
    }
}
