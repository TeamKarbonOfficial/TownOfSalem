package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by joekawai on 12/8/15.
 */
public class CustomAdapter extends ArrayAdapter<Model> {

    Model[] modelItems = null;
    Context context;

    public CustomAdapter(Context context, Model[] resource) {
        super(context,R.layout.achievement_row,resource);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.modelItems = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.achievement_row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        TextView des = (TextView) convertView.findViewById(R.id.textView2);
        TextView tp = (TextView) convertView.findViewById(R.id.textView3);
        //CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox);
        name.setText(modelItems[position].getName());
        des.setText(modelItems[position].getDes());
        tp.setText(modelItems[position].getTp());
        //if(modelItems[position].getValue() == 1)
        //    cb.setChecked(true);
        //else
        //    cb.setChecked(false);
        return convertView;
    }
}
