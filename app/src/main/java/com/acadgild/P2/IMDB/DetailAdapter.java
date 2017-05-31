package com.acadgild.P2.IMDB;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

/*Adapter class*/
public class DetailAdapter extends ArrayAdapter<Detail> {


    public DetailAdapter(MainActivity context, List<Detail> detail) {
        super(context, 0, detail);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, null);
        }

        Detail currentDetail = getItem(position);


        // setting required texts

        TextView txt1 = (TextView) listItemView.findViewById(R.id.tv1);
        txt1.setText(currentDetail.getTextView());

        TextView txt2 = (TextView) listItemView.findViewById(R.id.tv2);
        txt2.setText("Released on : " + currentDetail.getTextView1());

        TextView txt3 = (TextView) listItemView.findViewById(R.id.tv3);
        txt3.setText("Popularity : " + currentDetail.getTextView3());

        TextView txt4 = (TextView) listItemView.findViewById(R.id.tv4);
        txt4.setText("(" + Math.round(Double.parseDouble(currentDetail.getmTextView4()) / Double.parseDouble(currentDetail.getTextView2()) * 10) / 10.0 + ") voted by " + Math.round(Double.parseDouble(currentDetail.getTextView2())) + " users");

        ImageView iv1 = (ImageView) listItemView.findViewById(R.id.iv);
        Picasso.with(getContext()).load(currentDetail.getimageView()).into(iv1);

        return listItemView;

    }
}
