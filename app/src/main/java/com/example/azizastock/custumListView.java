package com.example.azizastock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custumListView extends BaseAdapter {

    Context context;
    String itemsList[];
    String PricesList[];
    int imagesList[];
    LayoutInflater inflater;

    public custumListView(Context ctx, String[] items, int[] images,String[] prix) {
        this.context = ctx;
        this.itemsList = items;
        this.PricesList = prix;
        this.imagesList = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return itemsList.length;
    }

    @Override
    public Object getItem(int i) {
        return itemsList[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_custum_list_view, null);
        }

        TextView txtView = convertView.findViewById(R.id.textviewlist);
        ImageView itemImg = convertView.findViewById(R.id.imageicon);

        txtView.setText(itemsList[i]);
        itemImg.setImageResource(imagesList[i]);

        return convertView;
    }
}
