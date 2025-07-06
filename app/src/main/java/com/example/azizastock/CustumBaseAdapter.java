package com.example.azizastock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustumBaseAdapter extends BaseAdapter {

    Context context;
    String itemsList[];
    String PricesList [];
    int ImagesList[];
    LayoutInflater inflater;
    public CustumBaseAdapter (Context ctx, String[] Items, int [] Images ,String[] Price){
        this.context = ctx;
        this.itemsList = Items;
        this.ImagesList=Images;
        this.PricesList=Price;
        inflater=LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        return itemsList.length;
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
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custum_list_view,null);
        TextView txtView =(TextView) convertView.findViewById(R.id.textviewlist);
        ImageView ItemImg = (ImageView) convertView.findViewById(R.id.imageicon);
        TextView price =(TextView) convertView.findViewById(R.id.textViewPrix);
        price.setText(PricesList[i]);
        txtView.setText(itemsList[i]);
        ItemImg.setImageResource(ImagesList[i]);
        return convertView;
    }
}
