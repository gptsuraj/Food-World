package com.aspireinfotech.foodworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private int[]image;
    private String[] title;
    private Context mcontext;
    private static LayoutInflater layoutInflater = null;

    public CustomAdapter(){

    }
    public CustomAdapter(Context mcontext,int[] image,String[] title) {
        this.mcontext = mcontext;
        this.image = image;
        this.title = title;
        layoutInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=layoutInflater.inflate(R.layout.grid_single_item,null);
        ImageView gridviewsingleimageview = (ImageView) convertView.findViewById(R.id.grid_single_item_iv);
        TextView gridviewsingletextview = (TextView )convertView.findViewById(R.id.grid_single_item_tv);
        gridviewsingleimageview.setImageResource(image[position]);
        gridviewsingletextview.setText(title[position]);
        return  convertView;

    }
}
